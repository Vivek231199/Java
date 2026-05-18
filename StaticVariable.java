/* This Program is use for static keyword of variable */
public class StaticVariable {
    String name;
    int age;
    static String college = "GEC MODASA";
    public StaticVariable(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void display_result(){
        System.out.println("Name is:" + this.name + " " + "Age is:" + this.age + " " + "College is:" + this.college);
    }
    
    public static void main(String arg[]){
       StaticVariable sc = new StaticVariable("Vivek",18);
       StaticVariable sc1 = new StaticVariable("Parth",18);
       sc.display_result();
       sc1.display_result();
    }
}
