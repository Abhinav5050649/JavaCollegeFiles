public class Q14 {
    public static void main(String[] args)
    {
        int a[][]={{1,4,5}, {21,12,32},{32,31,30}};    
        int b[][]={{121, 3, 1}, {200,29,12},{23,13,3}};
        
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 3; ++j)
            {
                c[i][j] = 0;
                for (int k = 0; k < 3; ++k)
                {
                    c[i][j] = a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product matrix: ");
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 3; ++j)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        int[][] l1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] l2 = {{7, 8, 9}, {6, 5, 4}, {3, 2, 1}};
        int[][] l3 = new int[3][3];

        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 3; ++j)
            {
                l3[i][j] = 0;
                for (int k = 0; k < 3; ++k)
                {
                    l3[i][j] = l1[i][k] + l2[k][j];
                }
            }
        }

        System.out.println("Sum matrix: ");
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 3; ++j)
            {
                System.out.print(l3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
