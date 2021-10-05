public class DebugArray {
    public static void main (String[] args){
    // 1.Create an array to hold the numbers 1-10
    int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int total = 0;

    // print out the array
    for (int i=0; i < 10; i++) {
        System.out.println(numList[i]);
        }

    // 2. loop thru the array and add up the total to display
    // int numlist () = ({1, 2, 3, 4, 5, 6, 7, 8, 9, 10)} incorrect code
    // int[] numlist = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; already declared above
    // int total = 0; declared above to keep all variables together

    for (int i = 0; i < 10; i++){   //i can't be = 10 as that's out of bounds
        total = total + numList[i];
    }
    System.out.println("The total of the numbers is " + total);

    // Below is how I would write the equivalent code:
    total = 0;
    for (int i:numList){
        total += i;
    }
    System.out.printf("Format line: The total of the numbers is %d", total);
    }
}
