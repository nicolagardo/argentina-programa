import { Component, Input, OnInit, Output } from '@angular/core';
import { EducationService } from 'src/app/services/education/education.service';

@Component({
  selector: 'app-educations',
  templateUrl: './educations.component.html',
  styleUrls: ['./educations.component.css']
})
export class EducationsComponent implements OnInit {
  educations: any = []
  @Input() isAdmin!: boolean
  // educations : any =[
  //   {escuela: "comercio",
  //   ano: "2000"},
  //   {escuela: "normal",
  //   ano: "2020"}]
  
  //   data = Object.values(this.educations)
  constructor(private servHttp: EducationService) { }

  ngOnInit(): void {
    this.servHttp.getDataEd().subscribe(
      (response:any) => {
        this.educations = response;
      }
    )
  }

}
