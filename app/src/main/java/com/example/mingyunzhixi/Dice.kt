package com.example.mingyunzhixi

import android.util.Log

class Dice (val numSides:Int){
    fun roll():Int{
        return (0..numSides).random()

    }
}