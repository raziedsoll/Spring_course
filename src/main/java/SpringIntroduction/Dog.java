package SpringIntroduction;

public class Dog implements Pet {
    Dog(){
        System.out.println("Dog here");
    }
    @Override
    public void say(){
        System.out.println("WOw-wow");
    }
}
