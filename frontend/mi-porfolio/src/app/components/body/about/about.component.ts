import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { Form } from '@angular/forms';
import { BehaviorSubject } from 'rxjs';
import { AppComponent } from 'src/app/app.component';
import { About } from 'src/app/interfaces/user';
import { ServiceService } from 'src/app/services/service.service';
import { BotoneraComponent } from 'src/app/shared/botonera/botonera.component';


@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit, OnChanges{
  
  usuario: any =[]
@Input() isAdmin!: boolean
//@Input() about!: boolean
_isAdmin$!: boolean;
// @Input() edit():void{

// }
outputdelboton!:boolean;

  constructor( 
    private serviceHttp: ServiceService,
    //private btn: BotoneraComponent
    ) { }

  ngOnInit(): void {
    this.serviceHttp.getData().subscribe((response:any) => {
      this.usuario = response;
      console.log(response);
      
    })
    //this._isAdmin$.asObservable().subscribe();
  }
  ngOnChanges(changes: SimpleChanges): void {
      console.log('ngOnChanges');
      
  }
  hola(valor: boolean):void{
    console.log('====================================');
    console.log('hola about');
    console.log('====================================');
    //this.btn.edit()
    this.outputdelboton =valor;
    console.log("output ->", this.outputdelboton);
    
  }
  cancel():void{
    this.outputdelboton = !this.outputdelboton;
  }

  upDateAbout(about: About):any{
    this.serviceHttp.updateAbout(about);
    console.log('update ->', about);
    
  }
  onSubmit(form: any):void{ 
    //this.upDateAbout(form);
    this.serviceHttp.updateAbout(form);
    console.log('submit->',form);
    
  }

}
