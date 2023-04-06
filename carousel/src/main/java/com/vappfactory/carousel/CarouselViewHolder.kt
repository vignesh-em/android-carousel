package com.vappfactory.carousel

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder

abstract class CarouselViewHolder(itemView: View) : ViewHolder(itemView) {
    abstract fun bind(position: Int, item: Item?)
}