package net.codejava.ProductRest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductRestApplicationTests {

	@Test
	void testCasues() {
		add(new Product(1,"Cijp3333M",33333));
	}

}
