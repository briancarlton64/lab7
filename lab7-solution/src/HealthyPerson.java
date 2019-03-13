/**
 * A class that represents someone who is not sick.
 * @author Brian
 *
 */

public class HealthyPerson extends Person {
	/**
	 * String reason stores the reason of visit of the HealthyPerson
	 */
	private String reason;
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
	}
	/**
	 * A method to compare a HealthyPerson to a Person.
	 * @param p the person to compare to
	 * @return 0 if p is not a HealthyPerson
	 * @return negative if the name of p comes before this, positive for the contrapositive, and zero if equal.
	 */
	protected int compareToImpl(Person p)
	{
			if(p.getClass().toString().split(" ")[1].equals("HealthyPerson"))
				{
					return this.getName().compareTo(p.getName());
				}
			return 0;
	}
	/**
	 * Returns the string representation of this HealthyPerson
	 * @return The String "%s In for %s" with replacements of the super's toString and the HealthyPerson's reason.
	 */
	@Override
	public String toString()
	{
		return String.format("%s In for %s", super.toString(), reason);
	}
}
