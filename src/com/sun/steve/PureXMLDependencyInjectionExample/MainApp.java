package com.sun.steve.PureXMLDependencyInjectionExample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**This app is running fine! It helps me understand how @Resource annotation works! Cool!
 * Look at this project along with other two:
 * SpringPureXMLDependencyInjectionExample
 * Spring@RessourceAnnotationExample
 * to help me better understand the three possible ways to do DI using Spring.*/
public class MainApp {

    public static void main(String... args) {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            Person p =(Person) context.getBean("person");

            System.out.println(p.getCity().toString());
            System.out.println(p.getWife().toString());
            System.out.println(p.getCareer().toString());
    } 
}