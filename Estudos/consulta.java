package Estudos;

import java.util.Scanner;

public class consulta{
    public static void main(String[] args) {
        
    

    Scanner entrada = new Scanner(System.in);
     int q = entrada.nextInt();

    for(int i = 0; i < q; i++){
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int n = entrada.nextInt();
    



    int consulta = a;
for(int j = 0; j < n; j ++){
    consulta +=(1 << j ) * b;
    System.out.print(consulta + " ");
}
    
System.out.println();  // quebra de linha 
    }
    
}
}