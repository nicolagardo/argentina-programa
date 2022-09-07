import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/services/auth.service';
import { FormBuilder, FormGroup } from "@angular/forms";
import { Router } from '@angular/router';
import { TokenService } from 'src/app/services/token.service';
import { UserLogin, UserResponse } from 'src/app/interfaces/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {
  isLogged = false;
  isLoggedFail = false;
  loginUser!: UserLogin;
  nameUser:string = '';
  password:string = '';
  erroMsj: string = '';
  // usuario = {
  //   email:'',
  //   password:''
  // }
  constructor(
    private tokenService: TokenService,
    private authService: AuthService,
    private ruta: Router
  ) {}

  ngOnInit(): void {
    // const userData = {
    //   emailUser: 'nico@email.com',
    //   password: '123456'
      if (this.tokenService.getToken()) {
        this.isLogged = true;
        this.isLoggedFail = false;
        
      }
    //}
    //this.authService.login(userData).subscribe(res => console.log('Login!', res));


  }
  // Ingresar(event:Event): void {
  //   event.preventDefault;
  //   console.log();
  //   this.ruta.navigate(['/home']);
    
  // }
  onLogin(): void {
    this.loginUser = new UserLogin(this.nameUser, this.password);
    this.authService.login(this.loginUser).subscribe(
      data => {
        this.isLogged = true;
        this.isLoggedFail = false;
        this.tokenService.setToken(data.token);
        
      },
      err => {
        this.isLogged = false;
        this.isLoggedFail = true;
        this.erroMsj = err.error.message;
        console.log(err);
        
      }
    )
    
  }

}
