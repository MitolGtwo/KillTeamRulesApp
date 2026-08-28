package com.example.killteamruleset.ui.components.components

import android.graphics.Bitmap
import android.graphics.pdf.PdfRenderer
import android.os.ParcelFileDescriptor
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import java.io.File

@Composable
fun PdfPagerViewer(
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

        repeat(renderer.pageCount) { index ->
            val page = renderer.openPage(index)

            val bitmap = Bitmap.createBitmap(
                page.width,
                page.height,
                Bitmap.Config.ARGB_8888
            )

            page.render(bitmap, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY)
            pages.add(bitmap)
            page.close()
        }

        renderer.close()
    }

    if (pages.isEmpty()) {
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("Loading Assembly Guide…")
        }
        return
    }

    val pagerState = rememberPagerState { pages.size }

    Column(modifier = modifier.fillMaxSize()) {

        Text(
            text = "Page ${pagerState.currentPage + 1} / ${pages.size}",
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(8.dp)
        )

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { page ->
            Image(
                bitmap = pages[page].asImageBitmap(),
                contentDescription = "PDF page ${page + 1}",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}