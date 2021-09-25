import { Component, OnInit } from '@angular/core';
import { Ciclo } from 'src/app/models/ciclo.model';
import { Disponibilidad } from 'src/app/models/disponibilidad.model';
import { Usuario } from 'src/app/models/usuario.model';
import { CicloService } from 'src/app/services/ciclo.service';
import { DisponibilidadService } from 'src/app/services/disponibilidad.service';
import { UsuarioService } from 'src/app/services/usuario.service';

@Component({
  selector: 'app-add-disponibilidad',
  templateUrl: './add-disponibilidad.component.html',
  styleUrls: ['./add-disponibilidad.component.css']
})
export class AddDisponibilidadComponent implements OnInit {

  usuarios: Usuario[] = [];
  ciclos: Ciclo[] = [];
  disponibilidad: Disponibilidad = {
    idCycle:{
      idCiclo:0,
    },
    idUser:{
      idUsuario:0,
    }
  }


  constructor(private usuarioService:UsuarioService,
              private cicloService:CicloService,
              private disponibilidadService:DisponibilidadService) {
                this.usuarioService.listAll().subscribe(
                  (usuarios) => this.usuarios = usuarios
                );
                this.cicloService.listAll().subscribe(
                  (ciclos) => this.ciclos = ciclos
                );
              }

  registerDisponibilidad(){
    console.log(this.disponibilidad)
    this.disponibilidadService.register(this.disponibilidad).subscribe(
      response => {
        console.log(response.mensaje);
        alert(response.mensaje);
      },
      error => {
        console.log(error);
      }
    );
  }

  ngOnInit(): void {
  }

}
