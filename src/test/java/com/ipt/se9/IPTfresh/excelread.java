package com.ipt.se9.IPTfresh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ParticularData();
	}
	private static void ParticularData() throws IOException {
		File f= new File("C:\\Users\\hp\\Desktop\\IPT.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w =new XSSFWorkbook(fi);
		Sheet s=w.getSheet("sheet1");
		Row r=s.getRow(1);
		Cell c=r.getCell(0);
		CellType ce=c.getCellType();
		if(ce.equals(CellType.STRING)) {
			String st=c.getStringCellValue();
			System.out.println(st);
		}
		else if(ce.equals(CellType.NUMERIC)){
			double d=c.getNumericCellValue();
			int a=(int)d;
			System.out.println(a);
		}
		
	}

}
