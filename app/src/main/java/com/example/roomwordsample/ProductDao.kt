package com.example.roomwordsample

import androidx.room.Dao
import androidx.room.Query

@Dao

interface ProductDao{
    @Query("SELECT * FROM product")
    fun getAllProducts(): List<Product>
}