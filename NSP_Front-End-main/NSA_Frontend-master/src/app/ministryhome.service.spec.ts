import { TestBed } from '@angular/core/testing';

import { MinistryhomeService } from './ministryhome.service';

describe('MinistryhomeService', () => {
  let service: MinistryhomeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MinistryhomeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
