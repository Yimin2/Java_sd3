package com.ll.a.basic;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println("================== 배열 최댓값/최솟값 ==================");
        int[] numbers = {45, 23, 78, 12, 89, 34};
        Arrays.sort(numbers);
        System.out.printf("최댓값 %d\n", numbers[numbers.length-1]);
        System.out.printf("최소값 %d\n", numbers[0]);

        System.out.println("================== 배열 뒤집기 ==================");
        int[] arr1 = {1, 2, 3, 4, 5};
        Arrays.sort(arr1);
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] =  arr1[arr1.length-1-i];
        }
        System.out.println(Arrays.toString(arr2));

        System.out.println("================== 특정 값 찾기 ==================");
        int[] arr3 = {10, 20, 30, 40, 50};
        int target1 = 30;
        Arrays.sort(arr3);
        int idx1 = Arrays.binarySearch(arr3, target1);
        System.out.printf("%d의 인덱스: %d\n", target1, idx1);

        System.out.println("================== 배열 요소 개수 세기 ==================");
        int[] arr4 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        Arrays.sort(arr4);
        int count = 1;
        for (int i = 0; i <  arr4.length ; i++) {
            if(i+1 == arr4.length) {
                System.out.printf("%d: %d\n", arr4[i], count);
                break;
            }
            if(arr4[i] == arr4[i+1]) {
                count++;
            } else {
                System.out.printf("%d: %d\n", arr4[i], count);
                count = 1;
            }
        }
        System.out.println("================== 2차원 배열 합계 ==================");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int result1 = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                result1 += num;
            }
        };
        System.out.println(result1);

        System.out.println("================== 배열에서 두 번째로 큰 수 ==================");
        int[] arr6 = {45, 23, 78, 12, 89, 34};
        Arrays.sort(arr6);
        System.out.printf("두 번째로 큰 수: %d", arr6[arr6.length-2]);

    }
}
