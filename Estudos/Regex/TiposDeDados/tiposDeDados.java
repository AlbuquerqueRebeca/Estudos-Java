package TiposDeDados;


import java.math.BigInteger;
import java.util.Scanner;



public class tiposDeDados{

public static void main(String[] args){

Scanner entrada = new Scanner(System.in);

int casoTest = entrada.nextInt();
for(int i = 0; i < casoTest; i ++){

String valorStr = entrada.next();

BigInteger valor = new BigInteger(valorStr);


if(valor.compareTo(BigInteger.valueOf(Long.MIN_VALUE))  < 0 ||
valor.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 ){
    System.out.println( valorStr  + " can't be fitted anywhare.");
}else {
    long v = valor.longValue();
    
    System.out.println(valorStr + " can be fitted in:");
    if(valor.compareTo(BigInteger.valueOf(-128)) >= 0 && valor.compareTo(BigInteger.valueOf(127)) <= 0
    )
        System.out.println("* byte");
    if(valor.compareTo(BigInteger.valueOf(-32768)) >= 0 && valor.compareTo(BigInteger.valueOf(32767)) <= 0)
        System.out.println("* short");
    if(valor.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && valor.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0)
        
        System.out.println("* int");
        
        System.out.println("* long");
    }
    }
    }    
        
    
}



    












