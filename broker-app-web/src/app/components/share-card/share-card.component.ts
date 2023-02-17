import {Component, Input} from '@angular/core';
import {Chart} from "chart.js";

@Component({
  selector: 'app-share-card',
  templateUrl: './share-card.component.html',
  styleUrls: ['./share-card.component.scss']
})
export class ShareCardComponent {
  // @Input()
  share: any = {
    id: -1,
    name: 'Test',
    currentPrice: -1
  };

  chart: any

  createChart(){

    this.chart = new Chart("MyChart", {
      type: 'bar', //this denotes tha type of chart

      data: {// values on X-Axis
        labels: ['2022-05-10', '2022-05-11', '2022-05-12','2022-05-13',
          '2022-05-14', '2022-05-15', '2022-05-16','2022-05-17', ],
        datasets: [
          {
            label: "Sales",
            data: ['467','576', '572', '79', '92',
              '574', '573', '576'],
            backgroundColor: 'blue'
          },
          {
            label: "Profit",
            data: ['542', '542', '536', '327', '17',
              '0.00', '538', '541'],
            backgroundColor: 'limegreen'
          }
        ]
      },
      options: {
        aspectRatio:2.5
      }

    });
  }
}
