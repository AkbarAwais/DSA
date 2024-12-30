
public class ValidPassword {

    public static void main(String[] args) {
        System.out.println(minimumNumber(11, "#HackerRank"));
    }

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        int count = 0;
        int freq[] = new int[256];
        for (int i = 0; i < numbers.length(); i++) {
            freq[numbers.charAt(i)]+= 2;
        }

        for (int i = 0; i < lower_case.length(); i++) {
            freq[lower_case.charAt(i)]+= 2;
        }

        for (int i = 0; i < upper_case.length(); i++) {
            freq[upper_case.charAt(i)]+= 2;
        }

        for (int i = 0; i < special_characters.length(); i++) {
            freq[special_characters.charAt(i)]+= 2;
        }
        for (int i : freq) {
            System.out.print(i + " ");
        }
        return count;
    }

}
