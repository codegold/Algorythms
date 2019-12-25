package src.Matrix;

public class Matrix {

    private int nRows;
    private int nCols;

    private MatrixLink first;
    private MatrixLink current;

    public Matrix(int rows, int cols) {
        nRows = rows;
        nCols = cols;

        first = new MatrixLink(0);
        current = first;

        //initialize all cells to 0
        MatrixLink temp;
        for (int i = 0; i < nRows; i++) {
            temp = current;

            for (int j = 1; j < nCols; j++) {
                temp.nextCol = new MatrixLink(0);
                temp = temp.nextCol;
            }

            if (i < nRows - 1) {
                //don't make a new row if we're on the last one
                current.nextRow = new MatrixLink(0);
                current = current.nextRow;
            }
        }
    }
}
