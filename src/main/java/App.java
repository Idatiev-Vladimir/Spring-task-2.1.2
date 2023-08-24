import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHelloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("first bean helloworld: " + beanHelloWorld.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("second bean helloworld: " + bean2.getMessage());

        boolean checkBeanHelloWorld = beanHelloWorld == bean2;
        System.out.println(checkBeanHelloWorld + ": " + beanHelloWorld + ", " + bean2);

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println("first bean cat: " + beanCat.getMessage());

        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println("second bean cat: " + beanCat2.getMessage());

        boolean checkBeanCat = beanCat == beanCat2;
        System.out.println(checkBeanCat + ": " + beanCat + ", " + beanCat2);
    }
}