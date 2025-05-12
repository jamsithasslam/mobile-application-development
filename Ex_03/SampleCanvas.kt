package com.example.shapedrawer_220701076
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class SimpleCanvas(context: Context, attrs: AttributeSet?) : View(context, attrs) {
    private val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.YELLOW)

        // Draw Circle
        paint.color = Color.BLACK
        paint.textSize = 50f
        paint.color = Color.RED
        canvas.drawText("Circle", 230f, 190f, paint)

        canvas.drawCircle(300f, 400f, 180f, paint)

        // Draw Rectangle

        paint.color = Color.GREEN
        canvas.drawText("Rectangle", 580f, 190f, paint)

        canvas.drawRect(550f, 250f, 800f, 800f, paint)

        // Draw Square

        paint.color = Color.BLUE
        canvas.drawText("Square", 235f, 960f, paint)

        canvas.drawRect(150f, 1000f, 500f, 1350f, paint)

        // Draw Line
        paint.color = Color.BLACK
        canvas.drawText("Line", 630f, 960f, paint)
        paint.strokeWidth = 10f
        canvas.drawLine(680f, 1000f, 680f, 1350f, paint)
    }
}