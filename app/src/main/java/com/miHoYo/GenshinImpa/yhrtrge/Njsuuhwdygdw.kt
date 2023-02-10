package com.miHoYo.GenshinImpa.yhrtrge

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.miHoYo.GenshinImpa.R
import com.miHoYo.GenshinImpa.udgdfgd.Losijdwhugydsa
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.spowokdjijisad
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Njsuuhwdygdw : Fragment() {
    lateinit var dokokekokasdk: String
    private lateinit var icjjixcv: Context
    val froosdfijsd by activityViewModel<Losijdwhugydsa>(named("MainModel"))
    val fokokxckovkox: SharedPreferences by inject(named("SharedPreferences"))


    override fun onAttach(context: Context) {
        super.onAttach(context)
        icjjixcv = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.ijsjd, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sijdajisd = fokokxckovkox.getString(spowokdjijisad, null)
        val usuadjaids = fokokxckovkox.getString("appCamp", null)

        if (sijdajisd=="1" &&usuadjaids == null) {
            froosdfijsd.bcxvjivcjisd(icjjixcv)
            froosdfijsd.ixcjzivniv.observe(viewLifecycleOwner) {
                if (it != null) {
                    dokokekokasdk = it.toString()
                    fokokxckovkox.edit().putString("appCamp", dokokekokasdk).apply()
                    findNavController().navigate(R.id.bvcicijcjivhusd)
                }
            }
        } else {
            findNavController().navigate(R.id.bvcicijcjivhusd)
        }
    }

}