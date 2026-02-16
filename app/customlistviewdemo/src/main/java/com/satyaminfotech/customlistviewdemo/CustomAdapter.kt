package com.satyaminfotech.customlistviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(
    var context: Context,
    var dataset: Array<SocialMedia>

) : BaseAdapter() {
    override fun getCount(): Int {
            return dataset.size
    }

    override fun getItem(position: Int): Any? {
       return dataset[position]
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
       // Create a separate view for row.

        var row: View
        //Load the xml file
        // Use Lay - inflate(layout, parent, root)

       row = LayoutInflater.from(context).inflate(R.layout.row,parent,false)

        //Map the controls

        var img = row.findViewById<ImageView>(R.id.img)
        var title = row.findViewById<TextView>(R.id.tvTitle)
        var desc = row.findViewById<TextView>(R.id.tvDesc)

        //Set the values to those controls
        img.setImageResource(dataset[position].logo)
        title.setText(dataset[position].title)
        desc.setText(dataset[position].desc)

        return row


    }
}