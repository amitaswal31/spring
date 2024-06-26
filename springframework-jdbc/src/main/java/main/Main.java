package main;

import config.ProjectConfig;
import model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

import javax.sql.DataSource;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       try( var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
           ProductRepository  productRepository = context.getBean(ProductRepository.class);
//           Product p = new Product();
//           p.setName("Beer");
//           p.setPrice(10);
//
//           productRepository.addProduct(p);
           List<Product> products = productRepository.getProducts();
            products.forEach(System.out::println);
       }
    }
}
