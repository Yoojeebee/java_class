package io.pratice;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("/Users/jeonggukyoo/workspace/java_workspace/FileDemo/sample2.txt");

        // write() 메서드는 기존의 내용에 덮어쓴다.(기존의 내용 전부 삭제된다.)
        writer.write("김유신,100,100,100\n");
        writer.write("강감찬,90,90,90\n");
        writer.write("이순신,80,80,80\n");

        //현재 열려 있는 파일을 닫음
        // try-with-resource문 사용 시 자동으로 자원 해제가 되므로 불필요
        // try-catch-finally문 사용 시 사용해줘야 메모리 누수를 방지하고 다른 곳에서 리소스 사용이 가능함
        // finally문 내에서도 역시 예외처리를 해줘야 함
        writer.close();

        String pathName = "/Users/jeonggukyoo/workspace/java_workspace/FileDemo/sample.txt";
        FileWriter writer2 = new FileWriter(pathName);

        // append() 메서드는 기존의 내용에 println 형식이 아닌 print 형식으로 내용을 덮어쓴다.(기존의 내용 전부 삭제된다.)
        writer2.append("안녕하세요1!");
        writer2.append("안녕하세요2!");

        writer2.close();

        // FileWriter 생성자 두 번째 인작밧에 true를 주면 기존의 내용 파일에 데이터를 추가한다(print 형식)
        FileWriter writer3 = new FileWriter(pathName, true);

        writer3.append("추가된 글1");
        writer3.append("추가된 글2");

        writer3.close();
    }
}
