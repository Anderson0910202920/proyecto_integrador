package yavirac.asistencia_docente.feature.permission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PermissionService {
    
    @Autowired
    PermissionRepository permissionRepository;

    //CRUD = Create, Read, Update, Delete

    public Permission save(Permission permission){

        return permissionRepository.save(permission);
    }

    public Permission findById(long id){
        return permissionRepository.findById(id).orElse(new Permission());
    }

    public Permission update(Permission permission){
        return permissionRepository.save(permission);
    }

    public void deleteById(long id){
        permissionRepository.deleteById(id);
    }
}