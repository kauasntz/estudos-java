package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main (String[] args) {
        int[] nums = new int[3];
        int[] nums2 = {2, 3, 5, 7, 11};

//        for (int i = 0; i < nums2.length; i++) {
//            System.out.println(nums2[i]);
//        }

        // foreach
        for(int i : nums2) {
            System.out.println(i);
        }

    }
}
