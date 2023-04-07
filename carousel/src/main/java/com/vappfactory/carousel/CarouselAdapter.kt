package com.vappfactory.carousel

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.vappfactory.carousel.factory.CarouselViewHolderFactory

class CarouselAdapter(private val viewHolderFactory: List<CarouselViewHolderFactory>) :
    ListAdapter<Item, CarouselViewHolder>(DiffUtilItemCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        val factory =
            viewHolderFactory.find { factory -> factory.canHandle(getItem(0)::class.java) } // to be replaced with item
                ?: throw IllegalStateException("None of the provided factories can create a ViewHolder for this item")
        return factory.create(parent, viewType)
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        holder.bind(position, getItem(position))
    }
}