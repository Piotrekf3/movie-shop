import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Currency } from '../models/currency'
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CurrencyService {

  private currenciesUrl = "http://localhost:8080/api/currencies"

  constructor(private http: HttpClient) { }

  public getCurrencies(): Observable<Currency> {
    return this.http.get<Currency>(this.currenciesUrl);
  }
}
