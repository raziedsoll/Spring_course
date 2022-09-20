package SpringIntroduction;

public class Dog implements Pet {
//    private String name;
    Dog(){
        System.out.println("Dog here");
    }
    @Override
    public void say(){
        System.out.println("WOw-wow");
    }

    public void init(){
        System.out.println("class dog init method");
    }


    public void destroy(){
        System.out.println("class dog destroy method");
    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
