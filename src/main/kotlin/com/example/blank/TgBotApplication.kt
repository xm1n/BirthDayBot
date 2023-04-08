package com.example.blank

import eu.vendeli.tgbot.TelegramBot
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val bot = TelegramBot("5867994957:AAGXSVReA7dtV1EwIgz4X0lOzUkMpHbN6LQ", "com.example.blank.controller")
    // And that's all write your own bot from blank.
    // Create new controllers in controller folder or expand old one

    bot.handleUpdates()
}
