/* this program is used for super constructor call */
class Parent{
    Parent(){
        System.out.println("Hello This is Parent class constructor");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Hello This is Child class constructor");

    }
}
class SuperConstructor{
    public static void main(String[] args) {
        Child cs = new Child();
    }
}