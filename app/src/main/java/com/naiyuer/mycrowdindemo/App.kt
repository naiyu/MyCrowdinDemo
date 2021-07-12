package com.naiyuer.mycrowdindemo

import android.app.Application
import com.crowdin.platform.Crowdin
import com.crowdin.platform.CrowdinConfig
import com.crowdin.platform.data.remote.NetworkType

/**
 * @author : naiyu
 * date : 2021/7/12
 * e-mail: hnaiyu@gmail.com
 * description:
 **/
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initCrowdin();
    }

    private fun initCrowdin() {
        val config = CrowdinConfig.Builder()
            .withScreenshotEnabled()
            .withSourceLanguage("en")
            .withDistributionHash("") // the distributionHash
            .withNetworkType(NetworkType.ALL)
            .withUpdateInterval(900L)
            .build()
        Crowdin.init(this, config)
    }
}