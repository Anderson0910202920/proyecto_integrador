package yavirac.asistencia_docente.feature.permiso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/permiso")
@CrossOrigin({"*"})

public class PermisoController {
    @Autowired

    PermisoService permisoService;

    @PostMapping("/save")
    public Permiso save(@RequestBody Permiso permiso) {
        return permisoService.save(permiso);
    }
    @GetMapping("findById/{id}")
    public Permiso findById(@PathVariable long id){
        return permisoService.findById(id);
    }
    
    @PutMapping("/update")
    public Permiso update(@RequestBody Permiso permiso)
    {
        return permisoService.save(permiso);
    }
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        permisoService.deleteById(id);
    }
    @GetMapping("/findAll")
    public List<Permiso> findAll(){
        return permisoService.findAll();
    }
    @GetMapping("/findByName/{term}")
    public List<Permiso> findByName(@PathVariable String term){ //Mapea desde la URL con PathVariable
        return permisoService.findByName(term);
    }
}
