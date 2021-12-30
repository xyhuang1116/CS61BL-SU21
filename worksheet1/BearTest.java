import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BearTest {

    @Test
    void Test() {
        Bear bear1 = new Bear(4, "Oski");
        Bear bear2 = new Bear(2, "Clark");


        System.out.println(bear2.num);
        bear2.num -= 1;
        System.out.println(bear1.num);
        bear2.myNum -= 1;
        System.out.println(bear1.myNum);
        bear1.printInfo(2);
        bear1.printInfo("apples");

    }
}