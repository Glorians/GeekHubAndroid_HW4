package com.geekhub.android.hw4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(var items: MutableList<Long>, val callback: Callback) : RecyclerView.Adapter<MainAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_template, parent, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(items[position])
    }

    fun addItem(item: Long) {
        items.add(item)
        super.notifyItemInserted(itemCount)
        callback(itemCount)
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val number = itemView.findViewById<TextView>(R.id.number)

        fun bind(item: Long) {
            number.text = 1.toString()
            }
        }
    }

    interface Callback {
        fun onItemClicked(item: Long)
    }
