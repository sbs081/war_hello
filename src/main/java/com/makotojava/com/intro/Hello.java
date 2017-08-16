package com.makotojava.com.intro;

import java.util.logging.Logger;

/**
 * Created by aronwong on 8/16/17.
 */

public class Hello {

    private static final Logger logger = Logger.getLogger(Hello.class.getName());

    public static void main(String[] args) {
        Hello hello = new Hello();

        hello.talk(new HelloCallback() {

            @Override
            public void sayHello(String whatToSay) {
                logger.info("This implementation says: " + whatToSay);
            }

        });
    }

    public void talk(HelloCallback helloCallback) {
        helloCallback.sayHello("Hello, world (how original :/)...");
    }

    interface HelloCallback {
        void sayHello(String whatToSay);
    }

}
