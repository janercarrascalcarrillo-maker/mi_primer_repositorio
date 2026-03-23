import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 7:");
        int numero = sc.nextInt();

        if(numero == 1){
            System.out.println("Lunes");
        } 
        else if(numero == 2){
            System.out.println("Martes");
        } 
        else if(numero == 3){
            System.out.println("Miercoles");
        } 
        else if(numero == 4){
            System.out.println("Jueves");
        } 
        else if(numero == 5){
            System.out.println("Viernes");
        } 
        else if(numero == 6){
            System.out.println("Sabado");
        } 
        else if(numero == 7){
            System.out.println("Domingo");
        } 
        else{
            System.out.println("Numero invalido");
        }

    }

}
