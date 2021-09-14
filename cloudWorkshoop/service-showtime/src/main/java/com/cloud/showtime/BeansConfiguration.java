package com.cloud.showtime;

import com.example.multimodule.service.MainCommon;
import com.example.multimodule.service.utils.ResponseBuilder;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    @Bean
    public MainCommon myService(){
        return new MainCommon();
    }

    @Bean
    public ResponseBuilder responseBuilder(){
        return new ResponseBuilder();
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
