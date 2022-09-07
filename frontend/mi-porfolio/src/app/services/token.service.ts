import { Injectable } from '@angular/core';

const TOKEN_KEY = 'AuthToken';

@Injectable({
  providedIn: 'root'
})
export class TokenService {
  roles: Array<string> = [];

  constructor() { }

  public setToken(token:string): void {
    window.sessionStorage.removeItem(TOKEN_KEY);
    window.sessionStorage.setItem(TOKEN_KEY, token);
    
  }
  public getToken(): string|null {
    return sessionStorage.getItem(TOKEN_KEY);
  }

  /**
   * logOut
   */
  public logOut(): void {
    window.sessionStorage.clear();
  }
}
