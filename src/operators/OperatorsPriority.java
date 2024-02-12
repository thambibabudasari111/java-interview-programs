package operators;

public class OperatorsPriority {

	public static void main(String[] args) {

		// priority of operators: *, +, -
		// circular brackets() will have highest priority
		// first (4*2) will be done, later -6 and result of (4*2) will be done
		System.out.println(-6 + 4 * 2);
	}

}
