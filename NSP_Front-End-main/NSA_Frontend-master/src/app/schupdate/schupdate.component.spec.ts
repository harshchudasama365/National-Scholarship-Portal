import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SchupdateComponent } from './schupdate.component';

describe('SchupdateComponent', () => {
  let component: SchupdateComponent;
  let fixture: ComponentFixture<SchupdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SchupdateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SchupdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
