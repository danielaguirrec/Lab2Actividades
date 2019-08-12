package com.example.pruebalab2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro.*

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        bConfirmaRegister.setOnClickListener {
            if(etRegistrarPassword.text.toString() == "" || etRepetirPassword.text.toString() == "" || etRegistrarEmail.text.toString()==""){
                val toast = Toast.makeText(applicationContext, "Ingrese todos los campos" , Toast.LENGTH_LONG)
                toast.show()
            }

            else{
                    if(etRegistrarPassword.text.toString()== etRepetirPassword.text.toString()){
                    val toast = Toast.makeText(applicationContext, "Registro exitoso" , Toast.LENGTH_LONG)
                    toast.show()
                     var intento1 = Intent(this, LoginActivity::class.java)
                    intento1.putExtra("Password", etRegistrarPassword.text.toString())
                    intento1.putExtra("Email", etRegistrarEmail.text.toString())
                    startActivity(intento1)
                    finish()
                }
                else{
                    val toast = Toast.makeText(applicationContext, "Las contraseñas, deben coincidir", Toast.LENGTH_LONG)
                    toast.show()
                } //No coiciden las contra
            } // Falataron campos por llenar
        } //funcion que funciona al hundir el boton

    }

}