package yavirac.asistencia_docente.feature.permission;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("permissions")
public class Permission {
    @Id
    @Column("permission_id")
    private long permissionId;

    private String description;

    @Column("date_time_from")
    private Timestamp dateTimeFrom;

    @Column("date_time_until")
    private Timestamp dateTimeUntil;

    private Timestamp created;

    private Timestamp updated;

    private boolean enabled;

    private boolean archive;

    private Long permisoId;

    @MappedCollection(idColumn = "permission_id")
    private Set<PermissionComment> comments = new HashSet<>();
}

/* <3 TE AMO */