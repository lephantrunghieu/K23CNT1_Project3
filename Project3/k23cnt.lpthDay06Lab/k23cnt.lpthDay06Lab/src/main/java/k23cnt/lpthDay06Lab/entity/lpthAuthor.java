package k23cnt.lpthDay06Lab.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
    String lpthActive;

    // Tạo mối quan hệ với bảng book
    @ManyToMany(mappedBy = "lpthAuthors")
    private List<lpthBook> books = new ArrayList<>();
}
