package lianxi;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;



public class WwwJava {
	public static void main(String[] args) {
		// java提供的方法完成对URL转码和解码的功能
		try {
			// 用URLencoder.encode进行转码
			String name = URLEncoder.encode("小宋你跟个鬼一样","utf-8");
			System.out.println(name);
			// 用URLdecoder.decode进行解码
			String encode = URLDecoder.decode("%E6%88%91%E6%97%A5","utf-8");
			System.out.println(encode);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		IpAddarss.get();
	}
}
class IpAddarss{
	public static void get() {
		System.out.println("======获取本机========");
		try {
			// 创建InetAddress对象
			InetAddress localHost = InetAddress.getLocalHost();
			// 获取本机的计算机名,gethostname
			String hostname = localHost.getHostName();
			// 获取本机的IP地址,gethostaddress
			String hostAddress = localHost.getHostAddress();
			System.out.println("本机地址是："+hostname);
			System.out.println("本机IP地址是："+hostAddress);
			// 获取本机的ipv4和ipv6地址
			InetAddress[] addresses = InetAddress.getAllByName(hostname);
			for (InetAddress m : addresses) {
				System.out.println(m.getHostAddress());
			}
			System.out.println("=======根据域名获取ip地址和主机名=======");
			// 根据域名创建InetAddress对象
			InetAddress hostname1 = InetAddress.getByName("www.baidu.com");// 这是名称
			String baiduip = hostname1.getHostAddress();// 这是IP地址
			System.out.println("百度名称是："+hostname1);
			System.out.println("百度ip地址是:"+baiduip);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}