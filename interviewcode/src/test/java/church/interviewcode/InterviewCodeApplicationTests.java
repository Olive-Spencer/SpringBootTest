package church.interviewcode;

import church.interviewcode.model.Results;
import church.interviewcode.service.InterviewCodeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class InterviewCodeApplicationTests {

	@Autowired
	InterviewCodeService interviewcodeService;
	@Test
	void anagramIsAnagram(){
		String word1 = "nest";
		String word2 = "sent";
		Results result = interviewcodeService.checkAnagram(word1,word2);
		assertThat(result.result).isTrue();
	}

	@Test
	void anagramWordsDifferentLengths(){
		String word1 = "notlong";
		String word2 = "not";
		boolean result = interviewcodeService.checkLengthIsEqual(word1,word2);
		assertThat(result).isFalse();
	}

	@Test
	void anagramWordsSameLength(){
		String word1 = "lee";
		String word2 = "not";
		boolean result = interviewcodeService.checkLengthIsEqual(word1,word2);
		assertThat(result).isTrue();
	}

	@Test
	void anagramDifferentWordsSameLength(){
		String word1 = "not";
		String word2 = "the";
		Results result = interviewcodeService.checkAnagram(word1,word2);
		assertThat(result.result).isFalse();
	}

}
