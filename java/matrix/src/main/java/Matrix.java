
class Matrix {
    private int[][] matrixFromString;
    private int rowSize;
    private int columnSize;

    Matrix(String matrixAsString) {
        this.matrixFromString = parseStringToMatrix(matrixAsString);
    }

    private int[][] parseStringToMatrix(String matrixAsString) {
        // String = "1";
        String[] rows = matrixAsString.split("\n");
        rowSize = rows.length;
        columnSize = rows[0].split("\\s").length;
        int[][] matrix = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                matrix[i][j] = Integer.valueOf(rows[i].split(" ")[j]).intValue();
            }
        }
        return matrix;
    }

    int[] getRow(int rowNumber) {
        return matrixFromString[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        int[] column = new int[rowSize];

        for (int i = 0; i < rowSize; i++) {
            column[i] = matrixFromString[i][columnNumber - 1];
        }
        return column;
    }
}
