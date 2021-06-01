package pw.jere.edukasi_tunarunggu


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    public fun sendToStart(view:View){
        startActivity(Intent(this@MainActivity,MenuActivity::class.java))
    }


}