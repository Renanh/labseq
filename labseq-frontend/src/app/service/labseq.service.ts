import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class LabseqService {
  private readonly apiPath: string;

  constructor(private http: HttpClient) {
    this.apiPath = 'http://localhost:8080/api/v1/labseq';
  }

  getValue(n: number): Observable<number> {
    const url: string = `${this.apiPath}/${n}`;
    return this.http.get<number>(url);
  }
}
