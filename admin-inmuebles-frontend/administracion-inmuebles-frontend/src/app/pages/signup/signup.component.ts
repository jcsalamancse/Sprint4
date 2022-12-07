import { Component } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import Swal from 'sweetalert2';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {

  public user ={
    username : '',
    password : '',
    nombre : '',
    apellido : '',
    email : '',
    telefono : ''
  }

  constructor(private UserService:UserService, private snack:MatSnackBar){}

  ngOnInit(): void {
        
  }
  formSubmit(){
    console.log(this.user);
    if(this.user.username == '' || this.user.username == null){
      this.snack.open("El Nombre de Usuario es Requerido !!",'Aceptar',{
        duration:3000,
        verticalPosition:'top',
        horizontalPosition :'right'
      });
      return;
    }
    if(this.user.password == '' || this.user.password == null){
      this.snack.open("La contraseña es requerida !!",'Aceptar',{
        duration:3000,
        verticalPosition:'top',
        horizontalPosition :'right'
      });
      return;
      }
    if(this.user.nombre == '' || this.user.nombre == null){
      this.snack.open("El nombre es requerido !!",'Aceptar',{
        duration:3000,
        verticalPosition:'top',
        horizontalPosition :'right'
      });
      return;
      }
    if(this.user.apellido == '' || this.user.apellido == null){
      this.snack.open("El apellido es requerido !!",'Aceptar',{
        duration:3000,
        verticalPosition:'top',
        horizontalPosition :'right'
      });
      return;
      }
    this.UserService.añadirusuario(this.user).subscribe(
      (data)=>{
        console.log(data);
        Swal.fire('Usuario Guardado','Usuario Registrado Correctamente en el sistema.','success')

      }, (error)=>{
        console.log(error);
        this.snack.open("Ha ocurrido un error en el sistema !!",'Aceptar',{
          duration:3000,
        });
      }
    )
    
    
  }
    
  
  
}
