public class EstanteP{
    public void Libros(){
        Biblio libpres = new Biblio();
        LibWE WE = new LibWE("Wigetta: un viaje magico","Autores: Vegetta777, Willyrex",0,3,"Tiene existencia");
        LibLDC ladivina = new LibLDC("Divina comedia","Autor: Dante Alighieri",1,0,"Tiene existencia");

        WE.mostrarLibWiVe();
        ladivina.mostrarLibLaDivCo();
        libpres.LibPres();
    }
}