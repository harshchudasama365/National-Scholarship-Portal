import { TestBed } from '@angular/core/testing';

import { InstitutionloginService } from './institutionlogin.service';

describe('InstitutionloginService', () => {
  let service: InstitutionloginService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(InstitutionloginService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
