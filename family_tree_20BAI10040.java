// 20BAI10040 Shankar Lohar CSE3002 Programming in Java
interface G_G_Parent{
    void speak();
    void write();
    void talk();
}
interface G_G_Parent1{
    void sleep();
}
abstract class G_Parent implements G_G_Parent{
    void running(){ System.out.println("I can run like my grand parent!");}
    void type_writing(){ System.out.println("I can type write like my grand parent!");}
}
class Parent extends G_Parent{
    @Override
    public void speak() { System.out.println("I can speak like my parent, grand parent and great grand parent!");}
    @Override
    public void write() { System.out.println("I can write like my parent, grand parent and great grand parent!");}
    @Override
    public void talk() { System.out.println("I can run like my  parent, grand parent and great grand parent!");}
    void fast_type_writing(){System.out.println("I can fast type write like my parent!");}
}

abstract class Parent1 implements G_G_Parent{
    void teaching(){ System.out.println("I can teach like my parent, grand parent and great grand parent!");}
    void singing(){ System.out.println("I can sing like my parent, grand parent and great grand parent!");}
    void laptop_handling(){ System.out.println("I can handle laptop like my parent, grand parent and great grand parent!");}
}

class Child1 extends Parent{
    void gaming(){ System.out.println("I can do gaming on my own!");}
    void hindi_speaker(){ System.out.println("I can speak hindi not my parent!");}
}
class Child2 extends Parent1 implements G_G_Parent1{
    @Override
    public void speak() {System.out.println("I can speak like my parent1, grand parent and great grand parent!");}
    @Override
    public void write() {System.out.println("I can write like my parent1, grand parent and great grand parent!");}
    @Override
    public void talk() { System.out.println("I can talk like my parent1, grand parent and great grand parent!");}
    @Override
    public void sleep() { System.out.println("I can sleep like my great grand parent1!");}
    void laptop_debugger(){ System.out.println("I can debugg laptop on my own!");}
}

public class family_tree_20BAI10040 {
    public static void main(String[] args) {
        Child1 firstChild = new Child1();
        Child2 secondChild = new Child2();
        System.out.println("\nCHILD 1 OBJECT\n");
        firstChild.gaming();
        firstChild.hindi_speaker();
        firstChild.fast_type_writing();
        firstChild.running();
        firstChild.running();
        firstChild.speak();
        firstChild.write();
        firstChild.talk();
        System.out.println("\nCHILD 2 OBJECT\n");
        secondChild.laptop_debugger();
        secondChild.teaching();
        secondChild.singing();
        secondChild.laptop_handling();
        secondChild.sleep();
        secondChild.speak();
        secondChild.write();
        secondChild.talk();
        System.out.println("\n\n");
        System.out.println("20BAI10040");
    }
}