
package problema3;

public class Pila {
    String pueblos[];
    int tope=0;
    
    public Pila(){
        pueblos = new String[5];
        tope = -1;
    }
    
    public void Push(String pueblo){
        tope++;
        pueblos[tope] = pueblo;  
    }
    
    public String Pop(){
        String fuera;
        fuera = pueblos[tope];
        tope--;
        return fuera;
    }
    
    public String topePila(){
        return pueblos[tope];
    }

    public String VueltaPila(){
       int inicio=tope;
       String variable;
       variable = pueblos[inicio];
       inicio--;
       return variable;    
    }
    
}