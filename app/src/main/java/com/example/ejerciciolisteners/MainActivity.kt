package com.example.ejerciciolisteners

import android.annotation.SuppressLint

import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.boton)
        val editText = findViewById<EditText>(R.id.editText)
        val imagen = findViewById<ImageView>(R.id.imagen)


        button.setOnClickListener {
            button.text = "Finalizar"
            editText.setText("Introduce tu nombre:")
            if (button.isFocusable)
                button.isVisible.not()
        }

        editText.setOnClickListener{
            if (editText.equals("Wayne"))
                imagen.isActivated
        }
        }



    }

