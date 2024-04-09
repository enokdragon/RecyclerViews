package com.example.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviews.adapter.MyAdapter
import com.example.recyclerviews.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //setup what it looks like
        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3,
                            LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)

        //all about data
        arrayList = setupData()

        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter
    }

    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.boat, "A Carnival Cruise ship"))
        items.add(MyModel(R.drawable.cyberkat, "AI generated cyber cat"))
        items.add(MyModel(R.drawable.apples, "Apples are healthy"))
        items.add(MyModel(R.drawable.bananas, "Bananas are tastier than apples"))
        items.add(MyModel(R.drawable.books, "I like to read"))
        items.add(MyModel(R.drawable.burger, "Hamburgers are a good food"))
        items.add(MyModel(R.drawable.cat, "A Cat that looks like mine"))
        items.add(MyModel(R.drawable.cattle, "A cool cow"))
        items.add(MyModel(R.drawable.charmander, "A Charmander toy"))
        items.add(MyModel(R.drawable.coke, "A Coca-Cola beverage"))
        items.add(MyModel(R.drawable.curry, "A Chicken Curry"))
        items.add(MyModel(R.drawable.dragon, "A golden dragon"))
        items.add(MyModel(R.drawable.eagle, "Bald Eagles"))
        items.add(MyModel(R.drawable.hatteras, "A lighthosue in the OBX"))
        items.add(MyModel(R.drawable.hemp, "A beautiful flower"))
        items.add(MyModel(R.drawable.ketchikan, "Ketchikan, Alaska"))
        items.add(MyModel(R.drawable.komodo, "A Komodo Dragon"))
        items.add(MyModel(R.drawable.lighthouse, "A different lighthouse in OBX"))
        items.add(MyModel(R.drawable.math, "I like math and think it's cool"))
        items.add(MyModel(R.drawable.patagonia, "Patagonia"))
        items.add(MyModel(R.drawable.pikespeak, "Pikes Peak in the American Rockies"))
        items.add(MyModel(R.drawable.redwoods, "Redwood Trees"))
        items.add(MyModel(R.drawable.saffron, "The spice saffron"))
        items.add(MyModel(R.drawable.tacos, "Taco Tuesday"))
        items.add(MyModel(R.drawable.waves, "Waves crash on the shore"))






        return items
    }
}