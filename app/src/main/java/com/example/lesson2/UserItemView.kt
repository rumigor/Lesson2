package com.example.lesson2

interface UserItemView: IItemView {
    fun setLogin(text: String)
    fun getLogin() : String
}