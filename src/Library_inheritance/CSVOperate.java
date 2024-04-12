/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Library_inheritance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class CSVOperate {                                   //CSV файл представляет собой текстовый файл,
    // в котором каждая строка содержит данные,
    // разделённые запятыми или другими разделителями

    private String fileName;// имя файла csv
    private String separator;// разделитель полей
    private Object[][] data;// массив данных
    private Object[] columnName;// наименования полей
    private boolean header;// флаг наличия заголовка в файле данных
    private BufferedReader reader;// объект для чтения данных

    // конструктор класса по умолчанию
    public CSVOperate() {
        separator = ";";                //символ разделитель полей по-умолчанию
    }

    // конструктор
    public CSVOperate(String filename, String separator) {
        this.fileName = filename;
        this.separator = separator;
    }

    /**
     * Задаёт имя файла с данными
     *
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Задаёт символ разделитель полей данных
     *
     * @param separator the separator to set
     */
    public void setSeparator(String separator) {
        this.separator = separator;
    }

    /**
     * Возвращает массив данных
     *
     * @return the data
     */
    public Object[][] getData() {
        return data;
    }

    /**
     * Задаёт массив данных
     *
     * @param data the data to set
     */
    public void setData(Object[][] data) {
        this.data = data;
    }

    /**
     * Читает данные из указанного файла
     */
    public void readData() {
        try {
            readFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSVOperate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Записывает данные в указанный файл
     */
    public void writeData() {
        try {
            writeFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSVOperate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Возвращает флаг наличия заголовков полей данных в указанном файле
     *
     * @return the header
     */
    public boolean isHeader() {
        return header;
    }

    /**
     * Задаёт  флаг наличия заголовков полей данных в указанном файле
     *
     * @param header the header to set
     */
    public void setHeader(boolean header) {
        this.header = header;
    }

    /**
     * Читает заданный файл
     *
     * @throws FileNotFoundException исключительная ситуация
     */
    private void readFile() throws FileNotFoundException {
        try {
            reader = new BufferedReader(new FileReader(fileName));

            // проверяем установлен ли флаг наличия заголовков в файле
            if (!header) {
                // заголовков нет
                getCellData();// читаем данные
                // имена заголовков
                columnName = new Object[data[1].length];
                for (int i = 0; i < columnName.length; i++) {
                    int j = i + 1;
                    columnName[i] = (Object) ("A" + j);
                }
            } else {
                // заголовки есть
                String line;
                line = reader.readLine();// читаем первую строку, содержащую заголовки
                columnName = (String[]) line.split(separator);// получаем массив заголовков
                // читаем данные
                getCellData();
            }
        } catch (IOException ex) {
            Logger.getLogger(CSVOperate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Запись данных в указанный файл
     *
     * @throws FileNotFoundException
     */
    private void writeFile() throws FileNotFoundException {
        // создаём объект для записи
        PrintWriter writer;
        writer = new PrintWriter(new File(fileName));
        if (header) {
            String value = "";// начальное значение строки данных             //value - значение
            for (Object columnName1 : columnName) {
                // собираем заголовки
                value = value + columnName1 + separator;
            }
            // обрезаем последний символ разделитель
            value = value.substring(0, value.length() - 1);
            writer.println(value);// записываем заголовки
        }
        // формируем данные для записи
        for (Object[] data1 : data) {
            String value = "";// начальное значение
            for (Object data11 : data1) {
                value = value + data11 + separator;
            }
            // обрезаем последний символ
            value = value.substring(0, value.length() - 1);
            writer.println(value);// записывем данные
        }
        writer.close();// закрываем поток записи
    }

    /**
     * Возвращает наименование заголовков полей данных
     *
     * @return the columnName
     */
    public Object[] getColumnName() {
        return columnName;
    }

    /**
     * Задаёт наименование заголовков полей данных
     *
     * @param columnName the columnName to set
     */
    public void setColumnName(Object[] columnName) {
        this.columnName = columnName;
    }

    /**
     * Считывает и возвращает данные из файла
     *
     * @throws IOException исключительная ситуация чтения данных из файла
     */
    private void getCellData() throws IOException {
        ArrayList<Object[]> rowList = new ArrayList<>();// массив строк данных
        String line;
        while ((line = reader.readLine()) != null) {
            // читаем файл пока не достигнут его конец
            String[] values = line.split(separator);// получаем массив значений
            ArrayList<Object> colList = new ArrayList<>();// массив столбцов данных
            // добавляем в массив
            colList.addAll(Arrays.asList(values));
            rowList.add(colList.toArray());
        }
        data = new Object[rowList.size()][];
        for (int i = 0; i < data.length; i++) {
            data[i] = rowList.get(i);
        }
    }
}
