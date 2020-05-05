# Sentence Analyser

## Introduction
This Maven module contains a class that analyses a sentence and outputs the shortest and longest words in that sentence. The lengths of the words are also calculated for you.

## Running the demo

### Pre-requisites
* Java 8 or above
* Maven 3+

### Building

1. Go to the root folder of the project where you'll find pom.xml
1. To compile the code and run the tests, use `mvn clean test`

### Running
1. Build the code as above
1. `cd target/classes`
1. `java net.melikian.sentenceanalyser.SentenceAnalyserRunner "<your-sentence>"`

where `<your-sentence>` is your sentence to analyse.

If you omit the sentence completely then the default sentence `The cow jumped over the moon` is analysed for you.

## Support
Please contact Chris Melikian in case of any issues.

## License
[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)

[MIT license](http://opensource.org/licenses/mit-license.php)