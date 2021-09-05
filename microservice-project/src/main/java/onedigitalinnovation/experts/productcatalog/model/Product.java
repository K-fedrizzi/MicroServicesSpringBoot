package onedigitalinnovation.experts.productcatalog.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;
import javax.persistence.Id;

@Document(indexName = "product", type = "catalog")// representação da classe product
@Getter
@Setter
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer amount;
    
}
