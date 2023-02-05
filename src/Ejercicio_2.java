import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****************Ejercicio IF***************");
        System.out.print("Ingrese un numero: ");
        int numeroIf = sc.nextInt();
        if(numeroIf > 0){
            System.out.println("El numero " + numeroIf + " Es POSITIVO");
        } else if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + " Es NEGATIVO");
        }else {
            System.out.println("El numero " + numeroIf + " Es CERO");
        }

        System.out.println("****************Ejercicio WHILE***************");

        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println("****************Ejercicio DO-WHILE***************");
        numeroWhile =0;
        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while (numeroWhile>3);

        System.out.println("****************Ejercicio FOR***************");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("****************Ejercicio Switch***************");
        String estacion = "Otoño";

        switch (estacion) {
            case "Invierno":
                System.out.println("La estacion es Invierno");
                break;
            case "Otoño":
                System.out.println("La estacion es Otoño");
                break;
            case "Primavera":
                System.out.println("La estacion es Primavera");
                break;
            default:
                System.out.println("La estacion es Verano");
                break;
        }

    }
}
