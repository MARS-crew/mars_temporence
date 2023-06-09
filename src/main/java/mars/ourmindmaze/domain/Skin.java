package mars.ourmindmaze.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import mars.ourmindmaze.common.entity.BaseTimeEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_skin")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Skin extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false, unique = true)
    private String name;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "character_id")
    private Character character;

    @OneToMany(mappedBy = "skin", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserSkin> userSkins;
}
