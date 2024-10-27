package com.galloway.myapplication;

public class hesapla {

        private  int gelensayi1 ,gelensayi2;

        public hesapla(int gelensayi2, int gelensayi1) {
            this.gelensayi2 = gelensayi2;
            this.gelensayi1 = gelensayi1;
        }
        public int toplam() {
            return gelensayi1+gelensayi2;
        }
        public int cikar () {
            return gelensayi1-gelensayi2;
        }

        public int böl(){
            return  gelensayi1/gelensayi2;
        }
        public int çarp(){
            return gelensayi1*gelensayi2;
        }
    }


