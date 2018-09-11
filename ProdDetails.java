import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProdDetails {

	private int id;

	private String name;
	private int price;
	private int quan;
	public ProdDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProdDetails(int id, String name, int price, int quan) {
		super();
		this.id = id;

		this.name = name;
		this.price = price;
		this.quan = quan;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quan;
	}
	public void setQuantity(int quantity) {
		this.quan = quantity;
	}
	@Override
	public String toString() {
		return "ProdDetails [id=" + id + ", , name=" + name + ", price=" + price
				+ ", quan=" + quan + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + quan;
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
		ProdDetails other = (ProdDetails) obj;


		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (quan != other.quan)
			return false;
		return true;
	}

}

