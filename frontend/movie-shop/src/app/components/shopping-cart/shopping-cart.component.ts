import { Component, OnInit } from '@angular/core';
import { Movie } from '../../models/movie';
import { CurrencyService } from '../../services/currency.service'

@Component({
  selector: 'app-shopping-cart',
  templateUrl: './shopping-cart.component.html',
  styleUrls: ['./shopping-cart.component.sass']
})
export class ShoppingCartComponent implements OnInit {

  private items: Movie[] = [];
  private sumPricePln: number = 0;
  private sumPriceEur: number = 0;
  private plnToEur: number = 1;

  constructor(private currencyService: CurrencyService) { }

  ngOnInit() {
    this.currencyService.getCurrencies().subscribe(currencies => {
      this.plnToEur = currencies.plnToEur;
    });
  }

  public addItem(item: Movie) {
    this.items.push(item);
    this.sumPricePln += item.price;
    this.calculateEurPrice();
  }

  public removeItem(item: Movie) {
    const index: number = this.items.indexOf(item);
    if (index !== -1) {
        this.items.splice(index, 1);
        this.sumPricePln -= item.price;
        this.calculateEurPrice();
    } 
  }

  private calculateEurPrice() {
    this.sumPriceEur = this.sumPricePln * this.plnToEur;
  }

}
