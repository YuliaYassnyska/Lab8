package ua.lviv.iot.armament.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "ParentClass")
public class Armament {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private ApartmentType type;
	@Column
	private double price;
	@Column
	private Power power;
	@Column
	private Use use;
	@Column
	private User user;
	@Column
	private int amount;

	public Armament() {
		super();
	}

	public Armament(final ApartmentType type ,final double price, final Power power, final Use use, final User user,
			final int amount) {
		this.type = type;
		this.price = price;
		this.power = power;
		this.use = use;
		this.user = user;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Armament [ type= "+ type + ", price=" + price + ", power=" + power + ", use=" + use + ", user=" + user
				+ ", amount=" + amount + "]";
	}

	public final ApartmentType getType() {
		return type;
	}

	public final void setType(final ApartmentType type) {
		this.type = type;
	}

	public final double getPrice() {
		return price;
	}

	public final void setPrice(final double price) {
		this.price = price;
	}

	public final Power getPower() {
		return power;
	}

	public final void setPower(final Power power) {
		this.power = power;
	}

	public final Use getUse() {
		return use;
	}

	public final void setUse(final Use use) {
		this.use = use;
	}

	public final User getUser() {
		return user;
	}

	public final void setUser(final User user) {
		this.user = user;
	}

	public final int getAmount() {
		return amount;
	}

	public final void setAmount(final int amount) {
		this.amount = amount;
	}
}