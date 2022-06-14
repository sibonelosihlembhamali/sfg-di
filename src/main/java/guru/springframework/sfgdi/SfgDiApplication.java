package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectionController;
import guru.springframework.sfgdi.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) cxt.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("----- Property");
		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) cxt.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());

		System.out.println("---- Setter");
		SetterInjectionController setterInjectionController = (SetterInjectionController) cxt.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());

		System.out.println("----- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) cxt.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
