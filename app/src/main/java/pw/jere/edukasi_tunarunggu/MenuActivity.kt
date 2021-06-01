package pw.jere.edukasi_tunarunggu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        (super.onCreate(savedInstanceState))
        setContentView(R.layout.menu_utama_2)

        window?.decorView?.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        val actionBar: android.app.ActionBar? = actionBar
        actionBar?.hide()
    }



    public fun selectSalam(view: View){
        startActivity(Intent(this@MenuActivity,SelectMateriActivity::class.java).apply {
            this.putExtra("judul","Salam")
        })
    }

    public fun selectAlfabet(view:View){
        startActivity(Intent(this@MenuActivity,SelectMateriActivity::class.java).apply {
            this.putExtra("judul","Alfabet")
        })
    }

    public fun selectAngka(view: View){
        startActivity(Intent(this@MenuActivity,SelectMateriActivity::class.java).apply {
            this.putExtra("judul","Angka")
        })
    }

    public fun selectKeluarga(view: View){
        startActivity(Intent(this@MenuActivity,SelectMateriActivity::class.java).apply {
            this.putExtra("judul","Keluarga")
        })
    }

    public fun sendToAbout(view:View){
        startActivity(Intent(this@MenuActivity,AboutActivity::class.java))
    }





}