import { Component, OnInit } from '@angular/core';
import User from 'src/app/Entity/user';
import { UserService } from 'src/app/Services/user.service';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  title: String= 'Please fill the form below';

user: User= new User();
  save(){
    const observables= this.userService.saveUser(this.user); //calling saveuser function
    observables.subscribe(
      (response: any) =>{
        console.log(response);
      }, function(error){
        console.log(error);
        alert("something went wrong, Please try again!")
      }
    )    
  }
  constructor(private userService: UserService) {} //injecting userservice
  ngOnInit(): void {}
}


