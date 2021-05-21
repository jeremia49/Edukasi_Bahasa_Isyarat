package pw.jere.edukasi_tunarunggu

import android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        (super.onCreate(savedInstanceState))

        setContentView(R.layout.about_view)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            findViewById<TextView>(R.id.about_text).justificationMode = JUSTIFICATION_MODE_INTER_WORD
        }

    }

}