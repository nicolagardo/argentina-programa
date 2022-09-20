import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { AppComponent } from 'src/app/app.component';
import { ServiceService } from 'src/app/services/service.service';
import { BotoneraComponent } from 'src/app/shared/botonera/botonera.component';


@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit, OnChanges{
usuario: any =[]
name2:any ={
  name:'nombre'
}
@Input() isAdmin!: boolean
//@Input() about!: boolean
_isAdmin$!: boolean;
@Input() edit():void{

}
outputdelboton!:boolean;

  constructor( 
    private serviceHttp: ServiceService,
    //private btn: BotoneraComponent
    ) { }

  ngOnInit(): void {
    this.serviceHttp.getData().subscribe((response:any) => {
      this.usuario = response;
    })
    //this._isAdmin$.asObservable().subscribe();
  }
  ngOnChanges(changes: SimpleChanges): void {
      
  }
  hola(valor: boolean):void{
    console.log('====================================');
    console.log('hola about');
    console.log('====================================');
    //this.btn.edit()
    this.outputdelboton =valor;
    console.log("output ->", this.outputdelboton);
    
  }

}
