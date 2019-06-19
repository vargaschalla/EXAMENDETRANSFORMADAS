/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.examenwvc;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class EXAMENIIIUWVC {
    public int[][] transformada06WVC(int dimensionX, int numInit) {
        System.out.println("transformada numero 06:");
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
        System.out.println("transformada numero 09:");
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
    public int[][] transformada12WVC(int dimensionX, int numInit) {
        System.out.println("transformada numero 12:");
        int[][] matriz = new int[dimensionX][dimensionX];
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length - 1; j >= 0; j--) {
                if (contador <dimensionX -i) {
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


    public int[][] transformada26WVC(int dim, int numInit) {
        System.out.println("transformada numero 26:");
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
     public int[][] transformada30WVC(int dim,int Inicio){
         System.out.println("transformada numero 30:");
        int [][] matrix=new int[dim][dim];
        for (int ec = 0; ec < dim/2; ec++) {
            for (int ldx = ec; ldx <dim-1-ec; ldx++) {
                matrix[ldx][dim-1-ec]=Inicio;
                Inicio++;
            }
            for (int lix = dim-1-ec; lix >ec; lix--) {
                matrix[dim-1-ec][lix]=Inicio;
                Inicio++;
        }
            for (int lxx = dim-1-ec; lxx >ec; lxx--) {
                 matrix[lxx][ec]=Inicio;
                Inicio++;
            }
            for (int lsx = ec; lsx <dim-1-ec; lsx++) {
                matrix[ec][lsx]=Inicio;
                Inicio++;
            }

            if(dim%2!=0){
                matrix[dim/2][dim/2]=Inicio;
            }
        }    
              
        return matrix;
    }
      public void imprimirMatrizWVC(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
      public static void main(String[] args) {
        EXAMENIIIUWVC wvc = new EXAMENIIIUWVC();
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        while (opcion != 0) {
            
           switch (opcion) {
                case 6:wvc.imprimirMatrizWVC(wvc.transformada06WVC(5, 0)); break;
                case 9:wvc.imprimirMatrizWVC(wvc.transformada09WVC(5, 0)); break;
                case 12:wvc.imprimirMatrizWVC(wvc.transformada12WVC(5, 0)); break;
                case 26:wvc.imprimirMatrizWVC(wvc.transformada26WVC(5, 0)); break;
                case 30:wvc.imprimirMatrizWVC(wvc.transformada30WVC(5, 0)); break;
                default:
                    System.out.println("Opción Inválida!!");
                    break;
            }
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
            opcion = leer.nextInt();
           } 
        }
           
      }
  

       
