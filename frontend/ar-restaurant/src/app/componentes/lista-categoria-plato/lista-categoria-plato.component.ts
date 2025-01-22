import { Component, OnInit } from '@angular/core';
import { CategoriaPlato } from '../../categoria-plato';
import { CommonModule } from '@angular/common';
import { CategoriaPlatoService } from '../../servicios/categoria-plato.service';



@Component({
  selector: 'app-lista-categoria-plato',
  imports: [CommonModule],
  standalone: true,
  
  templateUrl: './lista-categoria-plato.component.html',
  styleUrl: './lista-categoria-plato.component.css'
})
export class ListaCategoriaPlatoComponent implements OnInit {

  
  categoriaPlato : CategoriaPlato[]= [];

  constructor(private categoriaPlatoService: CategoriaPlatoService) {
    
  }

  ngOnInit(): void {
    this.obtenerListaCategoriaPlato()
  }

  private obtenerListaCategoriaPlato(){
    this.categoriaPlatoService.obtenerListaCategoriaPlato()
    .subscribe(dato =>{this.categoriaPlato= dato;});
  }

}
