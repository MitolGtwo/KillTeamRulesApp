package com.example.killteamruleset.ui.pdf

import android.content.Context
import android.graphics.Bitmap
import android.graphics.pdf.PdfRenderer
import android.os.ParcelFileDescriptor
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.File

fun createPdfRecyclerView(
    context: Context,
    assetPath: String
): RecyclerView {

    val pages = mutableListOf<Bitmap>()

    val file = File(context.cacheDir, "temp.pdf")
    context.assets.open(assetPath).use { input ->
        file.outputStream().use { output -> input.copyTo(output) }
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
        page.render(bitmap, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY)
        pages.add(bitmap)
        page.close()
    }
    renderer.close()

    return RecyclerView(context).apply {
        layoutManager = LinearLayoutManager(context)
        adapter = PdfPageAdapter(pages)
        setHasFixedSize(true)
    }
}