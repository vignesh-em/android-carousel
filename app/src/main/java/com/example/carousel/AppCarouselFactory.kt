package com.example.carousel

import android.view.ViewGroup
import com.vappfactory.carousel.CarouselViewHolder
import com.vappfactory.carousel.Item
import com.vappfactory.carousel.factory.CarouselViewHolderFactory

class AppCarouselFactory : CarouselViewHolderFactory() {
    override fun create(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        return GridViewHolder(parent.rootView)
    }

    override val types: Set<Class<out Item>>
        get() = setOf(Grid::class.java)
}