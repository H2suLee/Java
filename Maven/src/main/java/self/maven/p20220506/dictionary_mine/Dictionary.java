package self.maven.p20220506.dictionary_mine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//번역할 단어를 입력하세요
//god 입력
//신, 예수 출력
//map 입력
//지도 출력

// dao

public class Dictionary {

	private WordVO word;
	private List<WordVO> dic = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	private void dataSet() {
		word = new WordVO("water", "물");
		dic.add(word);

		word = new WordVO("coffee", "커피");
		dic.add(word);

		word = new WordVO("airpod", "에어팟");
		dic.add(word);

		word = new WordVO("notepad", "수첩");
		dic.add(word);

		word = new WordVO("monitor", "모니터");
		dic.add(word);
	}

	public void selectWord(String input) {
		dataSet();
		for (WordVO word : dic) {
			if (word.getEng().equals(input))
				word.toString();
			break;
		}
	}
}
