package Dolgozat;

public class Functions {
    public static String fizzBuzz(int number){
        if(number % 3  == 0 && number % 5 == 0 ){
            return "FizzBuzz";
        } else if( number % 3 == 0){
            return "Fizz";
        }else if(number % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public static int maxOfThree(int szam1, int szam2, int szam3){
        return Math.max(szam1,Math.max(szam2,szam3));
    } 

    public static int dividersnumber(int num1){
        int count = 0;
        for(int i = 1; i <= num1;i++){
            if (num1 % i == 0){
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char number ){
        char lowercase = Character.toLowerCase(number);
        return "aeou".indexOf(lowercase) != -1;
    }
}
