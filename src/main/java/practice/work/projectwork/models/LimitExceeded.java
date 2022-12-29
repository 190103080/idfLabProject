package practice.work.projectwork.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_limitexceeded")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LimitExceeded extends BaseEntity{

    @Column(name = "limitexceded")
    private boolean limitexceded;

}
