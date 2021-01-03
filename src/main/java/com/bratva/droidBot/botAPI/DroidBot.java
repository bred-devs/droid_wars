package com.bratva.droidBot.botAPI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
@PropertySource("classpath:application.properties")
public class DroidBot extends TelegramLongPollingBot {

    @Value("${telegrambot.userName}")
    private String botName;

    @Value("${telegrambot.botToken}")
    private String botToken;


    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (!update.hasMessage() || !update.getMessage().hasText())
            return;

        SendMessage message = new SendMessage()
                .setChatId(update.getMessage().getChatId())
                .setText("Hello" + update.getMessage().getAuthorSignature());
        try {
           execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
