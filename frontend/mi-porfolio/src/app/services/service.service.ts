import { Injectable } from '@angular/core';
import  { User } from '../interfaces/user'
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})

export class ServiceService {

  constructor( private http: HttpClient) {console.log('Servicio Service');
   }

   getData(): any {
    return this.http.get('http://localhost:8090/api/user/id/1')
   }
}
