/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interviewq5;

import java.util.*;

/**
 *
 * @author iloveirene
 */
public class InterviewQ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr1[] = new int[]{77, 5, 5, 22, 13, 55, 97, 4, 796, 1, 0, 9};
        int arr2[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr3[] = new int[12];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i]) {
                    arr3[i] = arr2[j];
                    arr2[j] = -1;
                    System.out.print(arr3[i] + " ");

                }
            }
        }

        System.out.println(" ");
    }

}
