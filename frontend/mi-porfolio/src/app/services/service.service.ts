import { Injectable } from '@angular/core';
import  { User } from '../interfaces/user'
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})

export class ServiceService {

  constructor( private http: HttpClient) { }
}
