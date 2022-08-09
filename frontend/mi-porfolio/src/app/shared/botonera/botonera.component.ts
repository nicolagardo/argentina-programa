import { Component, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-botonera',
  template: `<button mat-flat-button><mat-icon color="primary">edit</mat-icon></button>
  <button mat-flat-button><mat-icon color="warn">delete</mat-icon></button>`,
  styleUrls: ['./botonera.component.css']
})
export class BotoneraComponent implements OnInit {
  hola: string = 'hola'
  constructor() { }
  @Input() about!: boolean;
  @Input() isAdmin!: boolean;
  ngOnInit(): void {
  }

}
