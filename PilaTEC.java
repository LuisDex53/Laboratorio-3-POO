import java.util.ArrayList;
import java.util.Scanner;
public class PilaTEC<E> extends ArrayList<E>{
    public boolean isEmpty(){
        return super.isEmpty();
    }
public int getSize(){
    return super.size();
}
public Object peek(){
    return super.get(getSize()-1);
}
public Object pop(){
    Object o = super.get(getSize()-1);
    super.remove(getSize()-1);
    return o;
}
public void push(Object o){
    super.add((E)o);
    }
public	String toString() {		
    return "pila: " + super.toString(); 		
    }   
    public PilaTEC() {    	
    }		 
}