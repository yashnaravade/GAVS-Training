import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TemplateStatementComponent } from './template-statement.component';

describe('TemplateStatementComponent', () => {
  let component: TemplateStatementComponent;
  let fixture: ComponentFixture<TemplateStatementComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TemplateStatementComponent]
    });
    fixture = TestBed.createComponent(TemplateStatementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
