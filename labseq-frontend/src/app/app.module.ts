import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LabseqComponent } from './component/labseq/labseq.component';
import {FormsModule} from "@angular/forms";
import {NgIf} from "@angular/common";
import {HttpClientModule} from "@angular/common/http";
import {MatInputModule} from "@angular/material/input";

@NgModule({
  declarations: [
    AppComponent,
    LabseqComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    NgIf,
    MatInputModule,
    NgIf,
    FormsModule,
    NgIf,
    NgIf
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
