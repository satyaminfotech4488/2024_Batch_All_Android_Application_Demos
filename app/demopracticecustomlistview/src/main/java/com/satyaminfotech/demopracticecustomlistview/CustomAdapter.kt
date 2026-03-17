package com.satyaminfotech.demopracticecustomlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class CustomAdapter(
    var context: Context,
    var arraySM: Array<SocialMedia>

) : BaseAdapter(){
    override fun getCount(): Int {
        //logic
        return arraySM.size

    }

    override fun getItem(position: Int): Any? {
        return arraySM[position]
    }

    override fun getItemId(position: Int): Long {
            return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        //Load the xml file
        var row: View
        row = LayoutInflater.from(context).inflate(R.layout.row,parent,false)


        //Map the controls

        var img1 = row.findViewById<ImageView>(R.id.img)
        var title = row.findViewById<TextView>(R.id.tvTitle)
        var desc = row.findViewById<TextView>(R.id.tvDesc)

        //Set the values to all the controls
        img1.setImageResource(arraySM[position].img)
        title.setText(arraySM[position].title)
        desc.setText(arraySM[position].desc)

        return row

    }
}