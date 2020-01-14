package entities;
//6. herdar os atributos da classe employee
public class OutsourcedEmployee extends Employee {
	//7. colocar atributo adicional
	private Double additionalCharge;
	//8. construtor padrão
	public OutsourcedEmployee() {
		super();
	}
	//9. Criar construtor com argumentos e utilizar super com os argumentos de super classe
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	//10. getters e setters
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	//11. sobrescrever o método de pgt da classe employee aqui na classe OutsourcedEmployee
	// pois a regra de pagamento é diferente
	@Override
	public double payment() {
		return super.payment() + additionalCharge*1.1;
			}
	}
