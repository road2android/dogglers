package com.hafijulislam.doggler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.hafijulislam.doggler.adapters.DogCardAdapter
import com.hafijulislam.doggler.const.Layout

class HorizontalListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_horizontal_list)

        val recyclerView: RecyclerView = findViewById(R.id.horizontalRecyclerView)

        recyclerView.adapter = DogCardAdapter(this, Layout.HORIZONTAL)

        recyclerView.setHasFixedSize(true)
    }
}