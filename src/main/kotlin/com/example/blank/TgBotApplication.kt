package com.example.blank

import eu.vendeli.tgbot.TelegramBot
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val bot = TelegramBot("6295699160:AAGleZI1DwLi88Cv9ROjE-nplE9y643HzHE", "https://xm1nbot.herokuapp.com")
    // And that's all write your own bot from blank.
    // Create new controllers in controller folder or expand old one

    bot.handleUpdates()
}
