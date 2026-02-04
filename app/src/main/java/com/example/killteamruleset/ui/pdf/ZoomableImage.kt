package com.example.killteamruleset.ui.pdf

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import android.view.ScaleGestureDetector
import android.view.MotionEvent
import android.graphics.Matrix
import android.graphics.PointF
import android.widget.ImageView

class ZoomableImageView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : AppCompatImageView(context, attrs) {

    private val matrixValues = FloatArray(9)
    private val matrix = Matrix()

    private var scaleFactor = 1f
    private val minScale = 1f
    private val maxScale = 5f

    private val lastTouch = PointF()
    private var mode = NONE

    private val scaleDetector =
        ScaleGestureDetector(context, ScaleListener())

    init {
        scaleType = ScaleType.MATRIX
        imageMatrix = matrix
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        scaleDetector.onTouchEvent(event)

        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                lastTouch.set(event.x, event.y)
                mode = DRAG
            }

            MotionEvent.ACTION_MOVE -> {
                if (mode == DRAG && !scaleDetector.isInProgress) {
                    val dx = event.x - lastTouch.x
                    val dy = event.y - lastTouch.y
                    matrix.postTranslate(dx, dy)
                    imageMatrix = matrix
                    lastTouch.set(event.x, event.y)
                }
            }

            MotionEvent.ACTION_UP,
            MotionEvent.ACTION_POINTER_UP -> {
                mode = NONE
            }
        }

        return true
    }

    private inner class ScaleListener :
        ScaleGestureDetector.SimpleOnScaleGestureListener() {

        override fun onScale(detector: ScaleGestureDetector): Boolean {
            val scale = detector.scaleFactor
            val newScale = scaleFactor * scale

            if (newScale in minScale..maxScale) {
                scaleFactor = newScale
                matrix.postScale(
                    scale,
                    scale,
                    detector.focusX,
                    detector.focusY
                )
                imageMatrix = matrix
            }

            return true
        }
    }

    companion object {
        private const val NONE = 0
        private const val DRAG = 1
    }
}