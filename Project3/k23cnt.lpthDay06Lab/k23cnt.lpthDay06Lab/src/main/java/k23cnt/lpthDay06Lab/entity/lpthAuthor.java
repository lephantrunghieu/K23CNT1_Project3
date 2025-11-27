package k23cnt.lpthDay06Lab.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class lpthAuthor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lpthId;

    private String lpthCode;
    private String lpthName;
    private String lpthEmail;
    private String lpthDescription;
    private String lpthPhone;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<lpthBookAuthor> bookAuthors = new ArrayList<>();
}
