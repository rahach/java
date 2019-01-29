/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Constructors;

/**
 *
 * @author raik
 */
public class Constructors {
    Constructors(int i) throws Exception{ if (i==0)throw new Exception("Exception in Constructor");  }        //valid    
//    private Constructors(){  }        //valid
//    protected Constructors(){  }        //valid    
//    public Constructors(){  }        //valid
//    public final Constructors(){    }        //invalid
//    public static Constructors(){    }        //invalid
//    public abstract Constructors(){    }        //invalid        

    public static void main(String[] args){
        try{
            Constructors c = new Constructors(5);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
