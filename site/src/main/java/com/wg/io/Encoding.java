package com.wg.io;
/**
 * 编码格式
 * @author Administrator
 *
 */
public class Encoding {

	public static void main(String []args) throws Exception{
		//项目默认编码gbk
		String code = "宋琦AaB";
		byte []code1 = code.getBytes();
		for (int i = 0; i < code1.length; i++) {
			System.out.print(Integer.toHexString(code1[i]) + " ");
		}
		System.out.println();
		for (int i = 0; i < code1.length; i++) {
			System.out.print(Integer.toHexString(code1[i] & 0xff) + " ");
		}
		System.out.println();
		byte []code2 = code.getBytes("UTF-8");
		for(int i =0 ;i<code2.length;i++){
			System.out.print(Integer.toHexString(code2[i] & 0xff)+" ");
		}
		
	}
}
