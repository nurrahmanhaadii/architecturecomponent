package id.haadii.submission.dicoding.architecturecomponent.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import id.haadii.submission.dicoding.architecturecomponent.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        view_pager_main.adapter = MyPagerAdapter(supportFragmentManager, this)
        tab_layout.setupWithViewPager(view_pager_main)
    }

}
