package com.bratva.droidBot.botAPI;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Setter
@AllArgsConstructor
public class DroidBot extends TelegramWebhookBot {
    private String botPath;
    private String botUsername;
    private String botToken;

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public String getBotPath() {
        return botPath;
    }

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        SendMessage replyMessageToUser = new SendMessage(update.getMessage().getChatId(),"Hi "+ update.getMessage().getAuthorSignature());
        try {
            execute(replyMessageToUser);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        return replyMessageToUser;
    }

}
