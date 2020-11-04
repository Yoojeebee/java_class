package io.pratice;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/jeonggukyoo/workspace/java_workspace/FileDemo/sample.txt");

        int data = 0;
        // read() 메서드의 반환값은 정수 값을 char로 형변환(UTF-8) 시키고 한 글자씩 출력!
        while( (data = fileReader.read()) != -1)
            System.out.print((char)data);

        fileReader.close();
    }
}
