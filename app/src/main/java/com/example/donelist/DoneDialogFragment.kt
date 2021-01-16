package com.example.donelist

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.room.Room
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.dialog_edit_text.*
import kotlin.coroutines.coroutineContext


class DoneDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?) : Dialog {


        val builder = AlertDialog.Builder(activity)
        val inflater = activity!!.layoutInflater
        val editView = inflater.inflate(R.layout.dialog_edit_text, null)
        context?.let {
            builder.setView(editView)
                .setTitle("タイトルでーす")
                .setPositiveButton("Ok") { dialog, id ->
//                    println("ok pulled down")


//                    val database = UserDatabase.getInstance(it)
//                    val userDao = database.UserDao()
                    val done: String = dialog_edit_text.text.toString()

//                    val newItems = User(0, "${done}")
                    println(done)
                }
                .setNegativeButton("cancel") { dialog, id ->
                    println("cancel pulled down")
                }
        }

        return builder.create()



    }

}