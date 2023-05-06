class Automotores{
    private int cedulaDueño;
    private String marcaVehiculo;
    private int anioFabri;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotores() {
    }

    public Automotores(int cedulaDueño, String marcaVehiculo, int anioFabre, double valorVehiculo) {
        this.cedulaDueño = cedulaDueño;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabri = anioFabre;
        this.valorVehiculo = valorVehiculo;
    }

    public void setCedulaDueño(int cedulaDueño) {
        this.cedulaDueño = cedulaDueño;
    }


    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public void setAnioFabri(int anioFabri) {
        this.anioFabri = anioFabri;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    public void calcularValormatricula() {
        this.valorMatricula =((this.getValorVehiculo()*0.002)*(2023-this.getAnioFabri()));
        this.valorMatricula =valorMatricula;
    }

    public int getCedulaDueño() {
        return cedulaDueño;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int getAnioFabri() {
        return anioFabri;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        return "Automotores{" +
                "cedulaDueño=" + cedulaDueño +
                ", marcaVehiculo='" + marcaVehiculo + '\'' +
                ", anioFabri=" + anioFabri +
                ", valorVehiculo=" + valorVehiculo +
                ", valorMatricula=" + valorMatricula +
                '}';
    }
}
public class problema3 {
    public static void main(String[] args) {
        Automotores automotores1=new Automotores(1540004112,"ford",1970,8000);
        automotores1.calcularValormatricula();
        System.out.println(automotores1);
    }
}
