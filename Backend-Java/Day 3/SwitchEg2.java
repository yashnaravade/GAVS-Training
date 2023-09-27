public class SwitchEg2 {

    public static void main(String ar[]) {

        char c = ar[0].charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

    }

}
