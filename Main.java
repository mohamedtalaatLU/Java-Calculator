import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static double[] TakeInput(){
        double a; double b;
        System.out.println("Enter the first number: ");
        a = scn.nextDouble();
        System.out.println("Enter the second number: ");
        b = scn.nextDouble();
        double[] arr = {a, b};
        return arr;
    }
    public static void main(String[] args) {
        String msg = "Type the following options to choose from them and you can perform the chosen operation to two numbers of your choice!\n" +
                "Add\n" +
                "Subtract\n" +
                "Multiply\n" +
                "Divide (Note: DON'T DIVIDE BY ZERO!!!)\n" +
                "AND (Bitwise and operation)\n" +
                "OR (Bitwise or operation)\n" +
                "Exit (to stop the application)\n"+
                "Enter an operation from above (Case sensitive): ";
        System.out.println("Welcome to the CALCULATOR Prototype\n");


        while(true){
            System.out.println(msg);
            String op = scn.next();
            if(op.equals("Exit")){
                System.out.println("Thanks for using the prototype!");
                break;
            }
            double [] arr = TakeInput();
            if(op.equals("Add")){
                System.out.println(arr[0]+arr[1]+"\n");
            }
            else if(op.equals("Subtract")){
                System.out.println(arr[0]-arr[1]+"\n");
            }
            else if(op.equals("Multiply")){
                System.out.println(arr[0]*arr[1]+"\n");
            }
            else if(op.equals("Divide")){
                if(arr[1]==0){
                    System.out.println("I SAID DON'T DIVIDE BY ZERO!!!\n" +
                            "Now, start all over again.");
                    continue;
                }
                System.out.println(arr[0]/arr[1]+"\n");
            }
            else if(op.equals("AND")){
                long [] arr1 = {(long)arr[0], (long)arr[1]};
                System.out.println((arr1[0]&arr1[1])+"\n");
            }
            else if(op.equals("OR")){
                long [] arr1 = {(long)arr[0], (long)arr[1]};
                System.out.println((arr1[0]|arr1[1])+"\n");
            }
            else{
                System.out.println("Wrong choice (Remember, case sensitive!!)\n");
            }
            System.out.println("Another operation? [Y/N]:");
            if(scn.next().equals("N")){
                break;
            }
        }


    }
}