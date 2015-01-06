/**
 * Klasa student koja ima ima, broj indeksa i prosjek ocjena
 * 
 * @author harisarifovic
 *
 */
public class Student {
	private String ime;
	private int brIndexa;
	private double gpa;

	public Student(String name, int brIndexa, double gpa) {
		this.ime = name;
		this.brIndexa = brIndexa;
		this.gpa = gpa;
	}

	public String getName() {
		return ime;
	}

	public void setName(String name) {
		this.ime = name;
	}

	public int getBrIndexa() {
		return brIndexa;
	}

	public void setBrIndexa(int brIndexa) {
		this.brIndexa = brIndexa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	/**
	 * Poredi studente po sljedecem prioritetu: gpa,brIndexa,ime.
	 * 
	 * @param other
	 *            Student koji se poredi
	 * @return 1 ako je orginalni student veci, -1 ako je orginalni student
	 *         manji ili 0 ako su studenti isti
	 */
	public int compareTo(Student other) {
		if (this.gpa > other.gpa) {
			return 1;
		} else if (this.gpa < other.gpa) {
			return -1;
		} else {
			if (this.brIndexa > other.brIndexa) {
				return 1;
			} else if (this.brIndexa < other.brIndexa) {
				return -1;
			} else {
				if (this.ime.compareTo(other.ime) < 0) {
					return 1;
				} else if (this.ime.compareTo(other.ime) > 0) {
					return -1;
				} else
					return 0;
			}
		}
	}

	@Override
	/**
	 * Ispisuje studenta
	 */
	public String toString() {
		return "Student [name=" + ime + ", brIndexa=" + brIndexa + ", gpa="
				+ gpa + "]";
	}

}
