// This is polymorphism = berubah bentuk 
// using 'extends'

class Hewan {
    public void suaraHewan() {
        System.out.println("Hewan bersuara");
    }
}

class Tikus extends Hewan {
    public void suaraHewan() {
        System.out.println("Tikus bersuara : cit cit");
    }
}

class Kucing extends Hewan {
    public void suaraHewan() {
        System.out.println("Kucing bersuara : meong");
    }
}