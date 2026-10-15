public class Duplicados {
    public static void main(String[] args) {
        int [] numeros = {7, 8, 9, 10, 11, 2, 3, 4, 7, 11, 8};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    System.out.println("El numero duplicado es: " + numeros[i]
                            + " se encuentra en la posición: " + i + " y " + j);
                }
            }
        }
    }
}
