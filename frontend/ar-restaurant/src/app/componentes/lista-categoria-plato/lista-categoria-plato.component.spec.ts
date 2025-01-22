import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaCategoriaPlatoComponent } from './lista-categoria-plato.component';

describe('ListaCategoriaPlatoComponent', () => {
  let component: ListaCategoriaPlatoComponent;
  let fixture: ComponentFixture<ListaCategoriaPlatoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListaCategoriaPlatoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListaCategoriaPlatoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
