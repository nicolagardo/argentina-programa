import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {
  @Input() isAdmin!: boolean
  constructor() { }

  ngOnInit(): void {
  }

}