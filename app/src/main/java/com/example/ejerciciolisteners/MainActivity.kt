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



    private lateinit var boton : Button
    private lateinit var editText : EditText
    private lateinit var imageView: ImageView
    override fun getLayoutInflater(): LayoutInflater {
        return super.getLayoutInflater()
    }


    public void setOnClickListener(OnClickListener l) {
    }


    private val textWatcher = object : TextWatcher {

        @SuppressLint("SetTextI18n")
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        @SuppressLint("SetTextI18n")
        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            if (editText.isFocusable)
                editText.setText(" ")
            @RequiresApi(Build.VERSION_CODES.R)
            if (boton.isClickable())
                editText.isActivated
                boton.isClickable
                boton.text = "Finalizar"
                boton.isClickable
                boton.isEnabled
                boton.text = " "

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

