package Chip8;


// Felipe Martinez Tagle
// ID: 159938


public class Dissasembler{
    private short pc = 0;

    public String pcAddr(){
        return String.format("%04x: ", pc);
    }

    public String cls(){
        return "CLS";
    }

    public String ret(){
        return "RET";
    }

    public String jmp(byte msb, byte lsb){
        var addr = ((msb & 0x0F) << 8) | (lsb & 0xFF);
        return String.format("JP %04X", addr);
    }

    public String call(byte msb, byte lsb){
        var addr = ((msb & 0x0F) << 8) | (lsb & 0xFF);
        return String.format("CALL %04X", addr);
    }

    public String se (byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("SE V%1X, %02X", x, lsb);
    }

    public String sne(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("SNE V%1X, %02X", x, lsb);
    }
   
    public String se1(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SE V%1X, V%1X", x, y);
    }

    public String ld(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD V%1X, %02X", x, lsb);
    }

    public String add(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("ADD V%1X, %02X", x, lsb);
    }

    public String ld1(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("LD V%1X, V%1X", x, y);
    }

    public String or(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("OR V%1X, V%1X", x, y);
    }

    public String and(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("AND V%1X, V%1X", x, y);
    }

    public String xor(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("XOR V%1X, V%1X", x, y);
    }

    public String add1(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("ADD V%1X, V%1X", x, y);
    }

    public String sub(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SUB V%1X, V%1X", x, y);
    }

    public String shr(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SHR V%1X {, V%1X}", x, y);
    }

    public String subn(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SUBN V%1X, V%1X", x, y); 
    }

    public String shl(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SHL V%1X {, V%1X}", x, y);
    }

    public String sne2(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SNE V%1X, V%1X", x, y); 
    }

    public String ld2(byte msb, byte lsb){
        var addr = ((msb & 0x0F) << 8) | (lsb & 0xFF);
        return String.format("LD I, %04X", addr);
    }

    public String jp(byte msb, byte lsb){
        var addr = ((msb & 0x0F) << 8) | (lsb & 0xFF);
        return String.format("JP V0, %04X", addr);
    }

    public String rnd(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("RND V%1X, %02X", x, lsb);
    }

    public String drw(byte msb, byte lsb) {
        var x = msb & 0x0F;
        var n = lsb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("DRW V%1X, V%1X, %1X", x, y, n);
    }

    public String skp(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("SKP V%1X", x);
    }

    public String sknp(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("SKNP V%1X", x);
    }

    public String ld3(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD V%1X, DT", x);
    }

    public String ld4(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD V%1X, K", x);
    }

    public String ld5(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD DT, V%1X", x);
    }

    public String ld6(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD ST, V%1X", x);
    }

    public String add2(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("ADD I, V%1X", x);
    }

    public String ld7(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD F, V%1X", x);
    }

    public String ld8(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD B, V%1X", x);
    }

    public String ld9(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD [I], V%1X", x);
    }

    public String ld10(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD V%1X, [I]", x);
    }
}