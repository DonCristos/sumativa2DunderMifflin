import { IEmpleado, NewEmpleado } from './empleado.model';

export const sampleWithRequiredData: IEmpleado = {
  id: 24740,
  nombreEmpleado: 'hence uh-huh',
  apellidoEmpleado: 'courteous',
};

export const sampleWithPartialData: IEmpleado = {
  id: 22837,
  nombreEmpleado: 'same disapprove',
  apellidoEmpleado: 'soybean meanwhile on',
};

export const sampleWithFullData: IEmpleado = {
  id: 18717,
  nombreEmpleado: 'hepatitis incidentally',
  apellidoEmpleado: 'why',
  telefonoEmpleado: 'regarding',
  correoEmpleado: 'offset',
};

export const sampleWithNewData: NewEmpleado = {
  nombreEmpleado: 'certify charter',
  apellidoEmpleado: 'quinoa where',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
