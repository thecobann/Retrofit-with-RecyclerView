package com.example.useofrecyclerview.UI

import com.example.useofrecyclerview.webservice.Posts
import retrofit2.Call
import retrofit2.http.GET

interface Api{
    @GET("posts")
    fun getPosts():Call<List<Posts>>
}