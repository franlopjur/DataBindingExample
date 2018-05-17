package com.betabeers.databindingexample.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.betabeers.databindingexample.databinding.RowAndroidVersionBinding
import com.betabeers.databindingexample.model.AndroidVersionModel


class AndroidVersionAdapter(var items: List<AndroidVersionModel>,
                            var listener: (model: AndroidVersionModel) -> Unit) :
        RecyclerView.Adapter<AndroidVersionAdapter.AndroidVersionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidVersionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = RowAndroidVersionBinding.inflate(layoutInflater, parent, false)
        return AndroidVersionViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: AndroidVersionViewHolder, position: Int) {
        val currentVersion = items[position]
        holder.bind(currentVersion)
        holder.itemView.setOnClickListener {
            listener(currentVersion)
        }
    }

    class AndroidVersionViewHolder(private var binding: RowAndroidVersionBinding) :
            RecyclerView.ViewHolder(binding.root) {

        fun bind(androidVersionModel: AndroidVersionModel) {
            binding.androidVersion = androidVersionModel
            binding.executePendingBindings()
        }
    }
}