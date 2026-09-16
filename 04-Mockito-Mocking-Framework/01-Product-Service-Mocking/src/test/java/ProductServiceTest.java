import com.infosys.mockito.Product;
import com.infosys.mockito.ProductRepository;
import com.infosys.mockito.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductService productService;

    @Test
    void testGetProducts() {

        when(productRepository.findById(1))
                .thenReturn(new Product(1, "Laptop", 50000));

        Product product = productService.getProductId(1);

        assertEquals(1, product.getId());
        assertEquals("Laptop", product.getName());
        assertEquals(50000, product.getPrice());
        verify(productRepository).findById(1);
    }
}