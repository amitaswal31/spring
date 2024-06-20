package config;

import beans.Cat;
import beans.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

//    @Bean
//    public Cat cat (){
//        Cat c =  new Cat();
//        c.setName("Tom");
//        return c;
//    }
//    @Bean
//    public Owner owner(Cat cat){
//        Owner o =  new Owner();
//        o.setCat(cat);
//        return o;
//    }
    @Bean
    @Qualifier("1")
    public Cat cat1(){
        Cat c = new Cat();
        c.setName("Tom");
        return c;
    }
    @Bean
    @Qualifier("2")
    public Cat cat2() {
        Cat c = new Cat();
        c.setName("Leo");
        return c;
    }
}
