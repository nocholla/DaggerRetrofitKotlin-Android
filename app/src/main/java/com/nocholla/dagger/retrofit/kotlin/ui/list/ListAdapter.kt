package com.nocholla.dagger.retrofit.kotlin.ui.list

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.nocholla.dagger.retrofit.kotlin.R
import com.nocholla.dagger.retrofit.kotlin.model.Post
import kotlin.collections.ArrayList

class ListAdapter(private var context: Context?, private var list: List<Post>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = list!![position]

        // Title
        val postTitle = post.title.toString()
        Log.d("DEBUG ITEM TITLE", postTitle)
        holder.itemTitle.text = postTitle

        // Body
        val postBody = post.body.toString()
        Log.d("DEBUG ITEM BODY", postBody)
        holder.itemBody.text = postBody

        holder.itemView.setOnClickListener {
//            var postIntent = Intent(context, PostDetailsActivity::class.java)
//            postIntent.putExtra("title", postTitle)
//            postIntent.putExtra("body", postBody)
//
//            context!!.startActivity(postIntent)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle = itemView.findViewById(R.id.item_title) as TextView
        val itemBody = itemView.findViewById(R.id.item_body) as TextView
    }

}