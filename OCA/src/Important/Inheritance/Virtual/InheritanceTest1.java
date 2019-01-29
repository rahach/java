package Important.Inheritance.Virtual;


public class InheritanceTest1 {
    public static void main(String[] args) {
        
        A x = new B(); 
        x.mA();
        //x.mB();
        
        B y = new B(); 
        y.mA();
        
        B z = new C();  
        //z.mC();
        z.mB();

    }
}

class A{ 
   public void mA(){ System.out.println("Class A mA");};
}

class B extends A { 
   public void mA(){ System.out.println("Class B mA");}
   public void mB() { System.out.println("Class B mB");}
}

class C extends B { 
   public void mC(){ System.out.println("Class C mC");}
}

