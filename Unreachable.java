public class Unreachable {
    public static void main(String args[]) {
        try {
            int i = 10/0;
        } catch(ArithmeticException arithmeticException) {
            System.out.println("Arithmetic Exception");
        } catch(Exception e) {
            System.out.println("all Exception types");
        } catch (Throwable t) {
            System.out.println("Throwable class");//unreachable
        }
    }
}