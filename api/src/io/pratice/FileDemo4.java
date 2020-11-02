package io.pratice;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File folder = new File("/Users/jeonggukyoo/workspace/java_workspace/FileDemo/documents");

        // boolean mkdir() -> File 객체가 표현하는 디렉토리를 생성
        // 하나의 디렉토리만 생성이 가능하다
        // 가령 /Users/jeonggukyoo/workspace/java_workspace/FileDemo 에서 FileDemo의 밑 디렉토리를 추가하고 싶다면
        // /Users/jeonggukyoo/workspace/java_workspace/FileDemo/documents 는 가능하지만
        // /Users/jeonggukyoo/workspace/java_workspace/FileDemo/documents/images 처럼 둘 이상의 디렉토리는 불가
        folder.mkdir();

        File folders = new File("/Users/jeonggukyoo/workspace/java_workspace/FileDemo/documents/mk/milk");

        // boolean mkdirs() -> File객체가 표현하는 하위 디렉토리까지 한번에 생성
        folders.mkdirs();
    }
}
