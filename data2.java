import java.util.*;
 class Student {
    int rno=10;
    String name="Rahul";
    public void display(){
        System.out.println("Roll No: "+rno);
        System.out.println("Name: "+name);
    }
     
}
class B extends Student {
    public void display() {
        super.display();
    }

    
}

class Main{
    public static void main(String[] args) {
        B b=new B();
        b.display();
    }
}