import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class EducationService {
  private api_url = environment.API_URL

  constructor(private http: HttpClient) { }
  getDataEd(): any {
    return this.http.get(`${this.api_url}/educations`)
   }
   
  postDataEdu(dataBody: any): any {
    return this.http.post(`${this.api_url}/educations`, dataBody)
  }
  putDataEx(dataBody: any): any {
    return this.http.put(`${this.api_url}/educations`, dataBody)
  }
  deleteDataEx(id: number): any {
    return this.http.delete(`${this.api_url}/educations`)
  }
}
