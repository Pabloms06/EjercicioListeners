package com.example.ejerciciolisteners

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {
    // Este ejercicio se compone de 2 botones ( + y - ) que al ser pulsados van a sumar o restar
    // el valor que encontremos en un textView.

    // Añade un editText. Cuando el edittext tenga el focus activo, los botones deben cambiar de
    // color. Cuando lo tenga desactivado, deben volver a su color original.

    // Si el usuario escribe un número en el editText, entonces el textView debe mostrar ese número

    // TODO: El número que aparece en textView no puede ser negativo.

    // TODO: Una vez que has introducido un número en el textView, no puede volver a quedar vacio.

    // Investigar como private var colorOriginal: Int = 0

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

