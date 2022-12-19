import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { bookService } from 'src/app/Service/book.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  constructor(private bservice: bookService) { }

  bookform= new FormGroup({
    bookname: new FormControl(),
    authorname: new FormControl(),
    price: new FormControl(),
    genre: new FormControl(),
    bstatus: new FormControl()
  });

  get BookName(): FormControl{
    return this.bookform.get("bookname") as FormControl;
  }
  get BookAuthor(): FormControl{
    return this.bookform.get("authorname") as FormControl;
  }
  get BookPrice(): FormControl{
    return this.bookform.get("price") as FormControl;
  }
  get BookGenre(): FormControl{
    return this.bookform.get("genre") as FormControl;
  }
  get BorrowedStatus(): FormControl{
    return this.bookform.get("bstatus") as FormControl;
  }


  addbook(bookform: FormGroup){
    console.log(this.bookform);
    this.bservice.addBook(bookform.value).subscribe(
      (resp) => {
        console.log(resp);
        bookform.reset();
      },
      (err) => {
        console.log(err);
      }
    );
  }
  ngOnInit(): void {
  }

}
