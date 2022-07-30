
import { Component, OnInit } from '@angular/core';
import { ServiceService } from 'src/app/services/service.service';

@Component({
  selector: 'app-section',
  templateUrl: './section.component.html',
  styleUrls: ['./section.component.css']
})
export class SectionComponent implements OnInit {
  usuario: any =[];

  constructor( private servicesHttp: ServiceService) { }

  ngOnInit(): void {

    this.servicesHttp.getData()
    .subscribe((response: any) => {
      this.usuario = response;
      console.log(this.usuario);

    });
    
    
    
  }
 




}
