/*
 * 稀疏矩陣實做
 * */
public class Matrix {

	public static int[][] restore(int[][] sparse) {
		int row = sparse[0][0];
		int col = sparse[0][1];
		int[][] arr = new int [row][col];
		
		for(int i=0,k=1;i<row;i++){
			for(int j=0;j<col;j++){
				if(k<=sparse[0][2]&&i==sparse[k][0]&j==sparse[k][1]){
					arr[i][j]=sparse[k][2];
					k++;
				}else{
					arr[i][j]=0;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		int[][] sparse = { { 8, 9, 8 }, { 0, 8, 5 }, { 1, 1, 6 }, { 3, 0, 3 }, { 3, 6, 2 }, { 4, 5, 9 }, { 5, 3, 4 },
				{ 6, 0, 8 }, { 6, 5, 7 } };
		
		for(int[] i:Matrix.restore(sparse)){
			for(int elm:i){
				System.out.print(elm+" ");
			}
			System.out.println();
		}
		

	}

}
