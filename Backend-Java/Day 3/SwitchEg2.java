public class SwitchEg2 {

    public static void main(String ar[]) {

        char c = ar[0].charAt(0);
        String result;

        // switch (c) {
        // case 'a':
        // case 'e':
        // case 'i':
        // case 'o':
        // case 'u':
        // result = "Vowel";
        // break;
        // default:
        // result = "Consonant";
        // }

        // with yield
        // result = switch (c) {
        //     case 'a', 'e', 'i', 'o', 'u' -> {
        //         yield "Vowel";
        //     }
        //     default -> {
        //         yield "Consonant";
        //     }
        // };

        result = switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> "Vowel";
            default -> "Consonant";
        };

        System.out.println(result);
    }

}
