package com.example.guessnumber

import kotlin.random.Random

fun main () {
    val rand_num = Random.nextInt(101)
    println(rand_num)

    print("Please enter the number: ")

    var counter = 3
    while (counter > 0) {
        var user_num = readLine()!!.toInt()

        if(rand_num == user_num) {
            println("Congratulations! You guessed right!")
        } else if (rand_num < user_num) {
            counter--
            println("Remaining: $counter")
            if(counter != 0)
                print("The number that you entered is greater than the number! Please enter a number again: ")
            else
                print("You could not make it in 3 attempts! Let's play this game again!")
        }
        else {
            counter--
            println("Remaining: $counter")
            if (counter != 0)
                print("The number that you entered is less than the number! Please enter a number again: ")
            else
                print("You could not make it in 3 attempts! Let's play this game again!")
        }
    }
}