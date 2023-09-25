import { Component } from '@angular/core';
import { TranslateService } from '@ngx-translate/core';

@Component({
  selector: 'app-root',
  template: `
    <h1>{{ 'GREETING' | translate }}</h1>
    <button (click)="switchLanguage('en')">English</button>
    <button (click)="switchLanguage('fr')">French</button>
  `,
})
export class AppComponent {
  constructor(private translate: TranslateService) {
    translate.setDefaultLang('en'); // Default language
  }

  switchLanguage(language: string) {
    this.translate.use(language);
    console.log(`Switching to language: ${language}`);
  }
}
