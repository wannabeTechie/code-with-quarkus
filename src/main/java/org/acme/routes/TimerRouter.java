/*
package org.acme.routes;

import jakarta.enterprise.context.ApplicationScoped;
import org.apache.camel.builder.RouteBuilder;

import java.time.LocalDateTime;

@ApplicationScoped
public class TimerRouter extends RouteBuilder {

    @Override
    public void configure() {
//input>>Transformation>>Logging/Storing
        //Timer
        //transformation
        //logging


        from("timer:first-timer")
              //  .transform().constant("My constant message")
                .transform().constant("Time is now:"+ LocalDateTime.now())
                .to("log:first-log");

    }
}

 */