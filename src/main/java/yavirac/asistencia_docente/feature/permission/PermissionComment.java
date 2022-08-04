package yavirac.asistencia_docente.feature.permission;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("permission_comment")
public class PermissionComment {
  @Id private long id;
  private Long permissionId;
  private Long commentId;
}
