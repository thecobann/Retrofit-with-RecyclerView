package com.example.useofrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.useofrecyclerview.R
import com.example.useofrecyclerview.webservice.Posts

class ViewHolder (viewGroup:ViewGroup):RecyclerView.ViewHolder
    (LayoutInflater.from(viewGroup.context).inflate
    (R.layout.cardlayout,viewGroup,false))
{
        private val userID by lazy { itemView.findViewById<TextView>(R.id.userId) }
        private val id by lazy { itemView.findViewById<TextView>(R.id.id) }
        private val title by lazy { itemView.findViewById<TextView>(R.id.title) }
        private val body by lazy { itemView.findViewById<TextView>(R.id.body) }
    fun bindTo(postsTo:Posts){
        userID.text=postsTo.userId
        id.text=postsTo.id
        title.text=postsTo.title
        body.text=postsTo.body
    }
}