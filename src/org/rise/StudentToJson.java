package org.rise;

import org.codehaus.jackson.map.ObjectMapper;

public class StudentToJson {

	public static void main(String[] args) {
		Student s=new Student();
		s.setSid(12);
		s.setSname("pawan");
		s.setMarks(25.25);
		try {
			ObjectMapper om=new ObjectMapper();
			String js=om.writeValueAsString(s);
		} catch (Exception e) {
		}
	}

}
