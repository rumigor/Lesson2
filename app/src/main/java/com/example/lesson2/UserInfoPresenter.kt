package com.example.lesson2

import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter

class UserInfoPresenter (val router: Router) : MvpPresenter<UsersView>() {

    fun backPressed(): Boolean {
        router.exit()
        return true
    }
}