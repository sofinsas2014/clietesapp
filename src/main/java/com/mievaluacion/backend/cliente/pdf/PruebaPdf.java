package com.mievaluacion.backend.cliente.pdf;

import java.awt.Color;
import java.awt.Font;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Image;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.Barcode128;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Component("/pdfview")
public class PruebaPdf extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		PdfPTable tabla = new PdfPTable(1);
		tabla.setSpacingAfter(20);
		
		PdfPCell cell = null;
		
		//cell = new PdfPCell(new Phrase(messageSource.getMessage("text.factura.ver.datos.cliente", null, locale)));
		cell = new PdfPCell(new Phrase("datos del cliente"));
		cell.setBackgroundColor(new Color(184, 218, 255));
		cell.setPadding(8f);
		tabla.addCell(cell);
		
		
		tabla.addCell("*** ");
		tabla.addCell("***");
		
		PdfPTable tabla2 = new PdfPTable(1);
		tabla2.setSpacingAfter(20);
		
		
		//cell = new PdfPCell(new Phrase(messageSource.getMessage("text.factura.ver.datos.factura", null, locale)));
		cell = new PdfPCell(new Phrase("Datos de la Fcatura"));
		cell.setBackgroundColor(new Color(195, 230, 203));
		cell.setPadding(8f);
		
		tabla2.addCell(cell);
		tabla2.addCell("Id Factura" );
		tabla2.addCell("descripcion");
		tabla2.addCell("Fecha" + ": ");
		
		document.addTitle("Factura versión PDF");
		document.add(tabla);
		document.add(tabla2);
		
		PdfPTable tabla3 = new PdfPTable(4);
		tabla3.setWidths(new float [] {3.5f, 1, 1, 1});
		tabla3.addCell("Producto");
		tabla3.addCell("Precio");
		tabla3.addCell("Cantidad");
		tabla3.addCell("Total");
		
		
		
	    cell = new PdfPCell(new Phrase("Total"));
	    cell.setColspan(3);
	    cell.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
	    tabla3.addCell(cell);
	    
	    document.add(tabla3);
	    
	    Barcode128 code128 = new Barcode128();
	    code128.setSize(12f);
		code128.setBaseline(12f);
		code128.setCode("12345678");
        
		code128.setCodeType(Barcode128.CODE_C);
	
		code128.setFont(null);
		
		Image img = code128.createImageWithBarcode(writer.getDirectContent(), null, null);
		//img.scalePercent(50, 50);
		
		
		img.setAbsolutePosition(10,10);			
  		document.add(img);
        
		
	}

}
