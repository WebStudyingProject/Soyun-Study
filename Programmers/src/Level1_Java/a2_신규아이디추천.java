package Level1_Java;
/*
 * īī���� �Ի��� ���� ������ �׿��� "īī������������"�� ��ġ�Ǿ�, īī�� ���񽺿� �����ϴ� �������� ���̵� �����ϴ� ������ ����ϰ� �Ǿ����ϴ�. "�׿�"���� �־��� ù ������ ���� �����ϴ� �������� īī�� ���̵� ��Ģ�� ���� �ʴ� ���̵� �Է����� ��, �Էµ� ���̵�� �����ϸ鼭 ��Ģ�� �´� ���̵� ��õ���ִ� ���α׷��� �����ϴ� ���Դϴ�.
������ īī�� ���̵��� ��Ģ�Դϴ�.

���̵��� ���̴� 3�� �̻� 15�� ���Ͽ��� �մϴ�.
���̵�� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.) ���ڸ� ����� �� �ֽ��ϴ�.
��, ��ħǥ(.)�� ó���� ���� ����� �� ������ ���� �������� ����� �� �����ϴ�.
"�׿�"�� ������ ���� 7�ܰ��� �������� ó�� ������ ���� �ű� ������ �Է��� ���̵� īī�� ���̵� ��Ģ�� �´� �� �˻��ϰ� ��Ģ�� ���� ���� ��� ��Ģ�� �´� ���ο� ���̵� ��õ�� �ַ��� �մϴ�.
�ű� ������ �Է��� ���̵� new_id ��� �Ѵٸ�,

1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
     ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
 */
import java.util.*;
public class a2_�űԾ��̵���õ {
	class Solution {
	    public String solution(String new_id) {
	        String answer = "";
	        answer=new_id.toLowerCase();
	        for(int i=0; i<answer.length()-1; i++){
	            char s=answer.charAt(i);
	            if(!Character.isDigit(s) || s!='-' || s!='_' || s!='.'){
	                s=answer.charAt(i+1);
	            }
	            if(s=='.'&&answer.charAt(i+1)==s){
	                s=answer.charAt(i+1);
	            }
	            if(i==0&&s=='.'){
	                s=answer.charAt(1);
	            }
	            if(i==answer.length()-2&&s=='.'){
	                s=answer.charAt(i-3);
	            }
	            if(s==' '){
	                s='a';
	            }
	            // if(answer.length>=16){
	            //     answer=answer.substring(0,16);
	            //     if(answer.substring(15,16).equals(".")){
	            //         answer=anwer.substring(0,15);
	            //     }
	            // }
	            // if(answer.length<=2){
	            //     for (int i<)
	            // }
	        }
	        return answer;
	    }
	}
	
	// Ǯ��
	class Solution1 {
	    public String solution(String new_id) {
	        String answer = "";
	        
	        //1�ܰ�
	        new_id = new_id.toLowerCase();
	        
	        //2�ܰ�
	        String regularStr = "[^a-z0-9-_.]";
	        new_id = new_id.replaceAll(regularStr, "");
	 
	        //3�ܰ�
	        regularStr = "\\.{2,}";
	        new_id = new_id.replaceAll(regularStr, ".");
	        
	        ArrayList<Character> charList = new ArrayList<>();
	        
	        for(int i=0; i<new_id.length(); i++) {
	            charList.add(new_id.charAt(i));
	        }
	        
	        //4�ܰ�        
	        if (charList.size() > 0) {
	            if(charList.get(0) == '.' ) charList.remove(0);
	            if(charList.size() > 0 && '.' == charList.get(charList.size()-1) ) 
	            	charList.remove(charList.size()-1);
	        }
	        
	        //5�ܰ�
	        if(charList.size() == 0) charList.add('a');
	 
	        for(Character i : charList) {
					answer += i;
				}
				
	        if(answer.length() >= 16) {
	            answer = answer.substring(0, 15);
	 
	            if(answer.charAt(answer.length()-1) == '.') {
	                answer = answer.substring(0, answer.length() - 1);
	            }
	        }
	 
	        //7�ܰ�
	        if(answer.length() <= 2) {
	            while(answer.length() < 3) {
	                answer += answer.substring(answer.length()-1);
	            }
	        }
	        
	        return answer;
	    }
	}
}
