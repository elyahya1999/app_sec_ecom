package org.sid.inventoryservice.web;

import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.kafka.InventoryKafkaProducer;
import org.sid.inventoryservice.repositories.ProductRepository;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
//j'autorise tout les domaine d'envoyer des requetes vers mon microservice
//@CrossOrigin("*")
public class ProductRestController {
    private ProductRepository productRepository;
    private final InventoryKafkaProducer kafkaProducer;

    public ProductRestController(ProductRepository productRepository, InventoryKafkaProducer kafkaProducer) {
        this.productRepository = productRepository;
        this.kafkaProducer = kafkaProducer;
    }

//   //public ProductRestController(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    @GetMapping("/products")
    public List<Product> productList(){
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable String id){
        return productRepository.findById(id).get();
    }
    @GetMapping("/auth")
    public Authentication authentication(Authentication authentication){
        return authentication;
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        Product savedProduct = productRepository.save(product);
        kafkaProducer.sendMessage("Nouveau produit ajouté : " + product.getName());
        return savedProduct;
    }
}
