package arrays.medium;

public class RangeSumQuery2d {

    class NumMatrix {

        int[][] sumMatrix;
        public NumMatrix(int[][] matrix) {
            int colLength = matrix[0].length;
            int rowLength = matrix.length;
            sumMatrix = new int[rowLength][colLength];

            for(int i=0;i<rowLength;i++){
                int colSum = 0;
                for(int j=0;j<colLength;j++){
                    colSum = colSum + matrix[i][j];
                    sumMatrix[i][j] = colSum;
                }
            }

//            for(int i=0;i<rowLength;i++){
//                for(int j=0;j<colLength;j++){
//                    System.out.print(sumMatrix[i][j]+" ,");
//                }
//                System.out.print("\n");
//            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int totalSum = 0;

            for(int i=row1;i<=row2;i++){
                if(col1!=0){
                    totalSum-=sumMatrix[i][col1-1];
                }
                totalSum += sumMatrix[i][col2];
            }
            return totalSum;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix numMatrix = new RangeSumQuery2d().new NumMatrix(matrix);
        System.out.println(numMatrix.sumRegion(2, 1, 4, 3)); // Output: 8
        System.out.println(numMatrix.sumRegion(1, 1, 2, 2)); // Output: 11
        System.out.println(numMatrix.sumRegion(1, 2, 2, 4)); // Output: 12
    }
}
