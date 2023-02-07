public class EjercicioTema8 {
    public static void main(String[] args) {

        Persona persona1 = new Persona();// instanciamos la clase Persona con el obejo persona1

        //seteamos las propiedades del objeto con sus setters
        persona1.setEdad(30);
        persona1.setNombre("Rafael");
        persona1.setTelefono("321654789");

        //Imprimimos las propiedades del objeto persona1 usando los getters
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Telefono: " + persona1.getTelefono());

    }

}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
