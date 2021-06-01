package pw.jere.edukasi_tunarunggu.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import pw.jere.edukasi_tunarunggu.R


class VideoList(context: Context, val title: List<String>,val imgid: List<Int> = listOf()) : ArrayAdapter<String>(context, R.layout.list_item, title) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView: View = inflater.inflate(R.layout.list_item, null, true)

        val titleText = rowView.findViewById<View>(R.id.title) as TextView
        val imageView: ImageView = rowView.findViewById<View>(R.id.icon) as ImageView

        titleText.setText(title.get(position))
        if(imgid.getOrNull(position) != null){
            imageView.setImageResource(imgid.get(position))
        }

        return rowView
    }





}