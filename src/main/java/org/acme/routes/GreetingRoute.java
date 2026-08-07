package org.acme.routes;

/*
import jakarta.enterprise.context.ApplicationScoped;
import org.apache.camel.builder.RouteBuilder;

@ApplicationScoped
public class GreetingRoute extends RouteBuilder {

    @Override
    public void configure() {

        from("platform-http:/greet")
                .process(exchange -> {
                    String name = exchange.getIn()
                            .getHeader("name", String.class);

                    if (name == null || name.isBlank()) {
                        name = "Guest";
                    }

                    exchange.getMessage()
                            .setBody("Hello " + name);
                });
    }
}
*/