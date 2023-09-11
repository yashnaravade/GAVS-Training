import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { empManagementService } from './empmanagementservice';
import { ProjectManagementServiceService } from './project-management-service.service';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [empManagementService,ProjectManagementServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
