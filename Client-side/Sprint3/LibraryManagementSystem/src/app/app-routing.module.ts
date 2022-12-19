import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Components/home/home.component';
import { AddBookComponent } from './Components/add-book/add-book.component';
import { GetBooksComponent } from './Components/get-books/get-books.component';
import { BrowserModule } from '@angular/platform-browser';

const routes: Routes = [{path:'', component:HomeComponent}, {path:'add', component:AddBookComponent}, {path:'get', component:GetBooksComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes), BrowserModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
