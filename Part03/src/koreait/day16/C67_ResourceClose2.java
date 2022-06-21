package koreait.day16;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;

public class C67_ResourceClose2 {
	public static void main(String[] args) {
		
		String filename =fileDialogOpen();
		String filename2 = fileDialogSave();
		
		File ifile = new File(filename);
		File ofile = new File(filename2);
		
		try(Scanner sc = new Scanner(ifile);PrintWriter pw = new PrintWriter(ofile)){
			while(sc.hasNext()) {
				String temp = sc.nextLine();
				System.out.println(temp);
				pw.println(temp);
			}
			System.out.println("파일 복사 완료");
			sc.close();pw.close();
		}catch(FileNotFoundException e) {
			System.out.println("사용자 오류 발생 : " +e.getMessage());
			System.out.println("지정된 파일이 없습니다.");
		}catch(Exception e) {
			System.out.println("알수없는오류 : " +e.getMessage());
		}
		fileDialogOpen();
	}
public static String fileDialogOpen() {
	
	JFrame f = new JFrame();
	FileDialog fdw = new FileDialog(f,"파일저장",FileDialog.SAVE);
	fdw.setVisible(true);
	String filename = fdw.getDirectory() + fdw.getFile();
	System.out.println("저장한 경로화 파일 : " + fdw.getDirectory()+fdw.getFile());

	File file = new File(filename);
	System.out.println("선택한 파일 크기 : " + file.length()+"바이트");

	return filename;
}
public static String fileDialogSave() {
	
	JFrame f = new JFrame();
	FileDialog fdw = new FileDialog(f,"파일저장",FileDialog.SAVE);
	fdw.setVisible(true);
	String filename = fdw.getDirectory()+fdw.getFile();
	System.out.println("저장한 경로와 파일 : " + fdw.getDirectory() + fdw.getFile());
	
	File file = new File(filename);
	System.out.println("선택한 파일 크기 : " +file.length()+"바이트");
	
	return filename;
}
}
