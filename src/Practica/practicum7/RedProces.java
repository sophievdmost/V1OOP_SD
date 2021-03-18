package Practica.practicum7;

public class RedProces implements OpmaakProces{

    public String maakOp(String input){
        final String RED = "\u001B[31m";
        input = RED + input;
        return input;
    }
}
