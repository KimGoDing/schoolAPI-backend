package com.example.schoolapibackend.config;

import com.example.schoolapibackend.common.Decoder;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    /** feign 로깅 처리*/
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    /** feign custom decoder */
    @Bean
    feign.codec.Decoder feignDecoder(){
        return new Decoder();
    }
}
