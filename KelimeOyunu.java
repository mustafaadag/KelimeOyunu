package GerginKelimeAvi;



        /*
        KELİME AVI OYUNUNA HOŞGELDİNİZ.
        //////////////////////////////

        NASIL OYNANIR?
        -> RASTEGELE BİR SAYI SEÇEREK BİRDEN YÜZE KADAR OLAN KELİMLERDEN BİRİNİ SEÇİN.

        ->CÜMLE OLUŞTURMAK İÇİN SÜRE BELİRLEYİN(ÖRN:40SN)

        -> BU KELİMEYİ KENDİNİZİN BELİRLEDİĞİ KELİME SINIRLI CÜMLENİN İÇİNDE KULLANIN. (BİR NEVİ KELİMEYİ CÜMLEDE GİZLEYİN)

        -> BU KELİMEYİ RAKİPLERİN BİLMEMESİNİ SAĞLAYIN.

        ->RAKİP BİLİRSE PUAN RAKİBİN BİLEMEZSE PUAN SİZİNDİR.

        ->İSTEĞE BAĞLI OLARAK KELİME SAYISINI İKİYE ÇIKARIP KELİME SINIRINI DA YÜKSELTEREK OYUNU DAHADA ZORLAŞTIRABİLİRSİNİZ.

        -> İYİ EĞLENCELER

       ----->KURALLAR<-----
       *SIRALI CÜMLE KURMAK YASAK.(ÖRN:Markettebn elma,muz,kivi,şeftali aldım.[YASAK])
       *İSTEĞE BAĞLI OLARAK KELİMELERE EK GETİRMEK YASAK.
       *RAKİBİ SES TONU,TELAFFUZ HATASI VE MİMİKLERLE KANDIRMAK SERBEST :)

         */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KelimeOyunu extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kelime Avı");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);

    }


    private static void placeComponents(JPanel panel) {



        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }



        panel.setLayout(null);

        JLabel userLabel = new JLabel("1-100 arası bir sayı giriniz:");
        userLabel.setFont(new Font("Serif", Font.BOLD, 16));
        userLabel.setBounds(10, 20, 200, 25);
        userLabel.setForeground(Color.BLACK);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(220, 20, 165, 25);
        panel.add(userText);

        JButton loginButton = new JButton("Gönder");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.setForeground(Color.black);
        loginButton.setBackground(new Color(146,173,226));
        panel.add(loginButton);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 120, 400, 100);
        textArea.setForeground(new Color(255,194,150));
        textArea.setBackground(new Color(16,59,15));
        textArea.setFont(new Font("Serif", Font.BOLD, 18));
        panel.add(textArea);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sayi = Integer.parseInt(userText.getText());
                String kelime = "";
                switch (sayi) {
                    case 1:
                        kelime = "Şairane: Şiirsel, şairane bir anlatım.";
                        break;
                    case 2:
                        kelime = "Tıngır: Ses çıkaran, tınılı bir ses.";
                        break;
                    case 3:
                        kelime = "Çavdarlı: Çavdar ile yapılmış veya çavdar kokan.";
                        break;
                    case 4:
                        kelime = "Dırmık: Tel örgü veya hasır dokuma.";
                        break;
                    case 5:
                        kelime = "Tırtıklı: Dişli bir yüzeye sahip olmak";
                        break;
                    case 6:
                        kelime = "Şıpsevdi: Kolayca sevgi kazanan, ılımlı kişi.";
                        break;
                    case 7:
                        kelime = "Zımpara: Yüzeyi düzeltmek için kullanılan malzeme.";
                        break;
                    case 8:
                        kelime = "Şırdan: Yemek yapılan odun fırını.";
                        break;
                    case 9:
                        kelime = "Çıban: Ciltte oluşan iltihaplı şişlik.";
                        break;
                    case 10:
                        kelime = "Zıbın: Bebeklerin giydiği önlük.";
                        break;
                    case 11:
                        kelime = "Şubat: İkinci ay.";
                        break;
                    case 12:
                        kelime = "Mıntıka: Bölge, yer.";
                        break;
                    case 13:
                        kelime = "Ivırzıvır: Önemsiz, değersiz eşya.";
                        break;
                    case 14:
                        kelime = "Kıpçak: Orta Asya'da yaşayan bir Türk halkı.";
                        break;
                    case 15:
                        kelime = "İstifade: Fayda, yarar";
                        break;
                    case 16:
                        kelime = "Kuşku: Şüphe, tereddüt.";
                        break;
                    case 17:
                        kelime = "Müphem: Belirsiz, açık olmayan.";
                        break;
                    case 18:
                        kelime = "Zatürre: Akciğerlerin iltihaplanması.";
                        break;
                    case 19:
                        kelime = "Tirat: Uzun ve etkileyici konuşma.";
                        break;
                    case 20:
                        kelime = "Kibrit: Ateşleme aracı.";
                        break;
                    case 21:
                        kelime = "Külfet: Yük, sorumluluk.";
                        break;
                    case 22:
                        kelime = "Muazzam: Olağanüstü büyük, devasa.";
                        break;
                    case 23:
                        kelime = "Narin: Hassas, kırılgan.";
                        break;
                    case 24:
                        kelime = "Şampanya: Kutlamalarda kullanılan alkollü içki.";
                        break;
                    case 25:
                        kelime = "İttifak: Anlaşma, uzlaşma.";
                        break;
                    case 26:
                        kelime = "Züppe: Kendini beğenmiş, ukala kişi.";
                        break;
                    case 27:
                        kelime = "Mütenevvi: Karışık, çeşitli.";
                        break;
                    case 28:
                        kelime = "Süregelen: Devam eden, devamlı.";
                        break;
                    case 29:
                        kelime = "Basur: Hastalık";
                        break;
                    case 30:
                        kelime = "Cırcır: Cırcır böceğinin çıkardığı ses.";
                        break;
                    case 31:
                        kelime = "Ekspertiz: Bir konuda uzman görüşü";
                        break;
                    case 32:
                        kelime = "Rahip: Kilise görevlisi";
                        break;
                    case 33:
                        kelime = "Obje: Nesne";
                        break;
                    case 34:
                        kelime = "Cüsse: Beden yapısı";
                        break;
                    case 35:
                        kelime = "Şayet: Eğer";
                        break;
                    case 36:
                        kelime = "Ukalalık: Bilgiçlik taslama";
                        break;
                    case 37:
                        kelime = "Yufka: İnce hamur";
                        break;
                    case 38:
                        kelime = "Nükleer: Atom enerjisi ile ilgili";
                        break;
                    case 39:
                        kelime = "Jelatin: Bir çeşit malzeme";
                        break;
                    case 40:
                        kelime = "Wc: Tuvalet";
                        break;
                    case 41:
                        kelime = "Jambon: Bir et türü";
                        break;
                    case 42:
                        kelime = "Hınzır: Kurnaz, hilekar";
                        break;
                    case 43:
                        kelime = "Curcuna: Karışıklık, gürültü";
                        break;
                    case 44:
                        kelime = "Dizayn: Tasarım, düzenleme";
                        break;
                    case 45:
                        kelime = "Fıçı: Küçük fıçı";
                        break;
                    case 46:
                        kelime = "Zıbın: Bebeklerin üzerine giyilen önlük";
                        break;
                    case 47:
                        kelime = "Şömiz: Ceketin ön tarafındaki dekoratif parça";
                        break;
                    case 48:
                        kelime = "Zımpara: Yüzeyi düzeltmek için kullanılan malzeme";
                        break;
                    case 49:
                        kelime = "Çarkıfelek: Şans oyunları için kullanılan araç";
                        break;
                    case 50:
                        kelime = "Turuncumsu: Turuncuya benzeyen";
                        break;
                    case 51:
                        kelime = "Çıngıraklı: Çan sesi çıkaran";
                        break;
                    case 52:
                        kelime = "Şifonyer: Çekmeceli dolap";
                        break;
                    case 53:
                        kelime = "Naaş: Ölü bedeni";
                        break;
                    case 54:
                        kelime = "Çıkrık: Su kuyusunu çekme aracı";
                        break;
                    case 55:
                        kelime = "Yılkı: Yabani ot, fundalık";
                        break;
                    case 56:
                        kelime = "Rektör: Üniversite başkanı";
                        break;
                    case 57:
                        kelime = "Meczub: Deli";
                        break;
                    case 58:
                        kelime = "Yünlü: Yünden yapılmış";
                        break;
                    case 59:
                        kelime = "Yalın: Süslemesiz, basit";
                        break;
                    case 60:
                        kelime = "Adaptasyon: Uyarlama";
                        break;
                    case 61:
                        kelime = "Baypas: Kalbe yapılan müdahale";
                        break;
                    case 62:
                        kelime = "Depozito: Güvence Akçesi";
                        break;
                    case 63:
                        kelime = "Geometri: Eşölçüm";
                        break;
                    case 64:
                        kelime = "Türbülans: Uçakların şiddetli sallantısı";
                        break;
                    case 65:
                        kelime = "Ütopik: Hayali";
                        break;
                    case 66:
                        kelime = "Vâkıf: Bilgisi olan";
                        break;
                    case 67:
                        kelime = "Müstehcen: Edebe aykırı, açık saçık.";
                        break;
                    case 68:
                        kelime = "Sirayet: Sinme, bulaşma";
                        break;
                    case 69:
                        kelime = "Paris: Şehir";
                        break;
                    case 70:
                        kelime = "Füme: Gri renk tonu";
                        break;
                    case 71:
                        kelime = "Gondol: Şehir içi su taşıma aracı";
                        break;
                    case 72:
                        kelime = "Jargon: Bir meslek veya gruba özgü dil";
                        break;
                    case 73:
                        kelime = "Zarf: Mektup kâğıdı";
                        break;
                    case 74:
                        kelime = "Dekont: Belge";
                        break;
                    case 75:
                        kelime = "Pasifize: Etkisizleştirme";
                        break;
                    case 76:
                        kelime = "Refakât: Beraberlik";
                        break;
                    case 77:
                        kelime = "Nidâ: Seslenme";
                        break;
                    case 78:
                        kelime = "Nâhoş: Tatsız";
                        break;
                    case 79:
                        kelime = "Râkım: Yükseklik";
                        break;
                    case 80:
                        kelime = "Alaturka: Geleneksel Türk tarzı";
                        break;
                    case 81:
                        kelime = "Amfi: Yarı daire şeklinde oturma düzenine sahip tiyatro veya konser salonu";
                        break;
                    case 82:
                        kelime = "Fuzuli: Gereksiz, boşuna";
                        break;
                    case 83:
                        kelime = "Kadim: Eski, tarihi";
                        break;
                    case 84:
                        kelime = "Evvel: Önce, ilk olarak";
                        break;
                    case 85:
                        kelime = "Hıyanet: İhanet, kötülük";
                        break;
                    case 86:
                        kelime = "Hata: Yanlışlık, hatalı davranış";
                        break;
                    case 87:
                        kelime = "Gözdağı: Tehdit, korkutma";
                        break;
                    case 88:
                        kelime = "Genelge: Genel bir konuda yapılan yazılı açıklama";
                        break;
                    case 89:
                        kelime = "Kontrat: Sözleşme, anlaşma";
                        break;
                    case 90:
                        kelime = "Santral: Enerji üretim merkezi";
                        break;
                    case 91:
                        kelime = "Sondaj: Araştırma, inceleme";
                        break;
                    case 92:
                        kelime = "Olta: Balık tutmak için kullanılan araç";
                        break;
                    case 93:
                        kelime = "Mevla: Allah, Tanrı";
                        break;
                    case 94:
                        kelime = "Mesken: Ev, konut";
                        break;
                    case 95:
                        kelime = "Matruşka: İç içe geçen Rus bebek figürleri";
                        break;
                    case 96:
                        kelime = "Maksat: Amaç, hedef";
                        break;
                    case 97:
                        kelime = "Yavan: Tatsız, lezzetsiz";
                        break;
                    case 98:
                        kelime = "Yılanağzı: Güle benzer bir bitki";
                        break;
                    case 99:
                        kelime = "Verem: Tuberculosis, akciğer hastalığı ";
                        break;
                    case 100:
                        kelime = "Taviz: Ödün, geri adım";
                        break;
                    default:
                        kelime = "GEÇERSİZ BİR SAYI GİRDİNİZ";

                }
                textArea.setText(kelime);
            }
        });
    }
}