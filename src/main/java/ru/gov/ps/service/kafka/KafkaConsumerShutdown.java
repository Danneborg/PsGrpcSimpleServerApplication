package ru.gov.ps.service.kafka;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.kafka.listener.MessageListenerContainer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KafkaConsumerShutdown implements DisposableBean {

    private final List<MessageListenerContainer> listenerContainers;

    public KafkaConsumerShutdown(List<MessageListenerContainer> listenerContainers) {
        this.listenerContainers = listenerContainers;
    }

    @Override
    public void destroy() throws Exception {
        for (MessageListenerContainer container : listenerContainers) {
            if (container.isRunning()) {
                container.stop();
            }
        }
    }
}
