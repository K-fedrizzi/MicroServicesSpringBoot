package onedigitalinnovation.experts.productcatalog.controller;


import onedigitalinnovation.experts.productcatalog.model.Product;
import onedigitalinnovation.experts.productcatalog.repository.ProductReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired //busca instancia correta
    private ProductReposity productReposity;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){

        return productReposity.save(product);
    }
    @RequestMapping(value = "/id", method = RequestMethod.GET)
        Optional<Product> findById(@PathVariable Integer id){
        return productReposity.findById(id);
    }
}
