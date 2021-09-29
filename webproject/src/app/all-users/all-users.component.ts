import { Component, OnInit } from '@angular/core';
import { UserRegisterService } from '../user-service.service';

@Component({
  selector: 'app-all-users',
  templateUrl: './all-users.component.html',
  styleUrls: ['./all-users.component.css']
})
export class AllUsersComponent implements OnInit {
  users : any;

  constructor( private service : UserRegisterService) { }

  ngOnInit() {
    let response  = this.service.getUsers();
    response.subscribe(data => this.users = data);
  }
  public removeUser(fullname : string){
    let response = this.service.deleteUser(fullname);
    response.subscribe(data => this.users = data);
  }

}
