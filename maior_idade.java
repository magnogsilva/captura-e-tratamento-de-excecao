import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        try
        {
            System.out.println("Para assistir ao filme você terá que ser maior de idade!");
            System.out.println("Qual é sua idade?");
            int idade = ler.nextInt();
            
            if (idade < 18){
            System.out.println("Você ainda é menor de idade, por isso não assistirá ao filme!");
        }
            else {
            System.out.println("Você tem " + (idade) + " anos. Pode assistir ao filme!");
            }
        }
        
        catch (Exception erro)
        {
            System.out.println("ERRO - Valor digitado não é um número inteiro!");
        }
    }
}
