package com.example.foodsmobile

class Greeting {
    fun greeting(): String {
        return "Your current device is , ${Platform().platform}!"
    }
}