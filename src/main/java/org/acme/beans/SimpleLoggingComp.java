package org.acme.beans;


import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;


import java.time.LocalDateTime;

@ApplicationScoped
@Slf4j

public class SimpleLoggingComp {

    public void  process(String message)
    {
        log.info("SimpleLoggingComp: "+message);
    }
}