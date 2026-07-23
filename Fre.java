public class Fre {
    public static void main(String[] args) {

        String text = "programming";

        for (int i = 0; i < text.length(); i++) {

            char current = text.charAt(i);
            boolean isVisited = false;

            // Check if this character appeared before
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isVisited = true;
                    break;
                }
            }

            if (isVisited) {
                continue;
            }

            int count = 0;

            // Count frequency
            for (int k = 0; k < text.length(); k++) {
                if (current == text.charAt(k)) {
                    count++;
                }
            }

            System.out.println(current + " = " + count);
        }
    }
}