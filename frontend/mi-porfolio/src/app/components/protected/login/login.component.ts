import { Component, OnInit } from '@angular/core';

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
  constructor() { }

  ngOnInit(): void {
  }
  Ingresar() {
    console.log(this.usuario);
    
  }
}
