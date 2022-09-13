import java.net.Inet4Address;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

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

        // removeIf() method can remove elements from an array list if meet a certain condition

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 10; i++){
            numbers.add(i);
        }

        System.out.println(numbers);
        //numbers.removeIf(number -> number % 2 == 1);
        System.out.println(numbers);
        // the removeIf() takes a lambda expression as a parameter
        // lambda expressions are like unnamed methods

        // clone() method
        ArrayList<Integer> numbersCloned = (ArrayList<Integer>)numbers.clone();

        // contains() method can be used to check if an array list contains a given element or not

        System.out.println(numbers.contains(8));

        // sort() fun can also be used for array list

        // retainAll() method can find elements which are present in both array lists
        // and remove the rest from the first array list

        ArrayList<Integer> oddNumbers3 = new ArrayList<>();

        oddNumbers3.add(1);
        oddNumbers3.add(3);
        oddNumbers3.add(5);

        ArrayList<Integer> moreOddNumbers = new ArrayList<Integer>();

        moreOddNumbers.add(5);
        moreOddNumbers.add(7);
        moreOddNumbers.add(9);

        oddNumbers3.retainAll(moreOddNumbers);

        System.out.println(oddNumbers3.toString());

        ArrayList<Integer> testList = (ArrayList<Integer>)numbers.clone();

        testList.forEach(x -> {
            x = x * 2;
            System.out.printf("%d ", x);
            System.out.println(testList);

        });

        // Hash Maps in Java
        // looks similar to Kotlin - key-value pairs
        // import java.util.HashMap;

        HashMap<String, Double> prices = new HashMap<>();

        String goods [] = {"apple", "orange", "guava", "berry", "banana"};
        double pricesArray [] = {2.0, 1.8, 1.5, 2.5, 1.0};
        for (int i = 0; i < 5; i++){
            prices.put(goods[i],pricesArray[i]);
        }
        System.out.printf(prices.toString());

        // putIfAbsent() method adds the given element only if it already doesn't exist in the has map
        prices.putIfAbsent("guava", 2.9);

        // get() method bring out a value from the hash map
        // it takes the key as its parameter
        System.out.println();
        System.out.println(prices.get("banana"));

        // the getOrDefault() but if the given key is not found, it'll
        // return a specified default value (that value has to match the type of the values in hash map)
        System.out.println(prices.getOrDefault("strawberry", 0.0));

        // map value can be updated by replace() method
        prices.replace("berry", 2.8);

        // for removing elements from a has map, you can remove() method
        prices.remove("guava");
        System.out.println(prices.toString());

        // size() method
        System.out.println(prices.size());

        // clear () - nuff said

        // putAll() method
        HashMap<String, Double> morePrices = new HashMap<>();

        prices.put("jack-fruit", 2.9);
        prices.put("pineapple", 1.2);
        prices.put("tomato", 0.8);

        prices.putAll (morePrices);
        System.out.println(prices.toString());

        // you can use replaceAll() method to update values in a hash map

        prices.replaceAll((x, y) -> y * 2);
        System.out.println(prices.toString());

        // for purpose of checking key or a value
        // containsKey(), containsValue() methods

        boolean isTrue = prices.containsKey("tomato");
        System.out.println(isTrue);

        // isEmpty() method for ch

        boolean isFalse = prices.isEmpty();
        System.out.println(isFalse);

        // Hash map also have their own forEach() method;
        prices.forEach((fruit, price) -> {
            System.out.println(fruit + " - "+ (price - 0.5));
        });

        // classes and objects in Java
        // OOP (Object-oriented programming) is a programming paradigm
        // based on the concept of "objects", which can contain
        // data and code: data in the form of fields (often known as
        // attributes or properties), and code, in the form of procedures
        // (often known as methods).

        User myUser = new User("Mister Bean","1956-09-15");
        //myUser.name = "Mister Bean";
        //myUser.birthDay = LocalDate.parse("1956-09-15");

        /*System.out.printf("%s was born on the highway in a train wreck on %s",
                myUser.name, myUser.birthDay.toString());
        System.out.println();*/

        //default values of properties for new created instance of a class is null

        System.out.println(myUser.age());
        /*System.out.printf("%s was born on the highway in a train wreck, and now he is %s years old",
                myUser.name, myUser.age());
        System.out.println();*/

        Book myBook2 = new Book("Monday Begins on Saturday", 100, new String[]{"Arkady Strugatsky","Boris Strugatsky"});
        //myBook2.title = "Monday Begins on Saturday";
        //myBook2.authors.add ("Arkady Strugatsky");
        //myBook2.authors.add ("Boris Strugatsky");

        Book myBook = new Book("The Great Gatsby", 180, new String[]{"F. Scott Fitzgerald"});
        //myBook.title = "The Great Gatsby";
        //myBook.authors.add("F. Scott Fitzgerald");

        /*System.out.printf("%s is written by %s", myBook.title, myBook.authors.toString());
        System.out.println();*/

        myUser.borrow(myBook2);
        myUser.borrow(myBook);

        /*System.out.printf("%s has borrowed these books: %s", myUser.name, myUser.borrowedBooks.toString());
        System.out.println();*/

        // method overloading
        // methods have same name if their parameters are different

        Book book1 = new Book("Carmilla", 300, new String[]{"Sheridan Le Fanu"});
        Book book2 = new Book("Frankenstein", 200, new String[]{"Mary Shelley"});
        Book book3 = new Book("Dracula", 150, new String[]{"Bram Stoker"});

        myUser.borrow(new Book[]{book1,book2});
        myUser.borrow(book3);

        Car myBMW = new Car("BMW", 250, "e39");
        myBMW.isBroken = false;
        System.out.println(myBMW.drive());

        // access modifiers in Java
        // default = accessible within the package
        // public = accessible everywhere
        // private = accessible within the class
        // protected = accessible within the class and subclasses

        // public access modifier is pretty self-explanatory
        // private are the opposite - only available within their class

        // it's mandatory to hide sensitive (or important) data in private modifier
        // to reach this date, you need to use public methods
        // it's all about encapsulation


        // getters and setters
        System.out.printf("%s has borrowed these books: %s", myUser.getName(), myUser.getBorrowedBooks());
        System.out.println();

        System.out.println(book3.getAuthors());

        // Inheritance in Java

        Book thisBook = new Book ("War and Peace", 700, new String []{"Sheridan Le Fanu"});
        Ebook ebook = new Ebook("Frankenstein", 220, new String[]{"Mary Shelley"}, "PDF");
        AudioBook audioBook = new AudioBook("Dracula", new String[]{"Bram Stoker"}, 160);

        System.out.println(thisBook.toString());
        System.out.println(ebook.toString());
        System.out.println(audioBook.toString());

        // How to override a method in Java
        // in AudioBook


    }
}
