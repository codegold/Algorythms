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

    public boolean insert(double value, int row, int col) {

        //If out of range
        if (row > nRows || col > nCols || row < 0 || col < 0) {

            System.out.println("Must be in range (0,0) to (" + nRows + "," + nCols + ")");
            return false;
        } else {
            current = first;
            for (int i = 1; i < row; i++) {
                current = current.nextRow;
            }
            for (int i = 1; i < col; i++) {
                current = current.nextCol;
            }
            current.dData = value;

            System.out.println("Inserted value at row: " + row + "and at col: " + col);
            return true;
        }
    }
}
