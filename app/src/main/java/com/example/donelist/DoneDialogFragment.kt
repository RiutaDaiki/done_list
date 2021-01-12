package com.example.donelist

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class DoneDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?) : Dialog {


        val builder = AlertDialog.Builder(activity)
        val inflater = activity!!.layoutInflater
        val editView = inflater.inflate(R.layout.dialog_edit_text, null)
        builder.setView(editView)
                .setTitle("タイトルでーす")
                .setPositiveButton("Ok") { dialog, id ->
                    println("OK pulled down")
                }
                .setNegativeButton("cancel") { dialog, id ->
                    println("cancel pulled down")
                }
        return builder.create()
    }

}