package com.caren.wishlist
import android.content.ClipData.Item
import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.view.OneShotPreDrawListener.add
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    lateinit var wishList: ArrayList<Wishlist>
    lateinit var item: EditText
    lateinit var price: EditText
    lateinit var link: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button= findViewById<Button>(R.id.button)

        wishList=ArrayList()
        item=findViewById<EditText>(R.id.item)
        price=findViewById<EditText>(R.id.price)
        link=findViewById<EditText>(R.id.link)

        button.setOnClickListener{
            var itemname= item.text.toString()
            var priceofitem= price.text.toString()
            var linkofitem= link.text.toString()
          //Wishlist.add(Wishlist(itemname, priceofitem, linkofitem))
        }



        // Lookup the RecyclerView in activity layout
        val wishlistRV = findViewById<RecyclerView>(R.id.wishlistRV)
        // Fetch the list of emails // Create adapter passing in the list of emails
        val adapter = WishlistAdapter(wishList)
        // Attach the adapter to the RecyclerView to populate items
        wishlistRV.adapter = adapter
        // Set layout manager to position the items
        wishlistRV.layoutManager = LinearLayoutManager(this)


    }
}