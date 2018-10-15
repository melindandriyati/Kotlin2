package com.example.asus.hellokotlin

import android.graphics.ColorSpace
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content.view.*

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val tvtitle = itemView.findViewById<TextView>(R.id.tvTitle)
    val tvcontent = itemView.findViewById<TextView>(R.id.tvContent)
}