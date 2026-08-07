package org.acme.routes;



import jakarta.enterprise.context.ApplicationScoped;
import org.apache.camel.builder.RouteBuilder;


@ApplicationScoped
public class ActiveMqRouter extends RouteBuilder {

    @Override
    public void configure() {

        from("timer:active-mq-timer?period=10000")
                .transform().constant("My message for ActiveMQ")
                .log("Received message from ActiveMQ: ${body}")
                .to("activemq:queue:my-activemq-queue");
    }
}