package Week3.example.neo_3.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private long id;
    private String type;
    private String production;
    private double initialPrice;
    private int quantity;
}
