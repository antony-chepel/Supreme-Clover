package com.miHoYo.GenshinImpa

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.miHoYo.GenshinImpa.udgdfgd.GameActivity
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.hhhcbbhxvhus
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.spowokdjijisad
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.teuudh
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.appqlwkosdijw
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.vnjvicjijds
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.vuhhuvcjijifdji
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.kkkxzocksaijwj
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.bcbxvhuhushuds
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.apssookwjiisjdhuuxhchzu
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.bhivjuuhfuhdij
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.ycyvyuuhds
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.vicvjijbjihufhu
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.twwuuwhjisajidwdsa
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.llsoosodwjijwd
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.popsoodwijsdhuuhwd
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.cokdoksijejif
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.wokkowkosjid
import com.miHoYo.GenshinImpa.yhrtrge.Uetyeygsad
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class Oppwowjisd : Fragment() {
    private lateinit var ysadjiwjiijdwji: Context
    val cjixjiv: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ysadjiwjiijdwji = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.wijjisijdaw, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val okdskoakoasd = cjixjiv.getString(appqlwkosdijw, null)
        val oxocozpzxc = cjixjiv.getString(spowokdjijisad, null)
        val dsfjisdfji = cjixjiv.getString(wokkowkosjid, null)
        val eokkoaskodkoas = AppsFlyerLib.getInstance().getAppsFlyerUID(ysadjiwjiijdwji)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val wokqokksod = cjixjiv.getString("mainId", null)
        val kkkkcxizhusa = "com.miHoYo.GenshinImpa"
        val rkokokodf = cjixjiv.getString(vnjvicjijds, null)
        val eijjidasji = cjixjiv.getString("appCamp", null)
        val uhczyzgygycz = cjixjiv.getString("deepSt", null)

        val reisjd = Build.VERSION.RELEASE
        val huczokokczkoxsajasc = cjixjiv.getString(apssookwjiisjdhuuxhchzu, null)
        val rokekokoaskodkoij: String? = cjixjiv.getString(vuhhuvcjijifdji, null)

        val qpappasosk = Intent(activity, Uetyeygsad::class.java)
        val uuuuxucizizxc = Intent(activity, GameActivity::class.java)



        cjixjiv.edit().putString(teuudh, eokkoaskodkoas).apply()

        val aaokaskosajisahu = "$dsfjisdfji$llsoosodwjijwd$eijjidasji&$ycyvyuuhds$eokkoaskodkoas&$hhhcbbhxvhus$wokqokksod&$twwuuwhjisajidwdsa$kkkkcxizhusa&$vicvjijbjihufhu$reisjd&$popsoodwijsdhuuhwd$bhivjuuhfuhdij"
        val wijdko = "$dsfjisdfji$ycyvyuuhds$huczokokczkoxsajasc&$hhhcbbhxvhus$rokekokoaskodkoij&$twwuuwhjisajidwdsa$kkkkcxizhusa&$vicvjijbjihufhu$reisjd&$popsoodwijsdhuuhwd$bhivjuuhfuhdij"
        val ncnxjvhuds = "$dsfjisdfji$llsoosodwjijwd$uhczyzgygycz&$ycyvyuuhds$eokkoaskodkoas&$hhhcbbhxvhus$wokqokksod&$twwuuwhjisajidwdsa$kkkkcxizhusa&$vicvjijbjihufhu$reisjd&$popsoodwijsdhuuhwd$cokdoksijejif"
        val wokskod = "$dsfjisdfji$llsoosodwjijwd$uhczyzgygycz&$ycyvyuuhds$huczokokczkoxsajasc&$hhhcbbhxvhus$rokekokoaskodkoij&$twwuuwhjisajidwdsa$kkkkcxizhusa&$vicvjijbjihufhu$reisjd&$popsoodwijsdhuuhwd$cokdoksijejif"

        when(oxocozpzxc) {
            "1" ->
                if(eijjidasji!!.contains(kkkxzocksaijwj)) {
                    cjixjiv.edit().putString(bcbxvhuhushuds, aaokaskosajisahu).apply()
                    cjixjiv.edit().putString("WebInt", "campaign").apply()
                    startActivity(qpappasosk)
                    activity?.finish()
                } else if (uhczyzgygycz!=null||okdskoakoasd!!.contains(rkokokodf.toString())) {
                    cjixjiv.edit().putString(bcbxvhuhushuds, ncnxjvhuds).apply()
                    cjixjiv.edit().putString("WebInt", "deepLink").apply()
                    startActivity(qpappasosk)
                    activity?.finish()
                } else {
                    startActivity(uuuuxucizizxc)
                    activity?.finish()
                }
            "0" ->
                if(uhczyzgygycz!=null) {
                    cjixjiv.edit().putString(bcbxvhuhushuds, wokskod).apply()
                    cjixjiv.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(qpappasosk)
                    activity?.finish()
                } else if (okdskoakoasd!!.contains(rkokokodf.toString())) {
                    cjixjiv.edit().putString(bcbxvhuhushuds, wijdko).apply()
                    cjixjiv.edit().putString("WebInt", "geo").apply()
                    startActivity(qpappasosk)
                    activity?.finish()
                } else {
                    startActivity(uuuuxucizizxc)
                    activity?.finish()
                }
        }
    }
}
