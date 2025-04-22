import java.util.Random;
class Datatypes{ 
    public static int generateRandomNumber(){
        Random randomObject=new Random();
        int number = randomObject.nextInt();
        return ((number % 7) + 1);
    }
    public static void main(String args[]){
        // Primitive data types
        int age = 5;
        float height = 72.f;
        double score = 88.99;
        char grade = 'S';
        boolean hasPassed = true;
        long population = 1000000000;
        System.out.println("This is an integer: " + age + "\nThis is a float: " + height + "\nThis is a double: " + score + "\nThis is a character: " + grade + "\nThe student passed exam: " + hasPassed + "\nThis is a long value: " + population);
       
        // Non-primitive data types
        String[] hobbies = {"Eating", "Reading", "Writing"};
        String studentName = "Shravanti";
        System.out.println("Name of student is " + studentName);
        System.out.println("Their activities are:");
        for (String hobby : hobbies) {
            System.out.print(hobby + " ");
        }

        // Operators
        int firstNumber=5,secondNumber=6;
        int original = firstNumber,
        sum = 0,
        difference = 0,
        product = 0,
        quotient = 0,
        remainder = 0;
        sum += secondNumber;
        difference -= secondNumber;
        product *= secondNumber;
        quotient /= secondNumber;
        remainder %= secondNumber;
        
        //Arithmetic operators
        System.out.println("\n Sum of the numbers is:"+(firstNumber + secondNumber)+"\n Difference of the two numbers is :"+(firstNumber - secondNumber)+"\n Product of the numbers is :"+(firstNumber * secondNumber)+"\n After divison then quotient is "+(firstNumber / secondNumber)+"\n The remainder is:"+(firstNumber % secondNumber));
        
        //Relational operators
        System.out.println("\n The relational operators:+"+"\n Equal to: "+(firstNumber == secondNumber)+"\n Greater than: "+(firstNumber > secondNumber)+"\n Less than: "+(firstNumber < secondNumber)+"\n Greater than or equal to: "+(firstNumber >= secondNumber)+"\n Less than or  Equal to: "+(firstNumber <= secondNumber)+ "\n Not Equal to: " +(firstNumber != secondNumber));
        
        // Logical operators
        System.out.println("\n Logical operators:"+"\n Logical and: "+(firstNumber == secondNumber && firstNumber > secondNumber)+"\n Logical or: "+(firstNumber == secondNumber || firstNumber > secondNumber)+"\n Logical not: "+(!(firstNumber == secondNumber || firstNumber > secondNumber))); 
        
        // Assignment operators
        System.out.println("\n Assignment operators are: "+"Assigned number: "+original+" "+" \n Assigment operators in order "+sum+" "+difference+" "+product+" "+quotient+" "+remainder+" "); 
        
        // Unary operators
        System.out.println("\n Unary operators: "+"\n Unary plus"+( + firstNumber) +"\n Unary minus"+( + firstNumber)+"\n Pre incremment:" +(++ firstNumber)+"\n Post increment:"+(firstNumber ++)+"\n Pre decrement:"+(-- firstNumber)+"\n Post decrement:"+(firstNumber --));
        
        // Bitwise operators
        System.out.println("\n Bitwise operators :"+"\n Bitwise or "+(firstNumber | secondNumber)+"\n Bitwise and "+(firstNumber & secondNumber)+"\n Bitwise xor "+(firstNumber ^ secondNumber)+"\n Bitwise negation "+(~ firstNumber)+"\n Left shift "+(firstNumber << 1)+"\n Right shift "+(firstNumber >> 1));
        
        // Ternary operators
        System.out.println("\n Ternary operators: "+((firstNumber > secondNumber) ? true : false));

        //Control Statements
        //If-else demonstration
        System.out.println("\n Finding the greatest number among the two.." );
        if( firstNumber> secondNumber){
            System.out.println("\n The greatest number amobng two is: "+ firstNumber);
        }
        else{
            System.out.println("\n The greatest number among two is: "+ secondNumber);
        }
        //Switch case demonstration
        String WeekDays[]= { " ","Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday", "Saturday", "Sunday"};
        int day = generateRandomNumber();
        System.out.print(" ");
        switch(day){
            case 1:
                System.out.println(WeekDays[day]); break;
            case 2:
                System.out.println(WeekDays[day]); break;
            case 3:
                System.out.println(WeekDays[day]); break;
            case 4:
                System.out.println(WeekDays[day]); break;
            case 5:
                System.out.println(WeekDays[day]); break;
            case 6:
                System.out.println(WeekDays[day]); break;
            case 7:
                System.out.println(WeekDays[day]); break;
            default:
                System.out.println("Not a valid week day number "); break;
        }
        System.out.println();    
    }
}