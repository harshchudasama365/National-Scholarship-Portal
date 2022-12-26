import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegupdateComponent } from './regupdate.component';

describe('RegupdateComponent', () => {
  let component: RegupdateComponent;
  let fixture: ComponentFixture<RegupdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegupdateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegupdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
