import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineToArray {
	static Integer [] getIntArrayFromLine(String line) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(line);
		while(s.hasNext())
			list.add(s.nextInt());
		 Integer [] ret = list.toArray(new Integer[list.size()]);
		 s.close();
		 return ret;
	}

	public static Integer[] getIntArrayFromStdin() {
		Scanner s = new Scanner(System.in);
		Integer [] ret = getIntArrayFromLine(s.nextLine());
		s.close();
		return ret;
	} 
}
