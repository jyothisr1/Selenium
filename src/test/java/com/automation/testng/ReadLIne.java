package com.automation.testng;

import java.io.*;
import java.util.Scanner;

public class ReadLIne {
    public static void main(String[] args) throws IOException {
//        FileReader file=new FileReader("C:\\ust\\Selenium\\src\\test\\resources\\Data\\data1.txt");
//        BufferedReader bf=new BufferedReader(file);
//         String line= bf.readLine();
//
//         while (line!=null){
//             System.out.println(line);
//             line= bf.readLine();
//         }
        Scanner scanner=new Scanner(new FileInputStream("C:\\ust\\Selenium\\src\\test\\resources\\Data\\data1.txt"));
        if(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
