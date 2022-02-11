public class javaPractice {

    /*public static int sumDigits(int x) {
        if (x < 10) {
            return x;
        }
        return sumDigits(x / 10) + x % 10;
    }*/


    // iteratively
    public static int sumDigits(int x) {
        int sum = 0;
        while(x > 0){
            sum += x%10;
            x = (x - x%10)/10;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(sumDigits(31415));
    }
}
