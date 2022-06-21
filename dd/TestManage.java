package dd;

import java.time.LocalDate;

public class TestManage {
	public static void main(String args[]) {
		DirayManage m = new DirayManageImp1();
		
		m.add(new Diary(LocalDate.now(),"9","a","w"));
		m.add(new Diary(LocalDate.of(2022,6,20),"2","e","3"));
		m.add(new Diary(LocalDate.of(2022,6,19),"4","5","5"));
		System.out.println(m.list());
	}
}
