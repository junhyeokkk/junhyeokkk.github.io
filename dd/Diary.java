package dd;

import java.util.*;
import java.time.*;

public class Diary implements Comparable<Diary> {
	private LocalDate day;
	private String title;
	private String wether;
	private String content;
	
	public Diary(LocalDate day) {
		super();
		this.day = day;
	}
	@Override
	public String toString() {
		return "일기 [날짜=" + day + ", 제목=" + title + ", 날씨=" + wether + "]";
	}
	//재정의(날짜로만)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Diary))
			return false;
		Diary other = (Diary) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		return true;
	}
	public Diary(LocalDate day, String title, String wether, String content) {
		super();
		this.day = day;
		this.title = title;
		this.wether = wether;
		this.content = content;
	}
	/**
	 * @return the day
	 */
	public LocalDate getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(LocalDate day) {
		this.day = day;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the wether
	 */
	public String getWether() {
		return wether;
	}
	/**
	 * @param wether the wether to set
	 */
	public void setWether(String wether) {
		this.wether = wether;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public int compareTo(Diary o) {
		return day.compareTo(o.day);
	}
	
	

}
