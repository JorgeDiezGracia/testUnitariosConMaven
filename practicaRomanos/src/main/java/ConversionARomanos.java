public class ConversionARomanos {
    public String conversionNumero(int numeroEntero) {
        String numeroConvertido = "";

        String[] numerosUnidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] numerosDecenas =  {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] numerosCentenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] numeroMiles = {"", "M", "MM","MMM"};

        int menorDiez = numeroEntero%10;
        int menorCien = (numeroEntero/10)%10;
        int menorMil = (numeroEntero/100)%10;
        int mayorMil = numeroEntero/1000;

        if(numeroEntero>=1000)
            numeroConvertido = numeroMiles[mayorMil] + numerosCentenas[menorMil] + numerosDecenas[menorCien] + numerosUnidades[menorDiez];
        else
        if(numeroEntero>=100)
            numeroConvertido = numerosCentenas[menorMil] + numerosDecenas[menorCien] + numerosUnidades[menorDiez];
        else
        if(numeroEntero>=10)
            numeroConvertido = numerosDecenas[menorCien] + numerosUnidades[menorDiez];
        else
            numeroConvertido = numerosUnidades[menorDiez];

        return numeroConvertido;
    }
}
