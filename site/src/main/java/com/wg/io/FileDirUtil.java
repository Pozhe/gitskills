package com.wg.io;

import java.io.File;

public class FileDirUtil {

	public static void fileDir(File dir){
		if(!dir.exists()){
			throw new IllegalArgumentException(dir.getName()+"�ļ�������!");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"����Ŀ¼");
		}
		File[]dirfiles = dir.listFiles();
		if(dirfiles!=null&& dirfiles.length>0)
		{
			for (File file : dirfiles) {
				if(file.isDirectory()){
					fileDir(file);
				}else{
					System.out.println(file.getName());
				}
			}
		}
	}
}
