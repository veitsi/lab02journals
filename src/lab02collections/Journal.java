package lab02collections;

import java.util.LinkedList;

public class Journal implements Journalable {
	LinkedList<Record> l = new LinkedList<Record>();

	public void add(Record r) {
		l.add(r);

	}

	public void add(Journal j) {
		int i;
		for (i = 0; i < j.l.size(); i++) {
			this.l.add(j.l.get(i));
		}
	}

	public static void main(String[] args) {
		Journal j = new Journal();
		Journal j2 = new Journal();
		j.add(new Record(""));
		System.out.println(j);
		j.add(j2);
	}

}

// class ArrayJournal extends Journal implements Journalable {
// Record[] a;
// int n;
//
// }
//
// class CollectionJournal extends Journal implements Journalable {
//
// }