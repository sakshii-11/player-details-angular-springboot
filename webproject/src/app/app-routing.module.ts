import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllUsersComponent } from './all-users/all-users.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { SearchComponent } from './search/search.component';

const routes: Routes = [
  {
    path : "", redirectTo: "home" , pathMatch : "full"
  },
  {
    path : "home", component : HomeComponent
  },
  {
    path : "login", component : LoginComponent
  },
  {
    path : "search", component : SearchComponent
  },
  {
    path : "register" , component : RegisterComponent
  },
 
  {
    path : "all-users", component : AllUsersComponent
  },
  {
    path : "**", component : HomeComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
