package com.example.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton : Button = findViewById(R.id.btn)
        clickButton.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.title)
            builder.setMessage(R.string.titlemessage)
//            Setting up the Button
            builder.setPositiveButton("Yes") { DialogInterface, which ->
                Toast.makeText(
                    this,
                    "clicked yes",
                    Toast.LENGTH_LONG
                ).show()
            }
//            Setting up the button
            builder.setNegativeButton("NO") { DialogInterface, which ->
                Toast.makeText(
                    this,
                    "clicked no",
                    Toast.LENGTH_LONG
                ).show()
            }

            val alertDialog : AlertDialog = builder.create()
            alertDialog.show()
        }
    }
}