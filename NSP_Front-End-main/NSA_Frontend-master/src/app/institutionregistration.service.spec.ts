import { TestBed } from '@angular/core/testing';

import { InstitutionregistrationService } from './institutionregistration.service';

describe('InstitutionregistrationService', () => {
  let service: InstitutionregistrationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(InstitutionregistrationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
