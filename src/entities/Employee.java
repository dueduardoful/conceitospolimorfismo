package entities;

public class Employee {
	//1. declarar vari�veis
	private String name;
	private Integer hours;
	private Double valuePerHour;
	//2. construtor padr�o
	public Employee() {
	}
	//3. construtor com argumentos
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	//4. getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	// 5. m�todo payment
	public double payment() {
		return hours*valuePerHour;
	}
	
	
	
}
