public class Main {

   public static void main(String []args) {
      
      // ARRAY (list) is a DATA STRUCTURE (collection) 
      // stores multiple values in one named variable

      // DECLARE arrays using square brackets
      // one array can hold items of ONE DATA TYPE
      int[] luckyNumbers; // just creates a named REFERENCE, no values yet
      double[] mileTimes;
      boolean[] trueOrFalse;
      // Arrays can also store OBJECT (reference types)
      String[] spiritAnimals;

      // TWO OPTIONS to CREATE the array in memory
      // 1. Use the keyword NEW to set up an empty array 
      // Need to tell Java HOW MANY SPACES to allocate!!!
      luckyNumbers = new int[6]; // already declared earlier
      int[] moreLuckyNumbers = new int[8]; // DECLARE + CREATE in one line
      double[] movieRatings = new double[10];
      String[] faveAnimals = new String[8];

      System.out.println(moreLuckyNumbers); // just prints location in memory

      // 2. Use an INITIALIZER LIST to set array values
      int[] luckiestNumbers = { 13, 13, 10, 9, 5, 20, 37, 7};
      double[] currentCash = { 1.0, 5.25, 15.0, 21.0 };

      // HOW TO ACCESS ARRAY ELEMENTS (times)
      // arrayName[index] --> gets item at that position
      System.out.println(luckiestNumbers[0]); // first item is at index 0
      // System.out.println(bestClass[5]); // prints Bryce

      // HOW TO MODIFY ARRAY ELEMENTS
      // arrayName[index] = newValue
      faveAnimals[0] = "dolphin";
      faveAnimals[1] = "dog";
      // NOTE that the other 6 indices hold NULL
      System.out.println(faveAnimals[2]);

      String[] bestClass = { "Maya", "Alex", "Zoie", "Paige", "Natalie", "Bryce", "Finny", "Jackson"};
      // LENGTH is an Array ATTRIBUTE/PROPERTY
      int numStudents = bestClass.length;
      System.out.println(numStudents); // 8
      // FINAL INDEX is always [length - 1] !!!
      int lastStudentIndex = bestClass.length - 1;
      System.out.println(bestClass[lastStudentIndex]);

      // PARALLEL ARRAY to hold info associated with anothe array
      String[] faveFoods = {"Pasta", "", "Sushi", "Caesar Salad", "Sushi", "Burritos", "I don't know", "Lasagna"};
      // With parallel arrays, ORDER MATTERS! 
      // So we can use the same index for multiple lists
      System.out.println(bestClass[0] + "'s favorite food is " + faveFoods[0]);
      System.out.println(bestClass[2] + "'s favorite food is " + faveFoods[2]);

   



   }
}
