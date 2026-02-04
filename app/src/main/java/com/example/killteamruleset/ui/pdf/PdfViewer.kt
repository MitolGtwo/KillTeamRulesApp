package com.example.killteamruleset.ui.pdf

import android.graphics.Bitmap
import android.graphics.pdf.PdfRenderer
import android.os.ParcelFileDescriptor
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import java.io.File
import androidx.compose.foundation.lazy.items

@Composable
fun PdfViewer(
    assetPath: String,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val pages = remember { mutableStateListOf<Bitmap>() }

    LaunchedEffect(assetPath) {
        pages.clear()

        val file = File(context.cacheDir, "temp.pdf")

        context.assets.open(assetPath).use { input ->
            file.outputStream().use { output ->
                input.copyTo(output)
            }
        }

        val renderer = PdfRenderer(
            ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY)
        )

        for (i in 0 until renderer.pageCount) {
            val page = renderer.openPage(i)

            val bitmap = Bitmap.createBitmap(
                page.width,
                page.height,
                Bitmap.Config.ARGB_8888
            )

            page.render(
                bitmap,
                null,
                null,
                PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY
            )

            pages.add(bitmap)
            page.close()
        }

        renderer.close()
    }

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        items(pages) { bitmap ->
            ZoomablePdfPage(
                bitmap = bitmap,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}