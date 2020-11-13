package com.example.eludom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lab2)
    }


    fun selected(view: View){
        val cake: CheckBox = findViewById(R.id.cake)
        val steak: CheckBox = findViewById(R.id.steak)
        val coffee: CheckBox = findViewById(R.id.coffee)
        val tea: CheckBox = findViewById(R.id.tea)

        var str = "You have chosen:\n"
        var chosen = listOf<String>()
        if(cake.isChecked){
            str += cake.text
            str += "\n"
        }
        if(steak.isChecked){
            str += steak.text
            str += "\n"
        }
        if(coffee.isChecked){
            str += coffee.text
            str +=  "\n"
        }
        if(tea.isChecked){
            str += tea.text
        }


        val res = Toast.makeText(this, str, Toast.LENGTH_LONG)
        res.show()

    }
}