package self.maven.p20220506.dictionary_mine;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Dictionary dao = new Dictionary();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번역할 단어를 입력하세요");
		String input = sc.nextLine();
		dao.selectWord(input);
	}
}
