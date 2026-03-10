package Estudos.Regex;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {


    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);


    String regexIp = "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]{1,2})(\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]{1,2})){3}$";
    Pattern padraoIp = Pattern.compile(regexIp);
     
    


    for(int i = 0; i < 12 && entrada.hasNextLine(); i++){
        String ip = entrada.nextLine();
        Matcher matcher = padraoIp.matcher(ip);
       
        //System.out.println(matcher.matches());
    }
       System.out.println(matcher.matches());
       
    
    
    }

  






    }
    


