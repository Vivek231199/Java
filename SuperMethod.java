/* This program is used for super method */
class Parent{
    public void run(){
        System.out.println("Hello this is super class method");
    }
}
class Child extends Parent{
    public void run(){
        System.out.println("Hello this is child class method");
    }
    public void display(){
        run();
        super.run();
    }
}
class SuperMethod{
    public static void main(String args[]){
        Child cs = new Child();
        cs.display();
    }
}