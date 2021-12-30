public class Bear {
    public static int num = 0;
    public int myNum;
    public String name;
    public Bear (int n, String str) {
        num += 1;
        myNum = n;
        name = str;
    }
    public void printNum() {
        System.out.println(myNum);
    }
    public void printInfo(String str) {
        System.out.println("I like " + str);
    }
    public void printInfo(int d) {
        System.out.println("Number: " + d);
    }
}
