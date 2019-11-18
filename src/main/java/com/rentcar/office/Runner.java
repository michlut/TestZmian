package com.rentcar.office;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private final ApplicationContext ctx;
    private final User user;

    Runner(ApplicationContext ctx, User user){
        this.ctx = ctx;
        this.user = user;
        //add line
    }

    @Override
    public void run(String... args) throws Exception {
        user.showInfo();
        System.out.println("Start");
    }
}
