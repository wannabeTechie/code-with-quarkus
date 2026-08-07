
package org.ibs.routes;



import jakarta.enterprise.context.ApplicationScoped;
import org.apache.camel.builder.RouteBuilder;


@ApplicationScoped
public class ActiveMqReceiverRouter extends RouteBuilder {

    @Override
    public void configure() {

        from("activemq:queue:my-activemq-queue")
                .log("Received message from ActiveMQ: ${body}")
                .to("log:Received-message from ActiveMq");
    }
}

