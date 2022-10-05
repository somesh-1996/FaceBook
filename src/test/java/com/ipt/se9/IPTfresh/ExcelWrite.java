package com.ipt.se9.IPTfresh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			File f=new File("C:\\Users\\hp\\Desktop\\Book2.xlsx");
			FileInputStream fi = new FileInputStream(f);
			Workbook  w = new XSSFWorkbook(fi);
			Sheet s=w.createSheet("Write22");
			Row r=s.createRow(2);
			Cell c=r.createCell(2);
			c.setCellValue("kkk");
			w.getSheet("Write22").createRow(3).createCell(3).setCellValue("kkpp");
			w.getSheet("Write22").createRow(4).createCell(4).setCellValue("mmmm");
			FileOutputStream fo=new FileOutputStream(f);
			w.write(fo);
			w.close();
	}

}
