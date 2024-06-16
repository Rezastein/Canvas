package com.hgi.mycanvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.View

class MyCanvas(context: Context?) : View(context) {

    lateinit var rect : Rect
    lateinit var paint : Paint

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        rect = Rect(100, 100, 1000, 1300)
        paint = Paint()
        paint.setColor(Color.BLUE)
        paint.style = Paint.Style.FILL
        paint.strokeWidth = 10f

        canvas.drawRect(rect,paint)

    }
}