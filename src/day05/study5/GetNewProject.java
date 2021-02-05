package day05.study5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;


public class GetNewProject {
    public static void main(String[] args) throws IOException {
        int day = 0;
        Calendar cBase = Calendar.getInstance();
        cBase.set(2021, Calendar.JANUARY, 24); //寒假回家
        Calendar cNow = Calendar.getInstance();
        int mmBase = cBase.get(Calendar.MONTH);
        int ddBase = cBase.get(Calendar.DATE);

        for (int i = 1; i < 40; i++) {
            cNow.add(Calendar.DATE, -1);
            int mm = cNow.get(Calendar.MONTH);
            int dd = cNow.get(Calendar.DATE);
            if (mm == mmBase && dd == ddBase) {
                day = i;
                break;
            }
        }
        String myFile = "src\\day" + day;
        for (int i = 1; i < 100; i++) {
            String fileString = "study" + i;
            File file = new File(myFile, fileString);
            if (file.mkdirs()) {
                File javaFile = new File(file, "\\StartDemo.java");
                FileOutputStream fos = new FileOutputStream(javaFile);
                String s = "package day" + day + ".study" + i + ";\n" +
                        "\n" +
                        "public class StartDemo {\n" +
                        "}";
                fos.write(s.getBytes(StandardCharsets.UTF_8));
                fos.close();
                break;
            }
        }
    }
}
