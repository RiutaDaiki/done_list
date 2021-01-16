//リストの要素と一行分のレイアウト紐づけてくれる

package com.example.donelist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(val list: List<String>, val supportFragmentManager: FragmentManager) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, index: Int) {
        holder.timeText.text = index.toString()
        holder.ItemText.text = ""
        holder.clickarea.setOnClickListener() {
            val dialog = DoneDialogFragment()
            dialog.show(supportFragmentManager, null)
        }
    }

    override fun getItemCount(): Int = list.size
}


