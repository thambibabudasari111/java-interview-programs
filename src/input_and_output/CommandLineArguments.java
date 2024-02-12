package input_and_output;

public class CommandLineArguments {

	public static void main(String[] args) {

		if (args.length > 0) {
			for (String str : args) {
				System.out.println(str);
			}
		}
	}

}
