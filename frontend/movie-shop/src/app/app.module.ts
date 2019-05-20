import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MoviesListComponent } from './components/movies-list/movies-list.component';
import { HttpClientModule }    from '@angular/common/http';
import { ShoppingCartComponent } from './components/shopping-cart/shopping-cart.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatIconModule} from '@angular/material/icon';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    MoviesListComponent,
    ShoppingCartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgbModule.forRoot(),
    BrowserAnimationsModule,
    MatIconModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
