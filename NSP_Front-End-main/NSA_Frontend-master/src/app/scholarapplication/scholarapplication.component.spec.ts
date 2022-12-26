import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ScholarapplicationComponent } from './scholarapplication.component';

describe('ScholarapplicationComponent', () => {
  let component: ScholarapplicationComponent;
  let fixture: ComponentFixture<ScholarapplicationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ScholarapplicationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ScholarapplicationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
