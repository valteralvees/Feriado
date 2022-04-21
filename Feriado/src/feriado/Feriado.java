package feriado;
import java.util.Scanner;
public class Feriado {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia do mês:");
        int diaMes = teclado.nextInt();
        System.out.println("Digite a temperatura atual");
        float temperatura = teclado.nextFloat();
        if(diaMes == 1 && temperatura < 0) {
            System.out.println("Feriado decretado");
        } else {
            System.out.println("Não é feriado");
        }
    }
    
}
