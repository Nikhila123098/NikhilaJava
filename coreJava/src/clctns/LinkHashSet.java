package clctns;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkHashSet {

	public static void main(String[] args) {
LinkedHashSet T=new LinkedHashSet();
T.add(12);
T.add(23);
T.add(11);
T.add(11);
T.add("NIK");
T.add("NIK");
T.add("NIK");
T.add(null);

T.add(11);

System.out.println(T);
	}

}
