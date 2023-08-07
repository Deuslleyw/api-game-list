package com.deusley.gamelistapi.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapper {

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
