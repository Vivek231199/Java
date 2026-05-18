/* This program is for super variable call */
class Parent{
    int maxAge = 25;
}
class Child extends Parent{
    int maxAge = 20;
    void display(){
        System.out.println("Parent class Age" + super.maxAge);
        System.out.println("Child class Age" + maxAge);
    }
}
public class SuperClass {
    public static void main(String arg[]){
        Child c = new Child();
        c.display();
    }
}
