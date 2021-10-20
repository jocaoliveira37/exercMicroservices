import { Postagem } from './Postagem';
export class Usuario{
  public id!: number
  public nome!: string
  public endereco!: string
  public senha!: string
  public usuario!: string
  public tipo!: string
  public Postagem!: Postagem[]
}
