public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar) {
        return tutar * 1.10; //burdaki işlemle base krediki kalıtıma katıldı ama onu ezdi geçti

    }
    //overridable yani belirtmediği sürece üzerine yazılabilir
    //
}
