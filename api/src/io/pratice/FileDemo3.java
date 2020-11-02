package io.pratice;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        // 지금 존재하지 않는 파일로도 File객체를 생성할 수 있다
        File file = new File("/Users/jeonggukyoo/workspace/java_workspace/FileDemo/sample2.txt");

        // File객체가 표현하는 경로에 지정된 이름으로 파일 생성하기
        // 사이즈가 0인 파일이 생성된다.
        // 메소드 재실행시 덮어쓴다(안에 있는 내용은 삭제되지 않는다)
        // 예외처리를 해야 한다(IOException)
        file.createNewFile();
    }
}
