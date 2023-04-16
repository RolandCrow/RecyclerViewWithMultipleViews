package com.example.recyclerviewwithmultipleviews

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)  {


    private fun bindHeader(data: DataModel.Header) {
        val title: TextView = itemView.findViewById(R.id.tv_title_header)
        title.text = data.title
    }

    private fun bindItem(data: DataModel.Items) {
        val title: TextView = itemView.findViewById(R.id.tv_title)
        val description: TextView = itemView.findViewById(R.id.tv_description)
        title.text = data.title
        description.text = data.description
    }

    fun bind(data: DataModel) {
        when(data) {
            is DataModel.Header -> bindHeader(data)
            is DataModel.Items -> bindItem(data)
        }
    }

}