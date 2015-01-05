package calculator;

public class Calculator {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static float div(float a, float b) {
		return a / b;
	}
	
	public static void hexadecimalNumber(int intNum) {
		
		int[] intList = {-1,-1,-1,-1,-1,-1};
		String[] StringList = {"","","","","",""};
		
		for(int i=0; i<intList.length; i++) {
			intList[i]=intNum%16;
			intNum=intNum/16;
			if(intNum<16) { 
				intList[i+1]=intNum; break;
			}
		}
		
		for(int i=0; i<intList.length; i++) {
			if(intList[i]<0) break;
			if(intList[i]>=10) {
				StringList[i]=(char)(intList[i]+87)+"";
			}
			else { StringList[i]=intList[i]+""; }
		}
		
		for(int i=0; i<intList.length; i++) {
			System.out.print(StringList[intList.length-1-i].trim());
		}
		
	}
}
