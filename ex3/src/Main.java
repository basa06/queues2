import ibadts.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue= new Queue<>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please give some ints: ");
        int n = 0;
        while (scanner.hasNextInt()){
            queue.enqueue(scanner.nextInt());
            n++;
        }

        int rows = 1;
        if (n%7!=0){
            rows=n/7 +1;

        }


        else{
            rows= n/7;
        }
        int[][] data = new int[rows][7];

int r =0;
int c= 0;
        while (!queue.isEmpty())
        {
            int e = queue.dequeue();

            data[r][c]=e;
            c++;
            if(c==7){
                c=0;
                r++;
            }


        }
        for (int[]x: data){
            System.out.println(Arrays.toString(x) );
        }


    }
}