import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Book } from 'src/app/Entity/Book';
import { bookService } from 'src/app/Service/book.service';


@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})

  

export class AddBookComponent implements OnInit {
  book: Book = new Book();

  validate(loginForm:NgForm) {
    if(loginForm.touched && loginForm.valid){
      this.addBook();
    }else{
      alert("Please fill all the values");
    }
  }

  checkAllFields(loginForm:NgForm){
    return loginForm.valid;
  }

  addBook() {
    const promise = this.bservice.addBook(this.book);
    promise.subscribe((response) => {
      console.log(response);
      alert("Your book has been added succesfully!");
      this.book = new Book();
    }, function (error) {
      console.log(error);
      alert("ERROR!! Please try again...")
    })

  }
  constructor(private bservice: bookService) { }

  ngOnInit(): void {
  }

}