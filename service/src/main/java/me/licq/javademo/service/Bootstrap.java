package me.licq.javademo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by robertlee on 6/14/16.
 */
public class Bootstrap {
    public static void main(String[] args){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        classPathXmlApplicationContext.refresh();
        classPathXmlApplicationContext.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("service started!");

        String strIn = scanner.nextLine();
        while (strIn != "stop"){
            strIn = scanner.nextLine();
        }

        System.out.println("service stop!");
    }
}
