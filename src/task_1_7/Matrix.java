package task_1_7;

import java.util.Random;

/**
 * Created by pc-users on 6/23/2015.
 */
public class Matrix {
    int[][] matrix;
    int N,M;
    int[]col,row;

    public Matrix(int N,int M){
        this.M=M;
        this.N=N;
        col = new int[N];
        row = new int[M];
        matrix = new int[N][M];
        fillMatrix();
    }
    private void fillMatrix(){
        Random random =new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }
    public void findZeroAndFixMatrix(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j]==0){
                    col[i]=1;
                    row[j]=1;
                }
            }
        }
        fixMatrix();
    }
    private void fixMatrix(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(col[i]==1||row[j]==1)
                    matrix[i][j]=0;
            }
        }

    }

    public void printMatrix(String header){
        System.out.println(header);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
