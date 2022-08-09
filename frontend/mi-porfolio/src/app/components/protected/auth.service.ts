import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, map, Observable, throwError } from 'rxjs';
import { User, UserResponse } from 'src/app/interfaces/user';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AuthService {


  constructor(private http:HttpClient) { }

  login(authData: User):Observable<UserResponse | void>{
    return this.http
    .post<UserResponse>(`${environment.API_URL}/user/auth`, authData)
    .pipe(
      map( (res) => {
        this.saveToken(res.token);
        //saveToken
      }),
      catchError((error) => this.handleError(error))

    );
  }

  logout():void{
    localStorage.removeItem('token');
    //TODO: set userIsLogged

  }
  private checkToken():void{}
  private saveToken(token: string):void{
    localStorage.setItem('token', token)
  }

  private handleError(err: { message: any; }):Observable<never>{
    let errorMessage = 'Error';
    if (err) {
      errorMessage =`Error: code ${err.message}`
    }
    window.alert(errorMessage);
    return throwError(errorMessage)
  }

}
