public class Main {

    public static void main(String[] args) {
        //primera parte
        Suma(10,20,30);

        //segunda parte
        coche miCoche = new coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.getPuertas());

    }
    public static void Suma(int a, int b, int c){ // Funcion con retorno
        int res = a + b + c;
        System.out.println(res);
    }

    }


