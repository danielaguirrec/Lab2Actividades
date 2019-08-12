package com.example.pruebalab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle = intent.extras
        val Usuario = bundle?.getString("Email")
        val Contraseña = bundle?.getString("Password")
        tvResultado.text= Usuario
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean { //Para que me muestre el icono como menú
        menuInflater.inflate(R.menu.cerrar_seccion_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.CierroSesion -> {
                val bundle = intent.extras
                val Usuario = bundle?.getString("Email")
                val Contraseña = bundle?.getString("Password")

                //Toast.makeText(this, "ir a actividad 2", Toast.LENGTH_SHORT).show()
                var intent = Intent(this,LoginActivity::class.java) // Lanzar actividades o servicios
                intent.putExtra("Password", Contraseña)
                intent.putExtra("Email", Usuario)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
