import { Component, OnInit } from '@angular/core';
import { bookService } from 'src/app/Service/book.service';

@Component({
  selector: 'app-get-books',
  templateUrl: './get-books.component.html',
  styleUrls: ['./get-books.component.css']
})
export class GetBooksComponent implements OnInit {

  bookdetails=null;
  constructor(private bservice: bookService) { }

  deleteBook(book: any){
    this.bservice.deleteBook(book.id).subscribe(
      (resp) => {
        console.log(resp);
        alert("Book Deleted");
        this.ngOnInit();
      },
      (err) => {
        console.log(err);
        alert("Book Not Deleted,Service Down");
      }
    );
  }

  ngOnInit(): void {
    this.bservice.getAllBooks().subscribe(
      (resp) => {
        console.log(resp);
        this.bookdetails = resp;
      },
      (err) => {
        console.log(err);
      }
    );
  }
}
