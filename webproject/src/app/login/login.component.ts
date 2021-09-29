import { Component, OnInit } from '@angular/core';
// import { NgForm } from '@angular/forms';
import { UserRegisterService } from '../user-service.service';
import { User } from "../user";
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  User = new User();
  msg = '';

  constructor(private service : UserRegisterService, private _route : Router) { }

  ngOnInit() {
  }
  loginuser(){
    this.service.loginUserFromRemote(this.User).subscribe(
    data => {
      console.log("response recieved");
      this._route.navigate(['/all-users'])
      
    },
    error => {
      
    console.log("exception occured");
    this.msg = "Bad credentials, please enter valid credentials, else go and register you account";
  }
    )
  }}