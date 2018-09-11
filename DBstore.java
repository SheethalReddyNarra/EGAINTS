import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DBstore{


	private List<ProdDetails>p = new ArrayList<ProdDetails>();
	@Autowired
	
	
	
	public Test findbyid(int productid) {
		
		for (ProdDetails prodDetails : p) {
		if(Test.getId()==productid)	{
		
		return Test;
		}	
		}
		
		}
		
	public DBstore() {
		p.add(new ProdDetails(5,"Apples",11,51));
		p.add(new ProdDetails(6,"Oranges",22,61));
		p.add(new ProdDetails(5,"banans",11,51));
		p.add(new ProdDetails(6,"mangoes",22,61));

	}
	public ProdDetails  prodDetails() {
		for(ProdDetails product: p) {
			System.out.println(product);
			return product;


		}
		return null;
	}
	public List<ProdDetails> getP() {
		return p;
	}

	public void setPd(List<ProdDetails> p) {
		this.p= p;
	}
}
