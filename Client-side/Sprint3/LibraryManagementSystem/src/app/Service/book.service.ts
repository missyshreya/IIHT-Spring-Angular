import { Injectable } from "@angular/core";
import {HttpClient} from "@angular/common/http";
@Injectable({
    providedIn:'root'
})

export class bookService{

    constructor(private http: HttpClient){}

    api='http//localhost:7000';

    public addBook(book:any){
        return this.http.post(this.api+'/books/add/book',book);
    }

    public getAllBooks(){
        return this.http.get(this.api+'/books/allbooks');
    }

    public deleteBook(id:any){
        return this.http.delete(this.api+'/remove/' + id);
    }
}