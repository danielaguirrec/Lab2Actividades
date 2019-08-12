package com.example.pruebalab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_registro.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val bundle = intent.extras  //Creo un bundle
        val Usuario = bundle?.getString("Email")
        val Contraseña =bundle?.getString("Password")

        bSubmit.setOnClickListener {    // Trato de registrarme
            val Acceder = Intent(this, MainActivity::class.java)
            if(etloginAccount.text.toString()== Usuario && etloginPassword.text.toString()== Contraseña){
                Acceder.putExtra("Email", etloginAccount.text.toString())
                Acceder.putExtra("Password", etloginPassword.text.toString())
                startActivity(Acceder)
                val toast = Toast.makeText(applicationContext, "Bienvenido Señor usuario", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                val toast = Toast.makeText(applicationContext, "Usuario o contraseña incorrecta!!", Toast.LENGTH_LONG)
                toast.show()
            }

        } //cierro boton de enviar datos

        bRegister.setOnClickListener {      // Funcion que me permite ir a la actividad registrar
            val Registrarse = Intent(this, RegistroActivity::class.java)
            startActivity(Registrarse)

        } //Accedo

    }
}
