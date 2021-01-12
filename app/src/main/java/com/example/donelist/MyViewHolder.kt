//一行分のレイアウトを保持しておくクラス


package com.example.donelist

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val timeText : TextView = itemView.findViewById(R.id.time_text)
    val ItemText : TextView = itemView.findViewById(R.id.item_text)
    val dialogButton = itemView.findViewById<Button>(R.id.dialog_button)
}