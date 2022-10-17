package com.astitvasingh.tothenew.Spring.Framework.Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkAssignmentApplication {

    public static void main(String[] args) {

//		BinarySearchImplementation binarySearch = new BinarySearchImplementation(new BubbleSort());
// Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringFrameworkAssignmentApplication.class, args);

        BinarySearchImplementation binarySearchImplementation = applicationContext.getBean(BinarySearchImplementation.class);

        int result = binarySearchImplementation.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},4);

        if(result>=0)
		    System.out.println("At Index : "+result);
        else
            System.out.println("Number not found");

    }

}
