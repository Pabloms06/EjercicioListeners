package com.example.ejerciciolisteners

import android.R
import android.annotation.SuppressLint
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Build
import android.text.Editable
import android.text.Layout
import android.text.TextWatcher
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

//No he podidio arrancar el programa porque no he conseguido arrancar el emulador, pero he intentado hacerlo siguiendo el ejemplo que hiciste en clase

    private lateinit var boton : Button
    private lateinit var editText : EditText
    private lateinit var imageView: ImageView

 private val textWatcher = object : TextWatcher {

        @SuppressLint("SetTextI18n")
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        @SuppressLint("SetTextI18n")
        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {ç

           //1
            if (boton.isClickable())
                editText.isActivated
                boton.text = "Finalizar"
            //2
                boton.isClickable
                boton.isEnabled
                boton.text = " "

            // Si esta el usuario hay te borra el texto " "
            if (editText.isFocusable)
                editText.setText(" ")



        }

        override fun afterTextChanged(p0: Editable?) {
            }
        }


    private val textWatcher2 = object : TextWatcher {

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun afterTextChanged(p0: Editable?) {

            if (editText.text.equals("Wayne"))
                imageView.isActivated
        }



    }





    }

