package plantenApp;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import plantenApp.java.dao.*;
import plantenApp.java.model.*;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControllerPlantToevoegen {
    public Slider slBezonning;
    public Slider slVoedingsbehoefte;
    public Slider slVochtbehoefte;
    public ComboBox cbReactieAnta;
    private ComboBox<String> cbGrondsoort;
    public ComboBox cbHabitat;
    public Button btnHabitat;
    public ListView<String> lvHabitat;
    public Label VoedingbehoefteValue;
    public Label VochtbehoefteValue;
    public Label Bezonningvalue;
    public ComboBox<String> cboTypeTv;
    public TextField txtFamilieTv;
    public TextField txtGeslachtTv;
    public TextField txtSoortTv;
    public TextField txtVariantTv;
    public TextField txtDichtheidXTv;
    public TextField txtDichtheidYTv;
    public ComboBox<String> cbBezonningTv;
    public Label BezonningvalueTv;
    public ComboBox<String> cbVoedingsbehoefteTv;
    public Label VoedingbehoefteValueTv;
    public ComboBox<String> cbVochtbehoefteTv;
    public Label VochtbehoefteValueTv;
    public ComboBox<String> cbReactieAntaTv;
    public ComboBox<String> cbGrondsoortTv;
    public ComboBox<String> cbHabitatTv;
    public Button btnHabitatTv;
    public ListView lvHabitatTv;
    public ComboBox<String> cbOntwikkelingssnelheidTv;
    public CheckBox chkSociabiliteit1Tv;
    public CheckBox chkSociabiliteit2Tv;
    public CheckBox chkSociabiliteit3Tv;
    public CheckBox chkSociabiliteit4Tv;
    public CheckBox chkSociabiliteit5Tv;
    public RadioButton rbStrategieUnknownTv;
    public RadioButton rbStrategieTopTv;
    public RadioButton rbStrategieLMTv;
    public RadioButton rbStrategieMMTv;
    public RadioButton rbStrategieRMTv;
    public RadioButton rbStrategieLOTv;
    public RadioButton rbStrategieMOTv;
    public RadioButton rbStrategieROTv;
    public ComboBox<String> cbLevensduurTv;
    public Button btnLevensduurTv;
    public ListView<String> lvLevensduurTv;
    public Slider slNectarwaardeTv;
    public Label NectarwaardeValueTv;
    public Slider slPollenwaardeTv;
    public Label PollenValueTv;
    public RadioButton rbBijvriendelijkNullTv;
    public RadioButton rbBijvriendelijkJaTv;
    public RadioButton rbBijvriendelijkNeeTv;
    public RadioButton rbVlindervriendelijkNullTv;
    public RadioButton rbVlindervriendelijkJaTv;
    public RadioButton rbVlindervriendelijkNeeTv;
    public RadioButton rbEetbaarNullTv;
    public RadioButton rbEetbaarJaTv;
    public RadioButton rbEetbaarNeeTv;
    public RadioButton rbKruidgebruikNullTv;
    public RadioButton rbKruidgebruikJaTv;
    public RadioButton rbKruidgebruikNeeTv;
    public RadioButton rbGeurendNullTv;
    public RadioButton rbGeurendJaTv;
    public RadioButton rbGeurendNeeTv;
    public RadioButton rbVorstgevoeligNullTv;
    public RadioButton rbVorstgevoeligJaTv;
    public RadioButton rbVorstgevoeligNeeTv;
    public ComboBox<String> cbBladgrootteTotTv;
    public ComboBox<String> cbBladvormTv;
    public ComboBox<String> cbRatioTv;
    public ComboBox<String> cbSpruitfenologieTv;
    public RadioButton rbHydro1Tv;
    public RadioButton rbHydro2Tv;
    public RadioButton rbHeloTv;
    public RadioButton rbCrypto1Tv;
    public RadioButton rbCrypto2Tv;
    public RadioButton rbHemikryptoTv;
    public RadioButton rbChamae1Tv;
    public RadioButton rbChamae2Tv;
    public RadioButton rbFaneroTv;
    public Spinner spinMaxBladhJanTv;
    public Spinner spinMaxBladhFebTv;
    public Spinner spinMaxBladhMaaTv;
    public Spinner spinMaxBladhAprTv;
    public Spinner spinMaxBladhMeiTv;
    public Spinner spinMaxBladhJunTv;
    public Spinner spinMaxBladhJulTv;
    public Spinner spinMaxBladhAugTv;
    public Spinner spinMaxBladhSeptTv;
    public Spinner spinMaxBladhOktTv;
    public Spinner spinMaxBladhNovTv;
    public Spinner spinMaxBladhDecTv;
    public ComboBox<String> cbBladkleurJanTv;
    public ComboBox<String> cbBladkleurFebTv;
    public ComboBox<String> cbBladkleurMaaTv;
    public ComboBox<String> cbBladkleurAprTv;
    public ComboBox<String> cbBladkleurMeiTv;
    public ComboBox<String> cbBladkleurJunTv;
    public ComboBox<String> cbBladkleurJulTv;
    public ComboBox<String> cbBladkleurAugTv;
    public ComboBox<String> cbBladkleurSeptTv;
    public ComboBox<String> cbBladkleurOktTv;
    public ComboBox<String> cbBladkleurNovTv;
    public ComboBox<String> cbBladkleurDecTv;
    public Spinner spinMinBloeihJanTv;
    public Spinner spinMinBloeihFebTv;
    public Spinner spinMinBloeihMaaTv;
    public Spinner spinMinBloeihAprTv;
    public Spinner spinMinBloeihMeiTv;
    public Spinner spinMinBloeihJunTv;
    public Spinner spinMinBloeihJulTv;
    public Spinner spinMinBloeihAugTv;
    public Spinner spinMinBloeihSeptTv;
    public Spinner spinMinBloeihOktTv;
    public Spinner spinMinBloeihNovTv;
    public Spinner spinMinBloeihDecTv;
    public Spinner spinMaxBloeihJanTv;
    public Spinner spinMaxBloeihFebTv;
    public Spinner spinMaxBloeihMaaTv;
    public Spinner spinMaxBloeihAprTv;
    public Spinner spinMaxBloeihMeiTv;
    public Spinner spinMaxBloeihJunTv;
    public Spinner spinMaxBloeihJulTv;
    public Spinner spinMaxBloeihAugTv;
    public Spinner spinMaxBloeihSeptTv;
    public Spinner spinMaxBloeihOktTv;
    public Spinner spinMaxBloeihNovTv;
    public Spinner spinMaxBloeihDecTv;
    public ComboBox<String> cbBloeikleurJanTv;
    public ComboBox<String> cbBloeikleurFebTv;
    public ComboBox<String> cbBloeikleurMaaTv;
    public ComboBox<String> cbBloeikleurAprTv;
    public ComboBox<String> cbBloeikleurMeiTv;
    public ComboBox<String> cbBloeikleurJunTv;
    public ComboBox<String> cbBloeikleurJulTv;
    public ComboBox<String> cbBloeikleurAugTv;
    public ComboBox<String> cbBloeikleurSeptTv;
    public ComboBox<String> cbBloeikleurNovTv;
    public ComboBox<String> cbBloeikleurOktTv;
    public ComboBox<String> cbBloeikleurDecTv;
    public RadioButton rbTuftedTv;
    public RadioButton rbUprightarchingTv;
    public RadioButton rbArchingTv;
    public RadioButton rbUprightDivergentTv;
    public RadioButton rbUprightErectTv;
    public RadioButton rbMountedTv;
    public RadioButton rbKOfHGOfMTv;
    public RadioButton rbRondOfWaaiervormigTv;
    public RadioButton rbKussenvormendTv;
    public RadioButton rbZuilvormigTv;
    public RadioButton rbUitbuigendTv;
    public RadioButton rbWortelrozetplantTv;
    public RadioButton rbSucculentenTv;
    public RadioButton rbPollenvormersTv;
    public RadioButton rbParasolvormigTv;
    public RadioButton rbAarTv;
    public RadioButton rbBredePluimTv;
    public RadioButton rbEtageTv;
    public RadioButton rbBolOfKnopTv;
    public RadioButton rbMargrietachtigTv;
    public RadioButton rbSchotelTv;
    public RadioButton rbSchermTv;
    public RadioButton rbSmallePluimTv;
    public Button PLantToevoegenButtonTv;
    public Button TerugButtonTv;
    public VBox levensvormKeuzeTv;
    public ToggleGroup bloeiwijzegroepTv;
    public ToggleGroup habitusgroepTv;
    public ToggleGroup lvTv;
    private Connection dbConnection;
    private AbiotischeFactorenDAO abiotischeFactorenDAO;
    private int plantid;
    private ArrayList<Beheerdaad_Eigenschap> beheerdaad_eigenschaps = new ArrayList<>();
    private static ArrayList<Plant> plantss = new ArrayList<>();
    private static ArrayList<AbiotischeFactoren> abiotischeFactorenn = new ArrayList<>();
    private static ArrayList<AbioMulti_Eigenschap> abiotischmulti = new ArrayList<>();
    private static ArrayList<Commensalisme> commensalismes = new ArrayList<>();
    private static ArrayList<CommMulti_Eigenschap> commMulti_eigenschapss = new ArrayList<>();
    private static ArrayList<Extra> extrass = new ArrayList<>();
    private static ArrayList<FenoMulti_Eigenschap> fenoMulti_eigenschapss = new ArrayList<>();
    private static ArrayList<Fenotype> fenotypess = new ArrayList<>();
    public static ArrayList<Foto> fotoss = new ArrayList<>();
    private static ArrayList<Beheer> beheerss = new ArrayList<>();
    private static ArrayList<Beheerdaad_Eigenschap> beheerdaad_eigenschapss = new ArrayList<>();
    private static ArrayList<Integer> AantalPerElCommMulti = new ArrayList<>();
    private static ArrayList<Integer> AantalPerElAbMulti = new ArrayList<>();
    private static ArrayList<Integer> AantalPerElBehMulti = new ArrayList<>();
    private String scherm;
    private String sPlanttype = "", sFamilie = "", sGeslacht = "", sSoort = "", sVariant = "", sFgsv = "";
    private int iGebruikerID;
    //Moet meegekregen worden van login
    private String sEmailadres;

    /**
     * @author: Arne Vandenborre
     * Wout is helemaal NIET veranderd
     * Kasper eeft MEERDERE vriendinnen dit kan dus helemaal NIET
     * Kevin doet zich voor als een 90's kid klopt NIET
     * Mathias valt NIET  op
     * mvg
     * Arne xx    <3 *
     */
    public void initialize() throws Exception {
        //connectie met database maken
        dbConnection = Database.getInstance().getConnection();

        // enkele defaults klaarzetten
        Pollenwaarde();
        DefaultRadioButtons();
        //infotabel object aanmaken*/
        InfoTablesDAO infotablesDAO = new InfoTablesDAO(dbConnection);
        InfoTables infoTables = infotablesDAO.getInfoTables();
        /*comboboxes vullen*/
        FillComboboxes(infoTables);

        //Opvullen van emailadres om mee te geven met toevoegen plant
        sEmailadres = "kurt.engelbrecht@vives.be";
    }

    //initialiseren van de sliders
    public void Pollenwaarde() throws Exception {
        try {
            //Aanmaken sliders nectar en pollenwaarde
            slNectarwaardeTv.setMax(5);
            slPollenwaardeTv.setMax(5);
            //Aanpassen nectar en pollenwaarde
            PollenValueTv.textProperty().bind(
                    Bindings.format(
                            "%.0f",
                            slPollenwaardeTv.valueProperty()
                    )
            );
            NectarwaardeValueTv.textProperty().bind(
                    Bindings.format(
                            "%.0f",
                            slNectarwaardeTv.valueProperty()
                    )
            );
        } catch (Exception ex) {
            ShowError("Pollenwaarde invoegen", "Er is een probleem opgetreden bij het toevoegen van de pollenwaarde.");
            System.out.println(ex);
            throw new Exception();
        }
    }

    //default radio buttons selecteren
    public void DefaultRadioButtons() {
        rbStrategieUnknownTv.setSelected(true);
        rbBijvriendelijkNullTv.setSelected(true);
        rbVlindervriendelijkNullTv.setSelected(true);
        rbEetbaarNullTv.setSelected(true);
        rbKruidgebruikNullTv.setSelected(true);
        rbGeurendNullTv.setSelected(true);
        rbVorstgevoeligNullTv.setSelected(true);
    }

    //dit is een functie zodat alle comboboxes ingevuld worden
    public void FillComboboxes(InfoTables infotables) throws Exception {
        try {
            //type
            System.out.println(infotables.getPlantTypes().toString());
            cboTypeTv.getItems().addAll(infotables.getPlantTypes());
            cboTypeTv.getSelectionModel().select(0);

            //Bezonning
            cbBezonningTv.getItems().addAll(infotables.getBezonningsMogelijkheden());

            //Voedingsbehoefte
            cbVoedingsbehoefteTv.getItems().addAll(infotables.getVoedingsbehoeftes());

            //Vochtbehoefte
            cbVochtbehoefteTv.getItems().addAll(infotables.getVochtbehoeftes());

            //bladgrootte
            cbBladgrootteTotTv.getItems().addAll(infotables.getBladgroottes());
            //bladvorm
            cbBladvormTv.getItems().addAll(infotables.getBladvormen());
            //Grondsoort
            cbGrondsoortTv.getItems().addAll(infotables.getGrondsoorten());

            //BehandelingMaand
            //cboMaand.getItems().addAll("Januari", "februari", "maart", "april", "mei", "juni", "juli","augustus","september", "oktober", "november", "december");
            //ratio
            cbRatioTv.getItems().addAll(infotables.getBloeiBladRatios());
            //spruitfenologie
            cbSpruitfenologieTv.getItems().addAll(infotables.getSpruitfenologieen());
            //reactie antagonistische omgeving
            cbReactieAntaTv.getItems().addAll(infotables.getAntagonistischeOmgevingsReacties());
            //behandeling

            //Kleuren
            //Jan
            cbBladkleurJanTv.getItems().addAll(infotables.getKleuren());
            cbBloeikleurJanTv.getItems().addAll(infotables.getKleuren());
            //Feb
            cbBladkleurFebTv.getItems().addAll(infotables.getKleuren());
            cbBloeikleurFebTv.getItems().addAll(infotables.getKleuren());
            //Maart
            cbBladkleurMaaTv.getItems().addAll(infotables.getKleuren());
            cbBloeikleurMaaTv.getItems().addAll(infotables.getKleuren());
            //April
            cbBladkleurAprTv.getItems().addAll(infotables.getKleuren());
            cbBloeikleurAprTv.getItems().addAll(infotables.getKleuren());
            //Mei
            cbBladkleurMeiTv.getItems().addAll(infotables.getKleuren());
            cbBloeikleurMeiTv.getItems().addAll(infotables.getKleuren());
            //Juni
            cbBladkleurJunTv.getItems().addAll(infotables.getKleuren());
            cbBloeikleurJunTv.getItems().addAll(infotables.getKleuren());
            //Juli
            cbBladkleurJulTv.getItems().addAll(infotables.getKleuren());
            cbBloeikleurJulTv.getItems().addAll(infotables.getKleuren());
            //Augustus
            cbBladkleurAugTv.getItems().addAll(infotables.getKleuren());
            cbBloeikleurAugTv.getItems().addAll(infotables.getKleuren());
            //September
            cbBladkleurSeptTv.getItems().addAll(infotables.getKleuren());
            cbBloeikleurSeptTv.getItems().addAll(infotables.getKleuren());
            //Oktober
            cbBladkleurOktTv.getItems().addAll(infotables.getKleuren());
            cbBloeikleurOktTv.getItems().addAll(infotables.getKleuren());
            //November
            cbBladkleurNovTv.getItems().addAll(infotables.getKleuren());
            cbBloeikleurNovTv.getItems().addAll(infotables.getKleuren());
            //November
            cbBladkleurDecTv.getItems().addAll(infotables.getKleuren());
            cbBloeikleurDecTv.getItems().addAll(infotables.getKleuren());

            //Habitat
            cbHabitatTv.getItems().addAll(infotables.getHabitats());

            //Ontwikkelingssnelheid
            cbOntwikkelingssnelheidTv.getItems().addAll(infotables.getOnstwikkelingssnelheden());

            //Levensduur
            cbLevensduurTv.getItems().addAll(infotables.getConcurentiekrachten());
        } catch (Exception ex) {
            ShowError("Opvullen comboboxen", "Het opvullen van de comboboxen is niet voltooid.");
            System.out.println(ex);
            throw new Exception();
        }

    }

    //als er op planttoevoegen geclicked wordt dan worden alle gegevens in verschillende arrays gestoken
    // op het einde wordt het beheer scherm geopend
    public void Clicked_PlantToevoegen(MouseEvent mouseEvent) throws Exception {


        //alle data doorsturen naar beheer, alle mogelijke errors hier worden in de methodes zelf opgevangen.
        createplant();//ik //done
        createNaam();
        createAbiotischefactoren();//afgewerkt //done
        createAbiotischeMulti();//Mathias //done
        createfenotype();//afgewerkt // done*/
        createfenotypemulti();//Wout // done
        createCommensalisme();//Kasper //done
        createCommensalismeMulti();//Mathias //done
        //createBeheer();//Wout dit moet nog verplaatst worden naar een button op beheer scherm //done
        createExtra();//Kasper
        //createFoto(); nog geen plaats of scherm voor een foto in toe te voegen

        //Openen nieuw scherm
        openNieuwScherm(mouseEvent);


    }

    //deze functie zorgt voor het open van nieuw scherm
    public void openNieuwScherm(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view/BeheeBehandelingPlant.fxml"));
        Scene scen = new Scene(root);
        Stage window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        window.setScene(scen);
        window.show();
        scherm = "beheer";
        window.setMaximized(true);
    }

    //Fenotype in array steken om mee te geven.
    public void createfenotype() throws Exception {
        //Aanmaken variabelen
        FenotypeDAO fenotypeDAO = new FenotypeDAO(dbConnection);
        int maxid = fenotypeDAO.getmaxid(), iBladgrootte;
        maxid++;
        String sBladvorm, sLevensvorm, sHabitus, sBloeiwijze, sRatio,sSpruitenologie ="", sTitel = "toevoegen fenotype";
        //Controle op bladvorm
        try{
            sBladvorm = cbBladvormTv.getValue();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij de bladvorm.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op levensvorm
        try{
            sLevensvorm = levensvormCheck();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij levensvorm. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op habitus
        try{
            sHabitus = habitusCheck();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij habitus. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op bloeiwijze
        try{
            sBloeiwijze = bloeiwijzeCheck();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij bloeiwijze. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op bladgrootte
        try{
            iBladgrootte = Integer.parseInt(cbBladgrootteTotTv.getValue());

        }catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij bladgrootte.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op ratio
        try{
            sRatio = cbBladgrootteTotTv.getValue();

        }catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij ratio.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op spruitfenologie
        try{
            sSpruitenologie = cbSpruitfenologieTv.getValue();

        }catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij spruitfenologie.");
            System.out.println(ex);
            throw new Exception();
        }
        System.out.println(plantid);
        //Aanmaken fenotype + toevoegen aan array
        try{
            Fenotype fenotype = new Fenotype(maxid, plantid, sBladvorm, sLevensvorm, sHabitus, sBloeiwijze, iBladgrootte, sRatio, sSpruitenologie);
            fenotypess.add(fenotype);
        }
        catch (Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij het doorsturen van fenotype gegevens.");
            System.out.println(ex);
            throw new Exception();
        }

    }

    //Controleren op geselecteerde habitus
    public String habitusCheck() {
        //Foutafhanfeling gebeurt al in overliggende method.
        if (rbTuftedTv.isSelected()) {
            return "tufted";
        }
        if (rbUprightarchingTv.isSelected()) {
            return "Upright arching";
        }
        if (rbArchingTv.isSelected()) {
            return "Arching";
        }
        if (rbUprightDivergentTv.isSelected()) {
            return "Upright Divergent";
        }
        if (rbUprightErectTv.isSelected()) {
            return "Upright erect";
        }
        if (rbMountedTv.isSelected()) {
            return "Mounted";
        }
        if (rbKOfHGOfMTv.isSelected()) {
            return "Kruipend of horizontaal groeiend of mattenvormend";
        }
        if (rbRondOfWaaiervormigTv.isSelected()) {
            return "Rond- of waaiervormig";
        }
        if (rbKussenvormendTv.isSelected()) {
            return "Kussenvormend";
        }
        if (rbZuilvormigTv.isSelected()) {
            return "Zuilvormig";
        }
        if (rbUitbuigendTv.isSelected()) {
            return "Uitbuigend";
        }
        if (rbWortelrozetplantTv.isSelected()) {
            return "(Wortel)rozetplant";
        }
        if (rbSucculentenTv.isSelected()) {
            return "Succulenten";
        }
        if (rbPollenvormersTv.isSelected()) {
            return "Pollenvormers";
        }
        if (rbParasolvormigTv.isSelected()) {
            return "Parasolvormig";
        }
        return "";
    }
    //Controleren op geselecteerde levensvorm
    public String levensvormCheck() {
        //Foutafhandeling gebeurt al bij overkoepelende method.
        if (rbHydro1Tv.isSelected()) {
            return "1. Hydrofyt";
        }
        if (rbHydro2Tv.isSelected()) {
            return "2. Hydrofyt";
        }
        if (rbHeloTv.isSelected()) {
            return "3. Helofyt";
        }
        if (rbCrypto1Tv.isSelected()) {
            return "4. Cryptophyt";
        }
        if (rbCrypto2Tv.isSelected()) {
            return "5. Cryptophyt";
        }
        if (rbHemikryptoTv.isSelected()) {
            return "6. Hemikryptofyt";
        }
        if (rbChamae1Tv.isSelected()) {
            return "7. Chamaefyt";
        }
        if (rbChamae2Tv.isSelected()) {
            return "8. Chamaefyt";
        }
        if (rbFaneroTv.isSelected()) {
            return "9. Fanerophyt";
        }
        return "";
    }

    //Controleren op geselecteerde bloeiwijze
    public String bloeiwijzeCheck() {
        //Foutafhandeling hiervoor is al gebeurd in overkoepelende method.
        if (rbAarTv.isSelected()) {
            return "Aar";
        }
        if (rbBredePluimTv.isSelected()) {
            return "Brede pluim";
        }
        if (rbEtageTv.isSelected()) {
            return "Etage";
        }
        if (rbBolOfKnopTv.isSelected()) {
            return "Bol of knop";
        }
        if (rbMargrietachtigTv.isSelected()) {
            return "Margrietachtig";
        }
        if (rbSchotelTv.isSelected()) {
            return "Schotel";
        }
        if (rbSchermTv.isSelected()) {
            return "Scherm";
        }
        if (rbSmallePluimTv.isSelected()) {
            return "Smalle pluim";
        }
        return "";
    }

    public void createplant() throws SQLException, Exception {
        //Aanmaken variabelen
        //volledig toevoegen in databank vanuit scherm, waarschijnlijk nog iets toevoegen voor te kijken of de naam al in de databank zit
        GebruikerDAO gebruikerDAO = new GebruikerDAO(dbConnection);
        PlantDAO plantDAO = new PlantDAO(dbConnection);
        NaamDao naamDAO = new NaamDao(dbConnection);
        Plant plantTest = new Plant(cboTypeTv.getValue(), txtFamilieTv.getText(), txtGeslachtTv.getText(), txtSoortTv.getText(), txtVariantTv.getText());
        //Ophalen plantid voor nieuwe plant
        int maxidplant = plantDAO.getmaxid();
        iGebruikerID = gebruikerDAO.getIdMetEmail(sEmailadres);
        System.out.println(iGebruikerID);
        String srolGebruiker = gebruikerDAO.getRolMetEmail(sEmailadres);
        this.plantid = maxidplant;
        plantid = maxidplant + 1;
        String sErrorTitel = "Fout toevoegen plant";
        int ix = 0, iy = 0, iStatus = 0;

        //Controle op gebruiker
        try {
            iGebruikerID = gebruikerDAO.getIdMetEmail(sEmailadres);
            srolGebruiker = gebruikerDAO.getRolMetEmail(sEmailadres);
        } catch (Exception ex) {
            ShowError(sErrorTitel, "Er is een fout opgetreden bij het meegeven van gebruiker.");
            System.out.println(ex);
            throw new Exception(ex);
        }
        //Controle op plantType
        try {
            if (cboTypeTv.getValue().length() == 0) {
                ShowError(sErrorTitel, "Type kan niet leeg zijn");
            } else {
                sPlanttype = cboTypeTv.getValue();
            }

        } catch (Exception ex) {
            ShowError(sErrorTitel, "Type kan niet leeg zijn.");
            System.out.println(ex);
            throw new Exception(ex);
        }
        //Controle op familie
        try {
            if (txtFamilieTv.getText().length() == 0) {
                throw new ExceptionInInitializerError();
            } else {
                sFamilie = txtFamilieTv.getText();
            }
        } catch (Exception ex) {
            ShowError(sErrorTitel, "Er is een fout opgetreden bij het meegeven van familie.");
            System.out.println(ex);
            throw new Exception();
        } catch (
                ExceptionInInitializerError exi) {
            ShowError(sErrorTitel, "Familie kan niet leeg zijn");
            System.out.println(exi);
            throw new Exception();
        }
        //Controle op geslacht
        try {
            if (txtGeslachtTv.getText().length() == 0) {

                throw new ExceptionInInitializerError();
            } else {
                sGeslacht = txtGeslachtTv.getText();
            }
        } catch (
                Exception ex) {
            ShowError(sErrorTitel, "Er is een fout opgetreden bij het meegeven van geslacht.");
            System.out.println(ex);
            throw new Exception(ex);
        } catch (
                ExceptionInInitializerError exi) {
            ShowError(sErrorTitel, "Geslacht kan niet leeg zijn");
            System.out.println(exi);
            throw new Exception();
        }
        //Controle op soort
        try {
            if (txtSoortTv.getText().length() > 0) {
                sSoort = txtSoortTv.getText();
            }
        } catch (
                Exception ex) {
            ShowError(sErrorTitel, "Er is een fout opgetreden bij het meegeven van soort.");
            System.out.println(ex);
        }
        //Controle op variant
        try {
            if (txtVariantTv.getText().length() > 0) {
                sSoort = txtVariantTv.getText();
            }
        } catch (
                Exception ex) {
            ShowError(sErrorTitel, "Er is een fout opgetreden bij het meegeven van variant.");
            System.out.println(ex);
        }
        try {
            sFgsv = sFamilie + " " + sGeslacht + " " + sSoort + " " + sVariant;
        } catch (
                Exception ex) {
            ShowError(sErrorTitel, "Er is een fout opgetreden bij het meegeven van fgsv.");
            System.out.println(ex);
        }

        //Controle op plantdischtheid
        //Controle op minimum plantdichtheid
        try {
            // Wanneer X leeg is, aanpassen naar 0
            if (txtDichtheidXTv.getText().length() == 0) {
                ix = 0;
            }
            //Wanneer X kleiner is dan nul waarschuwing geven.
            else if (Integer.parseInt(txtDichtheidXTv.getText()) < 0) {
                throw new NumberFormatException();
            }
            //Wanneer getal positief is en niet 0, waarde aanpassen
            else {
                ix = Integer.parseInt(txtDichtheidXTv.getText());
            }


        } catch (
                NumberFormatException nex) {
            ShowError(sErrorTitel, "Gelieve een positief getal in te geven bij X.");
            throw new Exception(nex);
        } catch (
                Exception ex) {
            ShowError(sErrorTitel, "Er is een fout opgetreden bij het meegeven X.");
            System.out.println(ex);
            throw new Exception(ex);
        }
        //Controle op maximum plantdichtheid
        try {
            // Wanneer Y leeg is, aanpassen naar 0
            if (txtDichtheidYTv.getText().length() == 0) {
                iy = 0;
            } else if (Integer.parseInt(txtDichtheidYTv.getText()) < 0) {
                throw new NumberFormatException();
            }
            //Wanneer Y niet leeg is, en groter dan 0, waarde aanpassen
            else {
                iy = Integer.parseInt(txtDichtheidYTv.getText());
            }

        } catch (
                NumberFormatException nex) {
            ShowError(sErrorTitel, "Gelieve een getal in te geven bij Y.");
            throw new Exception(nex);

        } catch (
                Exception ex) {
            ShowError(sErrorTitel, "Er is een fout opgetreden bij het meegeven van Y.");
            System.out.println(ex);
            throw new Exception(ex);
        }
        //Controle of X < Y
        try {
            //Wanneer x > y, error weer geven.
            if (ix > iy) {
                throw new Exception();
            }
        } catch (Exception ex) {
            ShowError(sErrorTitel, "X moet kleiner zijn dan Y.");
            throw new Exception(ex);
        }

        //Controle of plantnaam al bestaat
        //Ophalen van count, om te zien of naam al bestaat.
        int iDubbeleNaam = naamDAO.ControleDubbeleNaam(plantTest);
        try {
            //als plant nog niet bestaat, plant toevoegen
            if (iDubbeleNaam == 0) {
                System.out.println(iDubbeleNaam + " is iDubbelenaam");
                //Toevoegen plant docent/admin
                if (srolGebruiker.equals("admin") || srolGebruiker.equals("docent")) {
                    System.out.println("plaa,t aangemaakt");
                    iStatus = 2;
                    Plant plant = new Plant(plantid, sPlanttype, sFamilie, sGeslacht, sSoort, sVariant, ix, iy, sFgsv, iStatus, iGebruikerID);
                    plantss.add(plant);
                }
                //Toevoegen plant als leerling/gast
                else {
                    System.out.println("plant aangemaakt");
                    iStatus = 1;
                    Plant plant = new Plant(plantid, sPlanttype, sFamilie, sGeslacht, sSoort, sVariant, ix, iy, sFgsv, iStatus, iGebruikerID);
                    plantss.add(plant);
                }
            }
            //Als plant bestaat waarschuwing geven
            else {
                throw new ExceptionInInitializerError();

            }
        } catch (Exception ex) {
            ShowError(sErrorTitel, "Het toevoegen van plant is niet gelukt.");
            throw new Exception();
        } catch (ExceptionInInitializerError exI) {
            ShowError(sErrorTitel, "Deze plant bestaat al.");
            throw new Exception();
        }


    }

    public void createAbiotischefactoren() throws Exception {
        //alles van scherm direct naar databank aangezien hier de input enkel kan gekozen worden uit gegeven lijsten
        //deze functie is afgewerkt
        //Aanmaken variabelen
        String sBezonning = "", sGrondsoort = "", sVochtbehoefte = "", sVoedingsbehoefte = "", sReactieAntagonische = "", sTitel = "Abiotische factoren";
        abiotischeFactorenDAO = new AbiotischeFactorenDAO(dbConnection);
        int maxidabio = abiotischeFactorenDAO.getmaxid();
        //Controle op bezonning
        try {
            sBezonning = cbBezonningTv.getValue();
        } catch (Exception ex) {
            ShowError(sTitel, "Er is een fout opgelopen bij bezonning. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op grondsoort
        try {
            sGrondsoort = cbGrondsoort.getValue();
        } catch (Exception ex) {
            ShowError(sTitel, "Er is een fout opgelopen bij grondsoort. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op vochtbehoefte
        try{
            sVochtbehoefte = cbVochtbehoefteTv.getValue();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij vochtbehoefte. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op voedingsbehoefte
        try{
            sVoedingsbehoefte = cbVoedingsbehoefteTv.getValue();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij voedingsbehoefte. ");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op reactie antagonistische omgeving
        try{
            sReactieAntagonische = cbReactieAntaTv.getValue();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgelopen bij reactie antagonistische omgeving. ");
            System.out.println(ex);
            throw new Exception();
        }
        //aanmaken abiotische factoren, en doorgeven naar array
        try {
            AbiotischeFactoren abiotischeFactoren = new AbiotischeFactoren(maxidabio + 1, plantid, sBezonning, sGrondsoort, sVochtbehoefte, sVoedingsbehoefte, sReactieAntagonische);
            abiotischeFactorenn.add(abiotischeFactoren);
        } catch (Exception ex) {
            ShowError(sTitel, "Er is een fout gebeurd bij aanmaken abiotische factoren.");
            System.out.println(ex);
            throw new Exception();
        }

    }

    //TODO foutafhandeling vervolledigen
    //Invullen van commensalisme gegevens voor array
    public void createCommensalisme() throws Exception {
        //Aanmaken variabelen
        CommensalismeDAO commensalismeDAO = new CommensalismeDAO(dbConnection);
        int maxidcommensalisme = commensalismeDAO.getmaxid();
        String sStrategie, sOntwikkelingssnelheid, sTitel = " toevoegen commensalisme";

        //Controle op strategie
        try{
            sStrategie = strategieCheck();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout gebeurd bij strategie.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op Ontwikkeling
        try{
           sOntwikkelingssnelheid = cbOntwikkelingssnelheidTv.getValue();
        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout gebeurd bij strategie.");
            System.out.println(ex);
            throw new Exception();
        }

        Commensalisme commensalisme = new Commensalisme(maxidcommensalisme + 1, plantid, sStrategie, sOntwikkelingssnelheid);
        commensalismes.add(commensalisme);
    }

    //Controle op welke strategie geselecteerd is.
    public String strategieCheck() {
        //Foutafhandeling gebeurd al in overkoepelende method.
        if (rbStrategieTopTv.isSelected()) {
            return "C";
        } else if (rbStrategieMMTv.isSelected()) {
            return "C-S-R";
        } else if (rbStrategieLMTv.isSelected()) {
            return "C-R";
        } else if (rbStrategieRMTv.isSelected()) {
            return "C-S";
        } else if (rbStrategieLOTv.isSelected()) {
            return "R";
        } else if (rbStrategieMOTv.isSelected()) {
            return "S-R";
        } else if (rbStrategieROTv.isSelected()) {
            return "S";
        } else {
            return "";
        }
    }

   //Toevoegen van extra eigenschappen aan de array.
    public void createExtra() throws Exception {
        //Aanmaken variabelen
        int iNectarwaarde, iPollenwaarde;
        String sBijVriendelijk,sEetbaar,sKruidgebruik,sGeurend,sVorstgevoeling, sTitel = "toevoegen extra eigenschappen.";

        ExtraDAO extraDAO = new ExtraDAO(dbConnection);
        int maxidextra = extraDAO.getmaxid();
        maxidextra++;

        //Foutafhandeling
        //Controle op nectarwaarde
        try{
            iNectarwaarde = Integer.parseInt(NectarwaardeValueTv.getText());
        }
        catch (Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij nectarwaarde.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op pollenwaarde
        try{
            iPollenwaarde = Integer.parseInt(PollenValueTv.getText());
        }
        catch (Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij pollenwaarde.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op bijvriendelijk
        try{
          sBijVriendelijk = bijvriendelijkCheck();

        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij bijvriendelijk.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op eetbaar
        try{
            sEetbaar= eetbaarCheck();

        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij eetbaar.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op kruidgebruik
        try{
            sKruidgebruik = kruidgebruikCheck();

        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij kruidgebruik.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op geurend
        try{
            sGeurend = geurendCheck();

        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij geurend.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op vorstgevoelig
        try{
            sVorstgevoeling = vorstgevoeligCheck();

        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij vorstgevoelig.");
            System.out.println(ex);
            throw new Exception();
        }
        //TODO vlindervriendelijk nog aanpassen + foutafhandeling

        Extra extra = new Extra(maxidextra, plantid, iNectarwaarde, iPollenwaarde, sBijVriendelijk, sEetbaar, sKruidgebruik, sGeurend, sVorstgevoeling, "vlinder");
        //deze fout van createExtra komt uit extraDAO omdat het niet zeker is hoe eetbaar en kruidgebruik uit de databank gehaald moeten worden
        extrass.add(extra);
        //ExtraDAO.createExtra(extra);
    }

    //ophalen selectie vorstgevoelig
    public String vorstgevoeligCheck() {
        //foutafhandeling hiervan gebeurd al in overkoepelende method.
        if (rbVorstgevoeligJaTv.isSelected()) {
            return "ja";
        } else if (rbVorstgevoeligNeeTv.isSelected()) {
            return "nee";
        } else {
            return "";
        }
    }
    //ophalen selectie eetbaar
    public String eetbaarCheck() {
        //foutafhandeling hiervan gebeurd al in overkoepelende method.
        if (rbEetbaarJaTv.isSelected()) {
            return "ja";
        } else if (rbEetbaarNeeTv.isSelected()) {
            return "nee";
        } else {
            return "";
        }
    }
    //ophalen selectie geurend
    public String geurendCheck() {
        //foutafhandeling hiervan gebeurd al in overkoepelende method.
        if (rbGeurendJaTv.isSelected()) {
            return "ja";
        } else if (rbGeurendNeeTv.isSelected()) {
            return "nee";
        } else {
            return "";
        }
    }
    //ophalen kruidgebruik
    public String kruidgebruikCheck() {
        //foutafhandeling hiervan gebeurd al in overkoepelende method.
        if (rbKruidgebruikJaTv.isSelected()) {
            return "ja";
        } else if (rbKruidgebruikNeeTv.isSelected()) {
            return "nee";
        } else {
            return "";
        }
    }
    //ophalen bijvriendelijk
    public String bijvriendelijkCheck() {
        //foutafhandeling hiervan gebeurd al in overkoepelende method.
        if (rbBijvriendelijkJaTv.isSelected()) {
            return "ja";
        } else if (rbBijvriendelijkNeeTv.isSelected()) {
            return "nee";
        } else {
            return "";
        }
    }

    //TODO foutafhandeling
    //Toevoegen van geselecteerde commmulti in listview

    public void ToevoegenCommensalismeMulti(MouseEvent mouseEvent) throws Exception {
        //Aanmaken variabelen
        String sLevensduur, sTitel = " toevoegen selectie aan listview commensalisme multi.";

        //Controle op levensduur
        try{
            sLevensduur = cbLevensduurTv.getValue();

        } catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij selectie commensalisme multi.");
            System.out.println(ex);
            throw new Exception();
        }

        //Controle op dubbele items toevoegen aan listview
        if (!lvLevensduurTv.getItems().contains(sLevensduur)) {
            lvLevensduurTv.getItems().add(sLevensduur);
        } else {
            ShowError(sTitel, "Deze selectie is al geselecteerd.");
        }
    }

    //Doorsturen van commensalisme multi naar array
    public void createCommensalismeMulti() throws Exception {
        //aanmaken variabelen
        String sTitel = " toevoegen van commensalisme multi.";
        //aantal elementen in bovenstaande lijst bijhouden
        int aantalCommMulti = 0;

        //Foutcontrole hier, is al gebeurd bij toevoegen aan lv.
        //Toevoegen van levensduur
        CommensalismeDAO commensalismeMulti = new CommensalismeDAO(dbConnection);

        System.out.println(" " + plantid);

        for (int i = 0; i < lvLevensduurTv.getItems().size(); i++) {
            try{
                CommMulti_Eigenschap commensalisme = new CommMulti_Eigenschap("levensduur", lvLevensduurTv.getItems().get(i), plantid);
                commMulti_eigenschapss.add(commensalisme);
            }
            catch (Exception ex)
            {
                ShowError(sTitel, "Er is een fout opgetreden bij toevoegen van levensduur.");
                System.out.println(ex);
                throw new Exception();
            }
            aantalCommMulti++;
        }


        //Toevoegen van sociabiliteit
        try
        {
            if (chkSociabiliteit1Tv.isSelected()) {
                CommMulti_Eigenschap sociabiliteit = new CommMulti_Eigenschap("sociabiliteit", "1", plantid);
                System.out.println(sociabiliteit.getNaam());
                commMulti_eigenschapss.add(sociabiliteit);
                aantalCommMulti++;
            }
            if (chkSociabiliteit2Tv.isSelected()) {
                CommMulti_Eigenschap sociabiliteit = new CommMulti_Eigenschap("sociabiliteit", "2", plantid);
                System.out.println(sociabiliteit.getNaam());
                commMulti_eigenschapss.add(sociabiliteit);
                aantalCommMulti++;
            }
            if (chkSociabiliteit3Tv.isSelected()) {
                CommMulti_Eigenschap sociabiliteit = new CommMulti_Eigenschap("sociabiliteit", "3", plantid);
                System.out.println(sociabiliteit.getNaam());
                commMulti_eigenschapss.add(sociabiliteit);
                aantalCommMulti++;
            }
            if (chkSociabiliteit4Tv.isSelected()) {
                CommMulti_Eigenschap sociabiliteit = new CommMulti_Eigenschap("sociabiliteit", "4", plantid);
                System.out.println(sociabiliteit.getNaam());
                commMulti_eigenschapss.add(sociabiliteit);
                aantalCommMulti++;
            }
            if (chkSociabiliteit5Tv.isSelected()) {
                CommMulti_Eigenschap sociabiliteit = new CommMulti_Eigenschap("sociabiliteit", "5", plantid);
                System.out.println(sociabiliteit.getNaam());
                commMulti_eigenschapss.add(sociabiliteit);
                aantalCommMulti++;
            }
            AantalPerElCommMulti.add(aantalCommMulti);
        }
        catch (Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij toevoegen van sociabiliteit.");
            System.out.println(ex);
            throw new Exception();
        }

    }

    //TODO Kevin nog aanvullen
    public void createFoto() throws SQLException {
        FotoDAO fotoDAO = new FotoDAO(dbConnection);
        int maxIdFoto = fotoDAO.getmaxid();
        Foto foto = new Foto(maxIdFoto + 1, plantid, "a", "b", null);
        fotoDAO.createFoto(foto);
    }

    //Toevoegen fenotyple multi aan array
    public void createfenotypemulti() throws Exception {
        //Aanmaken variabelen
        FenotypeDAO fenotypeDAO = new FenotypeDAO(dbConnection);
        int maxid = fenotypeDAO.getmaxidmulti();
        maxid++;
        System.out.println(maxid);
        String sTitel = " toevoegen van fenotype multi.";
        FenoMulti_Eigenschap bladhoogte, bladkleur, minbloeihoogte , maxbloeihoogte, bloeikleur;
        System.out.println();
        ArrayList<FenoMulti_Eigenschap> fenoMulti_eigenschaps = new ArrayList<>();
        //Controle op bladhoogte
        try{
            bladhoogte = new FenoMulti_Eigenschap(maxid, "Bladhoogte", spinMaxBladhJanTv.getValue().toString(), spinMaxBladhFebTv.getValue().toString(), spinMaxBladhMaaTv.getValue().toString(), spinMaxBladhAprTv.getValue().toString(), spinMaxBladhMeiTv.getValue().toString(), spinMaxBladhJunTv.getValue().toString(), spinMaxBladhJulTv.getValue().toString(), spinMaxBladhAugTv.getValue().toString(), spinMaxBladhSeptTv.getValue().toString(), spinMaxBladhOktTv.getValue().toString(), spinMaxBladhNovTv.getValue().toString(), spinMaxBladhDecTv.getValue().toString());
            maxid++;
        }
        catch (Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij toevoegen van bladhoogte.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op bladkleur
        try {
            bladkleur = new FenoMulti_Eigenschap(maxid, "Bladkleur", comboboxCheckString(cbBladkleurJanTv.getSelectionModel()), comboboxCheckString(cbBladkleurFebTv.getSelectionModel()), comboboxCheckString(cbBladkleurMaaTv.getSelectionModel()), comboboxCheckString(cbBladkleurAprTv.getSelectionModel()), comboboxCheckString(cbBladkleurMeiTv.getSelectionModel()), comboboxCheckString(cbBladkleurJunTv.getSelectionModel()), comboboxCheckString(cbBladkleurJulTv.getSelectionModel()), comboboxCheckString(cbBladkleurAugTv.getSelectionModel()), comboboxCheckString(cbBladkleurSeptTv.getSelectionModel()), comboboxCheckString(cbBladkleurOktTv.getSelectionModel()), comboboxCheckString(cbBladkleurNovTv.getSelectionModel()), comboboxCheckString(cbBladkleurDecTv.getSelectionModel()));
            maxid++;
        }
        catch (Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij toevoegen van bladkleur.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op minimum bloeihoogte
        try{
            minbloeihoogte = new FenoMulti_Eigenschap(maxid, "Min Bloeihoogte", spinMinBloeihJanTv.getValue().toString(), spinMinBloeihFebTv.getValue().toString(), spinMinBloeihMaaTv.getValue().toString(), spinMinBloeihAprTv.getValue().toString(), spinMinBloeihMeiTv.getValue().toString(), spinMinBloeihJunTv.getValue().toString(), spinMinBloeihJulTv.getValue().toString(), spinMinBloeihAugTv.getValue().toString(), spinMaxBloeihSeptTv.getValue().toString(), spinMinBloeihOktTv.getValue().toString(), spinMinBloeihNovTv.getValue().toString(), spinMinBloeihDecTv.getValue().toString());
            maxid++;
        }
        catch (Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij toevoegen van minimum bloeihoogte.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op maximum bloeihoogte.
        try{
            maxbloeihoogte = new FenoMulti_Eigenschap(maxid, "Max Bloeihoogte", spinMaxBloeihJanTv.getValue().toString(), spinMaxBloeihFebTv.getValue().toString(), spinMaxBladhMaaTv.getValue().toString(), spinMaxBloeihAprTv.getValue().toString(), spinMaxBloeihMeiTv.getValue().toString(), spinMaxBloeihJunTv.getValue().toString(), spinMaxBloeihJulTv.getValue().toString(), spinMaxBloeihAugTv.getValue().toString(), spinMaxBloeihSeptTv.getValue().toString(), spinMaxBloeihOktTv.getValue().toString(), spinMaxBloeihNovTv.getValue().toString(), spinMaxBloeihDecTv.getValue().toString());
            maxid++;
        }
        catch (Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij toevoegen van maximum bloeihoogte.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op bloeikleur
        try{
            bloeikleur = new FenoMulti_Eigenschap(maxid, "Bloeikleur", comboboxCheckString(cbBloeikleurJanTv.getSelectionModel()), comboboxCheckString(cbBloeikleurFebTv.getSelectionModel()), comboboxCheckString(cbBloeikleurMaaTv.getSelectionModel()), comboboxCheckString(cbBloeikleurAprTv.getSelectionModel()), comboboxCheckString(cbBloeikleurMeiTv.getSelectionModel()), comboboxCheckString(cbBloeikleurJunTv.getSelectionModel()), comboboxCheckString(cbBloeikleurJulTv.getSelectionModel()), comboboxCheckString(cbBloeikleurAugTv.getSelectionModel()), comboboxCheckString(cbBloeikleurSeptTv.getSelectionModel()), comboboxCheckString(cbBloeikleurOktTv.getSelectionModel()), comboboxCheckString(cbBloeikleurNovTv.getSelectionModel()), comboboxCheckString(cbBloeikleurDecTv.getSelectionModel()));
        }
        catch (Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij toevoegen van bloeikleur.");
            System.out.println(ex);
            throw new Exception();
        }
        //Controle op aanmaken eigenschappen
        try{
            fenoMulti_eigenschaps.add(bladhoogte);
            fenoMulti_eigenschaps.add(bladkleur);
            fenoMulti_eigenschaps.add(minbloeihoogte);
            fenoMulti_eigenschaps.add(maxbloeihoogte);
            fenoMulti_eigenschaps.add(bloeikleur);
            for (int i = 0; i < 5; i++) {
                FenoMulti_Eigenschap fenoMulti_eigenschap = new FenoMulti_Eigenschap(fenoMulti_eigenschaps.get(i).getId(), fenoMulti_eigenschaps.get(i).getNaam(), fenoMulti_eigenschaps.get(i).getJan(), fenoMulti_eigenschaps.get(i).getFeb(), fenoMulti_eigenschaps.get(i).getMaa(), fenoMulti_eigenschaps.get(i).getApr(), fenoMulti_eigenschaps.get(i).getMei(), fenoMulti_eigenschaps.get(i).getJun(), fenoMulti_eigenschaps.get(i).getJul(), fenoMulti_eigenschaps.get(i).getAug(), fenoMulti_eigenschaps.get(i).getSep(), fenoMulti_eigenschaps.get(i).getOkt(), fenoMulti_eigenschaps.get(i).getNov(), fenoMulti_eigenschaps.get(i).getDec());
                fenoMulti_eigenschapss.add(fenoMulti_eigenschap);
            }
        }
        catch(Exception ex)
        {
            ShowError(sTitel, "Er is een fout opgetreden bij het aanmaken van fenotype multi eigenschappen.");
            System.out.println(ex);
            throw new Exception();
        }
    }

    //String uit combobox halen indien ingevuld, anders lege string meegeven.
    public String comboboxCheckString(SingleSelectionModel <String> combobox) {
        if(combobox.isEmpty()) {
            return "";
        }
        else {
            return combobox.getSelectedItem();
        }
    }

    public void ToevoegenAbiotischeMulti(MouseEvent mouseEvent) {
        System.out.println(cbHabitatTv.getValue());
        if (!lvHabitatTv.getItems().contains(cbHabitatTv.getValue())) {
            lvHabitatTv.getItems().add((String) cbHabitatTv.getValue());
            System.out.println(cbHabitatTv.getValue());
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Je kan niet 2 keer hetzelfde item toevoegen");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    System.out.println("Pressed OK.");
                }
            });
        }
    }

    private void createAbiotischeMulti() throws SQLException {
        //aantal el toegevoegd in abmulti lijst bijhouden
        int aantalAbMultiEl = 0;
        AbiotischeFactorenDAO abiotischeMultidao = new AbiotischeFactorenDAO(dbConnection);
        int maxidcommensalismeMulti = abiotischeMultidao.getMaxIdMulti();
        System.out.println(" " + plantid);

        for (int i = 0; i < lvHabitatTv.getItems().size(); i++) {
            AbioMulti_Eigenschap abiotisch = new AbioMulti_Eigenschap("Habitat", (String) lvHabitatTv.getItems().get(i));
            maxidcommensalismeMulti++;
            abiotischmulti.add(abiotisch);
            aantalAbMultiEl++;
        }
        AantalPerElAbMulti.add(aantalAbMultiEl);
    }



    // de arraylist zijn de waarden van de multies die bij de specifieke plant horen;
    public void createdatabase(Plant plant, AbiotischeFactoren abiotischeFactoren, Fenotype fenotype, ArrayList<FenoMulti_Eigenschap> fenoMulti_eigenschaps, ArrayList<AbioMulti_Eigenschap> abiottisschemulti_eigenschaps, Commensalisme commensalisme, ArrayList<CommMulti_Eigenschap> commMulti_eigenschaps, ArrayList<Beheerdaad_Eigenschap> beheerdaad_eigenschaps, Extra extra) throws SQLException {
        PlantDAO plantDAO = new PlantDAO(dbConnection);
        abiotischeFactorenDAO = new AbiotischeFactorenDAO(dbConnection);
        FenotypeDAO fenotypeDAO = new FenotypeDAO(dbConnection);
        AbiotischeFactorenDAO abiotischeMultidao = new AbiotischeFactorenDAO(dbConnection);
        CommensalismeDAO commensalismeDAO = new CommensalismeDAO(dbConnection);
        BeheerDAO beheerDAO = new BeheerDAO(dbConnection);
        ExtraDAO extraDAO = new ExtraDAO(dbConnection);
        plantDAO.createplant(plant, 0, iGebruikerID);
        abiotischeFactorenDAO.CreateAbiostische(abiotischeFactoren);
        fenotypeDAO.createfenotype(fenotype);
        for (int j = 0; j < fenoMulti_eigenschaps.size(); j++) {
            fenotypeDAO.createfenomulti(fenoMulti_eigenschaps.get(j), plant.getId());
        }
        for (int f = 0; f < abiottisschemulti_eigenschaps.size(); f++) {
            abiotischeMultidao.CreateAbiotischeMulti(abiottisschemulti_eigenschaps.get(f), plantid);
        }
        commensalismeDAO.createCommensalisme(commensalisme);
        for (int m = 0; m < commMulti_eigenschaps.size(); m++) {
            commensalismeDAO.createCommensalismeMulti(commMulti_eigenschaps.get(m));
        }
        for (int a = 0; a < beheerdaad_eigenschaps.size(); a++) {
            beheerDAO.createBeheer(beheerdaad_eigenschaps.get(a), plant.getId());
        }
        extraDAO.createExtra(extra);
    }

    public void createNaam() throws SQLException {
        NaamDao naamDAO = new NaamDao(dbConnection);

        //Conrole op textboxen + dubbele plant is al gebeurd bij controle createplant
        Plant plant = new Plant(sPlanttype, sFamilie, sGeslacht, sSoort, sVariant);
        naamDAO.createNaam(plant);

    }

    public void ShowError(String sTitel, String sMessage) {
        //tonen van error
        JOptionPane.showMessageDialog(null, sMessage, "Fout bij: " + sTitel, JOptionPane.INFORMATION_MESSAGE);

    }

    public void click_verwijderenHabitat(MouseEvent mouseEvent) {
        final int selectedIndex = lvHabitatTv.getSelectionModel().getSelectedIndex();
        lvHabitatTv.getItems().remove(selectedIndex);
    }

    public void click_verwijderenLevensduur(MouseEvent mouseEvent) {
        final int selectedIndex = lvLevensduurTv.getSelectionModel().getSelectedIndex();
        lvLevensduurTv.getItems().remove(selectedIndex);
    }
}

