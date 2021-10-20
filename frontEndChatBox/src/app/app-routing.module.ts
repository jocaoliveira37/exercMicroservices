import { CadastrarComponent } from './cadastrar/cadastrar.component';
import { ChatBoxComponent } from './chat-box/chat-box.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EntrarComponent } from './entrar/entrar.component';

const routes: Routes = [
  { path: "", redirectTo: "entrar", pathMatch: "full" },
  {path: "entrar", component: EntrarComponent },
  {path:"chat-box", component: ChatBoxComponent},
  {path:"cadastrar", component: CadastrarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
