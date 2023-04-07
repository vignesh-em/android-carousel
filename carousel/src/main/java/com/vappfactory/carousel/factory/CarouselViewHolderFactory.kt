package com.vappfactory.carousel.factory

import android.view.ViewGroup
import com.vappfactory.carousel.CarouselViewHolder
import com.vappfactory.carousel.Item

abstract class CarouselViewHolderFactory {
    abstract fun create(parent: ViewGroup, viewType: Int): CarouselViewHolder

    internal fun canHandle(clazz: Class<out Item>) = types.contains(clazz)

    protected abstract val types: Set<Class<out Item>>
}