
// Introduce the scanner tool used for reading user input
import java.util.ArrayList;
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {


//        double[] x = new double[]{6, 13, 7, 11, 4, 13, 2, 14, 10, 6, 10, 14, 9, 7, 5, 7, 12, 9, 10, 5, 6, 10, 8, 15, 13, 14, 7, 4, 5, 2, 2, 2, 6, 11, 13, 14, 11, 6, 12, 5, 2, 11, 5, 15, 14, 11, 11, 3, 5, 14};
//        double[] y = new double[]{3, 11, 11, 14, 13, 15, 15, 2, 4, 14, 1, 11, 8, 2, 4, 15, 4, 6, 11, 10, 3, 13, 8, 12, 13, 3, 14, 6, 4, 10, 10, 12, 10, 13, 3, 6, 14, 14, 1, 3, 2, 12, 4, 13, 4, 2, 8, 6, 1, 7};

        double[] x = new double[]{1,2,3,324,2,23,145,2,4,6,32,45,3,12,54,34,23,12};
        double[] y = new double[]{23,12,1,2,3,324,2,23,145,2,4,6,32,45,3,12,54,34};
        

        int squareCount = 0;       
        
        for (int index1 = 0; index1 < x.length; index1++) {
           
            for (int index2 = index1 + 1; index2 < x.length; index2++) {
                double d1 = Math.abs(x[index1] - x[index2]);
                double d2 = Math.abs(y[index1] - y[index2]);
            
                if (d1 != 0 && d2 != 0 && d1 == d2) {
                    squareCount++;
                    System.out.println("-- "+"index1= "+index1+" x1= "+x[index1]+ " y1= "+y[index1] +" index2= "+index2+ " x2= "+x[index2]+" y2= "+y[index2]+" count: "+squareCount);
                    
                }
                    
            }
        }
        System.out.println("Number of squares: " + squareCount);
        System.out.println("Number of index pairs: " + squareCount*2);

    }
}
