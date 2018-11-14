import java.util.ArrayList;
import java.util.List;

public class ForEachWithList {

	public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			
			list.add("D");
			list.add("E");
			list.add("F");
			list.add("C");
			list.add("A");
			list.add("B");
			
			list.forEach(
					(name)-> System.out.println(name)
					);
			list.sort( ( s1 , s2) -> s1.compareTo(s2));
			list.forEach(
					(name)-> System.out.println(name)
					);
	}

}
