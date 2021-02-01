/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package large_small_cheak;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Large_small_cheak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max;
Scanner s = new Scanner(System.in);
int[] arr = new int[5];
System.out.println("Enter elements of array:");
for(int i = 0; i < arr.length; i++)
{
arr[i] = s.nextInt();
}
max = arr[0];
int min = arr[0];
for(int i = 0; i < arr.length; i++)
{
if(max < arr[i])
{
max = arr[i];
}
if(min > arr[i])
{
min = arr[i];
}
}
System.out.println("Smallest Value is :"+min);
System.out.println("Largest Value is :"+max);
        
    }
    
}
