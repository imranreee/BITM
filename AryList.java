import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AryList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		
		String [] fixAr = {"ABC", "DEF", "GHI", "JKL"};
		
		
		list.add("Android");
		list.add(1, "HelloWorld");
		list.add(2, "Imran");
		list.add("Thanks");
		list.add(4, "How are you?");
		list.set(3, "Welcome");
		list.add("Know");
		//list.addAll(fixAr);
		list.remove(5);
		//list.removeAll(list);
		list.iterator();
		list.subList(0, 2);
		
		Collections.swap(list, 0, 1);

		System.out.println(list.indexOf("Android"));
		System.out.println(list.get(1));
		System.out.println(list.isEmpty());
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.size());
		
		Iterator<String> itr =  list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
