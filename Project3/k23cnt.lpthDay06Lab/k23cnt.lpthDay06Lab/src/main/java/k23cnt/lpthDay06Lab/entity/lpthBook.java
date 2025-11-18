package k23cnt.lpthDay06Lab.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class lpthBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long lpthId;

    String lpthCode;
    String lpthName;
    String lpthDescription;
    String lpthImgUrl;
    Integer lpthQuantity;
    Double lpthPrice;
    Boolean lpthActive;

    @ManyToMany
    @JoinTable(
            name = "lpth_book_author",
            joinColumns = @JoinColumn(name = "lpthBookId"),
            inverseJoinColumns = @JoinColumn(name = "lpthAuthorId")
    )
    Set<lpthAuthor> lpthAuthors;
}
