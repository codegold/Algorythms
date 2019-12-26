package src.Matrix;

public class MatrixApp {
    public static void main(String[] args) {

        Matrix theMatrix = new Matrix(4,6);
        theMatrix.display();
        //this is just for test

        theMatrix.insert(7, 3, 2);
        theMatrix.insert(8, 4, 3);
        theMatrix.insert(66, 4, 5);
        theMatrix.insert(33, 4, 6);
        theMatrix.insert(11, 2, 3);
        theMatrix.display();
    }
}
