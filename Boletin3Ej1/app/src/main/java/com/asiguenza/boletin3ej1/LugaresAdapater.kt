package com.asiguenza.boletin3ej1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asiguenza.boletin3ej1.model.Lugar
import com.bumptech.glide.Glide
import com.asiguenza.boletin3ej1.databinding.ViewLugaresBinding

class LugaresAdapater(val lugares: List<Lugar>): RecyclerView.Adapter<LugaresAdapater.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_lugares, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lugares[position])
    }

    override fun getItemCount(): Int = lugares.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val binding = ViewLugaresBinding.bind(view)
        fun bind(lugar: Lugar){
            binding.lugar.text = lugar.lugar

            Glide.with(binding.imagen)
                .load(lugar.img)
                .into(binding.imagen)
        }
    }
}
