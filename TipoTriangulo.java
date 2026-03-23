import java.util.Scanner;

public class TipoTriangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese lado 1:");
        int a = sc.nextInt();

        System.out.println("Ingrese lado 2:");
        int b = sc.nextInt();

        System.out.println("Ingrese lado 3:");
        int c = sc.nextInt();

        if(a == b && b == c){
            System.out.println("Triangulo Equilatero");
        }
        else if(a == b || a == c || b == c){
            System.out.println("Triangulo Isosceles");
        }
        else{
            System.out.println("Triangulo Escaleno");
        }

    }

}
