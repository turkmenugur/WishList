package com.trkmn.wishlist.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.trkmn.wishlist.data.Wish
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun addAWish(wishEntity: Wish)

    //Loads all wishes from the wish table
    @Query("Select * from `wish-table`")
    abstract fun getAllWishes() : Flow<List<Wish>>

    @Update
    abstract fun updateAWish(wishEntity: Wish)

    @Delete
    abstract fun deleteAWish(wishEntity: Wish)

    @Query("Select * from `wish-table` where id=:id")
    abstract fun getAWishById(id:Long) : Flow<Wish>
}