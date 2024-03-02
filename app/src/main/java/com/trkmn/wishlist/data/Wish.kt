package com.trkmn.wishlist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    @ColumnInfo("wish-title")
    val title : String = "",
    @ColumnInfo("wish-desc")
    val description : String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google watch 2", description = "An android watch"),
        Wish(title = "Oculus Quest 2", description = "A VR headset for playing games"),
        Wish(title = "A sci-fi book", description = "A science fiction book from any seller"),
        Wish(title = "Macbook Pro", description = "A good laptop for coding")
    )
}