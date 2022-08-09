import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-boton-add',
  template: `<button mat-icon-button><mat-icon color="accent">add</mat-icon></button>`,
  styleUrls: ['./boton-add.component.css']
})
export class BotonAddComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
