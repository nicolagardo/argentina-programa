import { Component, OnInit } from '@angular/core';
import { ServiceService } from 'src/app/services/service.service';


@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
usuario: any =[]

  constructor( private serviceHttp: ServiceService) { }

  ngOnInit(): void {
    this.serviceHttp.getData().subscribe((response:any) => {
      this.usuario = response;
    })
  }

}
