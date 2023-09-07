import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerdetailsComponent } from './customerdetails.component';

describe('CustomerdetailsComponent', () => {
  let component: CustomerdetailsComponent;
  let fixture: ComponentFixture<CustomerdetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CustomerdetailsComponent]
    });
    fixture = TestBed.createComponent(CustomerdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
