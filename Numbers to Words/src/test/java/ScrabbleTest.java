import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer testOutput = 1;
    String testInput = "a";
    assertEquals(testOutput, testScrabble.calculateScore(testInput));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_2() {
    Scrabble testScrabble = new Scrabble();
    Integer testOutput = 2;
    String testInput = "d";
    assertEquals(testOutput, testScrabble.calculateScore(testInput));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_3() {
    Scrabble testScrabble = new Scrabble();
    Integer testOutput = 3;
    String testInput = "b";
    assertEquals(testOutput, testScrabble.calculateScore(testInput));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_4() {
    Scrabble testScrabble = new Scrabble();
    Integer testOutput = 4;
    String testInput = "f";
    assertEquals(testOutput, testScrabble.calculateScore(testInput));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_5() {
    Scrabble testScrabble = new Scrabble();
    Integer testOutput = 5;
    String testInput = "k";
    assertEquals(testOutput, testScrabble.calculateScore(testInput));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_8() {
    Scrabble testScrabble = new Scrabble();
    Integer testOutput = 8;
    String testInput = "j";
    assertEquals(testOutput, testScrabble.calculateScore(testInput));
  }


  @Test
  public void calculateScore_returnsScoreForWord_5() {
    Scrabble testScrabble = new Scrabble();
    Integer testOutput = 5;
    String testInput = "cat";
    assertEquals(testOutput, testScrabble.calculateScore(testInput));
  }








}
