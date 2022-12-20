import { Injectable } from "@angular/core";
import {HttpClient} from "@angular/common/http";
import { Book } from "../Entity/Book";

const api="http://localhost:5000";

@Injectable({
    providedIn:'root'
})

export class bookService{    

    public addBook(book){
        return this.http.post(api+"/add/book",book);
    }

    public getAllBooks(){
        return this.http.get(api+"/allbooks");
    }

    public deleteBook(id: any){
        return this.http.delete(api+"/remove/" + id);
    }

    constructor(private http: HttpClient){}
}