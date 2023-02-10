package com.miHoYo.GenshinImpa

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface Yuwijsjidhuxhuc {
    @GET("json/?key=LbwKKoO9eF4GLMz")
    suspend fun fokkocxkovo(): Response<Aokskokodwjisd>
}
@Keep
data class Twijjsidjia(
    @SerializedName("sup_gge")
    val gijjidfjis: String,
    @SerializedName("sup_cl_vvv")
    val oczxkzxo: String,
    @SerializedName("sup_cl_appp")
    val eoksakod: String,
)
interface Wisjdokkoxckoz {
    @GET("typo.json")
    suspend fun fokkcoxkov(): Response<Twijjsidjia>
}


class Aokskodjis(private val fokkocxkovko: Wisjdokkoxckoz) {
    suspend fun getDataDev() = fokkocxkovko.fokkcoxkov()
}

@Keep
data class Aokskokodwjisd(
    @SerializedName("countryCode")
    val fockxv: String,
)

class Oiwjjishudhuhuxczhu(private val uyxcggyvxc: Yuwijsjidhuxhuc) {
    suspend fun orkkoekokosdf() = uyxcggyvxc.fokkocxkovo()
}
