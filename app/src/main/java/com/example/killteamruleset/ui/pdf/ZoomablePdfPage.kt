package com.example.killteamruleset.ui.pdf

import android.graphics.Bitmap
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun ZoomablePdfPage(
    bitmap: Bitmap,
    modifier: Modifier = Modifier
) {
    AndroidView(
        modifier = modifier,
        factory = { context ->
            ZoomableImageView(context).apply {
                setImageBitmap(bitmap)
            }
        },
        update = { view ->
            view.setImageBitmap(bitmap)
        }
    )
}