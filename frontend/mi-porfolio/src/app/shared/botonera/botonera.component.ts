import { Component, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-botonera',
  templateUrl: './botonera.component.html',
  styleUrls: ['./botonera.component.css']
})
export class BotoneraComponent implements OnInit {
  hola: string = 'hola'
  constructor() { }
  @Output()
  ngOnInit(): void {
  }

}
