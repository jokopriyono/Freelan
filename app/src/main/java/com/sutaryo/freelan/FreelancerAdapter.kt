package com.sutaryo.freelan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FreelancerAdapter : RecyclerView.Adapter<FreelancerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_freelancer, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = 5

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }


    class ViewHolder(v: View) : RecyclerView.ViewHolder(v)
}