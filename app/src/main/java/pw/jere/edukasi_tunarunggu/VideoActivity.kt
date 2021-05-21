package pw.jere.edukasi_tunarunggu


import android.media.MediaPlayer
import android.widget.MediaController;
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class VideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.video_view)

        findViewById<TextView>(R.id.video_judul).setText(intent.getStringExtra("judul").toString())
        findViewById<TextView>(R.id.video_subjudul).setText(intent.getStringExtra("subjudul").toString())


        val progressbar = findViewById<View>(R.id.vid_progress_bar)

        val uri: Uri = Uri.parse(intent.getStringExtra("url").toString())
        val simpleVideoView = findViewById<View>(R.id.videoView) as VideoView // initiate a video view

        simpleVideoView.setVideoURI(uri)


        val mediaController  = MediaController(this)
        simpleVideoView.setMediaController(mediaController)
        simpleVideoView.start()

        simpleVideoView.keepScreenOn = true;
        simpleVideoView.setOnPreparedListener{
            progressbar.visibility = View.GONE

            it.setOnInfoListener { _, what, _ ->

                if(what == MediaPlayer.MEDIA_INFO_BUFFERING_START){
                    progressbar.visibility = View.VISIBLE
                }
                if(what == MediaPlayer.MEDIA_INFO_BUFFERING_END ){
                    progressbar.visibility = View.GONE
                }

                return@setOnInfoListener false;
            }

        }

    }
}