package task_1_7;

// if matrix element is zero ==> fill entire col and row to zero!

public class testAppl {

    public static void main(String[] args) {

        Matrix matrix = new Matrix(3,3);
        matrix.printMatrix("Initial matrix:");
        matrix.findZeroAndFixMatrix();
        matrix.printMatrix("Final matrix:");
    }
}
