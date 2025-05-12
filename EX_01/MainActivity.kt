package com.example.mypro_076

import android.graphics.Color
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Variables to store the current states
    private var isFontSizeLarge = false
    private var isFontColorChanged = false
    private var isBackgroundColorChanged = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"

        // Initialize UI elements
        val expression: TextView = findViewById(R.id.expression)
        val id1: EditText = findViewById(R.id.id1)
        val id2: EditText = findViewById(R.id.id2)
        val id3: EditText = findViewById(R.id.id3)
        val all: LinearLayout = findViewById(R.id.all)

        // Button to toggle font size
        id1.setOnClickListener {
            if (isFontSizeLarge) {
                expression.textSize = 30f  // Revert to normal size
                Toast.makeText(this, "Font size reset to normal", Toast.LENGTH_SHORT).show()
            } else {
                expression.textSize = 50f  // Increase the font size
                Toast.makeText(this, "Font size set to 50sp", Toast.LENGTH_SHORT).show()
            }
            isFontSizeLarge = !isFontSizeLarge  // Toggle state
        }

        // Button to toggle font color
        id2.setOnClickListener {
            if (isFontColorChanged) {
                expression.setTextColor(Color.BLUE)  // Revert to original color
                Toast.makeText(this, "Font color reset to blue", Toast.LENGTH_SHORT).show()
            } else {
                expression.setTextColor(Color.RED)  // Change the font color
                Toast.makeText(this, "Font color set to red", Toast.LENGTH_SHORT).show()
            }
            isFontColorChanged = !isFontColorChanged  // Toggle state
        }

        // Button to toggle background color
        id3.setOnClickListener {
            if (isBackgroundColorChanged) {
                all.setBackgroundColor(Color.parseColor("#F8F8F8"))  // Revert to original background
                Toast.makeText(this, "Background color reset", Toast.LENGTH_SHORT).show()
            } else {
                all.setBackgroundColor(Color.DKGRAY)  // Change the background color
                Toast.makeText(this, "Background color set to dark gray", Toast.LENGTH_SHORT).show()
            }
            isBackgroundColorChanged = !isBackgroundColorChanged  // Toggle state
        }
    }
}
