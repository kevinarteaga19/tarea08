package matrices.Traspuesta;

import javax.swing.*;

public class MatrizTranspuesta {

    private int matriz1[][];

    private int transpuesta[][];

    private int fila;

    private int columna;

    private int datos;

    public void matrizTamaño()
    {
        this.fila = Integer.parseInt(JOptionPane.showInputDialog("INGRESAR NUMERO DE FILA"));

        this.columna = Integer.parseInt(JOptionPane.showInputDialog("INGRESAR  NUMERO DECOLUMNA"));

        this.matriz1 = new int[this.fila][this.columna];

        this.transpuesta = new int[this.columna][this.fila];
    }

    public void nuevaMatriz()
    {
        for (int i = 0; i < matriz1.length; i++)
        {
            for (int j = 0; j < matriz1[i].length; j++)
            {
                this.datos = Integer.parseInt(JOptionPane.showInputDialog("INGRESE VALOR"));

                this.matriz1[i][j] = this.datos;
            }
        }
    }

    public void mostrarMatriz()
    {
        System.out.println("----------MATRIZ INGRESADA----------");

        for (int i = 0; i < matriz1.length; i++)
        {
            for (int j = 0; j < matriz1[i].length; j++)
            {
                System.out.print(this.matriz1[i][j]);
            }
            System.out.println();
        }
    }

    public void  transposicion()
    {
        for (int i = 0; i < matriz1.length; i++)
        {
            for (int j = 0; j < matriz1[i].length; j++)
            {
                this.transpuesta[j][i] = this.matriz1[i][j];
            }
        }
    }
    public void mostrarTranspuesta()
    {
        System.out.println("----------MATRIZ TRANSPUESTA----------");

        for (int i = 0; i < transpuesta.length; i++)
        {
            for (int j = 0; j < transpuesta[i].length; j++)
            {
                System.out.print(this.transpuesta[i][j]);
            }
            System.out.println();
        }
    }
}
