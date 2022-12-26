import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NodalofficerComponent } from './nodalofficer.component';

describe('NodalofficerComponent', () => {
  let component: NodalofficerComponent;
  let fixture: ComponentFixture<NodalofficerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NodalofficerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NodalofficerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
