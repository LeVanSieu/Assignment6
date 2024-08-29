
package arrays;

public class FlawedAlgorithm {
    public static void main(String[] args) {
        int[] numbers={10,5,13,4,52,67};
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        for (int i=0;i<numbers.length/2;i++){
            int temp = numbers[i];
            numbers[i]= numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=temp;
        }
        System.out.println();
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    
}
