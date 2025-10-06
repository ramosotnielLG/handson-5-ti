import java.util.Arrays;
import java.util.Random;

public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Arrays Deep Dive
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * array multidimensi, operasi lanjutan, parameter/return value, dan utility methods.
         */

        // ===== ARRAY MULTIDIMENSI DASAR =====
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        // Latihan 1: Membuat dan mengisi array 2D (matriks)
        // - Buat array 2D integer dengan ukuran 3x4 (3 baris, 4 kolom)
        int[][] matriks = new int[3][4];
        int num = 1;
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] = num++;
            }
        }
        System.out.println("Matriks 3x4:");
        displayMatrix(matriks);
        // - Isi array dengan nilai: baris 0: [1,2,3,4], baris 1: [5,6,7,8], baris 2: [9,10,11,12]

        // - Print seluruh matriks menggunakan nested loop dengan format yang rapi

        // Latihan 2: Array 2D dengan inisialisasi langsung
        // - Buat array 2D string yang merepresentasikan papan catur 3x3 dengan nilai awal "."
        String[][] board = new String[3][3];
        for (String[] row : board) {
            Arrays.fill(row, ".");
        }
        board[0][0] = "X";
        board[1][1] = "X";
        board[2][2] = "X";
        board[0][2] = "O";
        board[1][0] = "O";
        board[2][1] = "O";

        System.out.println("\nPapan Catur 3x3:");
        for (String[] row : board) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        // - Tempatkan "X" di posisi [0][0], [1][1], dan [2][2] (diagonal)
        // - Tempatkan "O" di posisi [0][2], [1][0], dan [2][1]

        // - Print papan dengan format grid yang rapi

        // ===== ARRAY JAGGED (IRREGULAR) =====
        System.out.println("\\n=== ARRAY JAGGED (IRREGULAR) ===");

        // Latihan 3: Array dengan panjang baris yang berbeda
        // - Buat array 2D integer dengan 4 baris: baris 0 panjang 2, baris 1 panjang 4, baris 2 panjang 3, baris 3 panjang 5
        int[][] jagged = new int[4][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];
        jagged[3] = new int[5];

        int value = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = value++;
            }
        }
        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Baris " + i + " (panjang " + jagged[i].length + "): " + Arrays.toString(jagged[i]));
        }
        // - Isi setiap baris dengan angka berurutan dimulai dari 1

        // - Print array jagged dengan menampilkan panjang setiap baris

        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\\n=== OPERASI LANJUTAN PADA ARRAY ===");

        // Latihan 4: Operasi matematika pada array 2D
        // - Buat dua matriks 2x3 dengan nilai bebas
        int[][] m1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] m2 = {{6, 5, 4}, {3, 2, 1}};

        System.out.println("Matriks 1:");
        displayMatrix(m1);
        System.out.println("Matriks 2:");
        displayMatrix(m2);

        int[][] sum = addMatrices(m1, m2);
        System.out.println("Hasil Penjumlahan Matriks:");
        displayMatrix(sum);

        int[][] multiplied = multiplyByScalar(m1, 2);
        System.out.println("Hasil Perkalian Matriks 1 dengan 2:");
        displayMatrix(multiplied);
        // - Implementasikan penjumlahan matriks (buat method addMatrices)

        // - Implementasikan perkalian setiap elemen dengan scalar 2 (buat method multiplyByScalar)

        // - Print hasil operasi

        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 5: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array Asli: " + Arrays.toString(numbers));

        int[] sorted = sortArray(numbers.clone());
        System.out.println("Array setelah sorting: " + Arrays.toString(sorted));

        int[] reversed = reverseArray(sorted.clone());
        System.out.println("Array setelah dibalik: " + Arrays.toString(reversed));

        int[] minmax = findMinMax(numbers);
        System.out.println("Nilai minimum: " + minmax[0] + ", maksimum: " + minmax[1]);
        // - Panggil method sortArray untuk mengurutkan array
        // (implementasikan method sortArray yang menerima array dan mengembalikan array yang sudah diurutkan)

        // - Panggil method reverseArray untuk membalik array
        // (implementasikan method reverseArray)

        // - Panggil method findMinMax untuk mencari nilai minimum dan maksimum
        // (implementasikan method yang mengembalikan array int dengan 2 elemen: [min, max])

        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        // Latihan 6: Eksplorasi utility methods Arrays
        int[] data = {5, 2, 8, 1, 9, 3};
        System.out.println("Array awal: " + Arrays.toString(data));

        Arrays.sort(data);
        System.out.println("Setelah sort(): " + Arrays.toString(data));

        int idx = Arrays.binarySearch(data, 8);
        System.out.println("Posisi angka 8: " + idx);

        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Setelah fill(7): " + Arrays.toString(filled));

        boolean equal = Arrays.equals(data, filled);
        System.out.println("Apakah data dan filled sama? " + equal);

        int[] copy = Arrays.copyOf(data, 10);
        System.out.println("Copy array dengan ukuran lebih besar: " + Arrays.toString(copy));
        // - Gunakan Arrays.toString() untuk print array

        // - Gunakan Arrays.sort() untuk mengurutkan array

        // - Gunakan Arrays.binarySearch() untuk mencari elemen (array harus sudah diurutkan)

        // - Gunakan Arrays.fill() untuk mengisi array dengan nilai tertentu

        // - Gunakan Arrays.equals() untuk membandingkan dua array

        // - Gunakan Arrays.copyOf() untuk membuat copy array dengan ukuran berbeda

        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\\n=== ARRAY 3D DAN KOMPLEKS ===");

        // Latihan 7: Array 3 dimensi
        // - Buat array 3D integer ukuran 2x3x4 (seperti 2 buah matriks 3x4)
        int[][][] threeD = new int[2][3][4];
        int counter = 1;
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    threeD[i][j][k] = counter++;
                }
            }
        }
        for (int i = 0; i < threeD.length; i++) {
            System.out.println("Lapisan " + (i + 1) + ":");
            displayMatrix(threeD[i]);
        }
        // - Isi dengan nilai berurutan dari 1

        // - Print menggunakan triple nested loop dengan format yang jelas

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 8: Sistem nilai mahasiswa
        // - Buat array 2D untuk menyimpan nilai 5 mahasiswa, 4 mata kuliah
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};

        int[][] grades = new int[namaMahasiswa.length][mataKuliah.length];
        fillRandomGrades(grades, 60, 100);

        System.out.println("Tabel nilai mahasiswa:");
        System.out.printf("%-10s", "Nama");
        for (String mk : mataKuliah) {
            System.out.printf("%-12s", mk);
        }
        System.out.printf("%-12s\n", "Rata-rata");

        double[] rataMahasiswa = new double[namaMahasiswa.length];
        double[] totalMK = new double[mataKuliah.length];

        for (int i = 0; i < grades.length; i++) {
            int[] nilai = grades[i];
            rataMahasiswa[i] = calculateAverage(nilai);
            System.out.printf("%-10s", namaMahasiswa[i]);
            for (int j = 0; j < nilai.length; j++) {
                System.out.printf("%-12d", nilai[j]);
                totalMK[j] += nilai[j];
            }
            System.out.printf("%-12.2f\n", rataMahasiswa[i]);
        }

        System.out.printf("%-10s", "Rata2 mk");
        for (int j = 0; j < mataKuliah.length; j++) {
            System.out.printf("%-12.2f", totalMK[j] / namaMahasiswa.length);
        }
        System.out.println();

        int bestIdx = 0;
        for (int i = 1; i < rataMahasiswa.length; i++) {
            if (rataMahasiswa[i] > rataMahasiswa[bestIdx]) bestIdx = i;
        }
        System.out.println("\nMahasiswa dengan nilai tertinggi: " + namaMahasiswa[bestIdx]);
        // - Isi dengan nilai random antara 60-100

        // - Hitung rata-rata per mahasiswa

        // - Hitung rata-rata per mata kuliah

        // - Tentukan mahasiswa dengan nilai tertinggi

        // - Print dalam format tabel yang rapi

        // Latihan 9: Game Tic-Tac-Toe sederhana
        System.out.println("\n=== GAME TIC TAC TOE SEDERHANA ===");
        // - Buat array 2D char 3x3 untuk papan permainan
        char[][] ticTacToe = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {' ', ' ', ' '}
        };

        printTicTacToe(ticTacToe);

        if (checkWinner(ticTacToe, 'X')) {
            System.out.println("Pemenang: X");
        } else if (checkWinner(ticTacToe, 'O')) {
            System.out.println("Pemenang: O");
        } else {
            System.out.println("Belum ada pemenang.");
        }
        // - Implementasikan method untuk menampilkan papan

        // - Implementasikan method untuk mengecek apakah ada pemenang

        // - Simulasikan beberapa langkah permainan
    }

    // ===== IMPLEMENTASI METHODS =====
    // TODO: Implementasikan method-method yang diperlukan di sini

    // Method untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Implementasi penjumlahan matriks
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result; // Ganti dengan implementasi yang benar
    }

    // Method untuk perkalian scalar
    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        // Implementasi perkalian scalar
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        return result; // Ganti dengan implementasi yang benar
    }

    // Method untuk sorting array
    public static int[] sortArray(int[] arr) {
        // Implementasi sorting (bisa menggunakan Arrays.sort atau implementasi sendiri)
        Arrays.sort(arr);
        return arr; // Ganti dengan implementasi yang benar
    }

    // Method untuk reverse array
    public static int[] reverseArray(int[] arr) {
        // Implementasi reverse array
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed; // Ganti dengan implementasi yang benar
    }

    // Method untuk find min dan max
    public static int[] findMinMax(int[] arr) {
        // Return array dengan format [min, max]
        int min = arr[0], max = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new int[]{min, max}; // Ganti dengan implementasi yang benar
    }

    // Method untuk display array 2D
    public static void displayMatrix(int[][] matrix) {
        // Implementasi untuk menampilkan matriks dengan format rapi
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    // Method untuk mengisi array 2D dengan nilai random
    public static void fillRandomGrades(int[][] grades, int min, int max) {
        // Implementasi untuk mengisi array dengan nilai random
        Random rand = new Random();
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
    }

    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int[] values) {
        // Implementasi untuk menghitung rata-rata
        double sum = 0;
        for (int v : values) sum += v;
        return sum / values.length; // Ganti dengan implementasi yang benar
    }

    public static void printTicTacToe(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j < board[i].length - 1) System.out.print("|");
            }
            System.out.println();
            if (i < board.length - 1) System.out.println("---+---+---");
        }
    }

    public static boolean checkWinner(char[][] board, char player){
        for(int i = 0; i < 3; i++){
            if((board[i][0] == player && board[i][1] == player && board[i][2] == player) || (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) || (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }
}


