package threads;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of matrix respectively :");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Enter elements of matrix :");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                matrix[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Enter number to divide :");
        int dividend = sc.nextInt();

        Divide divide = new Divide(dividend,rows,cols,matrix);
        divide.start();

    }
}

import java.lang.Thread;
public class Divide extends Thread{
    int dividend;
    int rows,cols;
    double[][] matrix;
    Divide(int dividend,int rows,int cols,double[][] matrix){
        this.dividend=dividend;
        this.rows=rows;
        this.cols=cols;
        this.matrix=matrix;
    }


    public void run(){
        //System.out.println("Hello");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                matrix[i][j]=matrix[i][j]/dividend;
            }
        }
        for (int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\t");
        }
    }
}


