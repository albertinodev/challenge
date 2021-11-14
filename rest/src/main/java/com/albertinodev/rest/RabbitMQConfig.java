package com.albertinodev.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Albertino Augusto */

@Configuration
public class RabbitMQConfig {

    @Bean
    DirectExchange sumCalExchange() {
        return new DirectExchange("sumCalc");
    }

    DirectExchange subtractCalExchange() {
        return new DirectExchange("subtractCalc");
    }

    DirectExchange divideCalExchange() {
        return new DirectExchange("divideCalc");
    }

    DirectExchange multiplyCalExchange() {
        return new DirectExchange("multiplyCalc");
    }

    @Bean
    Queue dlq() {
        return QueueBuilder.durable("cal.queue").build();
    }


    @Bean
    Binding binding() {
        return BindingBuilder.bind(queue()).to(exchange()).with("calc");
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    public AmqpTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jsonMessageConverter());
        return rabbitTemplate;
    }
}