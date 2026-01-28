import java.util.Scanner;

 class arraysum {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows, columns;

        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();

        System.out.println("Enter the number of columns:");
        columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter element at matrix[%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sum=0;

        for (int i = 0; i < rows && i < columns; i++) {
            sum=0;
            sum += matrix[i][i];
        }
int Sum=0;
        System.out.println("The sum of the diagonal of the matrix is " + sum);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                Sum += matrix[i][j];
            }
        }
        System.out.println("The sum of all elements of the matrix is " + Sum);

        scanner.close();
    }
}

