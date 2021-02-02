package day5.study5;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("src");
        GetAllFilePath(file);
    }
    public static void GetAllFilePath(File srcFile){
        File[] files=srcFile.listFiles();
        if(files!=null){
            for (File file : files) {
                if(file.isDirectory()){
                    GetAllFilePath(file);
                } else{
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
