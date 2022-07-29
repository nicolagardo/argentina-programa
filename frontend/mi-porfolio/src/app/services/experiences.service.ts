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
}
