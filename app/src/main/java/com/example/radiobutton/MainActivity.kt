package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //Variables de los cuadros de texto
    var txtNum1: EditText = findViewById(R.id.edNum)
    var txtNum2: EditText = findViewById(R.id.number2)
        // Se declaran las variables de los RADIOS
        var rdSuma: RadioButton = findViewById(R.id.rdSuma)
        var rdResta: RadioButton = findViewById(R.id.rdResta)
        var rdMulti: RadioButton = findViewById(R.id.rdMulti)
        var rdDiv: RadioButton = findViewById(R.id.rdDiv)
        var rdPot: RadioButton = findViewById(R.id.rdPot)
        // se declara la varible del boton
        var btn: Button = findViewById(R.id.btnOperacion)
        var txtResultado = findViewById<TextView>(R.id.txtResultado)
        // Obtenemos los valores del boton al momento de hacer click tomados a través de la busqueda
        btn.setOnClickListener{
            val number: Int = txtNum1.text.toString().toInt()
            val num2: Int = txtNum2.text.toString().toInt()
            //para verificar en consola que funcionen bien
           // Log.v("RadioApp", " Los numeros son: $number y $num2"  )
            var res: Int = 0
            if (rdSuma.isChecked)
                res = number + num2
            else if(rdResta.isChecked)
                res = number - num2
            else if(rdMulti.isChecked)
                res = number * num2
            else if(rdDiv.isChecked)
                res = number / num2
            else if(rdPot.isChecked)
                res = number*number
            txtResultado.text = "$res"
        }
    }
}