package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.edit
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    var PREFS = "meu_arquivo"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClique.setOnClickListener(){
            if (editLogin.text.toString().equals(("iris") && editSenha.text.toString().equals(("senha")){
                    if (checkBox.isChecked){
                        var prefs = getSharedPreferences(PREFS, Context.MODE_PRIVATE)
                        with((prefs.edit(){
                           putBoolean("logado", true)
                            commit()
                        }
                    }
                }
        var prefs = getSharedPreferences(PREFS, Context.MODE_PRIVATE)

        var logado = prefs.getBoolean("logado", false)
        if (!logado){
            var i = Intent(this, Main2Activity::class.java)
            startActivity(i)
            finish()
        }

    }
}
