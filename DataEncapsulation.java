/* Encapsulation program in java */
class DataEncapsulation{
    private int age = 18;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public static void main(String[] args) {
        DataEncapsulation dec = new DataEncapsulation();
        dec.setAge(55);
        System.out.println(dec.getAge());
    }
}