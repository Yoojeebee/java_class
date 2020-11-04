package io.pratice;

import java.io.File;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("/Users/jeonggukyoo/workspace/java_workspace/FileDemo/sample.txt");

        // 현재 파일의 이름을 반환
        String fileName = file.getName();
        System.out.println("파일명: " + fileName);

        // 파일이 저장되어 있는 디렉토리명을 반환한다
        String path = file.getPath();
        System.out.println("디렉토리 위치: " + path);

        // 파일명의 절대경로(c:/ 로부터 시작하는 경로)와 파일명을 반환한다
        String pathAneName = file.getAbsolutePath();
        System.out.println("전체경로 및 이름: " + pathAneName);

        // 현재 File 객체의 byte의 크기를 반환
        long filesize = file.length();
        System.out.println("파일크기: " + filesize + "byte");

        // 현재 File 객체의 마지막 수정 일자를 반환
        long time = file.lastModified();
        Date date = new Date(time);
        System.out.println("최종 수정 일자: " + date);
    }
}
