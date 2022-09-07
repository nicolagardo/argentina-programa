import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class ServiceService {
  private api_url :any = environment.API_URL

  constructor( private http: HttpClient) {console.log('Servicio Service');
   }

   getData(): any {
    return this.http.get(`${this.api_url}/user/id/1`)
   }
   
   getDataEd(): any {
    return this.http.get(`${this.api_url}/educations`)
   }
   getDataSk(): any {
    return this.http.get(`${this.api_url}/skills`)
   }
   getDataPj(): any {
    return this.http.get(`${this.api_url}/projects`)
   }
}
