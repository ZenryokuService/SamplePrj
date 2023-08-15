

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * テストクラス LogicTest.
 *
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class LogicTest
{
    private Logic target;
    /**
     * テストクラス LogicTest のためのデフォルトのコンストラクタ
     */
    public LogicTest()
    {
        target = new Logic();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testIsNumber() {
        assertTrue(target.isNumber("0"));
        assertFalse(target.isNumber(""));
        assertFalse(target.isNumber("12"));
        assertFalse(target.isNumber("a"));
        assertFalse(target.isNumber("*"));
        assertFalse(target.isNumber("\\"));
    }
    
    @Test
    public void testOkLength() {
        assertTrue(target.okLength("0"));
        assertFalse(target.okLength(""));
        assertFalse(target.okLength("12"));
    }
    
    @Test
    public void testMisMutch() {
        assertFalse(target.misMutchInput("0"));
        assertFalse(target.misMutchInput("1"));
        assertFalse(target.misMutchInput("2"));
        assertTrue(target.misMutchInput("a"));
        assertTrue(target.misMutchInput("12"));
        assertTrue(target.misMutchInput(""));
    }
}
