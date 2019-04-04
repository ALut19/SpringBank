import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="accounts")
@Data
public class Account {

    @Id
    @Column(name="acc_id")

    private Long id;

    @Column(nullable = false)
    private Long accNumber;

    @Column(nullable = false)
    private Long accClntId;

    @Column(nullable = false)
    private String type;

    @Column()
    private BigDecimal ammount;

}
