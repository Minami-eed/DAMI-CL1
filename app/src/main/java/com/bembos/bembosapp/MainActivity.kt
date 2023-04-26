package com.bembos.bembosapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    val listaHamburguesa = listOf(
        Hamburguesa("La Peso Pesada", "S/. 12.90", R.drawable.pesada),
        Hamburguesa("Burger Clásica Bembos", "S/ 16.90", R.drawable.clasica_parrilla),
        Hamburguesa("Burger Churrita", "S/ 20.90", R.drawable.churrita),
        Hamburguesa("La Corona", "S/. 23.90", R.drawable.corona)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerHamburguesas = findViewById<RecyclerView>(R.id.recyclerHamburguesas)
        recyclerHamburguesas.apply {
            //layoutManager = LinearLayoutManager(context) //Vertical
            //layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            //layoutManager = GridLayoutManager(context, 2)
            layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)

            adapter = HamburguesaAdapter(listaHamburguesa)
        }
    }
}