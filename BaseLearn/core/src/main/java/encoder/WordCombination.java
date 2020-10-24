package encoder;

import java.util.ArrayList;
import java.util.List;

public class WordCombination {
    List<String> dataString;
    /**
     * The method to get all combination
     * @param set : data for combination character
     * @param wordLength : length of the word for combination
     * @return combination sting List
     */
    public List<String> getAllCombination(char[] set, int wordLength){
        dataString = new ArrayList<>();
           int dataLength = set.length;
           createCombination(set, "", dataLength, wordLength );
           return dataString;
    }

    /**
     * Recursive method to create all the combination
     * @param data : data for which combination is performed
     * @param prefix : String combination
     * @param dataLength : length of the provided data
     * @param wordLength : Max length of word in combination
     */
    private void createCombination(char[] data, String prefix, int dataLength, int wordLength) {
        // Base case : k is 0,
        // print prefix
        if(wordLength == 0){
            dataString.add(prefix);
            return;
        }

        // One by one add all the characters
        // from set and recursively
        // call for k equals to k-1
        for (int i = 0; i < dataLength; i++) {
            // Next character of input added;
            String newPrefix = prefix + data[i];
            // k is decreased, because
            // we have added a new character
            createCombination(data, newPrefix, dataLength, wordLength-1);

        }

    }
}
