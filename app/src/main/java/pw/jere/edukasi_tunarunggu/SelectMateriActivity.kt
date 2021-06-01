package pw.jere.edukasi_tunarunggu

import android.app.ActionBar
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import pw.jere.edukasi_tunarunggu.list.VideoList
import java.util.*
import kotlin.collections.HashMap

class SelectMateriActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.select_materi_view)

        window?.decorView?.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        val actionBar: ActionBar? = actionBar
        actionBar?.hide()


        val judul = intent.getStringExtra("judul").toString()
        findViewById<TextView>(R.id.select_judul).setText(judul)

        val subbab : HashMap<String,List<String>> = HashMap()
        subbab.put("Salam", listOf( "Selamat Pagi", "Selamat Siang" , "Selamat Sore", "Selamat Malam", "Selamat Idul Fitri", "Selamat Natal"))
        subbab.put("Alfabet", listOf( "Huruf A", "Huruf B", "Huruf C", "Huruf D", "Huruf E", "Huruf F", "Huruf G", "Huruf H", "Huruf I", "Huruf J", "Huruf K", "Huruf L", "Huruf M", "Huruf N", "Huruf O", "Huruf P", "Huruf Q", "Huruf R", "Huruf S", "Huruf T", "Huruf U", "Huruf V", "Huruf W", "Huruf X", "Huruf Y", "Huruf Z"))
        subbab.put("Angka", listOf( "Angka 1", "Angka 2", "Angka 3", "Angka 4", "Angka 5", "Angka 6", "Angka 7", "Angka 8", "Angka 9", "Angka 10"))
        subbab.put("Keluarga", listOf("Ayah", "Ibu", "Kakek", "Nenek", "Om", "Tante", "Abang", "Kakak", "Adek", "Sepupu"))

        val deskripsi : HashMap<String,String> = HashMap()
        deskripsi.put("Salam", "Berikut adalah beberapa\ncara salam")
        deskripsi.put("Alfabet", "Berikut adalah beberapa\nalfabet")
        deskripsi.put("Angka", "Berikut adalah beberapa\nangka")
        deskripsi.put("Keluarga", "Berikut adalah beberapa\nanggota keluarga")

        val videoURL : HashMap<String,List<Int>> = HashMap()
        videoURL.put("Salam", listOf(R.raw.selamat_pagi,R.raw.selamat_siang_,R.raw.selamat_sore,R.raw.selamat_malam,R.raw.selamat_idul_fitri_,R.raw.selamat_natal_ ))
        videoURL.put("Alfabet", listOf(R.raw.a, R.raw.b, R.raw.c, R.raw.d, R.raw.e, R.raw.f, R.raw.g, R.raw.h, R.raw.i, R.raw.j, R.raw.k, R.raw.l, R.raw.m, R.raw.n, R.raw.o, R.raw.p, R.raw.q, R.raw.r, R.raw.s, R.raw.t, R.raw.u, R.raw.v, R.raw.w, R.raw.x, R.raw.y, R.raw.z))
        videoURL.put("Angka", listOf(R.raw.satu, R.raw.dua, R.raw.tiga, R.raw.empat, R.raw.lima, R.raw.enam, R.raw.tujuh, R.raw.delapan, R.raw.sembilan, R.raw.sepuluh))
        videoURL.put("Keluarga", listOf(R.raw.ayah, R.raw.ibu, R.raw.kakek, R.raw.nenek, R.raw.om, R.raw.tante, R.raw.abang, R.raw.kakak, R.raw.adek, R.raw.sepupu))

        val s_icon : List<Int> = listOf(R.drawable.ic_ayah,R.drawable.ic_ibu,R.drawable.ic_kakek,R.drawable.ic_nenek,R.drawable.ic_om,R.drawable.ic_tante, R.drawable.ic_kakak,R.drawable.ic_abang,R.drawable.ic_adik,R.drawable.ic_sepupu)


        val s_subbab : List<String> = subbab.get(judul).orEmpty()
        val s_deskripsi : String = deskripsi.get(judul).orEmpty()

        findViewById<TextView>(R.id.deskripsi_judul).setText(s_deskripsi)

        var listAdapter : VideoList? = null
        if(judul.equals("Keluarga")){
            listAdapter =  VideoList(this, s_subbab,s_icon)
        }else{
            listAdapter =  VideoList(this, s_subbab)
        }


        val list = findViewById<ListView>(R.id.listview)
        list.adapter = listAdapter

        list.setOnItemClickListener { _, _, position, _ ->
                    startActivity(Intent(this,VideoActivity::class.java).apply {
                        this.putExtra("judul",judul)
                        this.putExtra("subjudul", subbab.get(judul)?.get(position))
                        this.putExtra("url",videoURL.get(judul)?.get(position))
                    })
                }
            }

    public fun backbtn(view:View){
        super.onBackPressed()
    }

}

