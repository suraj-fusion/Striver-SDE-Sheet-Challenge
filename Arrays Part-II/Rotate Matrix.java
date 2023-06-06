class Solution {
    public void rotate(int[][] matrix) {
          
        //brute force approach
        //using temporary matrix of same size here what we do is that we copy every row of the 
        //original matrix into columns of the temporary matrix starting from last meaning that 1st row
        //becomes nth col 2nd row becomes n-1 th col and so on..

        int temp[][]=new int[matrix.length][matrix.length];

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                temp[j][matrix.length-1-i]=matrix[i][j];
            }
        }

       for(int i=0;i<matrix.length;i++)
         {
             for(int j=0;j<matrix.length;j++)
             {
                 matrix[i][j]=temp[i][j];
             }
         }

         //can do matrix=temp but leetcode wont accept for some reason
          
    }
    //TC-O(n^2)  SC-O(n^2)
}





class Solution2 {
    public void rotate(int[][] matrix) {
          
       //optimised approach 
       //using transpose of the matrix.Just transpose the matrix and then reverse every row 

       for(int i=0;i<matrix.length;i++)
       {
           for(int j=i+1;j<matrix.length;j++)
           {
               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
           }
       }

       for(int i=0;i<matrix.length;i++)
       {
           int low=0;
           int high=matrix.length-1;
           while(low<high)
           {
              int temp= matrix[i][low];
              matrix[i][low]=matrix[i][high];
              matrix[i][high]=temp;
              low++;
              high--;
           }
       }
       //TC-O(N^2) SC-O(1)
}
}



