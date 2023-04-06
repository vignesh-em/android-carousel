package com.vappfactory.carousel.factory

import android.view.ViewGroup
import com.vappfactory.carousel.CarouselViewHolder

interface CarouselViewHolderFactory {
    fun create(parent: ViewGroup, viewType: Int): CarouselViewHolder
}