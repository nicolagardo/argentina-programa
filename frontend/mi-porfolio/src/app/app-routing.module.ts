import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HeaderComponent } from './components/header/header.component';
import { LoginComponent } from './components/protected/login/login.component';
import { SectionComponent } from './components/section/section.component';

const routes: Routes = [
  {'path': 'login', component:LoginComponent},
  {'path': '', redirectTo:'home', pathMatch: 'full'},
  {'path': 'home', component:HeaderComponent},
  {'path': '**', component:HeaderComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
