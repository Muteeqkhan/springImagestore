package com.demo.sampleSpring;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.Date;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import com.demo.sampleSpring.java8.lamda.Person;

public class PropsLoader {
	
static	List<Person> list=new ArrayList<Person>();

	public static void main(String[] args) {
		
	}
	
	
	public List name() {
		 try {
	            long start = System.currentTimeMillis();
	             
	            FileInputStream inputStream = new FileInputStream("D:\\Book1.xlsx");
	 
	            Workbook workbook = new XSSFWorkbook(inputStream);
	 
	            Sheet firstSheet = workbook.getSheetAt(0);
	            Iterator<Row> rowIterator = firstSheet.iterator();
	 
	            
	             
	            rowIterator.next(); // skip the header row
	             
	            while (rowIterator.hasNext()) {
	                Row nextRow = rowIterator.next();
	                Iterator<Cell> cellIterator = nextRow.cellIterator();
	                Person person=new Person();
	                while (cellIterator.hasNext()) {
	                	
	                    Cell nextCell = cellIterator.next();
	 
	                    int columnIndex = nextCell.getColumnIndex();
	 
	                    switch (columnIndex) {
	                    case 0:{
	                    	person.setAddress(nextCell.getStringCellValue());
	                    	break;
	                    }
	                    case 1:{
	                    	person.setName(nextCell.getStringCellValue());
	                    	break;
	                    }
	                    case 2:{
	                    	person.setFathername(nextCell.getStringCellValue());
	                    	break;
	                    }
	                    case 3:{
	                    	person.setAddress(nextCell.getStringCellValue());
	                    }
	                    }
	                    
	                }
	                list.add(person);	
	            }	 
	            workbook.close();
	             
	            long end = System.currentTimeMillis();
	            System.out.printf("Import done in %d ms\n", (end - start));
	            list.forEach(System.out::println);
	            
	        } catch (IOException ex1) {
	            System.out.println("Error reading file");
	            ex1.printStackTrace();
	        } 
		 
		 return list;
	 
	}
}
