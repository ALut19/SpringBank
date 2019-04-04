import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name = "bankextids")
public class BankExtid {

    @Id
    @Column(name = "bankExtId")
    private Long id;

}
