
public class Main {


    public static void main(String[] args) {

        Calculate calculate = new Calculate();
        calculate.ssumm(2, 2);
        calculate.viewLastResult("console");

        calculate.executeOperation("multiply",5.0,5.0);
        calculate.viewLastResult("superConsole");

        

        calculate.executeOperation("multiply",23321.0,2311.9);
        calculate.viewLastResult("database");
        
    }


}
