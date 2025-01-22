import { TestBed } from '@angular/core/testing';

import { CategoriaPlatoService } from './categoria-plato.service';

describe('CategoriaPlatoService', () => {
  let service: CategoriaPlatoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CategoriaPlatoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
