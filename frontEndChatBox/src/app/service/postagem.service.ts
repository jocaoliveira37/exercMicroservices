import { Postagem } from './../model/Postagem';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';

@Injectable({
  providedIn: 'root'
})
export class PostagemService {

constructor(private http: HttpClient) { }

  token = {
    headers: new HttpHeaders().set('Authorization', environment.token)
  }

  getAllPostagem(): Observable<Postagem[]> {
    return this.http.get<Postagem[]>('http://localhost:8082/postagem/post', this.token)
  }
  postPostagem(postagem: Postagem): Observable<Postagem> {
    return this.http.post<Postagem>('http://localhost:8081/post/post', postagem, this.token)
  }
}
