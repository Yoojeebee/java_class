package io.pratice;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File file = new File("/Users/jeonggukyoo/workspace/java_workspace/FileDemo/sample.txt");

        // boolean delete() -> 파일객체가 표현하는 파일 혹은 디렉토리를 삭제한다
        file.delete();
    }
}
