/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thebountyhunter;

import com.mycompany.thebountyhunter.Rooms.Armeria;
import com.mycompany.thebountyhunter.Rooms.Incrocio;
import com.mycompany.thebountyhunter.Rooms.NotteCasa;
import com.mycompany.thebountyhunter.Rooms.Saloon;
import com.mycompany.thebountyhunter.Rooms.EntrataSaloon;
import com.mycompany.thebountyhunter.Rooms.FuoriSaloon;
import com.mycompany.thebountyhunter.Rooms.CasaArthur;
import com.mycompany.thebountyhunter.Rooms.EntrataArmeria;
import com.mycompany.thebountyhunter.Rooms.ScenaMessaggio;
import com.mycompany.thebountyhunter.Rooms.ScenaRum;
import com.mycompany.thebountyhunter.Rooms.TragittoCasa;
import com.mycompany.thebountyhunter.Rooms.ScenaNotte;
import com.mycompany.thebountyhunter.Rooms.GiornoCasa;
import com.mycompany.thebountyhunter.Rooms.StradaCasa;
import com.mycompany.thebountyhunter.Rooms.EntrataMarket;
import com.mycompany.thebountyhunter.Rooms.MenuUscita;
import com.mycompany.thebountyhunter.Rooms.Posta;
import static com.mycompany.thebountyhunter.ProjectGameDescription.getRooms;
import static com.mycompany.thebountyhunter.ProjectGameDescription.getSavedRoom;
import static com.mycompany.thebountyhunter.ProjectGameDescription.rooms;
import com.mycompany.thebountyhunter.Rooms.CatalogoArmeria;
import com.mycompany.thebountyhunter.Rooms.CatalogoMarket;
import com.mycompany.thebountyhunter.Rooms.Intro;
import com.mycompany.thebountyhunter.Rooms.InventoryForm;
import com.mycompany.thebountyhunter.Rooms.Market;
import com.mycompany.thebountyhunter.Rooms.MorteBandito;
import com.mycompany.thebountyhunter.Rooms.SceltaRevolver;
import com.mycompany.thebountyhunter.Rooms.ScenaBandito;
import com.mycompany.thebountyhunter.Rooms.ScenaLettera;
import com.mycompany.thebountyhunter.Rooms.Sentiero;
import com.mycompany.thebountyhunter.Rooms.UscitaSD;
import com.mycompany.thebountyhunter.Rooms.Fortino;
import com.mycompany.thebountyhunter.Rooms.ScenaCecchino;
import com.mycompany.thebountyhunter.Rooms.ScenaMorto2;
import com.mycompany.thebountyhunter.Rooms.CasaBronte;
import com.mycompany.thebountyhunter.Rooms.ScenaGuardie;
import com.mycompany.thebountyhunter.Rooms.SceltaUccisione;
import com.mycompany.thebountyhunter.Rooms.EntrataBronte;
import com.mycompany.thebountyhunter.Rooms.Salone;
import com.mycompany.thebountyhunter.Rooms.SalaRiunioni;
import com.mycompany.thebountyhunter.Rooms.Scalinata;
import com.mycompany.thebountyhunter.Rooms.ScenaBronte;
import com.mycompany.thebountyhunter.Rooms.MorteBronte;
import com.mycompany.thebountyhunter.Rooms.ScenaMorto;
import com.mycompany.thebountyhunter.Rooms.Finale;
import javax.swing.JFrame;



public class Game {

    public static Room intro, sceltarevolver, saloon, scenamessaggio, entratasaloon, scenarum, fuorisaloon, tragittocasa,
            nottecasa, casaarthur, scenanotte, giornocasa, stradacasa, entratamarket,
            posta, incrocio, entrataarmeria, armeria, market, scenabandito,
            mortebandito, scenalettera, sentiero, uscitasd, fortino, scenacecchino, scenamorto2, finale,
            scenaguardie, sceltauccisione, casabronte, entratabronte, salone, salariunioni, scalinata, scenabronte, mortebronte, scenamorto;

    private static Progresso dp = Accesso.p;

    public static JFrame inventory = new InventoryForm();
    private static JFrame menu = new MenuUscita(dp);
    private static JFrame catalogom = new CatalogoMarket();
    private static JFrame catalogoa = new CatalogoArmeria();

    public static void main() {
        ProjectGameDescription.getMenu().setMenuForm(menu);
        ProjectGameDescription.getInventory().setInventoryform(inventory);
        ProjectGameDescription.getCatalogoM().setCatalogoForm(catalogom);
        ProjectGameDescription.getCatalogoA().setCatalogoForm(catalogoa);

        //instanziare le room , riempire la lista e definire il percorso
        intro = new Room(0, (JFrame) new Intro(), "/images/intro.jpg", "Introduzione gioco", (new Intro()).sfondo);
        sceltarevolver = new Room(1, (JFrame) new SceltaRevolver(), "/images/scelta.png", "Scelta revolver", (new SceltaRevolver()).sfondo);
        saloon = new Room(2, (JFrame) new Saloon(), "/images/Room0.jpg", "Saloon Saint Denis", (new Saloon()).sfondo);
        entratasaloon = new Room(3, (JFrame) new EntrataSaloon(), "/images/Room1.jpg", "Entrata saloon", (new EntrataSaloon()).sfondo);
        scenarum = new Room(4, (JFrame) new ScenaRum(), "/images/bere_rum.jpg", "bottiglia di rum", (new ScenaRum()).sfondo);
        fuorisaloon = new Room(5, (JFrame) new FuoriSaloon(), "/images/Room2.jpg", "uscita saloon", (new FuoriSaloon()).sfondo);
        tragittocasa = new Room(6, (JFrame) new TragittoCasa(), "/images/tragittoCasa.png", "Ritorno a casa", (new TragittoCasa()).sfondo);
        nottecasa = new Room(7, (JFrame) new NotteCasa(), "/images/entrataretro.jpg", "Facciata casa Arthur", (new NotteCasa()).facciatacasa);
        casaarthur = new Room(8, (JFrame) new CasaArthur(), "/images/casa.png", "Casa Arthur", (new CasaArthur()).sfondo);
        scenanotte = new Room(9, (JFrame) new ScenaNotte(), "/images/notte.png", "Notte", (new ScenaNotte()).Sfondo_notte);
        scenamessaggio = new Room(10, (JFrame) new ScenaMessaggio(), "/images/lettura.jpg", "messaggio", (new ScenaMessaggio()).sfondo);
        giornocasa = new Room(11, (JFrame) new GiornoCasa(), "/images/entrata.png", "Uscita casa", (new GiornoCasa()).sfondo);
        stradacasa = new Room(12, (JFrame) new StradaCasa(), "/images/Strada_casa.jpg", "Orleans St.", (new StradaCasa()).sfondo);
        entratamarket = new Room(13, (JFrame) new EntrataMarket(), "/images/entratamarket.jpg", "Entrata Market Saint Denis", (new EntrataMarket()).sfondo);
        market = new Room(14, (JFrame) new Market(), "/images/Market.jpg", "Market Saint Denis", (new Market()).sfondo);
        incrocio = new Room(15, (JFrame) new Incrocio(), "/images/bivio.jpg", "Main St. Saint Denis", (new Incrocio()).sfondo);
        entrataarmeria = new Room(16, (JFrame) new EntrataArmeria(), "/images/armeriaentrata.jpg", "Entrata Gunsmith", (new EntrataArmeria()).sfondo);
        armeria = new Room(17, (JFrame) new Armeria(), "/images/armeria.jpg", "Gunsmith", (new Armeria()).sfondo);
        scenabandito = new Room(18, (JFrame) new ScenaBandito(), "/images/scenabandito1.png", "Scena bandito", (new ScenaBandito()).sfondo);
        mortebandito = new Room(19, (JFrame) new MorteBandito(), "/images/mortebandito.png", "Morte bandito", (new MorteBandito()).sfondo);
        posta = new Room(20, (JFrame) new Posta(), "/images/mail.jpg", "Posta Saint Denis", (new Posta()).sfondo);
        scenalettera = new Room(21, (JFrame) new ScenaLettera(), "/images/lettura2.jpg", "lettura lettera", (new ScenaLettera()).sfondo);
        uscitasd = new Room(22, (JFrame) new UscitaSD(), "/images/uscitaSDenis.png", "Uscita Saint Denis", (new UscitaSD()).sfondo);
        sentiero = new Room(23, (JFrame) new Sentiero(), "/images/sentiero.png", "Sentiero Caliga Hall", (new Sentiero()).sfondo);
        scenaguardie = new Room(24, (JFrame) new ScenaGuardie(), "/images/guardie.png", "Scena Guardie", (new ScenaGuardie()).sfondo);
        sceltauccisione = new Room(25, (JFrame) new SceltaUccisione(), "/images/scelta.png", "Scelta Uccisione", (new SceltaUccisione()).sfondo);
        casabronte = new Room(26, (JFrame) new CasaBronte(), "/images/casabronte.jpg", "Casa di Bronte", (new CasaBronte()).sfondo);
        entratabronte = new Room(27, (JFrame) new EntrataBronte(), "/images/entratabronte.jpg", "Entrata Casa Bronte", (new Sentiero()).sfondo);
        salone = new Room(28, (JFrame) new Salone(), "/images/salone.png", "Salone Casa di Bronte", (new Salone()).sfondo);
        salariunioni = new Room(29, (JFrame) new SalaRiunioni(), "/images/salariunioni.png", "Sala Riunioni Casa di Bronte", (new SalaRiunioni()).sfondo);
        scalinata = new Room(30, (JFrame) new Scalinata(), "/images/scalinata.png", "Scalinata Casa di Bronte", (new Scalinata()).sfondo);
        scenabronte = new Room(31, (JFrame) new ScenaBronte(), "/images/scenabronte.jpg", "Scena Bronte", (new ScenaBronte()).sfondo);
        mortebronte = new Room(32, (JFrame) new MorteBronte(), "/images/mortebronte.jpg", "Morte Bronte", (new MorteBronte()).sfondo);
        scenamorto = new Room(33, (JFrame) new ScenaMorto(), "/images/scenamorto.jpg", "Scena Bronte morto", (new ScenaMorto()).sfondo);
        fortino = new Room(34, (JFrame) new Fortino(), "/images/fortino.jpg", "Fortino Bronte", (new Fortino()).sfondo);
        scenacecchino = new Room(35, (JFrame) new ScenaCecchino(), "/images/scenacecchino.jpg", "Scena cecchino Bronte", (new ScenaCecchino()).sfondo);
        scenamorto2 = new Room(36, (JFrame) new ScenaMorto2(), "/images/bronte.jpg", "Morte Bronte con cecchino", (new ScenaMorto2()).sfondo);
        finale = new Room(37, (JFrame) new Finale(), "/images/Finale.jpg", "FINE GIOCO", (new Finale()).sfondo);
        getRooms().add(intro);
        getRooms().add(sceltarevolver);
        getRooms().add(saloon);
        getRooms().add(entratasaloon);
        getRooms().add(scenarum);
        getRooms().add(fuorisaloon);
        getRooms().add(tragittocasa);
        getRooms().add(nottecasa);
        getRooms().add(casaarthur);
        getRooms().add(scenanotte);
        getRooms().add(scenamessaggio);
        getRooms().add(giornocasa);
        getRooms().add(stradacasa);
        getRooms().add(entratamarket);
        getRooms().add(market);
        getRooms().add(incrocio);
        getRooms().add(entrataarmeria);
        getRooms().add(armeria);
        getRooms().add(posta);
        getRooms().add(scenabandito);
        getRooms().add(mortebandito);
        getRooms().add(scenalettera);
        getRooms().add(uscitasd);
        getRooms().add(sentiero);
        getRooms().add(scenaguardie);
        getRooms().add(sceltauccisione);
        getRooms().add(casabronte);
        getRooms().add(entratabronte);
        getRooms().add(salone);
        getRooms().add(salariunioni);
        getRooms().add(scalinata);
        getRooms().add(scenabronte);
        getRooms().add(mortebronte);
        getRooms().add(scenamorto);
        getRooms().add(fortino);
        getRooms().add(scenacecchino);
        getRooms().add(scenamorto2);
        getRooms().add(finale);
        intro.setScene(sceltarevolver);
        sceltarevolver.setScene(saloon);
        saloon.setSouth(entratasaloon);
        entratasaloon.setScene(scenarum);
        scenarum.setRoom(entratasaloon);
        entratasaloon.setNorth(fuorisaloon);
        fuorisaloon.setScene(tragittocasa);
        tragittocasa.setNorth(nottecasa);
        nottecasa.setNorth(casaarthur);
        casaarthur.setScene(scenanotte);
        scenanotte.setScene(scenamessaggio);
        scenamessaggio.setRoom(casaarthur);
        casaarthur.setSouth(giornocasa);
        giornocasa.setSouth(stradacasa);
        stradacasa.setEast(entratamarket);
        entratamarket.setNorth(market);
        market.setSouth(entratamarket);
        entratamarket.setWest(stradacasa);
        stradacasa.setNorth(incrocio);
        stradacasa.setWest(uscitasd);
        incrocio.setScene(scenabandito);
        scenabandito.setScene(mortebandito);
        mortebandito.setNorth(posta);
        posta.setSouth(incrocio);
        posta.setScene(scenalettera);
        scenalettera.setRoom(incrocio);
        entrataarmeria.setNorth(armeria);
        entrataarmeria.setWest(incrocio);
        armeria.setSouth(entrataarmeria);
        incrocio.setNorth(posta);
        incrocio.setEast(entrataarmeria);
        incrocio.setSouth(stradacasa);
        uscitasd.setWest(sentiero);
        sentiero.setWest(scenaguardie);
        scenaguardie.setScene(sceltauccisione);
        sceltauccisione.setScene(fortino);
        sceltauccisione.setRoom(casabronte);
        casabronte.setNorth(entratabronte);
        entratabronte.setRoom(salone);
        salone.setEast(salariunioni);
        salariunioni.setWest(salone);
        salone.setWest(scalinata);
        scalinata.setEast(salone);
        scalinata.setScene(scenabronte);
        scenabronte.setScene(mortebronte);
        mortebronte.setScene(scenamorto);
        scenamorto.setScene(finale);
        fortino.setScene(scenacecchino);
        scenacecchino.setScene(scenamorto2);
        scenamorto2.setScene(finale);

        getSavedRoom(rooms,
                p -> p.getId() == Accesso.p.getRoom()
        );

    }
}
