package com.vappfactory.carousel

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.vappfactory.carousel.factory.CarouselViewHolderFactory

class CarouselAdapter(private val viewHolderFactory: CarouselViewHolderFactory) :
    ListAdapter<Item, CarouselViewHolder>(DiffUtilItemCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        return viewHolderFactory.create(parent, viewType)
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        holder.bind(position, getItem(position))
    }
}