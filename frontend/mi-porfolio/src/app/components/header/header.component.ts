import { Component, Input, OnInit, Output } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { TokenService } from 'src/app/services/token.service';
import { BotoneraComponent } from 'src/app/shared/botonera/botonera.component';
import { SpinnerService } from 'src/app/shared/spinner/spinner.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  
  @Input() isAdminHeader!:boolean;
  //@Output() _isAdmin$: BehaviorSubject<boolean> = new BehaviorSubject<boolean>(true);
  
  
  constructor(
    private tokenService: TokenService,
    //private btn: BotoneraComponent
    ) { }

  ngOnInit(): void {
    this.tokenOn();

    
  }

  tokenOn(): void{
    if (this.tokenService.getToken()) {
     //this._isAdmin$ =  new BehaviorSubject<boolean>(true);
     this.isAdminHeader = true;
    }
    
  }
  hola():void{
    console.log('====================================');
    console.log('hola');
    console.log('====================================');
  }
  onEdit():void{
    //this.btn.oNedit$;
  }

}
