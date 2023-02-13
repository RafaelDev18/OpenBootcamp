import org.w3c.dom.ls.LSOutput;

public class Practica {
    public static void main(String[] args){
        Coche carro = new Coche();
        carro.setSonido("BRRR");

        System.out.println(carro.getSonido());


        Moto rtx = new Moto();
        rtx.setSonido("ñaamm ñammm");

        System.out.println(rtx.getSonido());
    }
}

abstract class Vehiculo{
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo(){
        System.out.println("Estoy en el contructor de vehiculo");
    }

    public boolean comprobarMatricula(String matricula){
        if(matricula == "ASD123"){
            return true;
        }
        return false;
    }

    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    abstract public void setSonido(String sonido);
    abstract public String getSonido();
}

class Coche extends Vehiculo{
    public String getSonido(){
        return "Soy un sonido de CARRO: " + this.sonido;
    }

    public void setSonido(String sonido){
        this.sonido = sonido;
    }

}

class Moto extends Vehiculo{
    public String getSonido(){
        return  "Soy un sonido de MOTO: " + this.sonido;
    }

    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}


