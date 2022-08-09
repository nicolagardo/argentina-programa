import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { FormBuilder, FormGroup } from "@angular/forms";
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  usuario = {
    email:'',
    password:''
  }
  constructor(private authServ: AuthService, private ruta: Router) { }

  ngOnInit(): void {
    const userData = {
      emailUser: 'nico@email.com',
      password: '123456'
    }
    this.authServ.login(userData).subscribe(res => console.log('Login!', res));


  }
  Ingresar(event:Event): void {
    event.preventDefault;
    console.log();
    this.ruta.navigate(['/home']);
    
  }

}
