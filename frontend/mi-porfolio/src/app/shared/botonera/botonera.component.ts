import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-botonera',
  template: `<button mat-flat-button (click)="edit()"><mat-icon color="primary">edit</mat-icon></button>
  <button mat-flat-button (click)="delete()"><mat-icon color="warn">delete</mat-icon></button>`,
  styleUrls: ['./botonera.component.css']
})
export class BotoneraComponent implements OnInit {
  
  constructor() { }
  @Input() about!: boolean;
  @Input() isAdmin!: boolean;
  @Output() onEdit$!: EventEmitter<boolean>;
  ngOnInit(): void {
    
  }
  edit():void{
    //this.about= true;
    console.log('====================================');
    console.log('edit');
    console.log('====================================');
    //this.oNedit$.emit();

  }
  delete():void{
    console.log('====================================');
    console.log('delete');
    console.log('====================================');

  }

}
