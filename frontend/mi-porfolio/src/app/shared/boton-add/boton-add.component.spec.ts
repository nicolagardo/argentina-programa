import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BotonAddComponent } from './boton-add.component';

describe('BotonAddComponent', () => {
  let component: BotonAddComponent;
  let fixture: ComponentFixture<BotonAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BotonAddComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BotonAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
