package neo.project.task.dossier.dossier;

import lombok.extern.slf4j.Slf4j;
import neo.project.task.dossier.dossier.DTO.EmailMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailConsumer {

    @KafkaListener(topics = "${kafka.topics[0].name}", groupId = "service-group")
    public void consumeFinishRegistrations(EmailMessage dto) {
        log.info("Получено сообщение из finish-registrations: {}", dto);
    }

    @KafkaListener(topics = "${kafka.topics[1].name}", groupId = "service-group")
    public void consumeSendEmails(EmailMessage dto) {
        log.info("Получено сообщение из send-emails: {}", dto);
    }

    @KafkaListener(topics = "${kafka.topics[2].name}", groupId = "service-group")
    public void consumeProcessPayments(EmailMessage dto) {
        log.info("Получено сообщение из process-payments: {}", dto);
    }

    @KafkaListener(topics = "${kafka.topics[3].name}", groupId = "service-group")
    public void consumeTosendsesTopic(EmailMessage dto) {
        log.info("Получено сообщение из send-ses: {}", dto);
    }

    @KafkaListener(topics = "${kafka.topics[4].name}", groupId = "service-group")
    public void consumeTocreditissuedTopic(EmailMessage dto) {
        log.info("Получено сообщение из credit-issued: {}", dto);
    }

    @KafkaListener(topics = "${kafka.topics[5].name}", groupId = "service-group")
    public void consumeTostatementdeniedTopic(EmailMessage dto) {
        log.info("Получено сообщение из statement-denied: {}", dto);
    }
}