package com.example.placebook.model

import android.content.Context
import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class Bookmark(
    @PrimaryKey(autoGenerate = true) var id: Long? = null,
    var placeId: String? = null,
    var name: String = "",
    var address: String = "",
    var latitude: Double = 0.0,
    var longitude: Double = 0.0,
    var phone: String = ""
) {
    fun setImage(image: Bitmap, context: Context) {
        id?.let {

        }
    }

    companion object {
        fun generateImageFilename() {

        }
    }
}