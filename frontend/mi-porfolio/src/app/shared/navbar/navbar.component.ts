import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  @Input() isAdmin!:boolean;
  @Output() toggleSide = new  EventEmitter<void>();
  constructor() { }

  ngOnInit(): void {
  }
  logout() :void{
    console.log("LogOut");
    this.toggleSide.emit();
    
  }
  changeAdmin():void{
    this.isAdmin= !this.isAdmin
  }


}
