/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;
import java.util.Scanner;

/**
 *
 * @author Fery Mei Ferdiansyah
 */
public class Nomor1 {
    public static void main (String[] args){
        int[] data = {3,20,4,2,8,13};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        for (int i=1; i<data.length; i++){
            int key = data[1];
            int j = i-1;
            while((j>=0)&&(data[j]>key)){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key;
        }
        System.out.println("\nsorted by Feri Mei Ferdiansah:");
        System.out.println("=== Insertion Sort ===");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
            }
        }
    }