package phucblbk.quizzapp2java.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "quizzes")
public class Quizzes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;
}
