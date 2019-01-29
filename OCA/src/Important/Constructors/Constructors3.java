package Important.Constructors;

public class Constructors3 {
    public static void main(String[] args) {
        X x = new Z();
        
      Constructors3 tc = new Constructors3();
      tc.method(null);
    }
   public void method(Object o){
      System.out.println("Object Version");
   }

    public void method(java.io.IOException s){
      System.out.println("IOException Version");
   }
    
   public void method(java.io.FileNotFoundException s){
      System.out.println("java.io.FileNotFoundException Version");
   }      
}

class X{ 
    public X(boolean b){
        System.out.println("this X");
    }        
    
    public X(){
        this(true);        
        System.out.println("In X");
    }
}

class Y extends X{
    public Y(boolean b){
        System.out.println("this Y");
    }        
    
    public Y(){
        this(true);        
        System.out.println("In Y");
    }
}

class Z extends Y{
    public Z(boolean b){
        System.out.println("this Z");
    }    
    
    public Z(){
        this(true);
        System.out.println("In Z");
    }
}
