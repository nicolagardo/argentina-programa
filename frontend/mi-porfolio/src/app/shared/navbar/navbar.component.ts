import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { TokenService } from 'src/app/services/token.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  isAdmin:boolean = false;
  @Output() toggleSide = new  EventEmitter<void>();
  constructor(    
    private tokenService: TokenService,
    ) { }

  ngOnInit(): void {

    if(this.tokenService.getToken()){
      this.isAdmin= true;

    }
  }
  logout() :void{
    console.log("LogOut");
    this.toggleSide.emit();
    
  }
  changeAdmin():void{
    
  }
  logOut():void {
    this.tokenService.logOut();
    //this.changeAdmin();
  }


}
