package com.hafijulislam.doggler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.hafijulislam.doggler.adapters.DogCardAdapter
import com.hafijulislam.doggler.const.Layout

class VerticalListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_vertical_list)

        val recyclerView: RecyclerView = findViewById(R.id.verticalRecyclerView)

        recyclerView.adapter = DogCardAdapter(this, Layout.VERTICAL)

        recyclerView.setHasFixedSize(true)
    }
}