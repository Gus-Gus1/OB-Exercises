public class Suma {

    // first part
    public static void main(String [] args){
        int resultado;
        resultado = suma(10, 50, 20);
        System.out.println(resultado);

        // Second Part
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.print(miCoche.puertas);
    }
    public static int suma(int a, int b, int c){
        return a + b + c;

    }
}
class Coche{
    public int puertas = 2;

    public void incrementarPuertas(){
        this.puertas++;
    }

}
