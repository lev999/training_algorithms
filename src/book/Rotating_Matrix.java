package book;

//http://stackoverflow.com/questions/25882480/rotating-a-nxn-matrix-in-java

public class Rotating_Matrix {

	private final static int N = 3;
	static int[][] M = new int[N][N];

	public static void main(String[] arg) {
		System.out.println("Initial matrix:");
		createM();
		printM();
		System.out.println("Rotated matrix");
		rotateM();
		printM();
	}

	private static void printM() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(M[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void rotateM() {
		int L0 = N - 1;
		int last = 0;
		int first=0;
		for (int lay = 0; lay < N / 2; lay++) {
			first = lay;
			last = L0 - first;
			for (int i = first; i <= last; i++) {
				int temp = M[first][first];
				
				M[first][first] = M[last - i][first];
				M[last - i][first] = M[last - i][last - i];
				M[last - i][last - i] = M[first][last - i];
				M[first][last - i] = temp;
			}

		}

	}

	private static void createM() {
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				M[i][j] = count;
				count++;
			}
		}

	}
}
