package com.hafijulislam.doggler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.hafijulislam.doggler.adapters.DogCardAdapter
import com.hafijulislam.doggler.models.Dog
import com.hafijulislam.doggler.data.DataSource

class VerticalListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_vertical_list)

        val dogs: List<Dog> = DataSource.dogs

        val recyclerView: RecyclerView = findViewById(R.id.verticalRecyclerView)

        recyclerView.adapter = DogCardAdapter(this, R.id.verticalRecyclerView)

        recyclerView.setHasFixedSize(true)
    }
}