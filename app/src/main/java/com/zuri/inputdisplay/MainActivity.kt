package com.zuri.inputdisplay

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textview = findViewById<TextView>(R.id.input_textview)
        val text = findViewById<TextInputEditText>(R.id.input_edittext)
        val button = findViewById<MaterialButton>(R.id.display_button)



        button.setOnClickListener {

            fun onClick(){
                text.text.toString()
                textview.text = text.text.toString()
                text.setText("")
            }

            onClick()

        }






    }
}