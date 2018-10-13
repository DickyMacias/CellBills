/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellbills;

import java.text.NumberFormat;

/**
 *
 * @author kimg
 */
public class CellBills {
    
    public static void main(String[] args) {
        //Here you declred and instantiate the array
        
        double [] CellBills = new double [10];        
        //Here you assingn values to the array's elements
        
        CellBills [0]= 45.24;
        CellBills [1]= 54.67;
        CellBills [2]= 42.55;
        CellBills [3]= 44.61;
        CellBills [4]= 65.29;
        CellBills [5]= 49.75;
        CellBills [6]= 56.50;
        CellBills [7]= 40.05;
        CellBills [8]= 50.45;
        CellBills [9]= 46.50;
        

double totalBills = 0.0; //inticializate total

for(int i=0; i<CellBills.length; i++)
    {
        totalBills += CellBills [1];
        
        }

int maxIndex = 0;
for (int  i = 1; i < CellBills.length; i++)
    
    if(CellBills [i] > CellBills[maxIndex])
        maxIndex = i;
        
NumberFormat priceFormat = NumberFormat.getInstance ();
System.out.println("Total for the Bills: " + priceFormat.format(totalBills));
System.out.print("------------------------>");
System.out.println("\n The highest bill: " + priceFormat.format(CellBills[maxIndex]) + ", was found at the Index" + maxIndex);


    }
    
}

