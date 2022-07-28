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
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button'
//INFO: MATERIAL


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
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    MatIconModule,
    MatButtonModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
