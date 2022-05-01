package _220425_3;

public class Movie extends Culture {
	
	public String genre;
	
	
	public Movie(String title, int director, int actor, String genre) {
		super(title, director, actor);
		this.genre = genre;
	}

	@Override
	public void getInformation() {
		System.out.println(genre + "제목: " + this.title);
		System.out.println("감독: " + this.director);
		System.out.println("배우: " + this.actor);
		System.out.println("관객 수: " + this.audience);
		System.out.println(genre + "총점: " + this.totalScore);
		System.out.println(genre + "평점: "+ this.getGrade());
//		getGrade();
		
		
	}
	

}
