package com.wg.io;

import java.io.File;

public class FileDirUtil {

	public static void fileDir(File dir){
		if(!dir.exists()){
			throw new IllegalArgumentException(dir.getName()+"文件不存在!");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"不是目录");
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
