package com.example.recyclerviewwithmultipleviews

import android.text.method.TextKeyListener.clear
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.Collections.addAll

class DataAdapter: RecyclerView.Adapter<DataViewHolder>() {
    private var dataList = mutableListOf<DataModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val layout = when(viewType) {
            VIEW_HEADER -> R.layout.item_header
            VIEW_ITEMS -> R.layout.item_items
            else -> 0
        }
        val view = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return DataViewHolder(view)
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemViewType(position: Int): Int {
        return when(dataList[position]) {
            is DataModel.Header -> VIEW_HEADER
            is DataModel.Items -> VIEW_ITEMS
        }
    }

    fun setItems(data: List<DataModel>) {
        dataList.apply {
            clear()
            addAll(data)
        }
        notifyDataSetChanged()
    }

    companion object {
        const val VIEW_HEADER = 0
        const val VIEW_ITEMS = 1
    }

}