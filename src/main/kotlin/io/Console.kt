package io

import java.util.*

class Console {

    fun input(): String {
        val scanner = Scanner(System.`in`)
        val text = scanner.next()
        validate(text)
        return text
    }

    private fun validate(string: String) {
        require(!string.isNullOrBlank())
    }

    fun output(number: Int) {
        println(number)
    }
}