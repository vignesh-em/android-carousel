package com.example.carousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.helper.widget.Carousel
import androidx.databinding.DataBindingUtil
import com.example.carousel.databinding.ActivityMainBinding
import com.vappfactory.carousel.CarouselAdapter
import com.vappfactory.carousel.Item

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setup()
    }

    private fun setup() {
        val viewHolderFactories = listOf(AppCarouselFactory())
        val adapter = CarouselAdapter(viewHolderFactories)
        binding.recycler.run {

            this.adapter = adapter
        }

        val list = mutableListOf<Item>()
        for (i in 0 until 1000) {
            list.add(Grid(i, i + 1))
            list.add(Alpha("$i ${i + 1}"))
        }
        adapter.submitList(list)
    }
}