package marti.vicente.microservicioinvoice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String customerId;
    private String number;
    private String detail;
    private String amount;
}
