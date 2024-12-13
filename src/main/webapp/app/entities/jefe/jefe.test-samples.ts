import { IJefe, NewJefe } from './jefe.model';

export const sampleWithRequiredData: IJefe = {
  id: 10961,
  nombreJefe: 'flowery',
  telefonoJefe: 'whereas blah',
};

export const sampleWithPartialData: IJefe = {
  id: 18610,
  nombreJefe: 'stained competent outlandish',
  telefonoJefe: 'or',
};

export const sampleWithFullData: IJefe = {
  id: 22385,
  nombreJefe: 'blaspheme',
  telefonoJefe: 'deck',
};

export const sampleWithNewData: NewJefe = {
  nombreJefe: 'grass',
  telefonoJefe: 'marten',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
