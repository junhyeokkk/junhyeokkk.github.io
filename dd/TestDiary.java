package dd;

import java.time.LocalDate;

public class TestDiary {
	public static void main(String args[]) {
		Diary d1 = new Diary(LocalDate.of(2022, 6, 1),"소바를 머금","흐림","ㅈㄴ 안나오네");
		Diary d2 = new Diary(LocalDate.of(2022, 6, 1),"구바를 머금","맑음","개 안나오네");
		
		System.out.println(d1.getDay().equals(d2.getDay()));
		System.out.println(d1.equals(d2));
		System.out.println(d1.compareTo(d2));
	}
}
