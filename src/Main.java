public class Main {

    public static void main(String[] args) {
        //primera parte
        //Suma(10,20,30);

        //segunda parte
        /*coche miCoche = new coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.getPuertas());*/

        Coches coche1 = new Coches();
        System.out.println(coche1.getPuertas());
        System.out.println(coche1.getVelocidadActual());
        coche1.agregarPuertas();
        coche1.acelerar();
        System.out.println(coche1.getPuertas());
        System.out.println(coche1.getVelocidadActual());

        Coches coche2 = new Coches(4,10);
        System.out.println(coche2.getPuertas());
        System.out.println(coche2.getVelocidadActual());
        coche2.agregarPuertas();
        coche2.acelerar();
        System.out.println(coche2.getPuertas());
        System.out.println(coche2.getVelocidadActual());

       // for(int i=1; i<=10; i++ ){
       //     System.out.println(i);
       // }
    }
    public static void Suma(int a, int b, int c){ // Funcion con retorno
        int res = a + b + c;
        System.out.println(res);
    }
    public int Suma(int a, int b){
        return a + b;
    }

    public float Suma(float a, float b){
        return a + b;
    }
}
class Coches{
    private int puertas;
    private int velocidadActual;

    public Coches(){
        System.out.println("Inicio el constructor sin parametros");
        setPuertas(0);
        setVelocidadActual(0);
    }
    public Coches(int puertas, int velocidadActual){
        System.out.println("Inicio el constructor con parametros");
        this.setPuertas(puertas);
        this.setVelocidadActual(velocidadActual);
    }

    public void agregarPuertas(){
        setPuertas(getPuertas() + 1);
    }
    public void acelerar(){
        setVelocidadActual(getVelocidadActual() + 10);
    }


    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas ;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
}




