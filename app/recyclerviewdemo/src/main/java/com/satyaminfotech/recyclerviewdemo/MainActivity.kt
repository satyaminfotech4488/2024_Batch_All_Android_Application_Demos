package com.satyaminfotech.recyclerviewdemo

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var re1 = findViewById<RecyclerView>(R.id.eleRecycler)
        var re2 = findViewById<RecyclerView>(R.id.fashionRecycler)
        var re3 = findViewById<RecyclerView>(R.id.groRecycler)

        var txtEle = findViewById<TextView>(R.id.tvEle)
        var txtFashion = findViewById<TextView>(R.id.tvFashion)
        var txtGro = findViewById<TextView>(R.id.tvGroceries)


        var listElectronics = listOf(Item("Mobile",R.drawable.mobile),
            Item("Mobile",R.drawable.mobile),
            Item("Tablet",R.drawable.tablet),
            Item("TV",R.drawable.tv),
            Item("Charger",R.drawable.charger),
            Item("Powerbank",R.drawable.powerbank),
            Item("Mobile",R.drawable.mobile)
            )


        var listFashion = listOf(Item("Shirt",R.drawable.shirt),
            Item("T-Shirts",R.drawable.tshirt),
            Item("Wallet",R.drawable.wallet),
            Item("Watch",R.drawable.watch),
            Item("Belt",R.drawable.belt),
            Item("Shoes",R.drawable.shoes)
        )


        var listGroceries = listOf(Item("Rice",R.drawable.rice),
            Item("Oil",R.drawable.oil),
            Item("Wheat",R.drawable.wheat),
            Item("Sugar",R.drawable.sugar),
            Item("Daal",R.drawable.dal),
            Item("Tea",R.drawable.tea),
        )

        re1.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL,false)

        re2.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL,false)

        re3.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL,false)

        re1.adapter = ItemAdapter(listElectronics)
        re2.adapter = ItemAdapter(listFashion)
        re3.adapter = ItemAdapter(listGroceries)
    }
}