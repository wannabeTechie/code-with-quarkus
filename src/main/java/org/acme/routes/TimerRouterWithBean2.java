/*
package org.acme.routes;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.beans.GetCurrentTime;
import org.acme.beans.SimpleLoggingComp;
import org.apache.camel.builder.RouteBuilder;

@ApplicationScoped
public class TimerRouterWithBean2 extends RouteBuilder {

    @Inject
    private GetCurrentTime getCurrentTime;
    @Inject
    private SimpleLoggingComp  SimpleLoggingComp;

    @Override
    public void configure() {
//input>>Transformation>>Logging/Storing
        //Timer
        //transformation
        //logging


        from("timer:first-timer")
                .log("${body}")
                .transform().constant("My constant message from bean2")
                .log("${body}")
                .bean(getCurrentTime, "getTime")

                .bean(SimpleLoggingComp, "process")
                .log("${body}")
                .to("log:first-log");

    }
}

 */