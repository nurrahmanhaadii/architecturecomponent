package id.haadii.submission.dicoding.architecturecomponent.tvShow


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import id.haadii.submission.dicoding.architecturecomponent.R
import kotlinx.android.synthetic.main.fragment_tv_show.*
import java.util.*
import id.haadii.submission.dicoding.architecturecomponent.detail.DetailActivity
import id.haadii.submission.dicoding.architecturecomponent.main.MainViewModel
import kotlin.collections.ArrayList

/**
 * A simple [Fragment] subclass.
 */
class TvShowFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var tvShowList: ArrayList<TvShow>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(Objects.requireNonNull(activity!!)).get(MainViewModel::class.java)

        tvShowList = viewModel.getTvShow()

        setRecyclerView()
    }

    private fun setRecyclerView() {
        rv_tv_show.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity)
            adapter = TvShowAdapter(activity!!, tvShowList) {
                val intent = Intent(activity, DetailActivity::class.java)
                intent.putExtra("tv_show", it)
                startActivity(intent)
            }

            pb_tv_show.visibility = View.GONE
        }
    }

}


