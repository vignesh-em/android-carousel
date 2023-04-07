package com.example.carousel

import android.view.View
import com.vappfactory.carousel.CarouselViewHolder
import com.vappfactory.carousel.Item

data class Grid(val x: Int, val y: Int) : Item {
    override fun getItemId() = "grid"
}

class GridViewHolder(itemView: View) : CarouselViewHolder(itemView) {
    override fun bind(position: Int, item: Item?) {

    }
}

data class Alpha(val a: String) : Item {
    override fun getItemId() = "alpha"
}

class AlphaViewHolder(itemView: View): CarouselViewHolder(itemView) {
    override fun bind(position: Int, item: Item?) {

    }

}