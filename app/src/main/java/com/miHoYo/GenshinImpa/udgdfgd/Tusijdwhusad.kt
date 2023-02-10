package com.miHoYo.GenshinImpa.udgdfgd

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class Tusijdwhusad(sodijwjidis: Application): ViewModel() {
    val fokkoxcv = sodijwjidis.packageManager


    fun fokrkodkosjicjixv(dokasd: String): Boolean {
        try {
            fokkoxcv.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }
    fun oiejjijidf(fokckox: WebView): WebSettings{
       val ivjjifdjiuh = fokckox.settings
        ivjjifdjiuh.javaScriptEnabled = true
        ivjjifdjiuh.useWideViewPort = true
        ivjjifdjiuh.setSupportMultipleWindows(false)
        ivjjifdjiuh.displayZoomControls = false


        ivjjifdjiuh.builtInZoomControls = true
        ivjjifdjiuh.allowFileAccess = true
        ivjjifdjiuh.allowContentAccess = true
        ivjjifdjiuh.setSupportZoom(true)
        ivjjifdjiuh.pluginState = WebSettings.PluginState.ON
        ivjjifdjiuh.loadWithOverviewMode = true
        ivjjifdjiuh.allowFileAccess = true
        ivjjifdjiuh.domStorageEnabled = true
        ivjjifdjiuh.userAgentString = ivjjifdjiuh.userAgentString.replace("; wv", "")
        ivjjifdjiuh.javaScriptCanOpenWindowsAutomatically = true

        ivjjifdjiuh.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        ivjjifdjiuh.cacheMode = WebSettings.LOAD_DEFAULT
        ivjjifdjiuh.allowContentAccess = true
        ivjjifdjiuh.mediaPlaybackRequiresUserGesture = false
        return ivjjifdjiuh
    }
    fun fkorkoodfis(kcxkvokijsd: String) {
        OneSignal.setExternalUserId(
            kcxkvokijsd,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(ovkcijvbjfhu: JSONObject) {
                    try {
                        if (ovkcijvbjfhu.has("push") && ovkcijvbjfhu.getJSONObject("push").has("success")) {
                            val dokeokkodfsfjid = ovkcijvbjfhu.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $dokeokkodfsfjid"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (ovkcijvbjfhu.has("email") && ovkcijvbjfhu.getJSONObject("email").has("success")) {
                            val qowkkosjisdjiajid =
                                ovkcijvbjfhu.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $qowkkosjisdjiajid"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (ovkcijvbjfhu.has("sms") && ovkcijvbjfhu.getJSONObject("sms").has("success")) {
                            val isSmsSuccess = ovkcijvbjfhu.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $isSmsSuccess"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }




}