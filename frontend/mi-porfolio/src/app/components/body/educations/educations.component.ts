import { Component, Input, OnInit, Output } from '@angular/core';
import { EducationService } from 'src/app/services/education/education.service';

@Component({
  selector: 'app-educations',
  templateUrl: './educations.component.html',
  styleUrls: ['./educations.component.css']
})
export class EducationsComponent implements OnInit {
  educations: any = []
  vari:boolean = false;
  @Input() isAdmin: boolean = false;
  // educations : any =[
  //   {escuela: "comercio",
  //   ano: "2000"},
  //   {escuela: "normal",
  //   ano: "2020"}]
  
  //   data = Object.values(this.educations)
  constructor(
    private servHttp: EducationService
    ) { }

  ngOnInit(): void {
    this.isAdmin;
    this.servHttp.getDataEd().subscribe(
      (response:any) => {
        this.educations = response;
      }
    )
  }
  onAddEdu():void{
    console.log('add->');
    
  }
  createEdu(education:any): any{
    this.servHttp.postDataEdu(education);
  }

}
