package pw.jere.edukasi_tunarunggu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        (super.onCreate(savedInstanceState))
        setContentView(R.layout.menu_utama_2)
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





}