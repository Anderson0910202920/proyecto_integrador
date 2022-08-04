package yavirac.asistencia_docente.feature.comment;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
  List<Comment> findByCommentLikeIgnoreCase(String term);
}
