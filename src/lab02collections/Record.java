package lab02collections;

import java.sql.Date;

class Record {
	Date dte;
	Importance imp;
	String src;
	String msg;


	public Record(Date dte, Importance imp, String src, String msg) {
		super();
		this.dte = dte;
		this.imp = imp;
		this.src = src;
		this.msg = msg;
	}

	public Record(String raw) {
		this.msg = msg;
	}
	private int getImportance() {
		return imp.ordinal() + 1;
	}

	private Date getDate() {
		return dte;
	}

	private String getSource() {
		return src;
	}

	private String getMsg() {
		return msg;
	}

	@Override
	public String toString() {
		return "Record [dte=" + dte + ", imp=" + imp + ", src=" + src
				+ ", msg=" + msg + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dte == null) ? 0 : dte.hashCode());
		result = prime * result + ((imp == null) ? 0 : imp.hashCode());
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		result = prime * result + ((src == null) ? 0 : src.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Record other = (Record) obj;
		if (dte == null) {
			if (other.dte != null)
				return false;
		} else if (!dte.equals(other.dte))
			return false;
		if (imp != other.imp)
			return false;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		if (src == null) {
			if (other.src != null)
				return false;
		} else if (!src.equals(other.src))
			return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new Record(new Date(0), Importance.low, ".", "111")
				.hashCode());
	}
}

enum Importance {
	low, nrm, avr, hgh
}