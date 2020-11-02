package io.pratice;

import java.io.File;
import java.io.IOException;

public class FileDemo6 {
    public static void main(String[] args) throws IOException {
        // pathname -> 경로 이름을 가지고 있는 String형 문자열
        String pathName = "/Users/jeonggukyoo/workspace/java_workspace/FileDemo/sample.txt";
        File pathFile = new File(pathName);

        File chileName = new File("/Users/jeonggukyoo/workspace/java_workspace/FileDemo", "sample.txt");
        // sample.txt 파일이 없을 경우 파일을 생성하는 메서드 실행
        if(!chileName.isFile()) {
            chileName.createNewFile();
        }

        File parent = new File("/Users/jeonggukyoo/workspace/java_workspace/FileDemo");
        File child = new File(parent, "sample3.txt");
        // sample3.txt 파일이 없을 경우 파일을 생성하는 메서드 실행
        if(!child.isFile()) {
            System.out.println("sample3.txt 파일은 없습니다.");
            child.createNewFile();
            System.out.println("sample3.txt 파일을 생성했습니다!");
        } else {
            System.out.println("sample3.txt파일은 있습니다.");
        }
    }
}
