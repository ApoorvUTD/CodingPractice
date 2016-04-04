import java.util.Stack;

public class validParenthesis {


	@SuppressWarnings("unchecked")
	public static void pushValue(Stack st, char ch){
		st.push(ch);

	}

	public static void popValue(Stack st){
		st.pop();

	}


	public static boolean isValid(String s){

		char[] arr = s.toCharArray();
		@SuppressWarnings("rawtypes")
		Stack st = new Stack();

		for(int i=0;i<arr.length;i++){
			if (arr[i]=='(' || arr[i]=='{' || arr[i]=='['){
				pushValue(st, arr[i]);
				continue;
			}

			if (st.empty()){
				return false;
			}

			if (st.size()==0){
				return false;
			}
			if (arr[i]==')'){
				char top = (Character)st.peek();
				if (top=='('){
					st.pop();
					continue;
				}
			}
			if (arr[i]=='}'){
				char top = (Character)st.peek();
				if (top=='{'){
					st.pop();
					continue;
				}
			}

			if (arr[i]==']'){
				char top = (Character)st.peek();
				if (top=='['){
					st.pop();
				}else{
					break;
				}
			}
			else{

				return false;
			}

		}
		if (st.size()==0){
			return true;
		}return false;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String parenthesis = "(])";
		if(isValid(parenthesis)){
			System.out.println("Valid Parenthesis");
		}else{
			System.out.println("Not Valid Parenthesis");
		}

	}

}
