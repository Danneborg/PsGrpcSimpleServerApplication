package ru.gov.ps.service.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    private final KafkaTemplate<String, AzPersonFoundEventDEVCINEMA> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, AzPersonFoundEventDEVCINEMA> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(AzPersonFoundEventDEVCINEMA dto) {
        kafkaTemplate.send("ru.ps.test.cinema.bo.client.command.AzPersonFoundEventDEVCINEMA", dto);
    }
}
