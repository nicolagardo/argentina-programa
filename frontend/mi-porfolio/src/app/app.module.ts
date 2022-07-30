import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeroComponent } from './components/hero/hero.component';
import { ToolbarComponent } from './components/toolbar/toolbar.component';
import { HeaderComponent } from './components/header/header.component';
import { SectionComponent } from './components/section/section.component';
import { FotoComponent } from './components/body/foto/foto.component';
import { HttpClientModule } from '@angular/common/http';
import { AboutComponent } from './components/body/about/about.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { AuthComponent } from './components/protected/auth/auth.component';
import { LoginComponent } from './components/protected/login/login.component';
import { FormsModule } from '@angular/forms';

//INFO: MATERIAL
import {MatIconModule} from '@angular/material/icon';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button'
import {MatCardModule} from '@angular/material/card';
import { ExperiencesComponent } from './components/body/experiences/experiences.component';
import { SkillsComponent } from './components/body/skills/skills.component';
import { ProjectsComponent } from './components/body/projects/projects.component';
import { EducationsComponent } from './components/body/educations/educations.component';
import { BotoneraComponent } from './shared/botonera/botonera.component'

@NgModule({
  declarations: [
    AppComponent,
    HeroComponent,
    HeaderComponent,
    SectionComponent,
    FotoComponent,
    AboutComponent,
    NavbarComponent,
    AuthComponent,
    LoginComponent,
    ExperiencesComponent,
    SkillsComponent,
    ProjectsComponent,
    EducationsComponent,
    BotoneraComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    MatIconModule,
    MatButtonModule,
    MatInputModule,
    MatCardModule,
    

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
