import { Time } from "@angular/common";
import { Ciclo } from "./ciclo.model";
import { Usuario } from "./usuario.model";

export class Disponibilidad {

    idDisponibilidad?:number;
    startTime?:Time;
    endTime?:Time;
    day?:string;
    idCycle?:Ciclo;
    idUser?:Usuario;


}
