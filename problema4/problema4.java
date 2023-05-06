class Bancos{
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double valorComision;

    public Bancos() {
    }

    public Bancos(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }
    public void calcularComisionBanco(){
        this.valorComision=(this.getValorCheque()*0.003);
        this.valorComision=valorComision;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public double getValorComision() {
        return valorComision;
    }

    @Override
    public String toString() {
        return "Bancos{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", nombreBanco='" + nombreBanco + '\'' +
                ", valorCheque=" + valorCheque +
                ", valorComision=" + valorComision +
                '}';
    }
}
public class problema4 {
    public static void main(String[] args) {
        Bancos bancos1=new Bancos("Rafael Correa","Banco de Guayaquil",40000);
        bancos1.calcularComisionBanco();
        System.out.println(bancos1);
    }
}
