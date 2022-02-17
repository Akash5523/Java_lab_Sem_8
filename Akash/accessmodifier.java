class A{
    public void msg(){
        System.out.println("hello");
    }
}

public class B{
    public static void main(String[] args){
        A obj = new A();
        obj.msg();
    }
}
