package ru.olhovets.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.olhovets.springcourse.config.SpringConfig;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);


        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());

        context.close();

    }
}
