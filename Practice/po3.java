package Practice;

class A{
    int a=12;
    A(){
        System.out.println("Inside a");
    }

}
class B extends A{
    int b=13;
    B(){
        System.out.println("Inside b");
    }
}


public class po3{
    public static void main(String[] args) {

//        A a= new A();//inside a
//        B b= new B();//inside b
//
//        A p = new B();
//
//        System.out.println(p.a);

        Integer k =4;
        Integer l =4;
        if(k==l) System.out.println("same");
        System.out.println("not same");

    }
}
