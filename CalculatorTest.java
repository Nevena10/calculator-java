public class CalculatorTest {
    public static void main(String[] args) {
        testAdd();
    } 

    public static void testAdd() { 
        TestRun sabiranje = new TestRun(); 
        int result = sabiranje.add(50, 25);
        if (result == 75) { 
            System.out.println("test sabiranja uspesan");  
        } else {
            System.out.println("test sabiranja neuspesan, ocekivano 75 dobijeno" + result);
        }

        

    }
}
