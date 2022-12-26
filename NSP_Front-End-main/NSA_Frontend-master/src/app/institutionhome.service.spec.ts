import { TestBed } from '@angular/core/testing';

import { InstitutionhomeService } from './institutionhome.service';

describe('InstitutionhomeService', () => {
  let service: InstitutionhomeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(InstitutionhomeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
