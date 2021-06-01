package pw.jere.edukasi_tunarunggu

import android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        (super.onCreate(savedInstanceState))

        setContentView(R.layout.about_view)

        window?.decorView?.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        val actionBar: android.app.ActionBar? = actionBar
        actionBar?.hide()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            findViewById<TextView>(R.id.about_text).justificationMode = JUSTIFICATION_MODE_INTER_WORD
        }

    }

    public fun backbtn(view:View){
        super.onBackPressed()
    }

}