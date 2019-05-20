import { Injectable } from '@angular/core';
import { Movie } from '../models/Movie'
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  
  private moviesUrl = "http://localhost:8080/api/movies"

  constructor(private http: HttpClient) { }

  public getMovies(category: string = null): Observable<Movie[]> {
    if(category !== null && category != 'ANY') {
      const params = new HttpParams()
        .set('category', category);
      return this.http.get<Movie[]>(this.moviesUrl, {params});
    }
    return this.http.get<Movie[]>(this.moviesUrl);
  }
}
