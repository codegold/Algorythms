package src.AlgorythmsWork.AlgoDraw.Matrix;

public class MatrixLink {
    public double dData;
    public MatrixLink nextRow;
    public MatrixLink nextCol;

    public MatrixLink(double value){
        dData = value;
    }

    public void displayLink(){
        System.out.print(dData + " ");
    }
}
