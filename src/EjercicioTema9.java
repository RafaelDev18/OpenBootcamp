public class EjercicioTema9 {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente(30, "Rafael", "321456798", true);
        Trabajador trabajador1 = new Trabajador(20,"Jhon Rico", "312456985",900000);
        System.out.println("Nombre: " + cliente1.getNombre() + "\nEdad: " + cliente1.getEdad() + "\nTelefono: " + cliente1.getTelefono() + "\nCredito: " + cliente1.getCredito());
        System.out.println("\nNombre: " + trabajador1.getNombre() + "\nEdad: " + trabajador1.getEdad() + "\nTelefono: " + trabajador1.getTelefono() + "\nSalario: " + trabajador1.getSalario());

    }
}
class Personas{
    private int edad;
    private String nombre;
    private String telefono;
    public Personas(int edad, String nombre, String telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;

    }

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
class Cliente extends Personas{
    private Boolean credito;

    public Cliente(int edad, String nombre, String telefono, boolean credito){
        super(edad,nombre,telefono);
        this.credito = credito;

    }

    public Boolean getCredito() {
        return credito;
    }

    public void setCredito(Boolean credito) {
        this.credito = credito;
    }
}

class Trabajador extends Personas{
    private double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario){
        super(edad,nombre,telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}



