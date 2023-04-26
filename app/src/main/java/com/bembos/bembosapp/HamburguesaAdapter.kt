package com.bembos.bembosapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HamburguesaAdapter(val list: List<Hamburguesa>) :
    RecyclerView.Adapter<HamburguesaViewHolder>(){

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HamburguesaViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return HamburguesaViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: HamburguesaViewHolder, position: Int) {
        val Hamburguesa: Hamburguesa = list[position]
        holder.bind(Hamburguesa)    
    }

}
