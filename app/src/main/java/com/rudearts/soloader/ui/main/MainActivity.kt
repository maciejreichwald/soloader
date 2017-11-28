package com.rudearts.soloader.ui.main

import android.os.Bundle
import com.rudearts.soloader.R
import com.rudearts.soloader.ui.ToolbarActivity

class MainActivity : ToolbarActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(getString(R.string.so_loader))
        showSearchView()
    }

    override fun provideSubContentViewId() = R.layout.activity_main
}
