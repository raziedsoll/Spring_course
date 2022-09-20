package SpringIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        context.close();

        person.callYourPer();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
    }
}
