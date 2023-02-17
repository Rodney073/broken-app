import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {RegisterComponent} from "src/app/components/register/register.component";
import {LoginComponent} from "src/app/components/login/login.component";
import {MainComponent} from "src/app/components/main/main.component";
import {ShareDetailComponent} from "src/app/components/share-detail/share-detail.component";

const routes: Routes = [
  { path: '', component: MainComponent },
  { path: 'shares', component: MainComponent },
  { path: 'shares/:id', component: ShareDetailComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
