package in.assignment.Q1;

public class ConvertInto2D {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		int m=2;
		int n=2;
		int[][] ans;
		ans=construct2DArray(nums,m,n);

		for(int i=0;i<ans.length;i++)
		{
			for(int j=0;j<ans[i].length;j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static int[][] construct2DArray(int[] original, int m, int n) {
        int [][] arr=new int [m][n];
        if(original.length!=m*n)return new int[0][0];
        int ix=0;
         for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=original[ix++];
              
         }
      }
      return arr;
    }

}
