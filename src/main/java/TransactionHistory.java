import lombok.Data;
import org.springframework.data.convert.Jsr310Converters;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.ZonedDateTime;

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

    @Column(nullable = false)
    private Long accountId;

    @Column(nullable = false)
    private Long externalBankId;

    @Column(nullable = false)
    private ZonedDateTime dateTime;
}
