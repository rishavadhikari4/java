public class DivisibleByThree {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;
        
        while (count < 10) {
            if (num % 3 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}