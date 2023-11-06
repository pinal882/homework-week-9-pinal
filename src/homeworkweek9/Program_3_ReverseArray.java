package homeworkweek9;
/**
 * Write a java program to reverse an array og integer values.
 */
public class Program_3_ReverseArray {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int n = a.length;
        //reverse array and store in another array
        int b[] = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.println("Reversed array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }
}