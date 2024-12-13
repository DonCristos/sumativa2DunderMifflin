import { IDepartamento, NewDepartamento } from './departamento.model';

export const sampleWithRequiredData: IDepartamento = {
  id: 10734,
  nombreDepartamento: 'and utter',
};

export const sampleWithPartialData: IDepartamento = {
  id: 22264,
  nombreDepartamento: 'tidy rarely',
  presupuestoDepartamento: 8314.57,
};

export const sampleWithFullData: IDepartamento = {
  id: 32083,
  nombreDepartamento: 'uh-huh',
  ubicacionDepartamento: 'toward forage',
  presupuestoDepartamento: 20761.37,
};

export const sampleWithNewData: NewDepartamento = {
  nombreDepartamento: 'bathhouse till',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
