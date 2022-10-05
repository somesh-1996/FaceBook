package com.ipt.se9.IPTfresh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXWriter {
public static void writeData(String sheet,int row,int cell,String value) throws IOException{
	File f=new File("C:\\Users\\hp\\Desktop\\IPT.xlsx");
	FileInputStream fi=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fi);
	w.getSheet(sheet).createRow(row).createCell(cell).setCellValue(value);
	FileOutputStream fo=new FileOutputStream(f);
	w.write(fo);
	w.close();
}
}
