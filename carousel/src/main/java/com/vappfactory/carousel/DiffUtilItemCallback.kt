package com.vappfactory.carousel

import androidx.recyclerview.widget.DiffUtil.ItemCallback

object DiffUtilItemCallback : ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item) =
        oldItem.getItemId() == newItem.getItemId()

    override fun areContentsTheSame(oldItem: Item, newItem: Item) = false
}