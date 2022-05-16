import java.util.Scanner;
public class DoWhile {
 
    
    public static void main(String[] args) {
    Scanner captura= new Scanner(System.in);
    
         int numero1=0, iniciador=0, total=0;
         
    do{
 
    System.out.println("Digite un numero a sumar.");
    numero1=captura.nextInt();
    
    total=total+numero1;
    iniciador=iniciador+1;
    }while(iniciador!=10);
    
        System.out.println("Su total es " + total);
        
    }
    
}
