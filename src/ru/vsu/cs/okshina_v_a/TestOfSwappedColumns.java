package ru.vsu.cs.okshina_v_a;

import org.junit.Test;
import org.junit.Assert;
import ru.vsu.cs.okshina_v_a.utils.ArrayUtils;

public class TestOfSwappedColumns {
    SwapColumns swap = new SwapColumns();

    @Test
    public void testMatrixWithAllZeroes() {
        int[][] testingMatrix = ArrayUtils.readIntArray2FromFile("testSrc/testCase/testingMatrixWithAllZeroes.txt");
        int[][] realMeaning = swap.swapColumnsWithMinAndMaxSumOfNumbers(testingMatrix);
        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testResult/answerMatrixWithAllZeroes.txt");

        Assert.assertArrayEquals(expectedResult, realMeaning);
    }

    @Test
    public void testRandomMatrix() {
        int[][] testingMatrix = ArrayUtils.readIntArray2FromFile("testSrc/testCase/testingRandomMatrix.txt");
        int[][] realMeaning = swap.swapColumnsWithMinAndMaxSumOfNumbers(testingMatrix);
        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testResult/answerRandomMatrix.txt");

        Assert.assertArrayEquals(expectedResult, realMeaning);
    }

    @Test
    public void testMatrixWithBigNumbers() {
        int[][] testingMatrix = ArrayUtils.readIntArray2FromFile("testSrc/testCase/testingMatrixWithBigNumbers.txt");
        int[][] realMeaning = swap.swapColumnsWithMinAndMaxSumOfNumbers(testingMatrix);
        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testResult/answerMatrixWithBigNumbers.txt");

        Assert.assertArrayEquals(expectedResult, realMeaning);
    }

    @Test
    public void testMatrixWithSameColumns() {
        int[][] testingMatrix = ArrayUtils.readIntArray2FromFile("testSrc/testCase/testingMatrixWithSameColumns.txt");
        int[][] realMeaning = swap.swapColumnsWithMinAndMaxSumOfNumbers(testingMatrix);
        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testResult/answerMatrixWithSameColumns.txt");

        Assert.assertArrayEquals(expectedResult, realMeaning);
    }

    @Test
    public void testMatrixWithNegativeNumbers() {
        int[][] testingMatrix = ArrayUtils.readIntArray2FromFile("testSrc/testCase/testingMatrixWithNegativeNumbers.txt");
        int[][] realMeaning = swap.swapColumnsWithMinAndMaxSumOfNumbers(testingMatrix);
        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testResult/answerMatrixWithNegativeNumbers.txt");

        Assert.assertArrayEquals(expectedResult, realMeaning);
    }
}