package com.example.foodsmobile

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}