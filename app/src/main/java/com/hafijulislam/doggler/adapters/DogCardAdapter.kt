package com.hafijulislam.doggler.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hafijulislam.doggler.R
import com.hafijulislam.doggler.const.Layout
import com.hafijulislam.doggler.data.DataSource
import com.hafijulislam.doggler.models.Dog

class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
) : RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    val dogs: List<Dog> = DataSource.dogs

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {

        val imageView: ImageView? = view?.findViewById(R.id.image)

        val nameTextView: TextView? = view?.findViewById(R.id.name)

        val ageTextView: TextView? = view?.findViewById(R.id.age)

        val hobbyTextView: TextView? = view?.findViewById(R.id.hobby)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {

        return if (layout == Layout.VERTICAL || layout == Layout.HORIZONTAL) {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.partial_card_list, parent, false)
            DogCardViewHolder(adapterLayout)
        } else {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.partial_card_grid, parent, false)

            DogCardViewHolder(adapterLayout)
        }
    }

    override fun getItemCount(): Int {
        return dogs.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: DogCardAdapter.DogCardViewHolder, position: Int) {
        val dog = dogs[position]
        holder.imageView?.setImageResource(dog.imageResourceId)
        holder.nameTextView?.setText(dog.name)
        holder.ageTextView?.setText("Age: " + dog.age)
        holder.hobbyTextView?.setText("Hobbies: " + dog.hobbies)
    }
}