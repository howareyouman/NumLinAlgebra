package Main;
import Matrix_Base.Matrix;
public final class Try_Matrix {

	public static void main(String[] args) {
		Matrix A = new Matrix(4,4); 
		A.random(4, 4);
		A.show();
	}
}
