package com.example.carousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.helper.widget.Carousel
import androidx.databinding.DataBindingUtil
import com.example.carousel.databinding.ActivityMainBinding
import com.vappfactory.carousel.CarouselAdapter

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

        adapter.submitList(listOf(Grid(1, 2), Alpha("")))
    }
}