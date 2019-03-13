/**
 * A class that represents someone who is sick.
 * @author Brian
 *
 */

public class SickPerson extends Person {
	/**
	 * Int severity stores the severity of the illness, higher values corresponding to more severe illnessess
	 */
	private int severity;
	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.severity = severity;
	}
	/**
	 * A method to compare a SickPerson to a Person.
	 * @param p the person to compare to
	 * @return 0 if p is not a SickPerson
	 * @return negative if the severity of p comes before this(i.e. is greater), positive for the contrapositive, and zero if equal.
	 */
	@Override
	protected int compareToImpl(Person p) {
		if(p.getClass().toString().split(" ")[1].equals("SickPerson"))
			{
				return ((SickPerson) p).getSeverity()-this.getSeverity();
			}
		return 0;
	}
	/**
	 * Returns the string representation of this HealthyPerson
	 * @return The String "%s Severity level %d" with replacements of the super's toString and the SickPerson severity.
	 */
	public String toString()
	{
		return String.format("%s Severity level %d", super.toString(), severity);
	}
	
	private int getSeverity()
	{
		return severity;
	}
}
