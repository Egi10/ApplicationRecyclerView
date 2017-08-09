package com.example.egi_fcb.applicationrecycleradapter.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.egi_fcb.applicationrecycleradapter.Model.Movies
import com.example.egi_fcb.applicationrecycleradapter.R

/**
 * Created by egi_fcb on 8/10/17.
 */
class MoviesRecyclerAdapter(private val moviesList : List<Movies>) : RecyclerView.Adapter<MoviesRecyclerAdapter.MyViewHolder>() {
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var title : TextView = view.findViewById<TextView>(R.id.title)
        var year : TextView = view.findViewById<TextView>(R.id.year)
        var genre : TextView = view.findViewById<TextView>(R.id.genre)
    }

    override fun getItemCount(): Int {
        //To change body of created functions use File | Settings | File Templates.

        return moviesList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //To change body of created functions use File | Settings | File Templates.

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.movie_list_row, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //To change body of created functions use File | Settings | File Templates.

        val Movies = moviesList[position]
        holder.title.text = Movies.title
        holder.genre.text = Movies.genre
        holder.year.text = Movies.year
    }
}