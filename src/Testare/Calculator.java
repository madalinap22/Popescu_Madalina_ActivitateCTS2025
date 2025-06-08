package Testare;

public class Calculator {
        public int aduna(int a, int b) {
            return a + b;
        }

        public int scade(int a, int b) {
            return a - b;
        }

        public int inmulteste(int a, int b) {
            return a * b;
        }

        public int imparte(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Impartirea la 0 nu este permisa.");
            }
            return a / b;
        }


    public double medie(int[] valori) {
        if (valori == null) {
            throw new IllegalArgumentException("Array-ul este null");
        }
        if (valori.length == 0) {
            return 0; // sau poți alege să arunci o excepție
        }
        int suma = 0;
        for (int val : valori) {
            suma += val;
        }
        return (double) suma / valori.length;
    }


}
