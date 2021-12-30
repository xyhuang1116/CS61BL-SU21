public class flatten{
    public static int[] flatten(int[][] x) {
        int newArraySize = 0;
        for (int[] y : x) {
            newArraySize += y.length;
        }
        int[] newArray = new int[newArraySize];
        int newArrayIndex = 0;
        for (int[] y : x) {
            for (int element : y) {
                newArray[newArrayIndex] = element;
                newArrayIndex += 1;
            }
        }
        return newArray;
    }

    public static void main(String[] args){
        int[][] x = new int[][]{new int[]{1, 3, 7}, new int[0],new int[]{9}};
        int[] newarray = flatten(x);
        System.out.println(newarray.length);
        for(int m : newarray){
            System.out.println(m);
        }
    }
}

