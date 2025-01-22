// app.config.ts
import { ApplicationConfig } from '@angular/core';
import { provideHttpClient } from '@angular/common/http'; // Importa provideHttpClient

export const appConfig: ApplicationConfig = {
  providers: [
    provideHttpClient(), // Proporciona HttpClient a nivel global
  ]
};