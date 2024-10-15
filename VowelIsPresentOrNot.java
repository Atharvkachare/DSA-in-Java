public class VowelIsPresentOrNot {
    public static void main(String[] args) {
        System.out.println(stringContainVowel("Hello"));
        System.out.println(stringContainVowel("Tata"));
    }

    public static boolean stringContainVowel(String input)
    {
      //  return input.toLowerCase().matches(".*[aeiou].*");
        return input.toUpperCase().matches(".*[AEIOU].*");
    }
    
}
