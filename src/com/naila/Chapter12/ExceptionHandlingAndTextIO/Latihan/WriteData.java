package com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan;

public class WriteData {
    public static void main(String[] args) throws java.io.IOException {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("Fie already exists");
            System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones");
        output.println(85);

        output.close();
    }
}

/*
"C:\Users\LAB 2B-06\.jdks\openjdk-19.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=53079:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\LAB 2B-06\IdeaProjects\NailaSahidah\out\production\Selection" com.naila.Chapter12.ExceptionHandlingAndTextIO.Latihan.WriteData

Process finished with exit code 0
 */