package main;

import beans.MyBeans;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        MyBeans myBeans = context.getBean(MyBeans.class);
        System.out.println(myBeans);
        context.close();
    }
}
