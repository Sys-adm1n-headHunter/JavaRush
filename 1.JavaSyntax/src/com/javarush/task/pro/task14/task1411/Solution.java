package com.javarush.task.pro.task14.task1411;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Распаковка исключений
*/

public class Solution {

    public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
    public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");

        } catch (RuntimeException e) {
            Throwable cauce = e.getCause();
            if (cauce instanceof FileNotFoundException) {
                FileNotFoundException exp = (FileNotFoundException) cauce;
                System.out.println("Не удалось прочесть файл.");
            }else if(cauce instanceof FileSystemException ){
                FileSystemException exp = (FileSystemException) cauce;
                System.out.println("Не удалось записать в файл.");
            }
        }
    }
}
