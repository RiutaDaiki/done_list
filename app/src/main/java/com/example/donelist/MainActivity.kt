 package com.example.donelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
 import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_recycler_view.*



 class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeList = listOf(
            ""
        )
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = MyRecyclerViewAdapter(timeList, supportFragmentManager)
        recyclerView.layoutManager = LinearLayoutManager(this)




    }

}