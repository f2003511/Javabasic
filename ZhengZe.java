package lianxi;

import java.util.regex.Pattern;

public class ZhengZe {
	public static void main(String[] args) {
		// 11位手机号的校验
		// 11位都是数字，第一位为1开头的，第二位为3456789，剩下的九位是0~9的随机数
		String reg11 = "^1[3-9]\\d{9}$";
		boolean istrue = Pattern.matches(reg11, "12135300621");
		System.out.println(istrue);
		// qq号校验 
		// 数字开头1~9，5~10位
		// 第一位是1~9，剩下的4~9位是0~9
		String regQQ = "^[1-9]\\d{4,9}$";
		boolean isQQ = Pattern.matches(regQQ, "751384354");
		System.out.println(isQQ);
		//身份证号验证
		// 身份证号一共18位  第一位是1~9，16位是0~9，最后一位是0~9或者X或者x
		String shenfenzheng = "^[1-9]\\d{16}[0-9xX]$";
		boolean issfz = Pattern.matches(shenfenzheng, "1426021990111015122");
		System.out.println(issfz);
		// 邮箱校验
		// 数字字母@xx。com \\w 是匹配所有单词字符，包括0~9所有数字，26个英文字母和下划线
		String youxiang = "^\\w+@(\\w+)[.]com$";
		boolean isyouxiang = Pattern.matches(youxiang, "751384354@qq.com");
		System.out.println(isyouxiang);
		// \\d是匹配0~9的所有数字
		// 匹配密码4位以上
		String password = "^\\w{4,}$";
		boolean ispass = Pattern.matches(password, "adadada");
		System.out.println(ispass);
		// 合法用户名
		String regex = "([a-z]|[A-Z]|[0-9]|[\\u4e00-\\u9fa5])+";
		boolean isname = Pattern.matches(regex, "f2003511");
		System.out.println(isname);
	}
}
