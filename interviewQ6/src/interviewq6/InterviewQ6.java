/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interviewq6;

import java.util.*;

/**
 *
 * @author iloveirene
 */
public class InterviewQ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入陣列長度");
        int b = sc.nextInt();
        int nums[] = new int[b];
        int c = 0, d = 0;
        if (b > 103) {
            System.out.print("陣列長度過大");
        } else if (b < 2) {
            System.out.print("陣列長度過小");
        } else {
            for (int i = 0; i < b; i++) {
                int a = sc.nextInt();
                if (a < -109 && a > 109) {
                    break;
                } else {
                    nums[i] = a;
                }
            }

            System.out.println("請輸入target");
            int target = sc.nextInt();
            if (target < -109 && target > 109) {
                System.out.print("target過大");
            } else {
                for (int j = 0; j < b; j++) {
                    for (int k = j + 1; k < b; k++) {
                        if (nums[j] + nums[k] == target) {
                            c = j;
                            d = k;
                        }
                    }
                }
            }
            System.out.print("[" + c + "," + d + "]");
        }

    }

}
