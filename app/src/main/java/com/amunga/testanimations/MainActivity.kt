package com.amunga.testanimations

import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.amunga.testanimations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var avd: AnimatedVectorDrawableCompat
    private lateinit var avd2: AnimatedVectorDrawable


    private var switchNumber: Int = 0
    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.setOnClickListener {
            if (switchNumber == 0) {
                binding.imageView.setImageDrawable(resources.getDrawable(R.drawable.avd_plus_to_minus))
                val drawable: Drawable = binding.imageView.drawable

                if (drawable is AnimatedVectorDrawableCompat) {
                    avd = drawable
                    avd.start()
                } else if (drawable is AnimatedVectorDrawable) {
                    avd2 = drawable
                    avd2.start()
                }
                switchNumber++
            } else {
                binding.imageView.setImageDrawable(resources.getDrawable(R.drawable.avd_minus_to_plus))
                val drawable: Drawable = binding.imageView.drawable

                if (drawable is AnimatedVectorDrawableCompat) {
                    avd = drawable
                    avd.start()
                } else if (drawable is AnimatedVectorDrawable) {
                    avd2 = drawable
                    avd2.start()
                }

            }
        }


    }
}