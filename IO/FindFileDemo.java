package IO;

import java.io.File;
import java.util.ArrayList;

public class FindFileDemo {

	public ArrayList<File> getListFiles(Object obj) {
		File directory = null;
		if (obj instanceof File) {
			directory = (File) obj;
		} else {
			directory = new File(obj.toString());
			System.out.println(obj.toString());
		}
		System.out.println("--1--");
		ArrayList<File> files = new ArrayList<File>();
		if (directory.isFile()) {
			files.add(directory);
			System.out.println("----");
			return files;
		} else if (directory.isDirectory()) {
			File[] fileArr = directory.listFiles();
			for (int i = 0; i < fileArr.length; i++) {
				File fileOne = fileArr[i];
				System.out.println("--222--");
				files.addAll(getListFiles(fileOne));// 递归遍历
			}
		}
		System.out.println("----");
		return files;
	}

	public static void main(String[] args) {
		FindFileDemo ff = new FindFileDemo();
		ArrayList<File> files = ff.getListFiles("C:\\JMPX\\Copy");
		for (int i = 0; i < files.size(); i++) {
			System.out.println("文件名：" + files.get(i).getName() + " 文件路径：" + files.get(i).getPath());
		}
	}

}
