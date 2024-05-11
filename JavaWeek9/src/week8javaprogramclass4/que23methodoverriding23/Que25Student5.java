package week8javaprogramclass4.que23methodoverriding23;

public class Que25Student5 {
    int id;
    String name;
    int age;
    Que25Student5(int i,String n){
        id = i;
        name = n;
    }
    Que25Student5(int i,String n,int a){
        id = i;
        name = n;
        age = a;
    }
    public void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Que25Student5 s1 = new Que25Student5(111,"Ronak");
        Que25Student5 s2 = new Que25Student5(222,"Aryan",25);
        s1.display();
        s2.display();
    }

}
