package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String ing;
        Scanner op = new Scanner(System.in);
        System.out.println("INGRESAR");
        ing=op.nextLine();

        while (ing.contains("()")||ing.contains("[]")||ing.contains("{}")){
            ing=ing.replace("()","");
            ing=ing.replace("[]","");
            ing=ing.replace("{}","");
            System.out.println(ing);
        }
        if(ing.trim().length()==0){
            System.out.println("EXPRESION EXPRESION VALIDA");
        }else{
            System.out.println("EXPRESION EXPRESION NO VALIDA");
        }

	
    }
}
