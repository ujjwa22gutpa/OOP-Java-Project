package JavaProjects;
public record Interface() {
    public static void main(String[] args) {
        // Animal a  = new Jerman();
        // a.sound();
        // Dog d = new Jerman();
        // d.eat();

        Payment p = new Cash();
       // p.pay(23.89);
       p = new NetBanking();
    //   p.pay(343.45);
     p = new UPI();
     p.pay(234.344);

    }
}


interface Payment{
    void pay(double money);
}

class UPI implements Payment{
     @Override
      public void pay(double monney){
          System.out.println("UPI"+" "+monney);
      }
}

class Cash implements Payment{
     @Override
      public void pay(double cash){
          System.out.println("CASH"+" "+cash);
      }
}

class NetBanking implements Payment{
     @Override
      public void pay(double monney){
          System.out.println("NETBANKING"+" "+monney);
      }
}












//  interface Animal{
//    void sound(); 
// }

//  interface Dog {
//    void eat();
    
// }


// class Jerman implements Animal,Dog{
//     @Override
//     public void sound(){
//         System.out.println("Dog barks");
//     }
//     @Override
//     public void eat(){
//         System.out.println("Dog eats");
//     }
// }



