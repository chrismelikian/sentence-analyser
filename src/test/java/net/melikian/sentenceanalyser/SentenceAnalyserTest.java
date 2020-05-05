package net.melikian.sentenceanalyser;

import net.melikian.sentenceanalyser.entity.SentenceAnalyserResult;
import net.melikian.sentenceanalyser.exception.WordMustNotBeNullException;
import org.junit.Assert;
import org.junit.Test;

public class SentenceAnalyserTest {

  private static final String SENTENCE_FROM_EXAM = "The cow jumped over the moon";

  @Test(expected = WordMustNotBeNullException.class)
  public void sentenceShouldntBeNull() {
    new SentenceAnalyser(null);
  }

  @Test
  public void shortestWordButSentenceIsEmpty() {
    SentenceAnalyserResult result = new SentenceAnalyser("").shortestWords();
    Assert.assertEquals(0, result.getWords().size());
    Assert.assertEquals(0, result.getWordLength());
  }

  @Test
  public void longestWordButSentenceIsEmpty() {
    SentenceAnalyserResult result = new SentenceAnalyser("").shortestWords();
    Assert.assertEquals(0, result.getWords().size());
    Assert.assertEquals(0, result.getWordLength());
  }

  @Test
  public void shortestWordsInExamQuestionReturns3Results() {
    SentenceAnalyserResult result = new SentenceAnalyser(SENTENCE_FROM_EXAM).shortestWords();
    Assert.assertEquals(3, result.getWords().size());
    Assert.assertEquals(3, result.getWordLength());
    Assert.assertTrue(result.getWords().contains("The"));
    Assert.assertTrue(result.getWords().contains("cow"));
    Assert.assertTrue(result.getWords().contains("the"));
  }

  @Test
  public void longestWordsInExamQuestionReturns1Result() {
    SentenceAnalyserResult result = new SentenceAnalyser(SENTENCE_FROM_EXAM).longestWords();
    Assert.assertEquals(1, result.getWords().size());
    Assert.assertEquals(6, result.getWordLength());
    Assert.assertTrue(result.getWords().contains("jumped"));
  }
}
