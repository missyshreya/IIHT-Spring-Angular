import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  title: String= 'Please fill the form below';

  firstname: String='';
  lastname: String='';
  age=0;
  gender: String='male';
  email: String='';

  save(){
    console.log('Hello '+this.firstname+' '+this.lastname);
    console.log('your email add is '+this.email);
  }

  constructor() { }

  ngOnInit(): void {
  }

}
