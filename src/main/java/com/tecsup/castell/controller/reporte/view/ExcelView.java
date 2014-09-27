package com.tecsup.castell.controller.reporte.view;
 
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;
 
public class ExcelView extends AbstractExcelView {
 
    @Override
    protected void buildExcelDocument(Map model, HSSFWorkbook workbook,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
 
        Map<String, String> revenueData = (Map<String, String>) model.get("reporteNotas");
 
        HSSFSheet sheet = workbook.createSheet("Reporte");
 
        HSSFRow header = sheet.createRow(0);
        header.createCell(0).setCellValue("Alumno");
        header.createCell(1).setCellValue("Nota");
 
        int rowNum = 1;
        for (Map.Entry<String, String> entry : revenueData.entrySet()) {
 
            HSSFRow row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(entry.getKey());
            row.createCell(1).setCellValue(entry.getValue());
        }
         
        response.setHeader("Content-Disposition", "attachment; filename=\"Reporte.xls\"");
    }
}