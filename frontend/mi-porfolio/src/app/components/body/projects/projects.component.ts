import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})
export class ProjectsComponent implements OnInit {
  @Input() isAdmin!: boolean
  constructor() { }
  projects:any =[]

  ngOnInit(): void {
  }

}
