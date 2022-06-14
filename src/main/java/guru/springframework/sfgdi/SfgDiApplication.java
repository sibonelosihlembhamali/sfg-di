package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
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
		I18nController i18nController = (I18nController) cxt.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) cxt.getBean("myController");

		System.out.println("----- Primary Bean");
		System.out.println(myController.sayHello());

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
