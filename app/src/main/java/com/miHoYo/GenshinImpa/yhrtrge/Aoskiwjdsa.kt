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
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.vnjvicjijds
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Aoskiwjdsa : Fragment() {
    val uhzxchuhuzx by activityViewModel<Losijdwhugydsa>(named("MainModel"))
    private lateinit var ydfijijjicxv: Context

    lateinit var adsoksda: String
    val aopskkoa: SharedPreferences by inject(named("SharedPreferences"))


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        uhzxchuhuzx.xlzlcok.observe(viewLifecycleOwner) {
            if (it!=null) {
                adsoksda = it.fockxv
                aopskkoa.edit().putString(vnjvicjijds, adsoksda).apply()
                findNavController().navigate(R.id.gdsgywhijjiwdas)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.psodkwjijiwd, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        ydfijijjicxv = context
    }


}