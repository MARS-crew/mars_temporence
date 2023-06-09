package mars.ourmindmaze.domain;

import lombok.*;
import mars.ourmindmaze.common.dto.UserAuthority;
import mars.ourmindmaze.common.entity.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_user")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 25)
    private String username;

    @Column(name = "password", length = 120, nullable = false)
    private String password;

    @Column(nullable = false)
    private UserAuthority authority;
}
