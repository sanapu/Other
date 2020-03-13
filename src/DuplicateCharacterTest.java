import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DuplicateCharacterTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void duplicateChars() {
        DuplicateCharacter d = new DuplicateCharacter();
        String s = d.duplicateChars("abbccd");
        System.out.println(s);
    }
}