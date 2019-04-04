import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "transactions")
public class TransactionHistory {

    @Id
    @Column(name = "tr_id")
    private Long transactionId;

    @Column(nullable = false)
    private String transactionType;

    @Column(nullable = false)
    private Long clientId;

    @Column(nullable = false)
    private String account;

    @Column(nullable = false)
    private String status;

    @Id
    @Column(nullable = false)
    private Long accId;

    @Id
    @Column(nullable = false)
    private Long externalBankId;

    @Column(nullable = false)
    private Timestamp dateTime;
}
