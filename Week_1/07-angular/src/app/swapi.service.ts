import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SwapiService {
  // Angular uses Observables almost everywhere, including http services
  constructor(private http:HttpClient) {
  }

  // make a call to an external REST API
  getData(){
    // Angular makes the call into an OBSERVABLE
    return this.http.get(`https://swapi.dev/api/people/1`)
      // .then()
      // .then()
  }
}