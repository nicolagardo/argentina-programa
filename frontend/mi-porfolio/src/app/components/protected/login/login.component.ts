import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

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
  constructor(private authServ: AuthService) { }

  ngOnInit(): void {
    const userData = {
      emailUser: 'nico@email.com',
      password: '123456'
    }
    this.authServ.login(userData).subscribe(res => console.log('Login!'));


  }
  Ingresar(): void {
    console.log(this.usuario);
    
  }

}
