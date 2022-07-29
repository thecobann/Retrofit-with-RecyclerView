package com.example.useofrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.useofrecyclerview.UI.Api
import com.example.useofrecyclerview.adapter.RecyclerAdapter
import com.example.useofrecyclerview.webservice.Posts
import com.example.useofrecyclerview.webservice.RetrofitClient
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_View.layoutManager=LinearLayoutManager(this)

        RetrofitClient.getClient().create(Api::class.java).getPosts()
            .enqueue(object :retrofit2.Callback<List<Posts>>{
                override fun onResponse(call: Call<List<Posts>>, response: Response<List<Posts>>) {
                    val postlist=ArrayList(response.body())
                    Toast.makeText(this@MainActivity, "Success",Toast.LENGTH_SHORT).show()
                    recycler_View.adapter= RecyclerAdapter(postlist)
                }

                override fun onFailure(call: Call<List<Posts>>?, t: Throwable) {
                    Toast.makeText(this@MainActivity,"Failure",Toast.LENGTH_SHORT).show()
                }

            }
            )
    }
    }