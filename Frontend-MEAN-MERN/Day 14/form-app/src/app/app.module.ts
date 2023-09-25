import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerdetailsComponent } from './customerdetails/customerdetails.component';

@NgModule({
  declarations: [
    AppComponent,
    CustomerdetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [
    CustomerdetailsComponent,AppComponent]
})
export class AppModule { }
