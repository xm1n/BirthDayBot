package com.example.blank.controller

import eu.vendeli.tgbot.TelegramBot
import eu.vendeli.tgbot.annotations.CommandHandler
import eu.vendeli.tgbot.api.message
import eu.vendeli.tgbot.types.User
import eu.vendeli.tgbot.types.internal.ProcessedUpdate

class StartController {
    @CommandHandler(["/start"])
    suspend fun start(update: ProcessedUpdate, bot: TelegramBot, user: User) {
        message("Hello").send(user, bot)
    }

    @CommandHandler(["/welcome"])
    suspend fun welcome(update: ProcessedUpdate, bot: TelegramBot, user: User) {
        message("Приветствую, пользователь\n Этот бот отправляет ваше поздравление Кирюше.").send(user, bot)
    }
}
