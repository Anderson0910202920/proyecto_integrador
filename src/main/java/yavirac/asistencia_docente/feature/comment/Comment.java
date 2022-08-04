package yavirac.asistencia_docente.feature.comment;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("comments")
public class Comment {
  @Id
  private long id;
  private String comment;
}
