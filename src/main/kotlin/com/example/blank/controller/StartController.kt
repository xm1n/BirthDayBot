package com.example.blank.controller

import eu.vendeli.tgbot.TelegramBot
import eu.vendeli.tgbot.annotations.CommandHandler
import eu.vendeli.tgbot.api.botactions.close
import eu.vendeli.tgbot.api.getFile
import eu.vendeli.tgbot.api.media.SendVoiceAction
import eu.vendeli.tgbot.api.message
import eu.vendeli.tgbot.types.ParseMode
import eu.vendeli.tgbot.types.User
import eu.vendeli.tgbot.types.internal.ImplicitFile
import eu.vendeli.tgbot.types.internal.ProcessedUpdate
import eu.vendeli.tgbot.types.keyboard.KeyboardButton
import eu.vendeli.tgbot.types.keyboard.ReplyKeyboardMarkup
import java.io.File

class StartController {
    @CommandHandler(["/start"])
    suspend fun start(update: ProcessedUpdate, bot: TelegramBot, user: User) {
        message { "Приветствую, пользователь\nЭтот бот отправляет ваше поздравление Кирюше.\nЕсли вам есть что сказать ему :)\n\n/send - отправить поздравление" }.options {
            parseMode = ParseMode.Markdown
        }.markup {
            ReplyKeyboardMarkup(
                KeyboardButton("/send")
            )
        }.send(user, bot)
    }

    @CommandHandler(["/send"])
    suspend fun send(update: ProcessedUpdate, bot: TelegramBot, user: User) {
        message { "Напиши сообщение:" }.send(user, bot)
        message { "Заранее спасибо!❤️" + "\nЕсли хочешь можешь подписаться на мой ТГ канал тыкай сюда: @xm1nya_life" }.send(
            user,
            bot
        )
        bot.handleUpdates {
            onMessage {
                message(
                    ("@" + user.username + " (" + user.firstName + " " + user.lastName + ") " + "отправил " + data.text)
                ).send(2087723441, bot)
            }
        }
    }

    @CommandHandler(["/welcome"])
    suspend fun welcome(update: ProcessedUpdate, bot: TelegramBot, user: User) {
        message("Приветствую, пользователь\n Этот бот отправляет ваше поздравление Кирюше.").send(user, bot)
    }
}