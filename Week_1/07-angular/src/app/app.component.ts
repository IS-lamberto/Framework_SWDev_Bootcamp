import { Component, OnInit } from '@angular/core';
import { SwapiService } from './swapi.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Framework-Bootcamp';
  result = {}

  constructor(private swapiService:SwapiService){}
  
  doStuff(){
    // we SUBSCRIBE to the OBSERVABLE
    this.swapiService.getData().subscribe( (data)=>{
      console.log(data)
      this.result = data
    })
  }

  ngOnInit(){
    this.doStuff()
  }
}