import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList number = new ArrayList();
        ArrayList number2 = new ArrayList();
        ArrayList result = new ArrayList();

        System.out.println("Digite número para preencher");
        number.add(s.nextInt());
        number.add(s.nextInt());
        number.add(s.nextInt());
        number.add(s.nextInt());

        System.out.println("Digite número para preencher o 2 arraylist ");
        number2.add(s.nextInt());
        number2.add(s.nextInt());
        number2.add(s.nextInt());
        number2.add(s.nextInt());

        int i;

        int n = number.size();

        for(i = 0; i < n; i++){
        System.out.println("lista : " +number.get(i));
        }

        System.out.println("Ordenado ordem Crescente:");
        Collections.sort(number);
        Collections.sort(number2);
        for(i = 0; i < n; i++){
            System.out.print(number.get(i) +" - ");
        }

        for(i = 0; i < n; i++){
           int mult = 0;
           result.add((int)number.get(i) * (int)number2.get(i));
        }

        System.out.println("Resultado da multiplicação");
        for(i = 0; i < n; i++){
            System.out.print(result.get(i) +" - ");
        }


    }
}