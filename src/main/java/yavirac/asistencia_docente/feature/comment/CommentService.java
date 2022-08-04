package yavirac.asistencia_docente.feature.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
  @Autowired
  CommentRepository commentRepository;
  
  public List<Comment> findByName(String term){
    return commentRepository.findByCommentLikeIgnoreCase(term+"%");
}

  public Comment findById(long id){
      return commentRepository.findById(id).orElse(new Comment());
  }

}
