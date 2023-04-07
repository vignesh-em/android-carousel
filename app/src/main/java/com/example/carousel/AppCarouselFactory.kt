package com.example.carousel

import android.view.ViewGroup
import com.vappfactory.carousel.CarouselViewHolder
import com.vappfactory.carousel.Item
import com.vappfactory.carousel.factory.CarouselViewHolderFactory

class AppCarouselFactory : CarouselViewHolderFactory() {
    override fun create(parent: ViewGroup, clazz: Class<out Item>): CarouselViewHolder {
        return when (clazz) {
            Grid::class.java -> GridViewHolder(parent.rootView)
            Alpha::class.java -> AlphaViewHolder(parent.rootView)
            else -> throw IllegalStateException("Cannot create a view holder for this type")
        }
    }

    override val types: Set<Class<out Item>>
        get() = setOf(Grid::class.java, Alpha::class.java)
}