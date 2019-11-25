package sk.itsovy.matysko.woDArray;

import java.util.Random;

public class Main {
    private final static int numRows = 4;
    private final static int numColums = 4;

    public static void main(String[] args) {


        Random rnd = new Random();
        int[][] array;
        int c, r;

        array = new int[numRows][numColums];
        for (r = 0; r < numRows; r++) {
            for (c = 0; c < numColums; c++) {
                array[r][c] = rnd.nextInt(51) + 10;
            }
        }
        int news = 0;
        System.out.println();
        for (r = 0; r < numRows; r++) {
            for (c = 0; c < numColums; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("MAX sum: ");
        int maxSum = array[0][0];
        for (r = 0; r < numRows; r++) {
            for (c = 0; c < numColums; c++) {
                if (maxSum < array[r][c]) {
                    maxSum = array[r][c];
                }
            }
        }
        System.out.print(maxSum);
        System.out.println("Max Colum values 1 2 ...n: ");
        int columSum = 0;
        for (r = 0; r < numRows; r++) {
            columSum = 0;
            for (c = 0; c < numColums; c++) {
                columSum = array[r][c];
            }
            System.out.println(columSum + " ");
        }
        System.out.println("sicin na diagonale:");
        int sumDiagonal = array[0][0];
        for (r = 1; r < numRows; r++) {
            sumDiagonal *= array[r][r];
        }
        System.out.print(sumDiagonal);
        System.out.println();
        int minRC = numColums < numRows ? numColums : numRows;
        int mul = 1;
        for (r = 0; r < minRC; r++) {
            mul *= array[r][r];
        }
        System.out.println("Multiplacion of main diagonale is: " + mul);

        int[][] array2;
        array2 = new int[numColums][numRows];
        for (r = 0; r < numRows; r++) {
            for (c = 0; c < numColums; c++) {
                array2[c][r] = array[r][c];
            }
        }

        /*
         * Zdravim 1N, mal som poradu vo firme GL, idem do skoly, troska budem meskat.
         * Uloha pre vas:
         * otvorte si projekt s 2D polom (robili sme pondelok, a aj na Gite ho najdete)
         * - pridajte algoritmus, ktory vypise, ktorych cisel v matici je viac, ci parnych alebo neparnych. Moze sa pocet aj rovnat.
         * - pridajte algoritmus, ktory nahodne vymeni niekolko cisel v matici (na roznych rioadkoch a stlpcoch)
         * - pridajte algoritmus, ktory spocita cisla na okrajoch matice - prvy a posledny riadok i stlpec.
         */
        System.out.println("______________________________________________");
        System.out.println("pocet parnich a neparnich v matici: ");
        int parne = 0;
        int neparne = 0;
        for (r = 0; r < numRows; r++) {
            for (c = 0; c < numColums; c++) {
                if (array[r][c] % 2 == 0) {
                    parne++;
                } else {
                    neparne++;
                }
            }
        }
        System.out.println("Parne: " + parne + " Neparne: " + neparne);


        for (r = 0; r < numRows; r++) {//vypis cisel
            for (c = 0; c < numColums; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int ramdomRow, ramdomColum, ramdom, ramdomRow2, ramdomColum2, memory;
        int j = rnd.nextInt(10);
        for (int i = 0; i <= j; i++) {
            ramdomRow = rnd.nextInt(numRows);
            ramdomColum = rnd.nextInt(numColums);
            ramdomRow2 = rnd.nextInt(numRows);
            ramdomColum2 = rnd.nextInt(numColums);

            memory = array[ramdomRow][ramdomColum];
            array[ramdomRow][ramdomColum] = array[ramdomRow2][ramdomColum2];
            array[ramdomRow2][ramdomColum2] = memory;
        }
        for (r = 0; r < numRows; r++) { //vypis cisel
            for (c = 0; c < numColums; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();


        int count = 0;
        for (r = 0; r < numRows; r++) {
            for (c = 0; c < numColums; c++) {
                if (r == 0 || r == numRows || c == 0 || c == numColums) {
                    count += array[r][c];
                }
            }
        }
        System.out.println("count okrajovich hodnot: " + count);


        int[][] tictactoe = {{1, 0, 2}, {0, 1, 2}, {0, 2, 0}};




        int a[][] = {{1, 4, 2}, {2, 3, 1}, {2, 3, 2}};
        int b[][] = {{1, 5, 1}, {2, 1, 3}, {3, 4, 5}};
        int visledok[][] = new int[3][3];

        System.out.println("Spocitavanie:");
        for (int i=0; i<a.length;i++){
            for (int f=0;f<3;f++){
                visledok[i][f]=a[i][f]+b[i][f];
                System.out.print(visledok[i][f]+" ");
            }
            System.out.println();
        }

        System.out.println("Nasobenie:");
        for (int i = 0; i < 3; i++) {
            for (int f = 0; f < 3; f++) {
                visledok[i][f] = 0;
                for (int k = 0; k < 3; k++) {
                    visledok[i][f] += a[i][k] * b[k][f];
                }//end of k loop
                System.out.print(visledok[i][f] + " ");  //printing matrix element
            }
            System.out.println();//new line
        }





    }
}
