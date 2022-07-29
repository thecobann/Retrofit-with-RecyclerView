package com.example.useofrecyclerview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.useofrecyclerview.webservice.Posts


class RecyclerAdapter(postsList:List<Posts>): RecyclerView.Adapter<ViewHolder>()  {
    var postsList=postsList
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindTo(postsList[position])
    }

    override fun getItemCount(): Int {
        return postsList.size
    }
    fun setPostList(postsList: List<Posts>){
        this.postsList=postsList
    }

}

