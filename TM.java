/*Author :shabs99 <FINGERPRINT Inc.>
**/
 
 /*Copyright © 2015 shabs99 <FINGERPRINT Inc.> */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TM{
public static char input;
public static String text;
public static int i = 0;
public static void main(String[] args)throws IOException{
	
	text = file(args[0]);	
	input = text.charAt(i);
	//System.out.println(input);
	q1(input);
}
public static String file(String fileName) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(fileName));
    try {
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }
        return sb.toString();
    } finally {
        br.close();
    }
}
public static void q1(char input){
	if(input == '0'){
		text.replace(text.charAt(i),'x');
		i= i+1;
		input = text.charAt(i);;
		q2(input); //#####
	}
	else if(input == '1'){
		text.replace(text.charAt(i),'x');
		i= i+1;
		input = text.charAt(i);;
		input = text.charAt(i);
		q3(input);} //##
	else if(input == 'x'){
		System.out.println("Input Rejected");}//????????????????????
	else if(input == '#'){
		text.replace(text.charAt(i),'#');
		i= i+1;
		input = text.charAt(i);;
		q8(input);}//##
	else if(input == ' '){
		System.out.println("Input Rejected");}	//?????????????????????
}
public static void q2(char input){
	if(input == '0'){
		text.replace(text.charAt(i),'0');
		i= i+1;
		input = text.charAt(i);;
		q2(input);
	}
	else if(input == '1'){
		text.replace(text.charAt(i),'1');
		i= i+1;
		input = text.charAt(i);;
		q2(input);}
	else if(input == 'x'){
		System.out.println("Input Rejected");}//??????????????
	else if(input == '#'){
		text.replace(text.charAt(i),'#');
		i= i+1;
		input = text.charAt(i);;
		q4(input);}
	else if(input == ' '){
		System.out.println("Input Rejected");}//??????????????	
}

public static void q3(char input){
	if(input == '0'){
		text.replace(text.charAt(i),'0');
		i= i+1;
		input = text.charAt(i);;
		q3(input);
	}
	else if(input == '1'){
		text.replace(text.charAt(i),'1');
		i= i+1;
		input = text.charAt(i);;
		q3(input);}
	else if(input == 'x'){
		System.out.println("Input Rejected");}//??????????????
	else if(input == '#'){
		text.replace(text.charAt(i),'#');
		i= i+1;
		input = text.charAt(i);;
		q5(input);}
	else if(input == ' '){
		System.out.println("Input Rejected");}	//????????????????????????
}
public static void q4(char input){
	if(input == '0'){
		text.replace(text.charAt(i),'x');
		i= i-1;
		input = text.charAt(i);;
		q6(input);
	}
	else if(input == '1'){
		System.out.println("Input Rejected");}//???????????????????
	else if(input == 'x'){
		text.replace(text.charAt(i),'x');
		i= i+1;
		input = text.charAt(i);;
		q4(input);}
	else if(input == '#'){
		System.out.println("Input Rejected");}//????????
	else if(input == ' '){
		System.out.println("Input Rejected");}	//????????????????????
}

public static void q5(char input){
	if(input == '0'){
		System.out.println("Input Rejected");//??????????????
	}
	else if(input == '1'){
		text.replace(text.charAt(i),'x');
		i= i-1;
		input = text.charAt(i);;
		q6(input);}
	else if(input == 'x'){
		text.replace(text.charAt(i),'x');
		i= i+1;
		input = text.charAt(i);;
		q5(input);}
	else if(input == '#'){
		System.out.println("Input Rejected");}//????????
	else if(input == ' '){
		System.out.println("Input Rejected");}	//???????????????????
}
public static void q6(char input){
	if(input == '0'){
		text.replace(text.charAt(i),'0');
		i= i-1;
		input = text.charAt(i);;
		q6(input);
	}
	else if(input == '1'){
		text.replace(text.charAt(i),'1');
		i= i-1;
		input = text.charAt(i);;
		q6(input);}
	else if(input == 'x'){
		text.replace(text.charAt(i),'x');
		i= i-1;
		input = text.charAt(i);;
		q6(input);}
	else if(input == '#'){
		text.replace(text.charAt(i),'#');
		i= i-1;
		input = text.charAt(i);;
		q7(input);}
	else if(input == ' '){
		System.out.println("Input Rejected");}	//???????????????????????/
}
public static void q7(char input){
	if(input == '0'){
		text.replace(text.charAt(i),'0');
		i= i-1;
		input = text.charAt(i);;
		q7(input);
	}
	else if(input == '1'){
		text.replace(text.charAt(i),'1');
		i= i-1;
		input = text.charAt(i);;
		q7(input);}
	else if(input == 'x'){
		text.replace(text.charAt(i),'x');
		i= i+1;
		input = text.charAt(i);;
		q1(input);}
	else if(input == '#'){
		System.out.println("Input Rejected");}//??????
	else if(input == ' '){
		System.out.println("Input Rejected");}	//?????????
}
public static void q8(char input){
	if(input == '0'){
		System.out.println("Input Rejected");;//???????????????
	}
	else if(input == '1'){
		System.out.println("Input Rejected");}//????????????
	else if(input == 'x'){
		text.replace(text.charAt(i),'x');
		i= i+1;
		input = text.charAt(i);;
		q8(input);}
	else if(input == '#'){
		text.replace(text.charAt(i),'x');
		i= i+1;
		input = text.charAt(i);;
		q2(input);}
	else if(input == ' '){
		text.replace(text.charAt(i),' ');
		i= i+1;
		input = text.charAt(i);;
		System.out.println("Input Acccepted");}	
}
}
