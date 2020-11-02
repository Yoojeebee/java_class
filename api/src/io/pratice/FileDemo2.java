package io.pratice;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File directory = new File("/Users");

        // isFile() 메서드는 파일인지 확인하는 메서드
        // isDirectory() 메서드는 디렉토리인지 확인하는 메서드
        System.out.println("파일인가요? " + directory.isFile());
        System.out.println("디렉토리인가요? " + directory.isDirectory());

        // String[] list() -> 디렉토리에 포함된 모든 파일명과 하뒤디렉토리명이 지정된 배열에 반환된다
        String[] list = directory.list();
        for(String name : list) {
            System.out.println(name);
        }
    }
}
