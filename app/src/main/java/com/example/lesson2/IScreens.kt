package com.example.lesson2

import com.github.terrakok.cicerone.Screen

interface IScreens {
    fun users(): Screen
    fun userInfo(userName: String): Screen
}