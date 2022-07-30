import { Component, Input, OnInit } from '@angular/core';
import { response } from 'express';
import { ExperiencesService } from 'src/app/services/experiences.service';
import { ServiceService } from 'src/app/services/service.service';

@Component({
  selector: 'app-experiences',
  templateUrl: './experiences.component.html',
  styleUrls: ['./experiences.component.css']
})
export class ExperiencesComponent implements OnInit {
experiencias: any =[]
@Input() isAdmin!: boolean

  constructor(private servHttp: ExperiencesService) { }
  
  ngOnInit(): void {
    this.servHttp.getDataEx().subscribe(
      (response:any) => {
        this.experiencias = response;
      }
    )
  }

}
