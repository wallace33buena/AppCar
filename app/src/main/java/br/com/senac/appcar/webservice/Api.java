package br.com.senac.appcar.webservice;

public class Api {
    private static final String ROOT_URL = "https://wallacebuena.000webhostapp.com/appcar/v1/Api.php?apicall=";
    public static String URL_CREATE_APPCAR = ROOT_URL + "createappcar";
    public static String URL_READ_APPCAR = ROOT_URL + "getappcar";
    public static String URL_UPDATE_APPCAR = ROOT_URL + "updateappcar";
    public static String URL_DELETE_APPCAR = ROOT_URL + "deleteappcar&id=";
}
