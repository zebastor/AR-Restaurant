import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CategoriaPlato } from '../categoria-plato';

@Injectable({
  providedIn: 'root'
})
export class CategoriaPlatoService {

  private baseURL="http://localhost:8080/api/v1/Categoria_plato";

  constructor(private httpClient: HttpClient) { }

  obtenerListaCategoriaPlato(): Observable<CategoriaPlato[]>{
    return this.httpClient.get<CategoriaPlato[]>(`${this.baseURL}`);
  }
  
}
