package seman4_1;

class Estudiante{
        private String nombreEst;
        private double nota1;
        private double nota2;
        private double nota3;
        private double promedio;
        public Estudiante(){}

        public Estudiante(String nombreEst, double nota1, double nota2, double nota3) {
            this.nombreEst = nombreEst;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        public String getNombreEst() {
            return nombreEst;
        }

        public double getNota1() {
            return nota1;
        }

        public double getNota2() {
            return nota2;
        }

        public double getNota3() {
            return nota3;
        }

        public double getPromedio() {
            return promedio;
        }

        public void setNombreEst(String nombreEst) {
            this.nombreEst = nombreEst;
        }

        public void setNota1(double nota1) {
            this.nota1 = nota1;
        }

        public void setNota2(double nota2) {
            this.nota2 = nota2;
        }

        public void setNota3(double nota3) {
            this.nota3 = nota3;
        }

        public void calcularpormedio() {
            this.promedio = ((this.getNota1()+this.getNota2()+this.getNota3())/3);
        }

        @Override
        public String toString() {
            return "seman4_1.Estudiante{" +
                    "nombreEst='" + nombreEst + '\'' +
                    ", nota1=" + nota1 +
                    ", nota2=" + nota2 +
                    ", nota3=" + nota3 +
                    ", promedio=" + promedio +
                    '}';
        }
}
public class problema1 {
    public static void main(String[] args) {
                Estudiante estudiante1=new Estudiante("lenin",10,10,10);
                estudiante1.calcularpormedio();
                System.out.println(estudiante1);
    }
}




