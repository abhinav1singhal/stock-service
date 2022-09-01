import java.io.IOException;
import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.stockapp.stockapp.model.StockWrapper;
import com.stockapp.stockapp.service.StockService;


@SpringBootTest
public class StockServiceTest {

    @Autowired
    private StockService stockService;

    @Test
    void testStockService()throws IOException{
        final StockWrapper stock= stockService.findStock("UU.L");
        System.out.println(stock.getStock());

        final BigDecimal stockPrice= stockService.findPrice(stock);
        System.out.println(stockPrice);

    }
    
}
