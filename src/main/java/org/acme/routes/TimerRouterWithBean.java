/*
package org.acme.routes;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.beans.GetCurrentTime;
import org.apache.camel.builder.RouteBuilder;

import java.time.LocalDateTime;

@ApplicationScoped
public class TimerRouterWithBean extends RouteBuilder {

    @Inject
    GetCurrentTime getCurrentTime;

    @Override
    public void configure() {
//input>>Transformation>>Logging/Storing
        //Timer
        //transformation
        //logging


        from("timer:first-timer")
              //  .transform().constant("My constant message")
                .bean(getCurrentTime, "getTime")
                .to("log:first-log");

    }
}

 */