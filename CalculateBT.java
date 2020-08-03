package test;



	import static org.junit.jupiter.api.Assertions.*;

	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.List;

	import org.junit.jupiter.api.Test;

	import beans.Product;
	import beans.ProductType;
	import beans.User;
	import beans.UserType;
	import service.RetailShop;
	import service.RetailShopImpl;
	
	public class CalculateBT {

		@Test
		void test() {
			RetailShopImpl retail=new RetailShopImpl();
			List<Product> list=new ArrayList(); 
			Product product=new Product();
			Product product1=new Product();
			User user=new User();
			user.setUserId(1);
			user.setUserName("Mohan");
			user.setUsertype(UserType.Employee);
			user.setRegistrationDate(LocalDate.now());
			product.setProductId(001);
			product.setProductName("onion");
			product.setProductType(ProductType.Groceries);
			product.setQuantity(100);
			product.setRatePerQuantity(10);
			list.add(product);
			product1.setProductId(02);
			product1.setProductName("munch");
			product1.setProductType(ProductType.NotGroceries);
			product1.setQuantity(200);
			product1.setRatePerQuantity(20);
			list.add(product1);
			user.setProduct(list);
			double bill=retail.CalculateBill(user);
			System.out.println(bill);
			assertEquals(80, bill);
			
		}

	}

