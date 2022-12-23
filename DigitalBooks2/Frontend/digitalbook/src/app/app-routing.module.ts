import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BooksComponent } from './Components/books/books.component';
import { CreateNewBookComponent } from './Components/create-new-book/create-new-book.component';
import { CreatedBookComponent } from './Components/created-book/created-book.component';
import { LoginComponent } from './Components/login/login.component';
import { SubscribedBookComponent } from './Components/subscribed-book/subscribed-book.component';
import { UsersComponent } from './Components/users/users.component';
import { HomeComponent } from './Components/home/home.component';

const routes: Routes = [
  { path: '', component: BooksComponent
  //, canActivate: [AuthGuard] 
},
{ path: 'signup', component: UsersComponent
},
{ path: 'signin', component: LoginComponent
},
{ path: 'home', component: HomeComponent
},
{ path: 'subescribedbooks', component: SubscribedBookComponent
},
{ path: 'createdbooks', component: CreatedBookComponent
},
{ path: 'createbooks', component: CreateNewBookComponent
},
{ path: 'search/:id', component: SubscribedBookComponent
},

  // { path: 'home', component: HomeComponent, canActivate: [AuthGuard]},
  // { path: 'selfposts', component: PostsComponent, canActivate: [AuthGuard]},
  // { path: 'login', component: LoginComponent },
  // { path: 'register', component: RegisterComponent },

  // // otherwise redirect to home
  // { path: '**', component: NotfoundComponent }




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


