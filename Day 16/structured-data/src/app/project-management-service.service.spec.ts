import { TestBed } from '@angular/core/testing';

import { ProjectManagementServiceService } from './project-management-service.service';

describe('ProjectManagementServiceService', () => {
  let service: ProjectManagementServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProjectManagementServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
