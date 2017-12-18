package org.rise.sun;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonToEmployee {

	public static void main(String[] args) {
		String json="{\"empId\":75,\"empName\":\"pawan\",\"sal\":25.25}";
		try {
			ObjectMapper ob=new ObjectMapper();
			Employee e=(Employee) ob.readValue(json, Employee.class);
			System.out.println(e);
			
		} catch (Exception e) {
		}

	}

}
