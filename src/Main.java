import java.util.ArrayList;
import java.util.Scanner;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    // method String.format()
    // takes a string with format specifier as its first argument and
    // arguments to replace those specifiers as the later arguments
    // string template in Java use % symbol
    // %b %B - Boolean
    // %s %S - String
    // %c %C - Unicode character
    // %d - decimal integer
    // %f - floating point numbers

    String brand = "BMW";
    int series = 7;
    int model = 38;

    String formattedString = String.format("Car brand is %s, series is %d and model is e%d", brand, series, model);
    System.out.println(formattedString);

    String fuelType = "Diesel engine";

    System.out.println(String.format("Length of this string is: %d.", fuelType.length()));

    // isEmpty() method can be used in logical expressions
    if (brand.isEmpty()){
        System.out.println("Type your car brand, please");
    } else {
        System.out.println(String.format("Your car brand is %s", brand));
    }

    // there are methods for UpperCase and LowerCase conversion;
    // toUpperCase(), toLowerCase()

    // to compare, there are two methods
    // equals() and equalsIgnoreCase()

    // user input methods
    // import java.util.Scanner class

    /*Scanner scanner = new Scanner(System.in);
    System.out.println("What's your name?");
    String name = scanner.nextLine();
    System.out.printf("So you are %s. How old are you?", name);
    int age = scanner.nextInt();

    // printf() method is kind of combination of the print)_ and String.format() methods

    System.out.printf("Cool! %d is good age to start programming!", age);

    scanner.close(); */

    // arrays in Java
    // import java.util.Arrays;

        char vowels[] = new char[5];

        vowels[0] = 'a';
        vowels[1] = 'b';
        vowels[2] = 'c';
        vowels[3] = 'd';
        vowels[4] = 'f';

        for (int i = 0; i <= vowels.length-1; i++){
            System.out.println(vowels[i]);
        }

        char vowels2 [] = {'c', 'b', 'a', 'q','f'};



        int routineActionsByWeek [] [] = {
                {1,2,3,4,5,6,7},
                {0,1,1,0,1,1,0},
                {2,5,2,1,0,2,3},
                {2,1,0,0,8,6,4}
        };

        for (int i = 0; i < routineActionsByWeek.length; i++) {
            int j;
            for (j = 0; j < routineActionsByWeek.length; j++) ;
            System.out.println("arr[" + i + "][" + j + "]=" + routineActionsByWeek[i][j]);
        }

        int result = routineActionsByWeek[0][6];
        System.out.println(result);

        // sorting arrays

        Arrays.sort(vowels2);
        for (int i = 0; i < vowels2.length; i++){
            System.out.println(vowels2[i]);
        }

        // searching using method Arrays.binarySearch()

        char key = 'q';
        int foundItemIndex = Arrays.binarySearch(vowels2, key);
        System.out.println("The vowel 'q' at index: " +foundItemIndex);

        // you can specify a range in which search should be executed

        int startIndex = 1;
        int endIndex = 4;

        int foundItemIndex2 = Arrays.binarySearch(vowels2, startIndex, endIndex, key);
        System.out.println("The vowel 'q' at index: " +foundItemIndex2);

        // how to fill an array

        Arrays.fill(vowels, 'x');
        System.out.println(vowels);

        // Arrays.copyOf() to copy an array

        int oddNumbers[] = {1,3,5,8};
        int oddNumbers2[] = {1,3,5};

        int copyOfOddNumbers [] = Arrays.copyOf(oddNumbers, oddNumbers.length);

        // copyOf() takes the source array as its first argument and the
        // desired length of the array as the second argument

        // to compare arrays you can use Arrays.equals() function

        if (Arrays.equals(oddNumbers,oddNumbers2)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // for multidimensional arrays you can use Array.deepEquals()

        // loops in java - for, for each, while

        // for loop contains three parts:
        // the initialization, condition, and update expression

        for (int number = 0; number <= 10; number++){
            System.out.println(number);
        }

        int myNumber = 5;
        for (int multiplier = 1; multiplier <= 10; multiplier++){
            System.out.printf("%d x %d = %d ; ", myNumber, multiplier, myNumber * multiplier);

        }
        System.out.println();
        //loops can be nested

        // for-each Loop

        int fibonacciNumbers[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        for(int number : fibonacciNumbers) {
            //System.out.println(number);
        }

        // while loop - as simple as that

        // do-while loop
        // first execute the loop body and then check the condition
        // start - body - condition (if true back to body), if false - stop;

        int number1 = 5;
        int number2 = 5;
        int sum = number1 + number2;
        int totalOperations = 0;

        do{
            System.out.println(sum);
            totalOperations++;
            sum += sum;

        } while (sum <= 100);
        System.out.println(totalOperations);

        // Array Lists
        // resizable, oppose to arrays

        ArrayList<Integer> listNumbers = new ArrayList<>();

        // add() method
        listNumbers.add(1);
        listNumbers.add(3);
        listNumbers.add(9);
        listNumbers.add(2);
        listNumbers.add(4);
        // get() method
        int get = listNumbers.get(1);
        // set() method
        int set = listNumbers.set(1,11);
        System.out.println(listNumbers.get(1));

        // no length property, but size() method
        System.out.println(listNumbers.size());

        // remove() method
        listNumbers.remove(Integer.valueOf(9));
        System.out.println(listNumbers);
        listNumbers.remove(1);
        // by the value or by the index


        //addAll(), removeAll() and clear() works similar to Kotlin

        // removeIf() method can remove elements from an array list if the meet a certain condition

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 10; i++){
            numbers.add(i);
        }

        System.out.println(numbers);
        numbers.removeIf(number -> number % 2 == 1);
        System.out.println(numbers);
        // the removeIf() takes a lambda expression as a parameter
        // lambda expressions are like unnamed methods

        // clone() method
        ArrayList<Integer> numbersCloned = (ArrayList<Integer>)numbers.clone();
        

    }
}
