package pe.edu.upeu;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author waldir vargas challa
 */
public class ExamenTransformadaWVC {

    public int[][] transformada01WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j <= dimensionX - i - 1) {
                    matriz[i][j] = numInit + (i + j) * (i + j + 1) / 2 + i;

                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }

    public int[][] transformada02WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j <= dimensionX - i - 1) {
                    matriz[i][j] = numInit + (i + j) * (i + j + 1) / 2 + j;

                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }

    public int[][] transformada03WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length - 1; j >= 0; j--) {
                if (((i + j) % 2 == 0)) {
                    matriz[i][j] = numInit + (i + j) * (i + j + 1) / 2 + j;
                } else if ((i + j) % 2 != 0) {
                    matriz[i][j] = numInit + (i + j) * (i + j + 1) / 2 + i;
                } else {
                    matriz[i][j] = 0;
                }
            }

        }
        return matriz;
    }

    public int[][] transformada04WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length - 1; j >= 0; j--) {
                if (((i + j) % 2 == 0)) {
                    matriz[i][j] = numInit + (i + j) * (i + j + 1) / 2 + i;
                } else if ((i + j) % 2 != 0) {
                    matriz[i][j] = numInit + (i + j) * (i + j + 1) / 2 + j;
                } else {
                    matriz[i][j] = -1;
                }
            }
        }
        return matriz;
    }

    public int[][] transformada05WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length - 1; j >= 0; j--) {
                if (contador <= i) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = 0;
                }
            }
            contador = 0;
        }
        return matriz;
    }

    public int[][] transformada06WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (contador <= i) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = 0;
                }
            }
            contador = 0;
        }
        return matriz;
    }

    public int[][] transformada09WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                if (j >=dimensionX-(i+1)) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = 0;
                }
            }
            contador = 0;
        }
        return matriz;
    }

    public int[][] transformada14WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        int contador = 0;
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (contador <= j) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = 0;
                }
            }
            contador = 0;
        }
        return matriz;
    }

    public int[][] transformada18WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        int contador = 0;
        for (int j = matriz.length - 1; j >= 0; j--) {
            for (int i = 0; i < matriz.length; i++) {
                if (contador <= dimensionX - j - 1) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = 0;
                }
            }
            contador = 0;
        }
        return matriz;
    }

    public int[][] transformada17WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        int contador = 0;
        for (int j = matriz.length - 1; j >= 0; j--) {
            for (int i = 0; i <= matriz[0].length - 1; i++) {
                if (contador <= j) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = 0;
                }
            }
            contador = 0;
        }
        return matriz;
    }

    public int[][] transformada12WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i <= j) {
                    matriz[i][j] = numInit - i;
                    numInit++;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }

    public int[][] transformada13WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        int contador = 0;
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= matriz[0].length - 1; i++) {
                if (contador <= dimensionX - 1 - j) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = 0;
                }
            }
            contador = 0;
        }
        return matriz;
    }

    public int[][] transformada19WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        int contador = 0;
        for (int j = matriz.length - 1; j >= 0; j--) {
            for (int i = matriz[0].length - 1; i >= 0; i--) {
                if (contador <= j) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = 0;
                }
            }
            contador = 0;
        }
        return matriz;
    }

    public int[][] transformada11WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length - 1; j >= 0; j--) {
                if (contador < dimensionX) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = 0;
                }
            }
            contador = 0;
        }
        return matriz;
    }

    public int[][] transformada15WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        int contador = 0;
        for (int j = 0; j < matriz.length; j++) {
            for (int i = matriz.length - 1; i >= 0; i--) {
                if (contador <= dimensionX - j - 1) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = 0;
                }
            }
            contador = 0;
        }
        return matriz;
    }

    public int[][] transformada16WVC(int dimensionX, int numInit) {
        int[][] matriz = new int[dimensionX][dimensionX];
        int contador = 0;
        for (int j = 0; j <= matriz.length - 1; j++) {
            for (int i = matriz[0].length - 1; i >= 0; i--) {
                if (contador <= j) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = 0;
                }
            }
            contador = 0;
        }
        return matriz;
    }

    public int[][] transformada28WVC(int dim, int numInit) {
        int cont = 0;
        int[][] matriz = new int[dim][dim];
        for (int y = matriz.length - 1; y >= 0; y--) {
            if (cont % 2 == 0) {
                for (int x = 0; x <= matriz[0].length - 1; x++) {
                    matriz[y][x] = numInit++;
                }
            } else {
                for (int x = matriz[0].length - 1; x >= 0; x--) {
                    matriz[y][x] = numInit++;
                }
            }
            cont++;
        }

        return matriz;
    }

    public int[][] transformada22WVC(int dim, int numInit) {
        int cont = 0;
        int[][] matriz = new int[dim][dim];
        for (int y = 0; y <= matriz.length - 1; y++) {
            if (cont % 2 == 0) {
                for (int x = matriz[0].length - 1; x >= 0; x--) {
                    matriz[x][y] = numInit;
                    numInit++;
                }
            } else {
                for (int x = 0; x <= matriz[0].length - 1; x++) {
                    matriz[x][y] = numInit;
                    numInit++;
                }
            }
            cont++;
        }

        return matriz;
    }

    public int[][] transformada25WVC(int dim, int numInit) {
        int cont = 0;
        int[][] matriz = new int[dim][dim];
        for (int y = 0; y <= matriz.length - 1; y++) {
            if (cont % 2 == 0) {
                for (int x = 0; x <= matriz.length - 1; x++) {
                    matriz[y][x] = numInit;
                    numInit++;
                }
            } else {
                for (int x = matriz.length - 1; x >= 0; x--) {
                    matriz[y][x] = numInit;
                    numInit++;
                }
            }
            cont++;
        }

        return matriz;
    }

    public int[][] transformada26WVC(int dim, int numInit) {
        int cont = 0;
        int[][] matriz = new int[dim][dim];
        for (int y = 0; y <= matriz.length - 1; y++) {
            if (cont % 2 == 0) {
                for (int x = matriz.length - 1; x >= 0; x--) {
                    matriz[y][x] = numInit;
                    numInit++;
                }
            } else {
                for (int x = 0; x <= matriz.length - 1; x++) {
                    matriz[y][x] = numInit;
                    numInit++;
                }
            }
            cont++;
        }

        return matriz;
    }

    public int[][] transformada27WVC(int dim, int numInit) {
        int cont = 0;
        int[][] matriz = new int[dim][dim];
        for (int y = matriz.length - 1; y >= 0; y--) {
            if (cont % 2 == 0) {
                for (int x = matriz[0].length - 1; x >= 0; x--) {
                    matriz[y][x] = numInit++;
                }
            } else {
                for (int x = 0; x <= matriz[0].length - 1; x++) {
                    matriz[y][x] = numInit++;
                }
            }
            cont++;
        }

        return matriz;
    }

    public int[][] transformada21WVC(int dim, int numInit) {
        int cont = 0;
        int[][] matriz = new int[dim][dim];
        for (int y = 0; y <= matriz.length - 1; y++) {
            if (cont % 2 == 0) {
                for (int x = 0; x <= matriz[0].length - 1; x++) {
                    matriz[x][y] = numInit;
                    numInit++;
                }
            } else {
                for (int x = matriz[0].length - 1; x >= 0; x--) {
                    matriz[x][y] = numInit++;
                }
            }
            cont++;
        }

        return matriz;
    }

    public int[][] transformada24WVC(int dim, int numInit) {
        int cont = 0;
        int[][] matriz = new int[dim][dim];
        for (int y = matriz.length - 1; y >= 0; y--) {
            if (cont % 2 == 0) {
                for (int x = matriz[0].length - 1; x >= 0; x--) {
                    matriz[x][y] = numInit;
                    numInit++;
                }
            } else {
                for (int x = 0; x <= matriz[0].length - 1; x++) {
                    matriz[x][y] = numInit;
                    numInit++;
                }
            }
            cont++;
        }

        return matriz;
    }

    public int[][] transformada23WVC(int dim, int numInit) {
        int cont = 0;
        int[][] matriz = new int[dim][dim];
        for (int y = matriz.length - 1; y >= 0; y--) {
            if (cont % 2 == 0) {
                for (int x = 0; x <= matriz[0].length - 1; x++) {
                    matriz[x][y] = numInit;
                    numInit++;
                }
            } else {
                for (int x = matriz[0].length - 1; x >= 0; x--) {
                    matriz[x][y] = numInit++;
                }
            }
            cont++;
        }

        return matriz;
    }

    public int[][] transformada29WVC(int dim, int Inicio) {
        int[][] matrix = new int[dim][dim];
        for (int ec = 0; ec < dim / 2; ec++) {
            for (int lsx = ec; lsx < dim - 1 - ec; lsx++) {
                matrix[ec][lsx] = Inicio;
                Inicio++;
            }
            for (int ldx = ec; ldx < dim - 1 - ec; ldx++) {
                matrix[ldx][dim - 1 - ec] = Inicio;
                Inicio++;
            }
            for (int lix = dim - 1 - ec; lix > ec; lix--) {
                matrix[dim - 1 - ec][lix] = Inicio;
                Inicio++;
            }
            for (int lxx = dim - 1 - ec; lxx > ec; lxx--) {
                matrix[lxx][ec] = Inicio;
                Inicio++;
            }

            if (dim % 2 != 0) {
                matrix[dim / 2][dim / 2] = Inicio;
            }
        }

        return matrix;
    }

    public int[][] transformada31WVC(int dim, int Inicio) {
        int[][] matrix = new int[dim][dim];
        for (int ec = 0; ec < dim / 2; ec++) {
            for (int lix = dim - 1 - ec; lix > ec; lix--) {
                matrix[dim - 1 - ec][lix] = Inicio;
                Inicio++;
            }
            for (int lxx = dim - 1 - ec; lxx > ec; lxx--) {
                matrix[lxx][ec] = Inicio;
                Inicio++;
            }

            for (int lsx = ec; lsx < dim - 1 - ec; lsx++) {
                matrix[ec][lsx] = Inicio;
                Inicio++;
            }
            for (int ldx = ec; ldx < dim - 1 - ec; ldx++) {
                matrix[ldx][dim - 1 - ec] = Inicio;
                Inicio++;
            }

            if (dim % 2 != 0) {
                matrix[dim / 2][dim / 2] = Inicio;
            }
        }
        return matrix;
    }

    public int[][] transformada32WVC(int dim, int Inicio) {
        int[][] matrix = new int[dim][dim];
        for (int ec = 0; ec < dim / 2; ec++) {
            for (int lxx = dim - 1 - ec; lxx > ec; lxx--) {
                matrix[lxx][ec] = Inicio;
                Inicio++;
            }
            for (int lsx = ec; lsx < dim - 1 - ec; lsx++) {
                matrix[ec][lsx] = Inicio;
                Inicio++;
            }
            for (int ldx = ec; ldx < dim - 1 - ec; ldx++) {
                matrix[ldx][dim - 1 - ec] = Inicio;
                Inicio++;
            }

            for (int lix = dim - 1 - ec; lix > ec; lix--) {
                matrix[dim - 1 - ec][lix] = Inicio;
                Inicio++;
            }

            if (dim % 2 != 0) {
                matrix[dim / 2][dim / 2] = Inicio;
            }
        }

        return matrix;
    }

    public int[][] transformada30WVC(int dim, int Inicio) {
        int[][] matrix = new int[dim][dim];
        for (int ec = 0; ec < dim / 2; ec++) {
            for (int ldx = ec; ldx < dim - 1 - ec; ldx++) {
                matrix[ldx][dim - 1 - ec] = Inicio;
                Inicio++;
            }
            for (int lix = dim - 1 - ec; lix > ec; lix--) {
                matrix[dim - 1 - ec][lix] = Inicio;
                Inicio++;
            }
            for (int lxx = dim - 1 - ec; lxx > ec; lxx--) {
                matrix[lxx][ec] = Inicio;
                Inicio++;
            }
            for (int lsx = ec; lsx < dim - 1 - ec; lsx++) {
                matrix[ec][lsx] = Inicio;
                Inicio++;
            }

            if (dim % 2 != 0) {
                matrix[dim / 2][dim / 2] = Inicio;
            }
        }

        return matrix;
    }

    public int[][] transformada34WVC(int dim, int Inicio) {
        int[][] matrix = new int[dim][dim];
        for (int ec = 0; ec < dim / 2; ec++) {
            for (int lsx = ec; lsx < dim - 1 - ec; lsx++) {
                matrix[lsx][ec] = Inicio;
                Inicio++;
            }
            for (int ldx = ec; ldx < dim - 1 - ec; ldx++) {
                matrix[dim - 1 - ec][ldx] = Inicio;
                Inicio++;
            }
            for (int lix = dim - 1 - ec; lix > ec; lix--) {
                matrix[lix][dim - 1 - ec] = Inicio;
                Inicio++;
            }
            for (int lxx = dim - 1 - ec; lxx > ec; lxx--) {
                matrix[ec][lxx] = Inicio;
                Inicio++;
            }

            if (dim % 2 != 0) {
                matrix[dim / 2][dim / 2] = Inicio;
            }
        }

        return matrix;
    }

    public int[][] transformada35WVC(int dim, int Inicio) {
        int[][] matrix = new int[dim][dim];
        for (int ec = 0; ec < dim / 2; ec++) {
            for (int ldx = ec; ldx < dim - 1 - ec; ldx++) {
                matrix[dim - 1 - ec][ldx] = Inicio;
                Inicio++;
            }
            for (int lix = dim - 1 - ec; lix > ec; lix--) {
                matrix[lix][dim - 1 - ec] = Inicio;
                Inicio++;
            }
            for (int lxx = dim - 1 - ec; lxx > ec; lxx--) {
                matrix[ec][lxx] = Inicio;
                Inicio++;
            }
            for (int lsx = ec; lsx < dim - 1 - ec; lsx++) {
                matrix[lsx][ec] = Inicio;
                Inicio++;
            }

            if (dim % 2 != 0) {
                matrix[dim / 2][dim / 2] = Inicio;
            }
        }

        return matrix;
    }

    public int[][] transformada36WVC(int dim, int Inicio) {
        int[][] matrix = new int[dim][dim];
        for (int ec = 0; ec < dim / 2; ec++) {
            for (int lix = dim - 1 - ec; lix > ec; lix--) {
                matrix[lix][dim - 1 - ec] = Inicio;
                Inicio++;
            }
            for (int lxx = dim - 1 - ec; lxx > ec; lxx--) {
                matrix[ec][lxx] = Inicio;
                Inicio++;
            }
            for (int lsx = ec; lsx < dim - 1 - ec; lsx++) {
                matrix[lsx][ec] = Inicio;
                Inicio++;
            }
            for (int ldx = ec; ldx < dim - 1 - ec; ldx++) {
                matrix[dim - 1 - ec][ldx] = Inicio;
                Inicio++;
            }

            if (dim % 2 != 0) {
                matrix[dim / 2][dim / 2] = Inicio;
            }
        }

        return matrix;
    }

    public int[][] transformada33WVC(int dim, int Inicio) {
        int[][] matrix = new int[dim][dim];
        for (int ec = 0; ec < dim / 2; ec++) {
            for (int lxx = dim - 1 - ec; lxx > ec; lxx--) {
                matrix[ec][lxx] = Inicio;
                Inicio++;
            }
            for (int lsx = ec; lsx < dim - 1 - ec; lsx++) {
                matrix[lsx][ec] = Inicio;
                Inicio++;
            }
            for (int ldx = ec; ldx < dim - 1 - ec; ldx++) {
                matrix[dim - 1 - ec][ldx] = Inicio;
                Inicio++;
            }
            for (int lix = dim - 1 - ec; lix > ec; lix--) {
                matrix[lix][dim - 1 - ec] = Inicio;
                Inicio++;
            }

            if (dim % 2 != 0) {
                matrix[dim / 2][dim / 2] = Inicio;
            }
        }

        return matrix;
    }
public int[][] transformada12WVC() {
        int numInit=0,dimemsionX=0;
        Scanner leer=new Scanner(System.in);
         System.out.println("Introduce la dimension:");
         dimemsionX=leer.nextInt();
         Scanner a=new Scanner(System.in);
         System.out.println("Introduce el numero de inicio:");
         numInit=a.nextInt();
        System.out.println("transformada numero 12:");
        int[][] matriz = new int[dimemsionX][dimemsionX];
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length - 1; j >= 0; j--) {
                if (contador <dimemsionX-i) {
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                } else {
                    matriz[i][j] = 0;
                }
            }
            contador = 0;
        }
        return matriz;
    }

    public void imprimirMatrizWVC(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExamenTransformadaWVC E = new ExamenTransformadaWVC();
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    E.imprimirMatrizWVC(E.transformada01WVC(5, 0));
                    break;
                case 2:
                    E.imprimirMatrizWVC(E.transformada02WVC(5, 0));
                    break;
                case 3:
                    E.imprimirMatrizWVC(E.transformada03WVC(5, 0));
                    break;
                case 4:
                    E.imprimirMatrizWVC(E.transformada04WVC(5, 0));
                    break;
                case 5:
                    E.imprimirMatrizWVC(E.transformada05WVC(5, 0));
                    break;
                case 6:
                    E.imprimirMatrizWVC(E.transformada06WVC(5, 0));
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    E.imprimirMatrizWVC(E.transformada09WVC(5, 0));
                    break;
                case 10:
                    break;
                case 11:
                    E.imprimirMatrizWVC(E.transformada11WVC(5, 0));
                    break;
                case 12:
                    E.imprimirMatrizWVC(E.transformada12WVC());
                    break;
                case 13:
                    E.imprimirMatrizWVC(E.transformada13WVC(5, 0));
                    break;
                case 14:
                    E.imprimirMatrizWVC(E.transformada14WVC(5, 0));
                    break;
                case 15:
                    E.imprimirMatrizWVC(E.transformada15WVC(5, 0));
                    break;
                case 16:
                    E.imprimirMatrizWVC(E.transformada16WVC(5, 0));
                    break;
                case 17:
                    E.imprimirMatrizWVC(E.transformada17WVC(5, 0));
                    break;
                case 18:
                    E.imprimirMatrizWVC(E.transformada18WVC(5, 0));
                    break;
                case 19:
                    E.imprimirMatrizWVC(E.transformada19WVC(5, 0));
                    break;
                case 20:
                    break;
                case 21:
                    E.imprimirMatrizWVC(E.transformada21WVC(5, 0));
                    break;
                case 22:
                    E.imprimirMatrizWVC(E.transformada22WVC(5, 0));
                    break;
                case 23:
                    E.imprimirMatrizWVC(E.transformada23WVC(5, 0));
                    break;
                case 24:
                    E.imprimirMatrizWVC(E.transformada24WVC(5, 0));
                    break;
                case 25:
                    E.imprimirMatrizWVC(E.transformada25WVC(5, 0));
                    break;
                case 26:
                    E.imprimirMatrizWVC(E.transformada26WVC(5, 0));
                    break;
                case 27:
                    E.imprimirMatrizWVC(E.transformada27WVC(5, 0));
                    break;
                case 28:
                    E.imprimirMatrizWVC(E.transformada28WVC(5, 0));
                    break;
                case 29:
                    E.imprimirMatrizWVC(E.transformada29WVC(5, 0));
                    break;
                case 30:
                    E.imprimirMatrizWVC(E.transformada30WVC(5, 0));
                    break;
                case 31:
                    E.imprimirMatrizWVC(E.transformada31WVC(5, 0));
                    break;
                case 32:
                    E.imprimirMatrizWVC(E.transformada32WVC(5, 0));
                    break;
                case 33:
                    E.imprimirMatrizWVC(E.transformada33WVC(5, 0));
                    break;
                case 34:
                    E.imprimirMatrizWVC(E.transformada34WVC(5, 0));
                    break;
                case 35:
                    E.imprimirMatrizWVC(E.transformada35WVC(5, 0));
                    break;
                case 36:
                    E.imprimirMatrizWVC(E.transformada36WVC(5, 0));
                    break;

                default:
                    System.out.println("Opción Inválida!!");
                    break;
            }
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
            opcion = leer.nextInt();
        }
    }

}
