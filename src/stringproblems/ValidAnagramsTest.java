package stringproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramsTest {

    @Test
    void isAnagram() {
        ValidAnagrams v  = new ValidAnagrams();
        System.out.println(v.isAnagram("a","ab"));
    }
    @Test
    void isPalindrome() {
        Palindrome v  = new Palindrome();
        System.out.println(v.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void isAtoi() {
        Palindrome v  = new Palindrome();
        System.out.println(v.myAtoi("   -9999"));
    }
}