package beans;

import org.springframework.stereotype.Component;

@Component
public class MyBeans {
    public MyBeans() {
        System.out.println("MyBeans instantiated!");
    }
}

