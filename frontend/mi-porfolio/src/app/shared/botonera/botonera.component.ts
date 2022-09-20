import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-botonera',
  template: `<button mat-flat-button (click)="edit()"><mat-icon color="primary">edit</mat-icon></button>
  <button mat-flat-button (click)="delete()"><mat-icon color="warn">delete</mat-icon></button>`,
  styleUrls: ['./botonera.component.css']
})
export class BotoneraComponent implements OnInit, OnChanges{
  
  constructor() {}
  ngOnChanges(changes: SimpleChanges): void {
    this.edit()
  }
  @Input() about!: boolean;
  @Input() isAdmin!: boolean;
  @Output() onEdit = new EventEmitter<boolean>();
  bul!:boolean;
  strinn:string="strinn"
  ngOnInit(): void {
    
  }
  edit():void{
    //this.about= true;
    console.log('====================================');
    console.log('edit');
    console.log('====================================');
    this.bul = !this.bul? true: false;
    this.onEdit.emit(this.bul);

  }
  delete():void{
    console.log('====================================');
    console.log('delete');
    console.log('====================================');

  }

}
