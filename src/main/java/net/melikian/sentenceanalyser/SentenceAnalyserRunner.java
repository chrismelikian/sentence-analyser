package net.melikian.sentenceanalyser;

import net.melikian.sentenceanalyser.entity.SentenceAnalyserResult;

public class SentenceAnalyserRunner {
  public static void main(String[] args) {
    String line = args.length == 0 ? "The cow jumped over the moon" : args[0];
    SentenceAnalyser sentenceAnalyser = new SentenceAnalyser(line);
    System.out.println(String.format("Sentence:%s", line));
    SentenceAnalyserResult shortestWordsResult = sentenceAnalyser.shortestWords();
    System.out.println(String.format("Shortest word(s):%s", shortestWordsResult.getWords()));
    System.out.println(String.format("Length of shortest word(s):%s", shortestWordsResult.getWordLength()));
    SentenceAnalyserResult longestWordsResult = sentenceAnalyser.longestWords();
    System.out.println(String.format("Longest word(s):%s", longestWordsResult.getWords()));
    System.out.println(String.format("Length of longest word(s):%s", longestWordsResult.getWordLength()));
  }
}
