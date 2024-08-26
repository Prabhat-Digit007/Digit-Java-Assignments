package Practice;//package Practice;
//
//class student{
//    int roll;
//    String name;
//    public static int count = 0;
//
//    public student(String name){
//        this.name=name;
//        student.count += 1;
//        roll = count;
//        display();
//    }
//
//    public void display(){
//        System.out.println(name + ": " + roll);
//    }
//}
//
//public class pop3 {
//    public static void main(String[] args) {
//        student s1 = new student("Satvik");
//        student s2 = new student("Chandrakant");
//        student s3 = new student("Abhishek");
//
//    }
//}

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class pop3 {
//    public static void main(String[] args) {
//        BufferedReader reader = null;
//        try{
//            reader = new BufferedReader(new FileReader("example.txt"));
//            String line;
//            while((line = reader.readLine())!= null){
//                System.out.println(line);
//            }
//
//        } catch (IOException e ){
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                if (reader != null)
//                    reader.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
//
//    }
//}

import java.io.IOException;

class pop3{
    public static void main(String[] args) {
        int a;
        try {
            a = System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(a);
    }
}