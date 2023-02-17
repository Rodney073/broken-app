import { Component } from '@angular/core';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.scss']
})
export class MainComponent {
  shares: Array<any> = [
    {
      title:"Alma",
      price: 10
    },
    {
      title:"Alma",
      price: 10
    },
    {
      title:"Alma",
      price: 10
    },
    {
      title:"Alma",
      price: 10
    },
    {
      title:"Alma",
      price: 10
    },
    {
      title:"Alma",
      price: 10
    }
  ]
}
