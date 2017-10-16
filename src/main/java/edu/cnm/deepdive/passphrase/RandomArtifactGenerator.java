package edu.cnm.deepdive.passphrase;
import edu.cnm.deepdive.passphrase.util.Constants;
import java.util.Random;
/**class used to generate passphrase/passwords using Math.Random*/
public abstract class RandomArtifactGenerator {
  /** length of password/passphrase supplied by user*/
  private int length;
  /** evaluates user input whether repeated words/chars are allowed*/
  private boolean repeatedAllowed = Constants.DEFAULT_REPEAT_ALLOWED;
  /** Math.random generator */
  private Random rng;
  /**constructor creating Random Artifact Generator*/
  protected RandomArtifactGenerator() {
  }
  /**
   *generates a random string
   * @return returns a string
   */
  public abstract String generate();
  /**
   *evaluates user input for length
   * @return length specified by user or default if none supplied
   */
  public int getLength() {
    return length;
  }
  /**
   *sets length to user or default input
   * @param length passes length to random artifact generator
   */
  public void setLength(int length) {
    this.length = length;
  }
  /**
   *evaluates whether there is user input for repeated words/chars
   * @return passes repeat allowed if no user input
   */
  public boolean isRepeatedAllowed() {
    return this.repeatedAllowed;
  }
  /**
   *allows for repeat words/characters based on user input
   * @param repeatedAllowed passes repeat allowed to random number generator
   */
  public void setRepeatedAllowed(boolean repeatedAllowed) {
    this.repeatedAllowed = repeatedAllowed;
  }
  /**
   *accesses random number generator
   * @return random number generator
   */
  public Random getRng() {
    return rng;
  }
  /**
   *creates random number generator
   * @param rng passes random number generator
   */
  public void setRng(Random rng) {
    this.rng = rng;
  }
}