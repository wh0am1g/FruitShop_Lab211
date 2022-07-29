package P0023;

import java.util.Scanner;

public class Validator {
    Scanner scanner=new Scanner(System.in);
    public boolean isNumber(String str) { 
        try {  
            Integer.parseInt(str);  
            return true;
        } catch(NumberFormatException e){   
            System.err.println("Values must be the positive number");
            return false;  
        }  
    }
    
    public int validateInput(String message,int min, int max){
        int result;
        while (true){
            System.out.print(message);
            String input=scanner.nextLine();
            if (isNumber(input)) 
            {
                result = Integer.parseInt(input); 
                if (result<min || result>max) {
                    System.err.println("Wrong input, try again.");
                    continue;
                }
                break;
            }
        }
        return result;
    }
    
    public  String validateInputString() {
        while (true) {
            String rerult = scanner.nextLine().trim();
            if (rerult.isEmpty()) {
                System.err.println("Input empty!");
                System.out.print("Enter again: ");
            } else {
                return rerult;
            }
        }
    }
    public boolean validateYN() {
        
        while (true) {
            String result = validateInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please enter Y or N!");
            System.out.print("Enter again: ");
        }
    }
}
