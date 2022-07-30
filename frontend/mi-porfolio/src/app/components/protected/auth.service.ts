import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, map, Observable, throwError } from 'rxjs';
import { User } from 'src/app/interfaces/user';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AuthService {


  constructor(private http:HttpClient) { }

  login(authData: User):Observable<User | void>{
    return this.http
    .post<User>(`${environment.API_URL}/user/auth`, authData)
    .pipe(
      map( (res:User) => {
        console.log('Res->',res);
        //saveToken
      }),
      catchError((error) => this.handleError(error))

    );
  }

  logout():void{}
  private readToken():void{}
  private saveToken():void{}

  private handleError(err: { message: any; }):Observable<never>{
    let errorMessage = 'Error';
    if (err) {
      errorMessage =`Error: code ${err.message}`
    }
    window.alert(errorMessage);
    return throwError(errorMessage)
  }

}
