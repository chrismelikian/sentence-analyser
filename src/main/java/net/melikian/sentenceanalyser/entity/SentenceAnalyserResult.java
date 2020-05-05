package net.melikian.sentenceanalyser.entity;

import java.util.Set;

public class SentenceAnalyserResult {
  private Set<String> words;

  public SentenceAnalyserResult(Set<String> words) {
    this.words = words;
  }

  public Set<String> getWords() {
    return words;
  }

  public int getWordLength() {
    return words.size() == 0 ? 0 : words.iterator().next().length();
  }
}
