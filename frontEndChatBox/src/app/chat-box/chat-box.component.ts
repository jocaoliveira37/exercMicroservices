import { PostagemService } from './../service/postagem.service';
import { Postagem } from './../model/Postagem';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment.prod';

@Component({
  selector: 'app-chat-box',
  templateUrl: './chat-box.component.html',
  styleUrls: ['./chat-box.component.css']
})
export class ChatBoxComponent implements OnInit {

  nome = environment.nome
  id = environment.id

  listaPostagem!: Postagem[]
  postagem: Postagem = new Postagem();

  constructor(
    private router : Router,
    private postagemService: PostagemService
  ) { }

  ngOnInit() {

    if(environment.token == ''){
      this.router.navigate(['/entrar'])
    }

    this.getAllPostagem()
    this.postagem.nome = this.nome
  }

  getAllPostagem() {
    this.postagemService.getAllPostagem().subscribe((resp: Postagem[]) => {
      this.listaPostagem = resp
      console.log(resp)
    })
  }
  post() {
    this.postagemService.postPostagem(this.postagem).subscribe((resp: Postagem) => {
      this.postagem = resp;
      console.log(resp)
      this.getAllPostagem()
      this.postagem.message = ''
    });

  }

}
