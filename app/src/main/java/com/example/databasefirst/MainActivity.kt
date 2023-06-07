package com.example.databasefirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val add_btn:FloatingActionButton = findViewById(R.id.add_btn)
        val recyclerView:RecyclerView = findViewById(R.id.recycler_view)
        add_btn.setOnClickListener {
            val intent:Intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
        }
    }
}