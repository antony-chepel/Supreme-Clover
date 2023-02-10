package com.miHoYo.GenshinImpa.util

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.miHoYo.GenshinImpa.R
import com.miHoYo.GenshinImpa.udgdfgd.Losijdwhugydsa
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Eqijsdhuhusad : Fragment() {
    private lateinit var sadjiw: Context

    val oxocokzksji by activityViewModel<Losijdwhugydsa>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.owijwuhds, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        sadjiw=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        oxocokzksji.palslpsakoasok(sadjiw)

        findNavController().navigate(R.id.suduhsadhu)

    }
}