package com.bratva.droidBot.appconfig;

import com.bratva.droidBot.botAPI.DroidBot;
import com.bratva.droidBot.botConfig.BotConfig;
import lombok.AllArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.client.RestTemplate;

@Configuration
@AllArgsConstructor
public class AppConfig {
    private BotConfig botConfig;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource
                = new ReloadableResourceBundleMessageSource();

        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    public DroidBot droidBot(){
        DroidBot droidBot = new DroidBot(botConfig.getWebHookPath(),botConfig.getUserName(),botConfig.getBotToken());
        return droidBot;
    }

}
