package yavirac.asistencia_docente.feature.user;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
import yavirac.asistencia_docente.feature.person.Person;

@Data
@Table("users")
public class User {

    @Id
    @Column("user_id")
    private long userId;
    private String username;
    private String email;
    private String password;
    private Timestamp created;
    private Timestamp updated;
    private boolean enabled;
    @Column("person_id")
    private Long personId;
    private boolean archived;

    @MappedCollection(idColumn = "person_id")
    private Set<Person> person = new HashSet<>();
}
