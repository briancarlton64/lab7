package lab7;

public class SickPerson extends Person {
	private int severity;
	public SickPerson(String name, int age) {
		super(name, age);
		severity = 0;
	}
	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.severity = severity;
	}
	
	protected int compareToImpl(HealthyPerson p)
	{
		return(0);
	}
	protected int compareToImpl(SickPerson p)
	{
		return(p.severity - this.severity);
	}
	public String toString()
	{
		//TODO
	}
}
