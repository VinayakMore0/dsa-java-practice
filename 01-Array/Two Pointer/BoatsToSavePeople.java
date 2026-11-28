import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] people = {1, 2, 2, 3};
        int limit = 3;

        Arrays.sort(people);
        int res = 0;
        int i = 0;
        int j = people.length - 1;

        while (i <= j) {
            res++;
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
        }

        System.out.println(res);
    }
}
