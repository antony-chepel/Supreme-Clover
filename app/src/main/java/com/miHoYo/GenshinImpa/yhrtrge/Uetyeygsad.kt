package com.miHoYo.GenshinImpa.yhrtrge

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.miHoYo.GenshinImpa.udgdfgd.Tusijdwhusad
import com.miHoYo.GenshinImpa.databinding.OidjwjijisaBinding
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.teuudh
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.bcbxvhuhushuds
import com.miHoYo.GenshinImpa.util.Losoiwijwwuhuushdygw.apssookwjiisjdhuuxhchzu
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*


class Uetyeygsad : AppCompatActivity() {
    private var oqokkowjisijijasd: ValueCallback<Array<Uri>>? = null
    private var ppxcovksdjijisd: String? = null
    private  val ridjisfji = 1
    private lateinit var sudwgyygadshuuhasd: OidjwjijisaBinding
    lateinit var jxcvkjvsijsdi: WebView



    private val viewTusijdwhusad by viewModel<Tusijdwhusad>(
        named("BeamModel")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sudwgyygadshuuhasd = OidjwjijisaBinding.inflate(layoutInflater)
        jxcvkjvsijsdi = WebView(this)
        setContentView(jxcvkjvsijsdi)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(jxcvkjvsijsdi, true)
        viewTusijdwhusad.oiejjijidf(jxcvkjvsijsdi)

        jxcvkjvsijsdi.webViewClient = CustomView()
        jxcvkjvsijsdi.webChromeClient = Twijisjidhuwhusd()
        jxcvkjvsijsdi.loadUrl(rokkosdjicjiv())
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != ridjisfji || oqokkowjisijijasd == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var results: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (ppxcovksdjijisd != null) {
                    results = arrayOf(Uri.parse(ppxcovksdjijisd))
                }
            } else {
                val dataString = data.dataString
                if (dataString != null) {
                    results = arrayOf(Uri.parse(dataString))
                }
            }
        }
        oqokkowjisijijasd!!.onReceiveValue(results)
        oqokkowjisijijasd = null
        return
    }

    inner class CustomView: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (viewTusijdwhusad.fokrkodkosjicjixv(url)) {

                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    startActivity(intent)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            djeijijiasodkodkas(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Uetyeygsad, description, Toast.LENGTH_SHORT).show()
        }
    }




    private var cvijjibvjidf = false
    override fun onBackPressed() {

        if (jxcvkjvsijsdi.canGoBack()) {
            if (cvijjibvjidf) {
                jxcvkjvsijsdi.stopLoading()
                jxcvkjvsijsdi.loadUrl(ygvijjxivjxvc)
            }
            this.cvijjibvjidf = true
            jxcvkjvsijsdi.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                cvijjibvjidf = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun rokkosdjicjiv(): String {

        val odksfokeokk = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val osodijwhuhusd = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)

        val icvjijbjicvbhu = osodijwhuhusd.getString(bcbxvhuhushuds, null)
        Log.d("Lololol", icvjijbjicvbhu.toString())
        val rodkokofjsdfji = osodijwhuhusd.getString(apssookwjiisjdhuuxhchzu, null)
        val paskosakoas = osodijwhuhusd.getString(teuudh, null)


        when (osodijwhuhusd.getString("WebInt", null)) {
            "campaign" -> {
                viewTusijdwhusad.fkorkoodfis(paskosakoas.toString())
            }
            "deepLink" -> {
                viewTusijdwhusad.fkorkoodfis(paskosakoas.toString())
            }
            "deepLinkNOApps" -> {
                viewTusijdwhusad.fkorkoodfis(rodkokofjsdfji.toString())
            }
            "geo" -> {
                viewTusijdwhusad.fkorkoodfis(rodkokofjsdfji.toString())
            }
        }
        return odksfokeokk.getString("SAVED_URL", icvjijbjicvbhu).toString()
    }

    var ygvijjxivjxvc = ""
    fun djeijijiasodkodkas(xcjivxicj: String?) {
        if (!xcjivxicj!!.contains("t.me")) {

            if (ygvijjxivjxvc == "") {
                ygvijjxivjxvc = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    xcjivxicj
                ).toString()

                val fijroksdokf = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val sdjiwijd = fijroksdokf.edit()
                sdjiwijd.putString("SAVED_URL", xcjivxicj)
                sdjiwijd.apply()
            }
        }
    }

    inner class Twijisjidhuwhusd : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            posdlijwji: ValueCallback<Array<Uri>>?,
            eokskoad: FileChooserParams?
        ): Boolean {
            oqokkowjisijijasd?.onReceiveValue(null)
            oqokkowjisijijasd = posdlijwji
            var izxjcjiauhhuacs: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (izxjcjiauhhuacs!!.resolveActivity(packageManager) != null) {
                var huchuzijcajsji: File? = null
                try {
                    huchuzijcajsji = ookkaoijdjw()
                    izxjcjiauhhuacs.putExtra("PhotoPath", ppxcovksdjijisd)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (huchuzijcajsji != null) {
                    ppxcovksdjijisd = "file:" + huchuzijcajsji.absolutePath
                    izxjcjiauhhuacs.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(huchuzijcajsji)
                    )
                } else {
                    izxjcjiauhhuacs = null
                }
            }
            val rijijfijhucxhuvhu = Intent(Intent.ACTION_GET_CONTENT)
            rijijfijhucxhuvhu.addCategory(Intent.CATEGORY_OPENABLE)
            rijijfijhucxhuvhu.type = "image/*"
            val psodlwodwjiwjdi: Array<Intent?> = izxjcjiauhhuacs?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val tsudhhusadhu = Intent(Intent.ACTION_CHOOSER)
            tsudhhusadhu.putExtra(Intent.EXTRA_INTENT, rijijfijhucxhuvhu)
            tsudhhusadhu.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            tsudhhusadhu.putExtra(Intent.EXTRA_INITIAL_INTENTS, psodlwodwjiwjdi)
            startActivityForResult(tsudhhusadhu, ridjisfji)
            return true
        }

        fun ookkaoijdjw(): File? {
            val fjjicxijvji = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val sodkwkoko = "JPEG_" + fjjicxijvji + "_"
            val yhuashuasd = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                sodkwkoko,
                ".jpg",
                yhuashuasd
            )
        }
    }

    }

