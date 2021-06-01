package pw.jere.edukasi_tunarunggu.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import pw.jere.edukasi_tunarunggu.R


class VideoList(context: Context, title: List<String>) : ArrayAdapter<String>(context, R.layout.list_item, title) {
    val _title = title;

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView: View = inflater.inflate(R.layout.list_item, null, true)

        val titleText = rowView.findViewById<View>(R.id.title) as TextView
//        val imageView: ImageView = rowView.findViewById<View>(R.id.icon) as ImageView
//        val subtitleText = rowView.findViewById<View>(R.id.subtitle) as TextView


        titleText.setText(_title.get(position))
//        imageView.setImageResource(imgid.get(position))
//        subtitleText.setText(_subjudul.get(position))

        return rowView
    }





}