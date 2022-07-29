import { Component, OnInit } from '@angular/core';
import { response } from 'express';
import { ServiceService } from 'src/app/services/service.service';

@Component({
  selector: 'app-experiences',
  templateUrl: './experiences.component.html',
  styleUrls: ['./experiences.component.css']
})
export class ExperiencesComponent implements OnInit {
experiencias: any =[]

  constructor(private servHttp: ServiceService) { }

  ngOnInit(): void {
    this.servHttp.getDataEx().subscribe(
      (response:any) => {
        this.experiencias = response;
      }
    )
  }

}
