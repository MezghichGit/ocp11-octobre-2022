package seance1;

import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Ex {

	public static void main(String[] args) {
		String pattern = "##";
		var message = DoubleStream.of(5.21, 8.49, 1234)
		.mapToObj(v -> new DecimalFormat(pattern).format(v))
		.collect(Collectors.joining("> <"));
		System.out.println("<"+message+">");
	}

}
