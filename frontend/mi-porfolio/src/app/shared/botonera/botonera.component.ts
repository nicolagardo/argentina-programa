import { Component, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-botonera',
  templateUrl: './botonera.component.html',
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
