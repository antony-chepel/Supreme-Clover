package com.miHoYo.GenshinImpa.udgdfgd

import android.app.Application
import android.content.Context
import com.miHoYo.GenshinImpa.ejidjidjisfijsdf
import com.miHoYo.GenshinImpa.tsdaasdjiiasd
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.jsuhwijqidjjiuhasdhuydgw
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.vuhhuvcjijifdji
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.vicijjichudushfgyeygf
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.apssookwjiisjdhuuxhchzu
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Hiwjjisudhwyg: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(jsuhwijqidjjiuhasdhuydgw)


        val disjjisdjifhu = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val jcxjnvdsvji = getSharedPreferences("PREFS_NAME", 0)

        val owowkijsdjia = MyTracker.getTrackerParams()
        val kcjxvhusdhusdvhu = MyTracker.getTrackerConfig()
        val wokskoadko = MyTracker.getInstanceId(this)
        kcjxvhusdhusdvhu.isTrackingLaunchEnabled = true
        val IDIN = UUID.randomUUID().toString()

        if (jcxjnvdsvji.getBoolean("my_first_time", true)) {
            owowkijsdjia.setCustomUserId(IDIN)
            disjjisdjifhu.edit().putString(apssookwjiisjdhuuxhchzu, IDIN).apply()
            disjjisdjifhu.edit().putString(vuhhuvcjijifdji, wokskoadko).apply()
            jcxjnvdsvji.edit().putBoolean("my_first_time", false).apply()
        } else {
            val cokxvkkoxc = disjjisdjifhu.getString(apssookwjiisjdhuuxhchzu, IDIN)
            owowkijsdjia.setCustomUserId(cokxvkkoxc)
        }
        MyTracker.initTracker(vicijjichudushfgyeygf, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Hiwjjisudhwyg)
            modules(
                listOf(
                    ejidjidjisfijsdf, tsdaasdjiiasd
                )
            )
        }
    }
}