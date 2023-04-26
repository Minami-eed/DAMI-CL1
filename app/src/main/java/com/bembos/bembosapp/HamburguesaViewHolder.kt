package com.bembos.bembosapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class HamburguesaViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_hamburguesa,
        parent, false) ) {

    private var imgPortada: ImageView? = null
    private var txtNombre: TextView? = null
    private var txtPrecio: TextView? = null

    init {
        imgPortada = itemView.findViewById(R.id.imgPortada)
        txtNombre = itemView.findViewById(R.id.textNombre)
        txtPrecio = itemView.findViewById(R.id.textPrecio)
    }

    fun bind(Hamburguesa: Hamburguesa) {
        txtNombre?.text = Hamburguesa.nombre
        txtPrecio?.text = Hamburguesa.precio
        imgPortada?.setImageResource(Hamburguesa.portada)
    }
}