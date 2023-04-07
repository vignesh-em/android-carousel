package com.vappfactory.carousel

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.vappfactory.carousel.factory.CarouselViewHolderFactory
import com.vappfactory.carousel.viewtypemapper.ViewTypeMapper

class CarouselAdapter(private val viewHolderFactory: List<CarouselViewHolderFactory>) :
    ListAdapter<Item, CarouselViewHolder>(DiffUtilItemCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        val clazz = ViewTypeMapper.getClassType(viewType)
        val factory =
            viewHolderFactory.find { factory -> factory.canHandle(clazz) }
                ?: throw IllegalStateException("None of the provided factories can create a ViewHolder for this item")
        return factory.create(parent, clazz)
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        holder.bind(position, getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return ViewTypeMapper.getViewType(getItem(position)::class.java)
    }
}