package org.acme.beans;


import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDateTime;

@ApplicationScoped
public class GetCurrentTime {

    public String getTime() {
        return "Time is now from Bean: " + LocalDateTime.now();
    }
}