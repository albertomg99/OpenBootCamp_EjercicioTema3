public class Main {
    public static void main(String[] args) {
        // Primera parte
        int resultadoSuma;
        int numero1 = 10;
        int numero2 = 21;
        int numero3 = 33;
        resultadoSuma = sumaTres(numero1,numero2,numero3);
        System.out.println(resultadoSuma);

        //Segunda parte
        coche miCoche = new coche(4);
        System.out.println("Mi coche inicialmente tiene " + miCoche.getNumPuertas() + " puertas.");
        miCoche.addPuertas();
        System.out.println("Mi coche ahora tiene " + miCoche.getNumPuertas() + " puertas.");

    }
    public static int sumaTres(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        return resultado;
    }
}

