// time n square
// space constant

class Solution {
    public int minFallingPathSum(int[][] matrix) {

        for(int i=matrix.length-2 ; i>=0 ; i--)
        {
            for(int j=0 ; j<matrix[0].length ; j++)
            {

                if(j==0)
                matrix[i][j] += Math.min(matrix[i+1][j],matrix[i+1][j+1]);

                else if(j==matrix[0].length-1)
                matrix[i][j] += Math.min(matrix[i+1][j],matrix[i+1][j-1]);

                else
                matrix[i][j] += Math.min(matrix[i+1][j], Math.min(matrix[i+1][j-1],matrix[i+1][j+1]));
        }

    }

        int min = Integer.MAX_VALUE;

        for(int n : matrix[0])
        {
            min = Math.min(min,n);
        }

        return min;

    }
}
