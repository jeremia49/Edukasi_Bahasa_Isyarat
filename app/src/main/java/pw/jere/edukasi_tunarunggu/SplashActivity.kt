package pw.jere.edukasi_tunarunggu

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        Handler(mainLooper).postDelayed(Runnable {
            startActivity(Intent(this@SplashActivity,MenuActivity::class.java))
            finish()
        },3000)
    }
}