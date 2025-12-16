/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT4_5;

/**
 *
 * @author aaron
 */
public class UtilidadeRecOrdCercaMejorado {
    // ===============================
    // 1️⃣ RECURSIÓN BÁSICA
    // ===============================

    // Suma de números hasta n
    public static int sumaRec(int n) {
        if (n == 0) return 0;
        return n + sumaRec(n - 1);
    }

    // Suma de números pares hasta n
    public static int sumaParells(int n) {
        if (n <= 0) return 0;
        if (n % 2 == 0)
            return n + sumaParells(n - 2);
        else
            return sumaParells(n - 1);
    }

    // Factorial recursivo
    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    // ===============================
    // 2️⃣ POTENCIA
    // ===============================

    public static int potencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }

    // ===============================
    // 3️⃣ FIBONACCI
    // ===============================

    // Fibonacci recursivo
    public static int fibonacciRec(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    // Fibonacci iterativo
    public static int fibonacciIt(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // ===============================
    // 4️⃣ MÁXIMO COMÚN DIVISOR
    // ===============================

    public static int mcd(int a, int b) {
        if (b == 0) return a;
        return mcd(b, a % b);
    }

    // ===============================
    // 5️⃣ ARRAYS - RECURSIÓN
    // ===============================

    // Suma de elementos de un array
    public static int sumaArray(int[] array, int i) {
        if (i == array.length) return 0;
        return array[i] + sumaArray(array, i + 1);
    }

    // Contar elementos pares
    public static int comptaParells(int[] array, int i) {
        if (i == array.length) return 0;
        if (array[i] % 2 == 0)
            return 1 + comptaParells(array, i + 1);
        else
            return comptaParells(array, i + 1);
    }

    // Búsqueda lineal recursiva
    public static int cercaLinealRec(int[] array, int num, int i) {
        if (i == array.length) return -1;
        if (array[i] == num) return i;
        return cercaLinealRec(array, num, i + 1);
    }

    // ===============================
    // 6️⃣ BÚSQUEDA BINARIA
    // ===============================

    // Binaria iterativa
    public static int cercaBinaria(int[] array, int num) {
        int esq = 0, dre = array.length - 1;

        while (esq <= dre) {
            int mig = (esq + dre) / 2;
            if (array[mig] == num) return mig;
            if (array[mig] < num) esq = mig + 1;
            else dre = mig - 1;
        }
        return -1;
    }

    // Binaria recursiva
    public static int cercaBinariaRec(int[] array, int num, int esq, int dre) {
        if (esq > dre) return -1;

        int mig = (esq + dre) / 2;
        if (array[mig] == num) return mig;

        if (array[mig] < num)
            return cercaBinariaRec(array, num, mig + 1, dre);
        else
            return cercaBinariaRec(array, num, esq, mig - 1);
    }

    // ===============================
    // 7️⃣ ORDENACIÓN
    // ===============================

    // Ordenación burbuja
    public static void burbuja(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    // Ordenación por inserción
    public static void insercio(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int clau = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > clau) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = clau;
        }
    }

    // ===============================
    // 8️⃣ ARRAYS BÁSICOS
    // ===============================

    // Invertir array
    public static void inverteix(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
            i++;
            j--;
        }
    }

    // Comprobar si está ordenado
    public static boolean estaOrdenat(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) return false;
        }
        return true;
    }
}


