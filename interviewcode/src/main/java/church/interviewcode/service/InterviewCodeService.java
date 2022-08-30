package church.interviewcode.service;

import church.interviewcode.model.Results;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class InterviewCodeService {

    public Results checkAnagram(String word1, String word2){

        Results resultClass = new Results();


        if(!checkLengthIsEqual(word1, word2)){
            resultClass.result = false;
        }

        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        resultClass.result = Arrays.equals(first, second);

        return resultClass;
    }

    public boolean checkLengthIsEqual(String word1, String word2){
        return word1.length() == word2.length();
    }
}
