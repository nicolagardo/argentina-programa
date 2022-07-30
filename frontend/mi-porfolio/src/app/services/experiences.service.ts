import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';



@Injectable({
  providedIn: 'root'
})
export class ExperiencesService {
  private api_url: string = environment.API_URL

  constructor(private http: HttpClient) { }

  getDataEx(): any {
    return this.http.get(`${this.api_url}/experiences`)
   }
   
  postDataEx(dataBody: any): any {
    return this.http.post(`${this.api_url}/experiences`, dataBody)
  }
  putDataEx(dataBody: any): any {
    return this.http.put(`${this.api_url}/experiences`, dataBody)
  }
  deleteDataEx(id: number): any {
    return this.http.delete(`${this.api_url}/experiences`)
  }
}
