package me.whn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        test test=context.getBean("a",me.whn.test.test.class);
        System.out.println(test.getA());
        System.out.println(context.getBean("a").getClass());
    }
}
