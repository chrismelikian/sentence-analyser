package net.melikian.sentenceanalyser;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import net.melikian.sentenceanalyser.entity.SentenceAnalyserResult;
import net.melikian.sentenceanalyser.exception.WordMustNotBeNullException;

public class SentenceAnalyser {

  private final String sentence;
  private List<String> words;

  public SentenceAnalyser(String sentence) {
    if (null == sentence) {
      throw new WordMustNotBeNullException();
    }
    this.sentence = sentence;
    words = extractWords();
  }

  public SentenceAnalyserResult shortestWords() {
    List<String> sortedWordsByLength = words.stream()
                                        .sorted(Comparator.comparing(String::length))
                                        .collect(Collectors.toList());
    return new SentenceAnalyserResult(wordsWithTheSameLengthFromStartOfTheList(sortedWordsByLength));
  }

  public SentenceAnalyserResult longestWords() {
    List<String> sortedWordsByLength = words.stream()
                                        .sorted(Comparator.comparing(String::length).reversed())
                                        .collect(Collectors.toList());
    return new SentenceAnalyserResult(wordsWithTheSameLengthFromStartOfTheList(sortedWordsByLength));
  }

  private Set<String> wordsWithTheSameLengthFromStartOfTheList(List<String> sortedWordsByLength) {
    Set<String> wordsWithTheSameLengthFromStartOfTheList = new HashSet<>();
    for(String word : sortedWordsByLength) {
      if(word.length() == sortedWordsByLength.get(0).length()) {
        wordsWithTheSameLengthFromStartOfTheList.add(word);
      } else {
        break;
      }
    }
    return wordsWithTheSameLengthFromStartOfTheList;
  }

  private List<String> extractWords() {
    return Arrays.stream(sentence.split("[ .]"))
                    .filter(i -> !"".equals(i))
                    .collect(Collectors.toList());
  }
}
