public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int a = 0;
        while (a <amount ) {
            System.out.print("*");
            a++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int a = 0;
        while (a<amount) {
            System.out.print(" ");  
            a++;
    }
        // 40.1
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i<=size) {
            printWhitespaces(size-i);
            printStars(i);
            i++;
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        int i = 1;
        
        while (i<=height) {
            printWhitespaces(height-i);
            printStars((2*i)-1);
            i++;
        }
        i=1;
        while(i<=2) {
            printWhitespaces(height-2);
            printStars(3);
            i++;
        }
        
        
        
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
