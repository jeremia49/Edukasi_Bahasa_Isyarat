package pw.jere.edukasi_tunarunggu

import android.content.Intent
import android.os.Bundle
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

        val judul = intent.getStringExtra("judul").toString()
        findViewById<TextView>(R.id.select_judul).setText(judul)

        val subbab : HashMap<String,List<String>> = HashMap()
        subbab.put("Salam", listOf( "Salam 1", "Salam 2" , "Salam 3", "Salam 4"))
        subbab.put("Alfabet", listOf( "Alfabet 1", "Alfabet 2" , "Alfabet 4", "Alfabet 5"))
        subbab.put("Angka", listOf( "Angka 1", "Angka 2" , "Angka 3", "Angka 4"))
        subbab.put("Keluarga", listOf( "Keluarga 1", "Keluarga 2" , "Keluarga 3", "Keluarga 5"))

        val deskripsi : HashMap<String,List<String>> = HashMap()
        deskripsi.put("Salam", listOf( "Salam 1", "Salam 2" , "Salam 3", "Salam 4"))
        deskripsi.put("Alfabet", listOf( "Alfabet 1", "Alfabet 2" , "Alfabet 4", "Alfabet 5"))
        deskripsi.put("Angka", listOf( "Angka 1", "Angka 2" , "Angka 3", "Angka 4"))
        deskripsi.put("Keluarga", listOf( "Keluarga 1", "Keluarga 2" , "Keluarga 3", "Keluarga 5"))

        val videoURL : HashMap<String,List<String>> = HashMap()
        videoURL.put("Salam", listOf( "https://nobar.jeremia.co/vid/new/y2mate.com%20-%20%E9%97%87%E9%9F%B3%E3%83%AC%E3%83%B3%E3%83%AAYou%20and%20beautiful%20worldUTAU%E3%82%AB%E3%83%90%E3%83%BC_v720P.mp4", "Salam 2" , "Salam 3", "Salam 4"))
        videoURL.put("Alfabet", listOf( "https://nobar.jeremia.co/vid/y2mate.com%20-%20Kano%20Interviewer_480p.mp4", "Alfabet 2" , "Alfabet 4", "Alfabet 4"))
        videoURL.put("Angka", listOf( "Angka 1", "Angka 2" , "Angka 3", "Angka 4"))
        videoURL.put("Keluarga", listOf( "Keluarga 1", "Keluarga 2" , "Keluarga 3", "Keluarga 4"))

        val s_subbab : List<String> = subbab.get(judul).orEmpty()
        val s_deskripsi : List<String> = deskripsi.get(judul).orEmpty()

        val listAdapter =  VideoList(this, s_subbab,s_deskripsi)

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
        }

