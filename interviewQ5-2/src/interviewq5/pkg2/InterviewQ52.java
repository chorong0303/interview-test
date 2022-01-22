/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interviewq5.pkg2;

/**
 *
 * @author iloveirene
 */
public class InterviewQ52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr1[] = new int[]{77, 5, 5, 22, 13, 55, 97, 4, 796, 1, 0, 9};
        int arr2[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr3[] = new int[12];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr2.length; k++) {
                if (arr1[i] == arr2[k]) {
                    count += 1;
                }
            }
            if (count == 0) {
                arr3[i] = arr1[i];
                System.out.print(arr3[i] + " ");
            } else {
                count = 0;
            }
        }
    }

}
