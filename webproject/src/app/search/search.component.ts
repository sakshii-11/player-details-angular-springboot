import { Component, OnInit } from '@angular/core';
import { UserRegisterService } from '../user-service.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  fullname : string;
  user : any;

  constructor( private service : UserRegisterService) {  }

  ngOnInit() {
  }
  public findUserByFullname(){
    let response = this.service.getUserByFullname(this.fullname);
    response.subscribe(data => this.user = data);
  }

}





// loginuser(){
//   this.service.loginUserFromRemote(this.User).subscribe(
//   data => {
//     console.log("response recieved");
//     this._route.navigate(['/all-users'])
    
//   },
//   error => {
    
//     console.log("exception occured");
//   this.msg = "Bad credentials, please enter valid credentials, else go and register you account";
// }
//   )
// }}
