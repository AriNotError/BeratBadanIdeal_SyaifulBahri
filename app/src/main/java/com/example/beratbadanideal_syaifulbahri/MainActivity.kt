package com.example.beratbadanideal_syaifulbahri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tinggi : EditText
    private lateinit var lk : RadioButton
    private lateinit var pr : RadioButton
    private lateinit var hasil : TextView
    private lateinit var button : Button

    private var tb : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tinggi = findViewById(R.id.tinggi)
        lk = findViewById(R.id.lk)
        pr = findViewById(R.id.pr)
        hasil = findViewById(R.id.hasil)
        button = findViewById(R.id.button)

        button.setOnClickListener {

            var tinggi = tinggi.text.toString().toInt()

            if (lk.isChecked){
                tb = (tinggi - 100) - ((tinggi - 100) * 10/100)
                hasil.setText(tb.toString()+ "kg")
            } else {
                tb = (tinggi - 100) - ((tinggi - 100) * 15/100)
                hasil.setText(tb.toString()+ "kg")
            }
        }

    }
}