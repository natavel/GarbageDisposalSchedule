package ru.cosiness.garbagedisposalschedule

import android.app.Person
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Natasha on 17.11.2020.
 * tg: natavel
 */

class CustomRecyclerAdapter(private val values: List<String>) :
        RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>() {

    override fun getItemCount() = values.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent?.context).inflate(R.layout.item_person_full, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name?.text = values[position]
        holder.lastname?.text = values[position]
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView? = null
        var lastname: TextView? = null

        init {
            name = itemView?.findViewById(R.id.tv_name)
            lastname = itemView?.findViewById(R.id.tv_lastname)
        }
    }
}


