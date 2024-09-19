package net.javaguides.springannoations;

import net.javaguides.springannoations.controllers.MyController;
import net.javaguides.springannoations.controllers.PizzaController;
import net.javaguides.springannoations.repository.MyRepository;
import net.javaguides.springannoations.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAnnoationsApplication {

	public static void main(String[] args) {

 ConfigurableApplicationContext context=SpringApplication.run(SpringAnnoationsApplication.class, args);
// PizzaController pizzaController=context.getBean(PizzaController.class);
// System.out.println(pizzaController.getPizza());
       MyController myController = context.getBean(MyController.class);
        System.out.println( myController.hello());
        MyService myService=context.getBean(MyService.class);
        System.out.println( myService.hello());
        MyRepository myRepository=context.getBean(MyRepository.class);
        System.out.println(myRepository.hello());
	}

}
