package SpringIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        //Если просто жаба
//        Pet pet = new Dog();
//        Person person = new Person(pet);
//        person.callYourPer();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        context.close();

        person.callYourPer();
//        System.out.println(person.getAge());
//        System.out.println(person.getSurname());
    }
}
