package com.hafijulislam.doggler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.hafijulislam.doggler.adapters.DogCardAdapter

class VerticalListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_vertical_list)

        val recyclerView: RecyclerView = findViewById(R.id.verticalRecyclerView)

        recyclerView.adapter = DogCardAdapter(this, R.id.verticalRecyclerView)

        recyclerView.setHasFixedSize(true)
    }
}