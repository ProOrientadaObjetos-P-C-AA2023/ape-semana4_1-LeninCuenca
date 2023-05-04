package seman4_1;
class Profesores {
    private String nombre;
    private String apellido;
    private double sueldoBas;
    private double sueldoTot;
    private int cedula;

    public Profesores() {
    }

    public Profesores(String nombre, String apellido, double sueldoBas , int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBas = sueldoBas;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldoBas(double sueldoBas) {
        this.sueldoBas = sueldoBas;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public void CalcularSueldoTotal() {
        this.sueldoTot =((this.getSueldoBas()*0.2));
        this.sueldoTot=sueldoTot+sueldoBas;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldoBas() {
        return sueldoBas;
    }

    public double getSueldoTot() {
        return sueldoTot;
    }

    public int getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sueldoBas=" + sueldoBas +
                ", sueldoTot=" + this.sueldoTot +
                ", cedula=" + cedula +
                '}';
    }
}
public class problema2 {
    public static void main(String[] args) {
        Profesores profesores=new Profesores("Rafael","Correa",450,1550041121);
        profesores.CalcularSueldoTotal();
        System.out.println(profesores);

    }
}
