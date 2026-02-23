package com.satyaminfotech.democustompractice

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class CustomAdapter(
    var context: Context,
    var arraySocialMedia: Array<SocialMedia>
) : BaseAdapter(){
    override fun getCount(): Int {
       return arraySocialMedia.size
    }

    override fun getItem(position: Int): Any? {
        return arraySocialMedia[position]
    }

    override fun getItemId(position: Int): Long {
            return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
       //Create a View
        //Find the controls and map the controls
        //Set the values to all the controls
        var row: View
        row = LayoutInflater.from(context).inflate(R.layout.row,parent,false)
        var img = row.findViewById<ImageView>(R.id.img)
        var title = row.findViewById<TextView>(R.id.tvTitle)
        var desc = row.findViewById<TextView>(R.id.tvDesc)

        img.setImageResource(arraySocialMedia[position].img)
        title.setText(arraySocialMedia[position].title)
        desc.setText(arraySocialMedia[position].desc)

        return row


    }
}