/* This program is for Method Overriding */
class A{
    public void display(){
        System.out.println("base class");
    }
}
class B extends A{
    @Override
    public void display(){
        System.out.println("child class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
