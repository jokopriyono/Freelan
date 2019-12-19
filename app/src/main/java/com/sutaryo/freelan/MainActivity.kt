package com.sutaryo.freelan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_freelancer.layoutManager = LinearLayoutManager(this)
        recycler_freelancer.setHasFixedSize(true)
        recycler_freelancer.adapter = FreelancerAdapter {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}
