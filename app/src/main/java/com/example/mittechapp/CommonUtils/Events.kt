package com.example.mittechapp.CommonUtils

open class Events<out T>(private val content: T) {
    var hasBeenHandled = false
        private set

    fun getContentIfNotHandled() = if (hasBeenHandled) {
        null
    } else {
        hasBeenHandled = true
        content
    }

    fun peekContent() = content
}