package Estudos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dequeue{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int [] arr = new int[a];
        System.out.print("");


        for(int i = 0; i < a; i ++){
            arr[i] = entrada.nextInt();
        }

        Map<Integer, Integer> freq = new HashMap<>();
        int maxUnicos = 0;

         for(int i = 0; i < b; i ++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
         }
            maxUnicos = freq.size();
        
         for(int i = b; i < a; i ++){
            int out = arr[i -b];
            freq.put(out, freq.get(out) - 1);
            if(freq.get(out) == 0){
                freq.remove(out);
            }

            int in = arr[i];
            freq.put(in, freq.getOrDefault(in, 0) + 1);
         }      

                maxUnicos = Math.max(maxUnicos, freq.size());
            
        
          System.out.println(maxUnicos);
 
          entrada.close();

        }
}

