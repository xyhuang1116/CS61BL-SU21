public class ArrayOperations {
    /**
     * Delete the value at the given position in the argument array, shifting
     * all the subsequent elements down, and storing a 0 as the last element of
     * the array.
     */
    public static void delete(int[] values, int pos) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        // TODO: YOUR CODE HERE
        while (pos < values.length - 1) {
            values[pos] = values[pos+1];
            pos++;
        }
        values[pos] = 0;
    }

    /**
     * Insert newInt at the given position in the argument array, shifting all
     * the subsequent elements up to make room for it. The last element in the
     * argument array is lost.
     */
    public static void insert(int[] values, int pos, int newInt) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        // TODO: YOUR CODE HERE
        for (int i = values.length - 1; i > pos; i--) {
            values[i] = values[i-1];
        }
        values[pos] = newInt;
    }

    /** 
     * Returns a new array consisting of the elements of A followed by the
     *  the elements of B. 
     */
    public static int[] catenate(int[] A, int[] B) {
        // TODO: YOUR CODE HERE
        int[] array = new int[A.length+B.length];
        for (int i = 0; i < A.length; i++) { array[i] = A[i]; }
        for (int i = A.length; i < array.length; i++) { array[i] = B[i-A.length]; }

        return array;
    }

    /** 
     * Returns the array of arrays formed by breaking up A into
     *  maximal ascending lists, without reordering.
     */
    public static int[][] naturalRuns(int[] A) {
        // TODO: Your CODE HERE
        int[] breakPos = new int[A.length];
        int[][] multiArray;
        int breakPosLen = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] >= A[i+1]) {
                breakPos[breakPosLen] = i;
                breakPosLen += 1;
            }
        }
        multiArray = new int[breakPosLen+1][];
        for (int i = 0; i <= breakPosLen; i++) {
            if (i == 0) {
                multiArray[i] = subarray(A, 0, breakPos[i]+1);
            } else if (i == breakPosLen) {
                multiArray[i] = subarray(A, breakPos[i-1]+1, A.length-1-breakPos[i-1]);
            } else {
                multiArray[i] = subarray(A, breakPos[i-1]+1, breakPos[i]-breakPos[i-1]);
            }
        }

        return multiArray;
    }

    /*
    * Returns the subarray of A consisting of the LEN items starting
    * at index K.
    */
    public static int[] subarray(int[] A, int k, int len) {
        int[] result = new int[len];
        System.arraycopy(A, k, result, 0, len);
        return result;
    }

}