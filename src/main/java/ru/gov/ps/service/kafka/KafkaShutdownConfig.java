package ru.gov.ps.service.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.listener.MessageListenerContainer;

import java.util.List;

@Configuration
public class KafkaShutdownConfig {

    @Bean
    public KafkaConsumerShutdown kafkaConsumerShutdown(List<MessageListenerContainer> listenerContainers) {
        return new KafkaConsumerShutdown(listenerContainers);
    }
}
