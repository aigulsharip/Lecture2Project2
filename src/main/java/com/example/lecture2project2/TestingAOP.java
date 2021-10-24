package com.example.lecture2project2;

import com.example.lecture2project2.config.SpringConfig;
import com.example.lecture2project2.dao.JdbcProductDao;
import com.example.lecture2project2.dao.ProductDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestingAOP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


        ProductDAO productDAO = context.getBean(ProductDAO.class);

        System.out.println("The name of product with 1st ID " +
                productDAO.findProductById(1));

        System.out.println("***************************");


        System.out.println(productDAO.checkAroundAdvice());

        context.close();

    }
}
