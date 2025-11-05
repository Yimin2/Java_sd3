package com.ll.a.basic;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = {5,2,1,7,8};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int idx = Arrays.binarySearch(nums, 7); // 정렬이 되어 있을 때만 가능
        System.out.println(idx);

        int[] filled = new int[10];
        Arrays.fill(filled, 99);
        System.out.println(Arrays.toString(filled));

        int[] origin = {1,2,3,4,5};
        int[] copied = Arrays.copyOf(origin, origin.length);
        // copyof 차이점, 객체를 참조 하는 일반 방식 대신, 값을 복사
        System.out.println(Arrays.toString(copied));

        int[] ranged = Arrays.copyOfRange(origin, 1,3);
        System.out.println(Arrays.toString(ranged));

        int[] arrA = {1,2,3};
        int[] arrB = {1,2,3};

        System.out.println(arrA == arrB);
        System.out.println(Arrays.equals(arrA,arrB));

        int[][] mat = {{1,2},{3,4}};
        System.out.println(Arrays.toString(mat));
        System.out.println(Arrays.deepToString(mat));

    }
}
