package com.example.todo.Config;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("/secrets.properties")
@Configuration
public class PropConfig {

    @Autowired
    Environment env;
}
