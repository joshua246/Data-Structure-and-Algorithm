class DiffMatrix
{
   public static void main(String args[])
   {
         int i,j,k;
         int matrixA[][]= { {10,11,12,13}, 
                             {14,15,16,17}, 
                             {18,19,20,21},
                             {22,23,24,25}
                           };

         int matrixB[][]= { {1,2,3,4}, 
                             {5,6,7,8}, 
                             {9,1,2,3},
                             {4,5,6,7}
                           };
         int diff[][] = new int[4][4];
         
         System.out.println("\n\t++Subtracting Two Matrices++\n");

         // Display Elements in Matrix A
         System.out.println("\n\tElements in Matrix A\n");

         for(i=0;i<4;i++)
         {
            for(j=0;j<4;j++)
            {
               System.out.print("\t" + matrixA[i][j]);
            }
            System.out.println("\t");
         }

         // Display Elements in Matrix B
         System.out.println("\n\n\tElements in Matrix B\n");

         for(i=0;i<4;i++)
         {
            for(j=0;j<4;j++)
            {
               System.out.print("\t" + matrixB[i][j]);
            }
            System.out.println("\t");
         }

         // Difference of 2 Matrices
         System.out.println("\n\n\tDifference of Matrix A and Matrix B\n");

         for(i=0;i<4;i++)
         {
            for(j=0;j<4;j++)
            { 
               diff[i][j] = matrixA[i][j]-matrixB[i][j];
               System.out.print("\t" + diff[i][j]);
            }
            System.out.println("\t");
         }
   }
}