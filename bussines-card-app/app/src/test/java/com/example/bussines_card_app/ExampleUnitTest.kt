package com.example.bussines_card_app

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val letter: Char = readLine()!![0]
        val text: String = readln()
        val result = letter_count(letter, text)
        println(result)
    }

    private fun letter_count(letter: Char, text:String):String{
        return text.indexOf(letter).toString();
    }
}