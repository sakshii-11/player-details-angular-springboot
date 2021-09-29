import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserRegisterService {

  constructor(private http : HttpClient) { }

  public doRegistration(user){
    
    return this.http.post("http://localhost:9090/save-user",user, {responseType : "text" as "json"});
  }
  public getUsers(){
    return this.http.get("http://localhost:9090/all-users");
  }
  
  public deleteUser(fullname){
    return this.http.get("http://localhost:9090/delete/" + fullname);
  }
  public getUserByFullname(fullname){
    return this.http.get("http://localhost:9090/search/"+ fullname);
  }
  public loginUserFromRemote(user: User):Observable<any>{
  return this.http.post<any>("http://localhost:9090/login",user)

  }

}
