import { Component, Input, OnInit } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { AppComponent } from 'src/app/app.component';
import { ServiceService } from 'src/app/services/service.service';


@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
usuario: any =[]
@Input() isAdmin!: boolean
@Input() about!: boolean
_isAdmin$!: boolean;
@Input() edit():void{

}

  constructor( private serviceHttp: ServiceService) { }

  ngOnInit(): void {
    this.serviceHttp.getData().subscribe((response:any) => {
      this.usuario = response;
    })
    //this._isAdmin$.asObservable().subscribe();
  }
  hola():void{
    console.log('====================================');
    console.log('hola about');
    console.log('====================================');
  }

}
