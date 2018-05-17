package com.betabeers.databindingexample.ui.activity

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.android.databinding.library.baseAdapters.BR
import com.betabeers.databindingexample.R
import com.betabeers.databindingexample.model.AndroidVersionModel

class DetailActivity : AppCompatActivity() {

    private var mAndroidVersion: AndroidVersionModel? = null

    //- Constantes y métodos estáticos
    companion object {
        const val EXTRA_DETAIL_ANDROID_VERSION_MODEL = "EXTRA_DETAIL_ANDROID_VERSION_MODEL"

        fun newInstanceDetail(context: Activity, androidVersionModel: AndroidVersionModel) {
            val starter = Intent(context, DetailActivity::class.java)
            starter.putExtra(EXTRA_DETAIL_ANDROID_VERSION_MODEL, androidVersionModel)
            context.startActivity(starter)
        }
    }

    //region Public Methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadFromArguments()
        initBinding()
    }
    //endregion

    //region Private Methods
    private fun loadFromArguments() {
        mAndroidVersion = intent?.getSerializableExtra(EXTRA_DETAIL_ANDROID_VERSION_MODEL) as? AndroidVersionModel
    }

    private fun initBinding() {
        val binding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_detail)
        binding.setVariable(BR.androidVersion, mAndroidVersion)
    }
    //endregion
}
