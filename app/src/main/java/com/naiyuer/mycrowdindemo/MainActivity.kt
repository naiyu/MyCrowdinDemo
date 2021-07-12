package com.naiyuer.mycrowdindemo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.BaseContextWrappingDelegate

class MainActivity : AppCompatActivity() {

    private val contentFromApi = "1234567890123456789012345678901234567890123456789"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        val tv1 = findViewById<TextView>(R.id.tv1)
        val tv2 = findViewById<TextView>(R.id.tv2)
        // In the first, the TextView named tv1 and tv2 is marquee normal,
        // but when I try to update the content of tv1 by clicking a button which id is btnChange,
        // tv1 update its content, but not marquee any more.
        // when I remove the getDelegate method, it can do correctly normal.
        findViewById<Button>(R.id.btnChange).setOnClickListener { tv1.text = contentFromApi }
    }

    // remove this the tv1 will marquee correctly.
    override fun getDelegate(): AppCompatDelegate = BaseContextWrappingDelegate(super.getDelegate())
}