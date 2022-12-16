import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  employee = {
    "name": "Lewis Hamillton",
    "BaseSalary": 5500000,
    "JoinedOn": Date.now(),
    "Qualification": "Btech",
    "About": "Sir Lewis Carl Davidson Hamilton MBE HonFREng is a British racing driver currently competing in Formula One for Mercedes. In Formula One, Hamilton has won a joint-record seven World Drivers' Championship titles",
    "WinningPercentage": 35 / 100
  }
  constructor() { }

  ngOnInit(): void {
  }

}
