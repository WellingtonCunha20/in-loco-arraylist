import java.util.ArrayList;
import java.util.Scanner;

public class ContadorVgCon {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        ArrayList<String> Palavras = new ArrayList<String>();

        System.out.println("Insira uma letra:");
        Palavras.add(s.next());
        Palavras.add(s.next());
        Palavras.add(s.next());
        Palavras.add(s.next());
        Palavras.add(s.next());

        int vogal = 0;
        int consoante = 0;

        for (int i = 0; i < Palavras.size(); i++){
            if (isVogal(Palavras.get(i).charAt(0))){
                vogal++;
            }else if (isConsoante(Palavras.get(i).charAt(0))){
                consoante++;
            }
        }
        System.out.println("Total de vogais: " +vogal);
        System.out.println("Total de consoantes: " +consoante);

    }
    public static boolean isVogal(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isConsoante(char ch) {
        ch = Character.toLowerCase(ch);
        return ch >= 'a' && ch <= 'z' && !isVogal(ch);
    }

}
