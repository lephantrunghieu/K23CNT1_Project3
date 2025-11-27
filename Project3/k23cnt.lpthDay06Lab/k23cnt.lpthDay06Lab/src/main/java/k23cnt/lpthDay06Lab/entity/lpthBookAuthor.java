package k23cnt.lpthDay06Lab.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class lpthBookAuthor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lpth_book_id", nullable = false)
    private lpthBook book;

    @ManyToOne
    @JoinColumn(name = "lpth_author_id", nullable = false)
    private lpthAuthor author;

    private Boolean editor = false; // true = chủ biên, false = đồng tác giả
}
