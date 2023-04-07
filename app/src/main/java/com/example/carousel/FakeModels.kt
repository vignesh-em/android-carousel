package com.example.carousel

import com.example.carousel.databinding.LayoutAlphaBinding
import com.example.carousel.databinding.LayoutGridBinding
import com.vappfactory.carousel.CarouselViewHolder
import com.vappfactory.carousel.Item

data class Grid(val x: Int, val y: Int) : Item {
    override fun getItemId() = "grid"
}

class GridViewHolder(private val binding: LayoutGridBinding) : CarouselViewHolder(binding.root) {
    override fun bind(position: Int, item: Item?) {
        item as Grid
        binding.text = "${item.y} + ${item.y}"
    }
}

data class Alpha(val a: String) : Item {
    override fun getItemId() = "alpha"
}

class AlphaViewHolder(private val binding: LayoutAlphaBinding) : CarouselViewHolder(binding.root) {
    override fun bind(position: Int, item: Item?) {
        item as Alpha
        binding.text = item.a
    }

}