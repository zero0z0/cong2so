 import java.util.*;
 public class MyBigNumber{
 public static int sum(String s1, String s2) {
        int num1 = 0;// dùng để ghép các chữ số lại thành 1 số
		int num2 = 0;
		int tmp1 = 1;  // biến tạm để đưa các chữ số thành 1 số hoàn chỉnh
		int tmp2 = 1;
		for (int i = s1.length()-1; i >= 0; i--) {
        num1 += (s1.charAt(i) - '0') * tmp1; // '0' vì 0 là chữ số đầu tiên từ 0 0 đến 10
        tmp1 *= 10;  // sau khi từ hàng đơn vị sẽ chuyển lên hàng chục và đến hàng trăm ,....
		}
		for (int i = s2.length()-1; i >= 0; i--) {
        num2 += (s2.charAt(i) - '0') * tmp2; 
        tmp2 *= 10;
		}
		int sum = num1+num2;
		return sum;
	
    }
 }