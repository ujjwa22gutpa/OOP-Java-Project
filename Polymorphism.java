
class Animal {
    void sound(){
        System.out.println("Animal sound");
    };
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog is barking");
    }
    void sleep(){
        System.out.println("Dog is sleeping");
    }
 }

class Cat extends Animal{
    void sound(){
        System.out.println("the cat is meowing..");
    }
}

 public class Polymorphism {
    public static void main(String[] args) {
        Dog d = new Dog();
      //  Animal d = new Cat();
        d.sound();
        d.sleep();
        d.eat();
        Cat c = new Cat();
        c.eat();
       
    }
}