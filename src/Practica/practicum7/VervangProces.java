package Practica.practicum7;

public class VervangProces implements OpmaakProces{
    private String oud;
    private String nieuw;

    public VervangProces(String ouder, String nieuwer){
        oud= ouder;
        nieuw = nieuwer;

        }


    public String maakOp(String input) {
        input = input.replace(oud, nieuw);
        return input;
    }
}
