package ru.gov.ps.service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class KafkaConsumer {


    @KafkaListener(topics = "${topicOne}", groupId = "foo")
    public void listen(AzPersonFoundEventDEVCINEMA message) {

        System.out.println(message);
    }
}
