package Paquete_1;
import Modelo.Clase_Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel {
    public static void main(String[] args) {
        //crearExcel();
        //leerExcel();
        //cargarExcelBD();
        cargarSQLExcel();
    }
    /*
    CÓDIGO 13-23 ES PARA CREAR ARCHIVOS ATIGUOS DE EXCEL EXTENSION "XLS"
    CÓDIGO SIN COMENTARIOS CON NOMBRE "CREAR EXCEL" ES PARA CREAR ARCHIVOS MÁS ACTUALES CON EXTENSIO "XLSX"
    public static void crearExcel(){
        Workbook libro = new HSSFWorkbook();
        Sheet hoja1 = libro.createSheet("HOJA 1");
        try {
            FileOutputStream archivo = new FileOutputStream("ArchivoPrueba.xls");
            libro.write(archivo);
            archivo.close();
        } catch (Exception ex) {
            System.err.println("ERROR AL CREAR EL ARCHIVO XLS");
        }
    }
    */
    public static void crearExcel(){
        Workbook libro = new XSSFWorkbook();
        Sheet hoja1 = libro.createSheet("HOJA 1");
        //AGREGANDO UNA CELDA
        Row fila0 = hoja1.createRow(0);
        //AGREGANDO VALORES A UNA CELDA
        fila0.createCell(0).setCellValue("HOLA");
        fila0.createCell(1).setCellValue(6.9);
        fila0.createCell(2).setCellValue(true);
        //EJEMPLO DE CELDA CON FORMULA MATEMATICA (1)
        Cell celda0 = fila0.createCell(3);
        celda0.setCellFormula(String.format("14+5", ""));
        //EJEMPLO DE CELDA CON FORMULA MATEMATICA (2)
        Row fila1 = hoja1.createRow(1);
        fila1.createCell(0).setCellValue(4.5);
        fila1.createCell(1).setCellValue(15.7);
        Cell celda1 = fila1.createCell(2);
        celda1.setCellFormula(String.format("A%d+B%d", 2,1));                   //PASO DE PARAMETROS DINAMICO
        try {
            //CREAR ARCHIVO
            FileOutputStream archivo = new FileOutputStream("ArchivoPrueba.xlsx");
            libro.write(archivo);
            archivo.close();
        } catch (Exception ex) {
            System.err.println("ERROR AL CREAR EL ARCHIVO XLSX");
        }
    }
    public static void leerExcel(){
        try {
            FileInputStream archivo = new FileInputStream(new File("E:\\Users\\theha\\Escritorio\\Progreso General\\Trabajos de Informática\\Java\\Programas Basicos\\Productos.xlsx"));
            XSSFWorkbook libroDeLectura = new XSSFWorkbook(archivo);
            XSSFSheet hojaDeLectura = libroDeLectura.getSheetAt(0);
            int numFilas = hojaDeLectura.getLastRowNum();
            for (int i=0; i<=numFilas; i++) {
                Row fila = hojaDeLectura.getRow(i);
                int numColumnas = fila.getLastCellNum();
                for (int j=0; j<numColumnas; j++) {
                    Cell celda = fila.getCell(j);
                    switch(celda.getCellTypeEnum().toString()){
                        case "NUMERIC":
                            System.out.print(celda.getNumericCellValue()+" ");
                            break;
                        case "STRING":
                            System.out.print(celda.getStringCellValue()+" ");
                            break;
                        case "FORMULA":
                            System.out.print(celda.getCellFormula()+" ");
                            break;
                    }
                }
                System.out.println("");
            }
        } catch (Exception ex) {
            System.err.println("ERROR AL LEER EL ARCHIVO");
        }
    }
    public static void cargarExcelBD(){
        Clase_Conexion con = new Clase_Conexion();
        PreparedStatement ps = null;
        try {
            Connection conexion = con.getConnection();
            FileInputStream archivo = new FileInputStream(new File("E:\\Users\\theha\\Escritorio\\Progreso General\\Trabajos de Informática\\Java\\Programas Basicos\\Paises.xlsx"));
            XSSFWorkbook libroDeLectura = new XSSFWorkbook(archivo);
            XSSFSheet hojaDeLectura = libroDeLectura.getSheetAt(0);
            int numFilas = hojaDeLectura.getLastRowNum();
            for (int i=1; i<=numFilas; i++) {
                Row fila = hojaDeLectura.getRow(i);
                ps = conexion.prepareStatement("insert into paises (idPais, nombrePais) values (?,?)");
                ps.setInt(1, (int) fila.getCell(0).getNumericCellValue());
                ps.setString(2, fila.getCell(1).getStringCellValue());
                ps.executeUpdate();
            }
            conexion.close();
        } catch (Exception ex) {
            System.err.println("ERROR AL HACER LA CONEXION Y SUBIR ARCHIVOS");
        }
    }
    public static void cargarSQLExcel(){
        Workbook libro = new XSSFWorkbook();
        Sheet hoja1 = libro.createSheet("Reporte de Paises");
        Clase_Conexion con = new Clase_Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String[] cabeceras = new String[]{"idPais","nombrePais"};
        Row filaCabeceras = hoja1.createRow(0);                                 //CABECERAS DE LAS COLUMNAS
        for (int i=0; i<cabeceras.length; i++) {
            Cell celda = filaCabeceras.createCell(i);
            celda.setCellValue(cabeceras[i]);
        }
        int numeroDeFilas = 1;
        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select idPais, nombrePais from paises");
            rs = ps.executeQuery();
            int numeroDeColumnas = rs.getMetaData().getColumnCount();           //CANTIDAD DE COLUMNAS
            while(rs.next()){
                Row filaDatos = hoja1.createRow(numeroDeFilas);
                for (int i=0; i<numeroDeColumnas; i++) {
                    Cell celda = filaDatos.createCell(i);
                    if (i==0 || i==1) {
                        celda.setCellValue(rs.getString(i+1));                  //RECIBE STRING
                    }else{
                        celda.setCellValue(rs.getInt(i+1));                     //RECIBE ENTEROS
                    }
                }
                numeroDeFilas++;
            }
            //CREAR ARCHIVO
            FileOutputStream archivo = new FileOutputStream("Reporte.xlsx");
            libro.write(archivo);
            archivo.close();
        } catch (Exception ex) {
            System.err.println("ERROR AL CREAR EL ARCHIVO XLSX "+ex);
        }
    }
}