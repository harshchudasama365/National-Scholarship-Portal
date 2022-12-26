import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InstitutefinalapprovalComponent } from './institutefinalapproval.component';

describe('InstitutefinalapprovalComponent', () => {
  let component: InstitutefinalapprovalComponent;
  let fixture: ComponentFixture<InstitutefinalapprovalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InstitutefinalapprovalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InstitutefinalapprovalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
