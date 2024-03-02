package com.trkmn.wishlist

import android.content.Context
import androidx.room.Room
import com.trkmn.wishlist.data.WishDatabase
import com.trkmn.wishlist.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context, WishDatabase::class.java, "wishlist.db").build()
    }
}