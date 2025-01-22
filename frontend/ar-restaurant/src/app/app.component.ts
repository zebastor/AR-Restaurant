import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import{ListaCategoriaPlatoComponent} from '../app/componentes/lista-categoria-plato/lista-categoria-plato.component'
//import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ListaCategoriaPlatoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ar-restaurant';
}