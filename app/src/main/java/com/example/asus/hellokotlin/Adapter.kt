package com.example.asus.hellokotlin

import android.content.Context
import android.graphics.ColorSpace
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*

class Adapter (mContext: Context, val listData : List<Model>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0?.context).inflate(R.layout.item, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }
//
//    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
//        val model: Model = listData.get(i)
//        viewHolder.tvtitle.setText(model.title)
////        viewHolder.tvcontent.setText(model.content)
//    }

}


