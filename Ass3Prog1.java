import java.util.*;

class Matrix {
    private int rows;
    private int columns;
    private int[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new int[rows][columns];
    }

    public void inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
    }

    public static Matrix addMatrices(Matrix matrix1, Matrix matrix2) {
        if (matrix1.rows != matrix2.rows || matrix1.columns != matrix2.columns) {
            System.out.println("Matrix addition is not possible. Matrices must have the same dimensions.");
            return null;
        }

        Matrix resultMatrix = new Matrix(matrix1.rows, matrix1.columns);

        for (int i = 0; i < matrix1.rows; i++) {
            for (int j = 0; j < matrix1.columns; j++) {
                resultMatrix.data[i][j] = matrix1.data[i][j] + matrix2.data[i][j];
            }
        }

        return resultMatrix;
    }

    public void displayMatrix() {
        System.out.println("Resulting Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Ass3Prog1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int columns = scanner.nextInt();

        Matrix matrix1 = new Matrix(rows, columns);
        Matrix matrix2 = new Matrix(rows, columns);

        System.out.println("Enter the elements for the first matrix:");
        matrix1.inputMatrix();

        System.out.println("Enter the elements for the second matrix:");
        matrix2.inputMatrix();

        Matrix resultMatrix = Matrix.addMatrices(matrix1, matrix2);

        if (resultMatrix != null) {
            resultMatrix.displayMatrix();
        }
    }
}
