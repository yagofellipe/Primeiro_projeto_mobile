package com.yagofellipe.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.View
import kotlin.random.Random

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortear(view: View){
        val textResultado = findViewById<TextView>(R.id.text_resultado)
        val numero = Random.nextInt(10)
        textResultado.setText("número gerado $numero")
    }
}


