package com.caren.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishlistAdapter(private val wishList: List<Wishlist>) : RecyclerView.Adapter<WishlistAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Provide a direct reference to each of the views within a data item
// Used to cache the views within the item layout for fast access


        // Your holder should contain a member variable for any view that will be set as you render
        // a row
        val productView: TextView
        val priceView: TextView
        val linkView: TextView

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view
        init {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            productView = itemView.findViewById(R.id.item)
            priceView = itemView.findViewById(R.id.price)
            linkView = itemView.findViewById(R.id.link)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.wish_list_layout, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val wishList = wishList.get(position)
        // Set item views based on views and data model
        holder.productView.text = wishList.item
        holder.priceView.text = wishList.price
        holder.linkView.text = wishList.link
    }

    override fun getItemCount(): Int {
        return wishList.size
    }

}