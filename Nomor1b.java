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
public class Nomor1b {
    public static void printData(int[] data){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
    public static void InsertionSort(int[] data){
        for (int i=0; i<data.length-1; i++){
            int indexSmall = i;
            for (int j=i+1; j<data.length; j++){
                if (data[j] < data[indexSmall]){
                    indexSmall = j;
                }
            }
            int temp = data[i];
            data[i] = data[indexSmall];
            data[indexSmall] = temp;
        }
    }
    public static void binarySearch(int[] data, int key){
        int indexAwal = 0;
        int indexAkhir = data.length-1;
        int middle = 0;
        int found = 0;
        while((indexAwal<=indexAkhir) && (found == 0)){
            middle = (indexAwal+indexAkhir)/2;
            System.out.println("nilai tengah = "+middle);
            if (key == data[middle]){
                System.out.println("Data "+key+", telah ditemukan pada indeks ke-"+middle);
                found = 1;
            }
            else{
                if (key < data[middle]){
                    System.out.println("<- kiri");
                    indexAkhir = middle-1;
                }
                else{
                    System.out.println("kanan ->");
                    indexAwal = middle+1;
                }
            }
        }
        if (found == 1){
            System.out.println("Kesimpulan : data ditemukan");
        }
        else{
            System.out.println("Kesimpulan : data tidak ditemukan");
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] nilai = {3,10,4,2,8,13};
        System.out.println("--- before ---");
        printData(nilai);
        InsertionSort(nilai);
        System.out.println("--- after ---");
        printData(nilai);
        
        System.out.println("\nMasukan Data yang Ingin Anda Cari:");
        int key = input.nextInt();
        
        binarySearch(nilai, key);
                }
            }
    
