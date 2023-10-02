public class task2 {
    public static void main(){
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int d = 0;
            double catchedRes1 = intArray[8] / (double) d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching ArithmeticException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching ArrayIndexOutOfBoundsException: " + e);
        }
        
    }
}
