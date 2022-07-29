import { Component, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-educations',
  templateUrl: './educations.component.html',
  styleUrls: ['./educations.component.css']
})
export class EducationsComponent implements OnInit {
  
  educations : any =[
    {escuela: "comercio",
    ano: "2000"},
    {escuela: "normal",
    ano: "2020"}]
  
    data = Object.values(this.educations)
  constructor() { }

  ngOnInit(): void {
  }

}
