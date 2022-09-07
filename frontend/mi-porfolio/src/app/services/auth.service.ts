import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import {  UserLogin, UserResponse } from '../interfaces/user';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  authUrl = environment.API_URL;
  constructor(private http: HttpClient) { }

  public login(loginUser: UserLogin): Observable<UserResponse>  {
    return this.http.post<UserResponse>(`${this.authUrl}/auth/login`, loginUser );
  }
}
