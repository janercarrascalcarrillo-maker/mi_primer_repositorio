import java.util.Scanner;

public class ContadorNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 0;

        for(int i=1;i<=5;i++){

            System.out.println("Ingrese numero:");
            int num = sc.nextInt();

            if(num>0){
                contador++;
            }

        }

        System.out.println("Numeros positivos: "+contador);

    }

}
