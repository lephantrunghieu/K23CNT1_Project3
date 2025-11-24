package k23cnt.lpthDay06Lab.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

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
    private List<lpthAuthor> lpthAuthors = new ArrayList<>();
}
