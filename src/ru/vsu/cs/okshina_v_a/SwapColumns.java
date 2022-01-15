package ru.vsu.cs.okshina_v_a;

public class SwapColumns {
    public int[][] swapColumnsWithMinAndMaxSumOfNumbers(int[][] arr2) {

        int min = 9999, max = -1;
        int min_index = 9999, max_index = -1;

        for (int j = 0; j < arr2[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr2.length; i++) {
                sum += arr2[i][j];

                if (j < 1 || sum > max) {
                    max = sum;
                    max_index = j;
                }

                if (j < 1 || sum < min) {
                    min = sum;
                    min_index = j;
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            int temp = arr2[i][min_index];
            arr2[i][min_index] = arr2[i][max_index];
            arr2[i][max_index] = temp;
        }

        return arr2;
    }
}