public class Ej5 {
    public static void main(String[] args) {
        int [] numeros = {2, 5, 6, 2, 3, 45, 6, 7, 8, 9};
        int maximo = numeros[0];
        for (int i = 0; i < numeros.length; i++ ){
            if (numeros[i] > maximo){
                maximo = numeros[i];
            }
        }
        System.out.println("El numero más grande es el: " + maximo);

    }
}
