package book;

//http://stackoverflow.com/questions/25882480/rotating-a-nxn-matrix-in-java

public class Rotating_Matrix {

	private final static int N = 5;
	static int[][] M = new int[N+1][N+1];

	public static void main(String[] arg) {
		System.out.println("Initial matrix:");
		createM();
		printM();
		System.out.println("Rotated matrix");
		rotateM();
		printM();
	}

	private static void rotateM() {

		for(int layer=1;layer<=N/2;layer++){
			for (int i=layer;i<=(N-layer);i++){
				int temp = M[layer][i];
				M[layer][i]= M[N-i+1][layer];
				M[N-i+1][layer]= M[N-layer+1][N-i+1];
				M[N-layer+1][N-i+1]= M[i][N-layer+1];
				M[i][N-layer+1]= temp;
			}
		}
	}

	private static void printM() {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Indexes:");
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}

	}


	private static void createM() {
		int count = 1;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				M[i][j] = count;
				count++;
			}
		}

	}
}
