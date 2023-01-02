import java.util.Arrays;

public class SetMatrixZero {

  static void setZerosBetter(int[][] matrix) {
    int row = matrix.length;
    int column = matrix[0].length;

    int[] dummy1 = new int[row];
    Arrays.fill(dummy1, -1);

    int[] dummy2 = new int[column];
    Arrays.fill(dummy2, -1);

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        if (matrix[i][j] == 0) {
          dummy1[i] = 0;
          dummy2[j] = 0;
        }
      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        if (dummy1[i] == 0 || dummy2[j] == 0) matrix[i][j] = 0;
      }
    }
  }

  static void setZerosGood(int[][] matrix) {
    int zeroIndexX = 0, zeroIndexY = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i][j] == 0) {
          zeroIndexX = i;
          zeroIndexY = j;

          break;
        }
      }
    }

    for (int i = 0; i < matrix.length; i++) matrix[zeroIndexX][i] = 0;
    for (int j = 0; j < matrix.length; j++) matrix[j][zeroIndexY] = 0;
  }

  public static void main(String[] args) {
    int[][] inputArray = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

    // Brute-force approach
    // setZerosGood(inputArray);

    // Better approach
    setZerosBetter(inputArray);

    // Best approach
    // setZerosBest(inputArray);

    System.out.println("Final result: ");
    for (int i = 0; i < inputArray.length; i++) {
      for (int j = 0; j < inputArray[i].length; j++) {
        System.out.print(inputArray[i][j] + " ");
      }

      System.out.println();
    }
  }
}
