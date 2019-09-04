import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        PilaTEC<String> Pila = new PilaTEC();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros o palabras");
        String a = scan.next();
        String b = scan.next();
        String	c = scan.next();
        String d = scan.next();
        String e = scan.next();
       Pila.push(a);
       Pila.push(b);
       Pila.push(c);
       Pila.push(d);
       Pila.push(e);
       for (int i=0; i<5; i++){
           System.out.println(Pila.pop());
       }
    }
}