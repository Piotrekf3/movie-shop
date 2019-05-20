import { Component, OnInit, Input } from '@angular/core';
import { MovieService } from '../../services/movie.service';
import { Movie } from '../../models/Movie'
import { ShoppingCartComponent } from '../shopping-cart/shopping-cart.component';

@Component({
  selector: 'app-movies-list',
  templateUrl: './movies-list.component.html',
  styleUrls: ['./movies-list.component.sass']
})
export class MoviesListComponent implements OnInit {

  private categories: string[] = [
    'DRAMA',
    'ACTION',
    'COMEDY',
    'FAMILY',
    'SCI-FI',
  ];

  @Input() shoppingCart: ShoppingCartComponent;

  private moviesList: Movie[];

  constructor(private movieService: MovieService) { }

  ngOnInit() {
    this.movieService.getMovies().subscribe(movies => {
      this.moviesList = movies;
    });
  }

  public addToCart(movie: Movie) {
    this.shoppingCart.addItem(movie);
  }

  public filterMovies(category) {
    this.movieService.getMovies(category).subscribe(movies => {
      this.moviesList = movies;
    });
  }

}
