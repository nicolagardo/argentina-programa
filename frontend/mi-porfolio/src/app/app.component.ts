import { Component, isDevMode, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'mi-porfolio';
  //@Output() isAdmin:boolean

  ngOnInit(): any{
    console.log('Componente inicializado');
    isDevMode();
    
  }
}
