package com.bratva.droidBot.botConfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "telegrambot")
@Getter
@Setter
public class BotConfig {
    private String webHookPath;
    private String userName;
    private String botToken;
}
