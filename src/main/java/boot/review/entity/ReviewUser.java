package boot.review.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "review_users")
public class ReviewUser {
    @Id
    @Column(name = "user_id")
    private String userId;
    private String name;
}
