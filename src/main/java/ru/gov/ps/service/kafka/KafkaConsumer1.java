package ru.gov.ps.service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer1 {


    @KafkaListener(topics = "${topicTwo}", groupId = "foo")
    public void listen(AzPersonFoundEventDEVCINEMA message) {

        System.out.println(message);
    }
}
