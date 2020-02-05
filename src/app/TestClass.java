package app;

public class TestClass {
    public static void main(String[] args) {

        double numberToPrint = 0;

        System.out.println("Pętla while:");
        while(numberToPrint < 3.1){
            System.out.format("%.1f", numberToPrint);
            numberToPrint += 0.1;
            if(numberToPrint < 3.1) System.out.print(", ");
        }

        numberToPrint = 0;
        System.out.println("\nPętla do while:");
        do{
            System.out.format("%.1f", numberToPrint);
            numberToPrint += 0.1;
            if(numberToPrint < 3.1) System.out.print(", ");
        }while(numberToPrint < 3.1);

    }
}
