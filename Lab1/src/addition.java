public class addition {
    public static void main(String[] args) {
        char originalChar = 'd';
        int originalASCII = (int) originalChar;

        int modifiedASCII = originalASCII + 3;
        char modifiedChar = (char) modifiedASCII;

        System.out.println("Original character: " + originalChar);
        System.out.println("Original ASCII value: " + originalASCII);
        System.out.println("Modified character: " + modifiedChar);
        System.out.println("Modified ASCII value: " + modifiedASCII);
    }
}
