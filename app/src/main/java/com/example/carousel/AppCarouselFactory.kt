package com.example.carousel

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.carousel.databinding.LayoutAlphaBinding
import com.example.carousel.databinding.LayoutGridBinding
import com.vappfactory.carousel.CarouselViewHolder
import com.vappfactory.carousel.Item
import com.vappfactory.carousel.factory.CarouselViewHolderFactory

class AppCarouselFactory : CarouselViewHolderFactory() {
    override fun create(parent: ViewGroup, clazz: Class<out Item>): CarouselViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (clazz) {
            Grid::class.java -> {
                GridViewHolder(
                    LayoutGridBinding.inflate(layoutInflater, parent, false)
                )
            }
            Alpha::class.java -> AlphaViewHolder(
                LayoutAlphaBinding.inflate(
                    layoutInflater, parent, false
                )
            )
            else -> throw IllegalStateException("Cannot create a view holder for this type")
        }
    }

    override val types: Set<Class<out Item>>
        get() = setOf(Grid::class.java, Alpha::class.java)
}