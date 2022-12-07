
package com.administracion.administracion.restcontroller;

import com.administracion.administracion.entity.Copropietario;
import com.administracion.administracion.service.CopropietarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/copropietarior")
        
public class CopropietarioRestController {
  @Autowired
private CopropietarioService copropietarioservices;
  
  @GetMapping
  public List<Copropietario> findAll(){
      return copropietarioservices.findAllCustom();
  }
  
  
}
