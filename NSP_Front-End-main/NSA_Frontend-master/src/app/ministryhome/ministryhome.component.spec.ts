import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MinistryhomeComponent } from './ministryhome.component';

describe('MinistryhomeComponent', () => {
  let component: MinistryhomeComponent;
  let fixture: ComponentFixture<MinistryhomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MinistryhomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MinistryhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
