package com.example.springmvc.boot;

import com.example.springmvc.model.Product;
import com.example.springmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        Product product1 = new Product();
        product1.setNome("Milky Bar");
        product1.setEstado("Goias");
        product1.setCidade("Goiania");
        product1.setHorarioFunc("11:00 as 18:00");
        product1.setSite("www.MilkyBar.com.br");
        product1.setTelefone("77777777");
        product1.setPreco(11.99);

        productRepository.save(product1);

        Product product2 = new Product();
        product2.setNome("Almond Bar");
        product2.setEstado("Rio de Janeiro");
        product2.setCidade("Rio de Janeiro");
        product2.setHorarioFunc("15:00 22:00");
        product2.setSite("www.AlmondBar.com");
        product2.setTelefone("99999999");
        product2.setPreco(22.99);

        productRepository.save(product2);
    }
}
