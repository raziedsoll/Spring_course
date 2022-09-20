package SpringIntroduction;


import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {


    Cat() {
        System.out.println("Cat here");
    }

    @Override
    public void say() {
        System.out.println("May-may");
    }
}
