package com.miHoYo.GenshinImpa.util

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
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.appqlwkosdijw
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.wokkowkosjid
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Njishudwhusda : Fragment() {
    val siadjjiw by activityViewModel<Losijdwhugydsa>(named("MainModel"))
    lateinit var kvcxuvijsdjids: String
    lateinit var eokskoado: String
    lateinit var appaoksako: String
    private lateinit var fjicxjiv: Context

    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.wuhwhusda, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fjicxjiv = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        siadjjiw.sokfkosfkofko.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                shareP.edit().putString("mainId", main).apply()
            }
        }

        siadjjiw.aplsaslpps.observe(viewLifecycleOwner) {
            if (it != null) {

                kvcxuvijsdjids = it.gijjidfjis
                appaoksako = it.eoksakod
                eokskoado = it.oczxkzxo

                shareP.edit().putString(appqlwkosdijw, kvcxuvijsdjids).apply()
                shareP.edit().putString(Losoiwijwwuhuushdygw.spowokdjijisad, appaoksako).apply()
                shareP.edit().putString(wokkowkosjid, eokskoado).apply()

                findNavController().navigate(R.id.eoksaokdjiwjiasd)
            }
        }
    }
}