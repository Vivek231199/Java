/* This program is for Method Oveloading Concepts */
class MethodOverloading{
    public int sum(int x,int y){
        return x + y;
    }
    public int sum(int x,int y,int z){
        return x + y + z;
    }
    public int sum(int x,int y,int z,int w){
        return x + y + z + w;
    }
    public static void main(String arg[]){
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.sum(1,2));
        System.out.println(mo.sum(1,2,3));
        System.out.println(mo.sum(1,2,3,4));
        
    }
}