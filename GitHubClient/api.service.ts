import {Injectable} from '@angular/core';
import {Headers, Http, Response, RequestOptionsArgs} from "@angular/http";
import {Observable} from "rxjs";


@Injectable()
export class ApiService {


    private headers: Headers = new Headers();
    private requestOptions: RequestOptionsArgs = {};
    private apiServer: string = "https://api.github.com";

    constructor(private http: Http) {

        this.headers.set("Content-Type", "application/json");


        this.requestOptions.headers = this.headers;


    }


    getHeaders(): Headers {

        return this.headers;
    }

    setHeader(key: string, value: string) {

        this.headers.set(key, value);
    }

    removeHeader(key: string) {

        this.headers.delete(key);
    }

    get(endPoint: string, options?: RequestOptionsArgs): Observable<Response> {
        return this.http.get(this.createUrl(endPoint), this.getRequestOptions(options));
    }


