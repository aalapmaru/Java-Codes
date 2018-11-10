import java.util.*;
public class CountFrequency {

	static class Count{

		public static void CountFrequency(ArrayList<String> list) {

			Map<String,Integer> map=new HashMap<String,Integer>();

			for(String s: list) {
				Integer count=map.get(s);
				map.put(s, (count==null) ? 1: count+1);
			}

			for(Map.Entry<String,Integer> val : map.entrySet()) {
				System.out.println("Element : " +val.getKey()+ " Occurs - " +val.getValue()+" times" );
			}	
		}
		
	
	}

	static class CountInOrder{
		public static void CountFrequency(ArrayList<String> list) {

			TreeMap<String,Integer> tmap=new TreeMap<String,Integer>();

			for(String s: list) {
				Integer count=tmap.get(s);
				tmap.put(s, (count==null) ? 1: count+1);
			}

			for(Map.Entry<String,Integer> val : tmap.entrySet()) {

				System.out.println("Element : " +val.getKey()+ " Occurs - " +val.getValue()+" times" );

			}



		}
	}

	public static void main(String[] args) {

		ArrayList<String> l=new ArrayList<String>();
		l.add("A");
		l.add("A");
		l.add("A");
		l.add("A");
		l.add("D");
		l.add("D");
		l.add("D");
		l.add("D");
		l.add("C");
		l.add("C");
		l.add("C");
		l.add("C");
		
		Count.CountFrequency(l);

		ArrayList<String> l1=new ArrayList<String>();
		l1.add("2");
		l1.add("2");
		l1.add("2");
		l1.add("3");
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("1");
		l1.add("2");
		l1.add("3");
        
		System.out.println();

		

		CountInOrder.CountFrequency(l1);



	}

}
