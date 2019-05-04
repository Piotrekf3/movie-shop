import { Component, OnInit } from '@angular/core';
import { Movie } from '../../models/movie';

@Component({
  selector: 'app-shopping-cart',
  templateUrl: './shopping-cart.component.html',
  styleUrls: ['./shopping-cart.component.sass']
})
export class ShoppingCartComponent implements OnInit {

  items: Movie[] = [];

  constructor() { }

  ngOnInit() {
  }

  public addItem(item: Movie) {
    this.items.push(item);
  }

  public removeItem(item: Movie) {
    const index: number = this.items.indexOf(item);
    if (index !== -1) {
        this.items.splice(index, 1);
    } 
  }

}
