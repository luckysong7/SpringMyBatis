package com.exe.springmybatis;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;


public class CustomMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext context = new GenericXmlApplicationContext("app-context.xml");

		CustomDAO dao2 = (CustomDAO) context.getBean("customDAO");

		CustomDTO dto;

//		// insert
//		dto = new CustomDTO();
//		dto.setId(222);
//		dto.setName("송재민");
//		dto.setAge(25);
//
//		dao2.insertData(dto);
//
//		System.out.println("insert 오케이");
		
//		// insert (named)
//		dto = new CustomDTO();
//		dto.setId(444);
//		dto.setName("송재원");
//		dto.setAge(22);
//
//		dao2.insertData(dto);
//
//		System.out.println("insert 오케이");

		// List 출력
		
//		 List<CustomDTO> lists = dao2.getLists();
//		 
//		 for(CustomDTO dto1 : lists) { System.out.printf("%d %s %d\n",
//		 dto1.getId(),dto1.getName(),dto1.getAge()); }
//		 System.out.println("select 완료 !");
//		 

		// 하나만 출력
		
//		  dto =dao2.getReadData(444);
//		  if(dto != null) 
//		  { 
//			 System.out.printf("%d %s %d\n", dto.getId(),dto.getName(),dto.getAge());
//		  
//		  }
		 

		// 업데이트
		
//		  dto = new CustomDTO(); dto.setId(111); dto.setName("박수현"); dto.setAge(26);
//		  
//		  dao2.update(dto);
//		  
//		  System.out.println("업데이트 완료 !! ");
//		  
//		  List<CustomDTO> lists = dao2.getLists();
//		  
//		  for (CustomDTO dto1 : lists) { System.out.printf("%d %s %d\n", dto1.getId(),
//		  dto1.getName(), dto1.getAge()); } System.out.println("select 완료 !");
		 

		// 삭제
		
		  dao2.deleteData(333); System.out.println("삭제완료 ! "); System.out.println();
		  List<CustomDTO> lists = dao2.getLists();
		  
		  for (CustomDTO dto1 : lists) { System.out.printf("%d %s %d\n", dto1.getId(),
		  dto1.getName(), dto1.getAge()); } System.out.println("select 완료 !");
		 

	}

}
