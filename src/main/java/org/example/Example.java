public class Example {
    public static String encryptThis(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            switch (word.length()) {
                case 0:
                    break;
                case 1:
                    result.append((int) word.charAt(0)).append(" ");
                    break;
                case 2:
                    result.append((int) word.charAt(0)).append(word.charAt(word.length() - 1)).append(" ");
                    break;
                default:
                    int asciiFirst = (int) word.charAt(0);
                    char second = word.charAt(word.length() - 1);
                    String body = word.substring(2, word.length() - 1);
                    char last = word.charAt(1);
                    result.append(asciiFirst).append(second).append(body).append(last).append(" ");
                    break;
            }
        }
        return result.toString().trim();
    }
}