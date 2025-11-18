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
public class lpthAuthor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long lpthId;

    String lpthCode;
    String lpthName;
    String lpthEmail;
    String lpthDescription;
    String lpthPhone;
    String lpthAddress;
    String lpthImgUrl;
    String lpthAcive;

    @ManyToMany(mappedBy = "lpthAuthors")
    Set<lpthBook> lpthBooks;
}
