package com.github;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * It is built to retrieve data based on given column header and row header of an MS Excel sheet
 * 
 * @author Deepjyoti Barman
 * @since March 31, 2020
 */
public class GetCellDataBasedOnColAndRowHeader
{
    static Scanner scan = new Scanner(System.in);
    static final String EXCEL_FILE_PATH = "./src/main/resources/testdata/emp-database.xlsx";
    
    // Retrieves and returns the specific data for given column and row header
    public static String getDataFromExcel(String colHeader, String rowHeader) throws IOException
    {
        int colIndex      = -1;
        String cellData   = null;
        Workbook workbook = WorkbookFactory.create(new File(EXCEL_FILE_PATH));
        
        // Retrieving the column index of the cell to be selected based on the column header given
        Iterator<Cell> cellIterator = workbook.getSheet("Sheet1").getRow(0).cellIterator();
        while(cellIterator.hasNext())
        {
            Cell cell = cellIterator.next();
            
            if (colHeader.equals(cell.toString()))
                colIndex = cell.getColumnIndex();
        }
        
        // Retrieving the cell data based on given row header and column index
        Iterator<Row> rowIterator = workbook.getSheet("Sheet1").rowIterator();
        while(rowIterator.hasNext())
        {
            Row row = rowIterator.next();
            
            if (rowHeader.equals(row.getCell(0).toString()) && colIndex != -1)
                cellData = row.getCell(colIndex).toString();
            
        }
        
        return cellData;
    }
    
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter the column header: ");
        String colHeader = scan.next();
        
        System.out.println("Enter the row header: ");
        String rowHeader = scan.next();
        
        System.out.println("\nEmployee Details:");
        String cellData = getDataFromExcel(colHeader, rowHeader);
        if (cellData != null)
            System.out.println(rowHeader + " --> " + colHeader + ": " + cellData);
        else
            System.out.println("\nData does not exist");
    }
}
