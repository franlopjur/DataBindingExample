package com.betabeers.databindingexample.ui.activity

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.betabeers.databindingexample.*
import com.betabeers.databindingexample.databinding.ActivityMainBinding
import com.betabeers.databindingexample.extension.bindView
import com.betabeers.databindingexample.model.AndroidVersionModel
import com.betabeers.databindingexample.ui.activity.DetailActivity.Companion.newInstanceDetail
import com.betabeers.databindingexample.ui.adapter.AndroidVersionAdapter
import com.betabeers.databindingexample.util.ModelUtils

class MainActivity : AppCompatActivity() {

    private val mAndroidVersionList: Lazy<RecyclerView> = bindView(R.id.main__list__android_versions)
    private var mDataList = ModelUtils.generateModel()

    //region Public Methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinding()
        setUpRecyclerView()
    }
    //endregion

    //region Private Methods
    private fun initBinding() {
        val binding = DataBindingUtil
                .setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.dataList = mDataList
    }

    private fun setUpRecyclerView() {
        val adapter = AndroidVersionAdapter(mDataList, {
            navigateToDetail(it)
        })
        mAndroidVersionList.value.adapter = adapter
    }

    private fun navigateToDetail(androidVersion: AndroidVersionModel) {
        newInstanceDetail(this, androidVersion)
    }
    //endregion
}
