package Practice;

@FunctionalInterface
interface C {
    public void m1();
}

@FunctionalInterface
interface D extends C{

        public void m1();       //valid
//    public void m2();   // error because we used m1() in upper function
}


//Lamda Expression with Funtional Interface
class FunctionalInterfaceImplementation1{
    public static void main(String[] args) {

    }
}

//(int a) -> {return a*a;};     // valid
//(int a) -> a*a;     // valid

//(int a) -> {a*a;};     // invalid
//(int a) -> {return a*a};     // invalid
//(int a) -> {return a*a;}     // invalid
//(int a) -> return a*a;     // invalid
//(int a) -> {a*a};     // invalid

//a -> a*a;
//a -> {return a*a;};
//(a,b) -> a*b;
//(int a,int b) -> a*b;
//a,b -> a*b; // invalid

//Lambda Expression can only be use with FunctionalInterface

//All the inferfaces we use make .class file but dont create .class file when you call that interface

//@FunctionalInterface
//interface Interf{
//    public int squreIt(int n);
//}
//class fnI{
//    public static void main(String[] args){
//        Interf i = n -> n*n;
//        System.out.println(i.squreIt(4));
//        System.out.println(i.squreIt(5));
//    }
//}

