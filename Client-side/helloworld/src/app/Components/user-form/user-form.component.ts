import { Component, OnInit } from '@angular/core';
import User from 'src/app/Entity/user';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  title: String= 'Please fill the form below';

user: User= new User();


  save(){
    console.log('Hello '+this.user.firstname+' '+this.user.lastname);
    console.log('your email add is '+this.user.email);
  }

  constructor() { }

  ngOnInit(): void {
  }

}
