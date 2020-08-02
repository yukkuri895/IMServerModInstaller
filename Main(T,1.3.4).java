package ims;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.*;
public class Main extends JFrame {
    Main() {
        getContentPane().setLayout(new FlowLayout());


        JPanel p0 = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JLabel l6 = new JLabel("必須Forgeバージョン : ");
        JLabel l7 = new JLabel("MinecraftForge1.12.2-14.23.5.2768");
        l7.setForeground(Color.BLUE.darker());
        l7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        l7.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // ラベルをクリックしたとき
                try {

                    Desktop.getDesktop().browse(new URI("https://files.minecraftforge.net/maven/net/minecraftforge/forge/1.12.2-14.23.5.2768/forge-1.12.2-14.23.5.2768-installer.jar"));

                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });

        p0.add(l6);
        p0.add(l7);



        JButton jb1 = new JButton("通常ダウンロード開始");

        JButton jb2 = new JButton("プログラム終了");

        JButton jb3 = new JButton("IMSおすすめMod(1.12.2)のダウンロード開始");
        

        JLabel l4 = new JLabel("©2018 - 2020 IMServer");
        JLabel l5 = new JLabel("Version : 1.3.4T");

        JPanel p3 = new JPanel();
        JPanel p6 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        p6.add(l5);
        p4.add(jb1);
        p4.add(jb3);
        p4.add(jb2);
        p5.add(l4);


        //jb1はメインDL
        //jb1がクリックされたら
        jb1.addActionListener(ev -> {			//以下のことをする

            String osname = System.getProperty("os.name");
            // Windowsであったときの処理
            if(osname.contains("Windows")){
                String userhome = System.getProperty("user.home");
                try {
                    URL url1 = new URL("https://media.forgecdn.net/files/2766/172/industrialcraft-2-2.8.187-ex112.jar");
                    //IC2ex 112
                    URL url2 = new URL("https://media.forgecdn.net/files/2569/56/TheCampingMod_2.4.3.jar");
                    //TCM
                    URL url3 = new URL("https://media.forgecdn.net/files/2569/880/RikMuldsCore_1.3.3.jar");
                    //TCM前提
                    URL url4 = new URL("https://media.forgecdn.net/files/2714/940/shutters-1.12.2-1.0b.jar");
                    //Shutters
                    URL url5 = new URL("https://media.forgecdn.net/files/2571/951/SpiceOfLife-mc1.12-1.3.12.jar");
                    //SOL
                    URL url6 = new URL("https://media.forgecdn.net/files/2679/415/AppleCore-mc1.12.2-3.2.0.jar");
                    //Applecore
                    URL url7 = new URL("https://mod-buildcraft.com/releases/BuildCraft/7.99.24.2/buildcraft-all-7.99.24.2.jar");
                    //bc
                    URL url8 = new URL("https://media.forgecdn.net/files/2755/790/ForgeMultipart-1.12.2-2.6.2.83-universal.jar");
                    //forge multipart
                    URL url9 = new URL("https://media.forgecdn.net/files/2735/197/MrTJPCore-1.12.2-2.1.4.43-universal.jar");
                    //MRTjp
                    URL url10 = new URL("https://media.forgecdn.net/files/2745/545/ProjectRed-1.12.2-4.9.4.120-Base.jar");
                    //prbase
                    URL url11 = new URL("https://media.forgecdn.net/files/2745/548/ProjectRed-1.12.2-4.9.4.120-integration.jar");
                    //prin
                    URL url12 = new URL("https://media.forgecdn.net/files/2745/549/ProjectRed-1.12.2-4.9.4.120-lighting.jar");
                    //prlig
                    URL url13 = new URL("https://media.forgecdn.net/files/2709/670/energyconverters_1.12.2-1.3.0.15.jar");
                    //EneCon
                    URL url14 = new URL("https://media.forgecdn.net/files/2701/842/Fureniku%27s+Roads-1.0.2.1.jar");
                    //Fucking Roads
                    URL url15 = new URL("https://media.forgecdn.net/files/2448/283/JustAFewFish-1.7_for_1.12.jar");
                    //JUSTsakana
                    URL url16 = new URL("https://media.forgecdn.net/files/2779/848/CodeChickenLib-1.12.2-3.2.3.358-universal.jar");
                    //コード鶏
                    URL url17 = new URL("https://media.forgecdn.net/files/2526/674/malisisdoors-1.12.2-7.3.0.jar");
                    //Door
                    URL url18 = new URL("https://media.forgecdn.net/files/2680/892/malisiscore-1.12.2-6.5.1.jar");
                    //Doorcore
                    URL url19 = new URL("https://media.forgecdn.net/files/2755/8/Mekanism-1.12.2-9.8.1.383.jar");
                    //Mekanism
                    URL url20 = new URL("https://media.forgecdn.net/files/2755/10/MekanismGenerators-1.12.2-9.8.1.383.jar");
                    //MekanismGen
                    URL url21 = new URL("https://media.forgecdn.net/files/2463/318/ModernLights-1.0.3_1.12.jar");
                    //モダン照明
                    URL url22 = new URL("https://media.forgecdn.net/files/2771/840/Pam%27s+HarvestCraft+1.12.2zf.jar");
                    //パンみたいなやつの
                    URL url23 = new URL("https://media.forgecdn.net/files/2749/993/furniture-6.3.1-1.12.2.jar");
                    //ファーwwwwww
                    URL url24 = new URL("https://media.forgecdn.net/files/2625/165/obfuscate-0.2.6-1.12.2.jar");
                    //おｆ
                    URL url25 = new URL("https://media.forgecdn.net/files/2762/988/vehicle-mod-0.41.1-1.12.2.jar");
                    //びーぐる
                    URL url26 = new URL("https://media.forgecdn.net/files/2776/707/guns-0.15.2-1.12.2.jar");
                    //guns
                    URL url27 = new URL("https://media.forgecdn.net/files/2712/805/thuttech-1.12.2-6.1.6.jar");
                    //nanntaraTech
                    URL url28 = new URL("https://media.forgecdn.net/files/2713/584/thutcore-1.12.2-5.21.0.jar");
                    //TechCore
                    URL url29 = new URL("https://ucf9638be9f64fdf46987b76d4de.dl.dropboxusercontent.com/cd/0/get/A8rN1HpDCSiABh3sQuyk5w9MrmS4rk6_u6BqcpGc-fdn7X_yH1gIKEgP8K7wtm7JuUUMepvQgB871VjhWpxAQe4dEMNs2GVG2MB7ynSwMiQkOg/file?dl=1#");
                    //CDM
                    URL url30 = new URL("https://media.forgecdn.net/files/2750/633/architecturecraft-1.12-3.98.jar");
                    //Archite~~~~
                    URL url31 = new URL("https://media.forgecdn.net/files/2528/295/VeinMiner-1.12-0.38.2.647%2Bb31535a.jar");
                    //ベインマイナー
                    URL url32 = new URL("https://media.forgecdn.net/files/2777/929/StorageDrawers-1.12.2-5.4.0.jar");
                    //ドロワー
                    URL url33 = new URL("https://media.forgecdn.net/files/2450/900/Chameleon-1.12-4.1.3.jar");
                    //カメレオン
                    URL url34 = new URL("https://media.forgecdn.net/files/2963/616/IndustrialRenewal_1.12.2-0.17.6.jar");
                    //renewal?
                    URL url35 = new URL("https://media.forgecdn.net/files/2633/646/CompactSolars-1.12.2-5.0.18.341-universal.jar");
                    URL url36 = new URL("https://media.forgecdn.net/files/2785/465/Forgelin-1.8.4.jar");
                    URL url37 = new URL("https://media.forgecdn.net/files/2580/52/tesla-core-lib-1.12.2-1.0.15.jar");
                    URL url38 = new URL("https://media.forgecdn.net/files/2609/759/industrialforegoing-1.12.2-1.11.2-212.jar");
                    URL url39 = new URL("https://media.forgecdn.net/files/2713/194/invisiblights-3.1-9.jar");
                    URL url40 = new URL("https://media.forgecdn.net/files/2732/851/Useful+Interior+-+0.13.1+%5b1.12.2%5d.jar");
                    URL url41 = new URL("https://media.forgecdn.net/files/2518/31/bdlib-1.14.3.12-mc1.12.2.jar");
                    URL url42 = new URL("https://media.forgecdn.net/files/2685/154/PTRLib-1.0.4.jar");
                    URL url43 = new URL("https://media.forgecdn.net/files/2777/813/Decocraft-2.6.3_1.12.2.jar");
                    URL url44 = new URL("https://media.forgecdn.net/files/2625/854/engineers_doors-1.12.2-0.8.0.jar");
                    URL url45 = new URL("https://media.forgecdn.net/files/2693/578/alternatingflux-0.12.2-2.jar");
                    URL url46 = new URL("https://media.forgecdn.net/files/2568/579/immersivetech-1.12-1.3.10.jar");
                    URL url47 = new URL("https://media.forgecdn.net/files/2544/919/immersivepetroleum-1.12.2-1.1.9.jar");
                    URL url48 = new URL("https://media.forgecdn.net/files/2676/501/ImmersiveEngineering-0.12-89.jar");
                    URL url49 = new URL("https://media.forgecdn.net/files/2516/219/generators-0.9.20.12-mc1.12.2.jar");
                    //ここは”Generators-0.0.20.12-im1.12.2.jar”。これ以降の#入り方(単純)に記載されているURLは入っていません。
                    //なお、Mac/Linuxの時の場合にも移されておりません。
                    URL url50 = new URL("");
                    URL url51 = new URL("");
                    URL url52 = new URL("");
                    URL url53 = new URL("");
                    URL url54 = new URL("");
                    URL url55 = new URL("");
                    URL url56 = new URL("");
                    URL url57 = new URL("");
                    URL url58 = new URL("");
                    URL url59 = new URL("");
                    URL url60 = new URL("");
                    URL url61 = new URL("");
                    URL url62 = new URL("");
                    URL url63 = new URL("");
                    URL url64 = new URL("");
                    URL url65 = new URL("");
                    URL url66 = new URL("");
                    URL url67 = new URL("");
                    URL url68 = new URL("");
                    URL url69 = new URL("");
                    URL url70 = new URL("");
                    URL url71 = new URL("");
                    URL url72 = new URL("");
                    URL url73 = new URL("");
                    URL url74 = new URL("");
                    URL url75 = new URL("");
                    URL url76 = new URL("");
                    URL url77 = new URL("");
                    URL url78 = new URL("");
                    URL url79 = new URL("");
                    URL url80 = new URL("");
                    URL url81 = new URL("");
                    URL url82 = new URL("");
                    URL url83 = new URL("");
                    URL url84 = new URL("");
                    URL url85 = new URL("");
                    URL url86 = new URL("");
                    URL url87 = new URL("");
                    URL url88 = new URL("");
                    URL url89 = new URL("");
                    URL url90 = new URL("");
                    URL url91 = new URL("");
                    URL url92 = new URL("");
                    URL url93 = new URL("");
                    URL url94 = new URL("");
                    URL url95 = new URL("");
                    URL url96 = new URL("");
                    





                    HttpURLConnection con1 =
                            (HttpURLConnection) url1.openConnection();
                    con1.setAllowUserInteraction(false);
                    con1.setInstanceFollowRedirects(true);
                    con1.setRequestMethod("GET");
                    con1.connect();


                    HttpURLConnection con2 =
                            (HttpURLConnection) url2.openConnection();
                    con2.setAllowUserInteraction(false);
                    con2.setInstanceFollowRedirects(true);
                    con2.setRequestMethod("GET");
                    con2.connect();


                    HttpURLConnection con3 =
                            (HttpURLConnection) url3.openConnection();
                    con3.setAllowUserInteraction(false);
                    con3.setInstanceFollowRedirects(true);
                    con3.setRequestMethod("GET");
                    con3.connect();


                    HttpURLConnection con4 =
                            (HttpURLConnection) url4.openConnection();
                    con4.setAllowUserInteraction(false);
                    con4.setInstanceFollowRedirects(true);
                    con4.setRequestMethod("GET");
                    con4.connect();


                    HttpURLConnection con5 =
                            (HttpURLConnection) url5.openConnection();
                    con5.setAllowUserInteraction(false);
                    con5.setInstanceFollowRedirects(true);
                    con5.setRequestMethod("GET");
                    con5.connect();


                    HttpURLConnection con6 =
                            (HttpURLConnection) url6.openConnection();
                    con6.setAllowUserInteraction(false);
                    con6.setInstanceFollowRedirects(true);
                    con6.setRequestMethod("GET");
                    con6.connect();


                    HttpURLConnection con7 =
                            (HttpURLConnection) url7.openConnection();
                    con7.setAllowUserInteraction(false);
                    con7.setInstanceFollowRedirects(true);
                    con7.setRequestMethod("GET");
                    con7.connect();


                    HttpURLConnection con8 =
                            (HttpURLConnection) url8.openConnection();
                    con8.setAllowUserInteraction(false);
                    con8.setInstanceFollowRedirects(true);
                    con8.setRequestMethod("GET");
                    con8.connect();


                    HttpURLConnection con9 =
                            (HttpURLConnection) url9.openConnection();
                    con9.setAllowUserInteraction(false);
                    con9.setInstanceFollowRedirects(true);
                    con9.setRequestMethod("GET");
                    con9.connect();


                    HttpURLConnection con10 =
                            (HttpURLConnection) url10.openConnection();
                    con10.setAllowUserInteraction(false);
                    con10.setInstanceFollowRedirects(true);
                    con10.setRequestMethod("GET");
                    con10.connect();


                    HttpURLConnection con11 =
                            (HttpURLConnection) url11.openConnection();
                    con11.setAllowUserInteraction(false);
                    con11.setInstanceFollowRedirects(true);
                    con11.setRequestMethod("GET");
                    con11.connect();


                    HttpURLConnection con12 =
                            (HttpURLConnection) url12.openConnection();
                    con12.setAllowUserInteraction(false);
                    con12.setInstanceFollowRedirects(true);
                    con12.setRequestMethod("GET");
                    con12.connect();


                    HttpURLConnection con13 =
                            (HttpURLConnection) url13.openConnection();
                    con13.setAllowUserInteraction(false);
                    con13.setInstanceFollowRedirects(true);
                    con13.setRequestMethod("GET");
                    con13.connect();


                    HttpURLConnection con14 =
                            (HttpURLConnection) url14.openConnection();
                    con14.setAllowUserInteraction(false);
                    con14.setInstanceFollowRedirects(true);
                    con14.setRequestMethod("GET");
                    con14.connect();


                    HttpURLConnection con15 =
                            (HttpURLConnection) url15.openConnection();
                    con15.setAllowUserInteraction(false);
                    con15.setInstanceFollowRedirects(true);
                    con15.setRequestMethod("GET");
                    con15.connect();


                    HttpURLConnection con16 =
                            (HttpURLConnection) url16.openConnection();
                    con16.setAllowUserInteraction(false);
                    con16.setInstanceFollowRedirects(true);
                    con16.setRequestMethod("GET");
                    con16.connect();


                    HttpURLConnection con17 =
                            (HttpURLConnection) url17.openConnection();
                    con17.setAllowUserInteraction(false);
                    con17.setInstanceFollowRedirects(true);
                    con17.setRequestMethod("GET");
                    con17.connect();


                    HttpURLConnection con18 =
                            (HttpURLConnection) url18.openConnection();
                    con18.setAllowUserInteraction(false);
                    con18.setInstanceFollowRedirects(true);
                    con18.setRequestMethod("GET");
                    con18.connect();


                    HttpURLConnection con19 =
                            (HttpURLConnection) url19.openConnection();
                    con19.setAllowUserInteraction(false);
                    con19.setInstanceFollowRedirects(true);
                    con19.setRequestMethod("GET");
                    con19.connect();


                    HttpURLConnection con20 =
                            (HttpURLConnection) url20.openConnection();
                    con20.setAllowUserInteraction(false);
                    con20.setInstanceFollowRedirects(true);
                    con20.setRequestMethod("GET");
                    con20.connect();


                    HttpURLConnection con21 =
                            (HttpURLConnection) url21.openConnection();
                    con21.setAllowUserInteraction(false);
                    con21.setInstanceFollowRedirects(true);
                    con21.setRequestMethod("GET");
                    con21.connect();


                    HttpURLConnection con22 =
                            (HttpURLConnection) url22.openConnection();
                    con22.setAllowUserInteraction(false);
                    con22.setInstanceFollowRedirects(true);
                    con22.setRequestMethod("GET");
                    con22.connect();


                    HttpURLConnection con23 =
                            (HttpURLConnection) url23.openConnection();
                    con23.setAllowUserInteraction(false);
                    con23.setInstanceFollowRedirects(true);
                    con23.setRequestMethod("GET");
                    con23.connect();


                    HttpURLConnection con24 =
                            (HttpURLConnection) url24.openConnection();
                    con24.setAllowUserInteraction(false);
                    con24.setInstanceFollowRedirects(true);
                    con24.setRequestMethod("GET");
                    con24.connect();

                    HttpURLConnection con25 =
                            (HttpURLConnection) url25.openConnection();
                    con25.setAllowUserInteraction(false);
                    con25.setInstanceFollowRedirects(true);
                    con25.setRequestMethod("GET");
                    con25.connect();

                    HttpURLConnection con26 =
                            (HttpURLConnection) url26.openConnection();
                    con26.setAllowUserInteraction(false);
                    con26.setInstanceFollowRedirects(true);
                    con26.setRequestMethod("GET");
                    con26.connect();

                    HttpURLConnection con27 =
                            (HttpURLConnection) url27.openConnection();
                    con27.setAllowUserInteraction(false);
                    con27.setInstanceFollowRedirects(true);
                    con27.setRequestMethod("GET");
                    con27.connect();

                    HttpURLConnection con28 =
                            (HttpURLConnection) url28.openConnection();
                    con28.setAllowUserInteraction(false);
                    con28.setInstanceFollowRedirects(true);
                    con28.setRequestMethod("GET");
                    con28.connect();

                    HttpURLConnection con29 =
                            (HttpURLConnection) url29.openConnection();
                    con29.setAllowUserInteraction(false);
                    con29.setInstanceFollowRedirects(true);
                    con29.setRequestMethod("GET");
                    con29.connect();

                    HttpURLConnection con30 =
                            (HttpURLConnection) url30.openConnection();
                    con30.setAllowUserInteraction(false);
                    con30.setInstanceFollowRedirects(true);
                    con30.setRequestMethod("GET");
                    con30.connect();

                    HttpURLConnection con31 =
                            (HttpURLConnection) url31.openConnection();
                    con31.setAllowUserInteraction(false);
                    con31.setInstanceFollowRedirects(true);
                    con31.setRequestMethod("GET");
                    con31.connect();

                    HttpURLConnection con32 =
                            (HttpURLConnection) url32.openConnection();
                    con32.setAllowUserInteraction(false);
                    con32.setInstanceFollowRedirects(true);
                    con32.setRequestMethod("GET");
                    con32.connect();

                    HttpURLConnection con33 =
                            (HttpURLConnection) url33.openConnection();
                    con33.setAllowUserInteraction(false);
                    con33.setInstanceFollowRedirects(true);
                    con33.setRequestMethod("GET");
                    con33.connect();
                    
                                        HttpURLConnection con34 =
                            (HttpURLConnection) url34.openConnection();
                    con34.setAllowUserInteraction(false);
                    con34.setInstanceFollowRedirects(true);
                    con34.setRequestMethod("GET");
                    con34.connect();
                    
                                        HttpURLConnection con35 =
                            (HttpURLConnection) url35.openConnection();
                    con35.setAllowUserInteraction(false);
                    con35.setInstanceFollowRedirects(true);
                    con35.setRequestMethod("GET");
                    con35.connect();

                    HttpURLConnection con36 =
                            (HttpURLConnection) url36.openConnection();
                    con36.setAllowUserInteraction(false);
                    con36.setInstanceFollowRedirects(true);
                    con36.setRequestMethod("GET");
                    con36.connect();
                    
                    HttpURLConnection con37 =
                            (HttpURLConnection) url37.openConnection();
                    con37.setAllowUserInteraction(false);
                    con37.setInstanceFollowRedirects(true);
                    con37.setRequestMethod("GET");
                    con37.connect();
                    
                    HttpURLConnection con38 =
                            (HttpURLConnection) url38.openConnection();
                    con38.setAllowUserInteraction(false);
                    con38.setInstanceFollowRedirects(true);
                    con38.setRequestMethod("GET");
                    con38.connect();
                    
                    HttpURLConnection con39 =
                            (HttpURLConnection) url39.openConnection();
                    con39.setAllowUserInteraction(false);
                    con39.setInstanceFollowRedirects(true);
                    con39.setRequestMethod("GET");
                    con39.connect();
                    
                    HttpURLConnection con40 =
                            (HttpURLConnection) url40.openConnection();
                    con40.setAllowUserInteraction(false);
                    con40.setInstanceFollowRedirects(true);
                    con40.setRequestMethod("GET");
                    con40.connect();
                    
                    HttpURLConnection con41 =
                            (HttpURLConnection) url41.openConnection();
                    con41.setAllowUserInteraction(false);
                    con41.setInstanceFollowRedirects(true);
                    con41.setRequestMethod("GET");
                    con41.connect();
                    
                    HttpURLConnection con42 =
                            (HttpURLConnection) url42.openConnection();
                    con42.setAllowUserInteraction(false);
                    con42.setInstanceFollowRedirects(true);
                    con42.setRequestMethod("GET");
                    con42.connect();
                    
                    HttpURLConnection con43 =
                            (HttpURLConnection) url43.openConnection();
                    con43.setAllowUserInteraction(false);
                    con43.setInstanceFollowRedirects(true);
                    con43.setRequestMethod("GET");
                    con43.connect();
                    
                    HttpURLConnection con44 =
                            (HttpURLConnection) url44.openConnection();
                    con44.setAllowUserInteraction(false);
                    con44.setInstanceFollowRedirects(true);
                    con44.setRequestMethod("GET");
                    con44.connect();
                    
                    HttpURLConnection con45 =
                            (HttpURLConnection) url45.openConnection();
                    con45.setAllowUserInteraction(false);
                    con45.setInstanceFollowRedirects(true);
                    con45.setRequestMethod("GET");
                    con45.connect();
                    
                    HttpURLConnection con46 =
                            (HttpURLConnection) url46.openConnection();
                    con46.setAllowUserInteraction(false);
                    con46.setInstanceFollowRedirects(true);
                    con46.setRequestMethod("GET");
                    con46.connect();
                    
                    HttpURLConnection con47 =
                            (HttpURLConnection) url47.openConnection();
                    con47.setAllowUserInteraction(false);
                    con47.setInstanceFollowRedirects(true);
                    con47.setRequestMethod("GET");
                    con47.connect();
                    
                    HttpURLConnection con48 =
                            (HttpURLConnection) url48.openConnection();
                    con48.setAllowUserInteraction(false);
                    con48.setInstanceFollowRedirects(true);
                    con48.setRequestMethod("GET");
                    con48.connect();
                    
                    HttpURLConnection con49 =
                            (HttpURLConnection) url49.openConnection();
                    con49.setAllowUserInteraction(false);
                    con49.setInstanceFollowRedirects(true);
                    con49.setRequestMethod("GET");
                    con49.connect();
                    
                    HttpURLConnection con50 =
                            (HttpURLConnection) url50.openConnection();
                    con50.setAllowUserInteraction(false);
                    con50.setInstanceFollowRedirects(true);
                    con50.setRequestMethod("GET");
                    con50.connect();
                    
                    HttpURLConnection con51 =
                            (HttpURLConnection) url51.openConnection();
                    con51.setAllowUserInteraction(false);
                    con51.setInstanceFollowRedirects(true);
                    con51.setRequestMethod("GET");
                    con51.connect();
                    
                    HttpURLConnection con52 =
                            (HttpURLConnection) url52.openConnection();
                    con52.setAllowUserInteraction(false);
                    con52.setInstanceFollowRedirects(true);
                    con52.setRequestMethod("GET");
                    con52.connect();
                    
                    HttpURLConnection con53 =
                            (HttpURLConnection) url53.openConnection();
                    con53.setAllowUserInteraction(false);
                    con53.setInstanceFollowRedirects(true);
                    con53.setRequestMethod("GET");
                    con53.connect();
                    
                    HttpURLConnection con54 =
                            (HttpURLConnection) url54.openConnection();
                    con54.setAllowUserInteraction(false);
                    con54.setInstanceFollowRedirects(true);
                    con54.setRequestMethod("GET");
                    con54.connect();
                    
                    HttpURLConnection con55 =
                            (HttpURLConnection) url55.openConnection();
                    con55.setAllowUserInteraction(false);
                    con55.setInstanceFollowRedirects(true);
                    con55.setRequestMethod("GET");
                    con55.connect();
                    
                    HttpURLConnection con56 =
                            (HttpURLConnection) url56.openConnection();
                    con56.setAllowUserInteraction(false);
                    con56.setInstanceFollowRedirects(true);
                    con56.setRequestMethod("GET");
                    con56.connect();
                    
                    HttpURLConnection con57 =
                            (HttpURLConnection) url57.openConnection();
                    con57.setAllowUserInteraction(false);
                    con57.setInstanceFollowRedirects(true);
                    con57.setRequestMethod("GET");
                    con57.connect();
                    
                    HttpURLConnection con58 =
                            (HttpURLConnection) url58.openConnection();
                    con58.setAllowUserInteraction(false);
                    con58.setInstanceFollowRedirects(true);
                    con58.setRequestMethod("GET");
                    con58.connect();
                    
                    HttpURLConnection con59 =
                            (HttpURLConnection) url59.openConnection();
                    con59.setAllowUserInteraction(false);
                    con59.setInstanceFollowRedirects(true);
                    con59.setRequestMethod("GET");
                    con59.connect();
                    
                    HttpURLConnection con60 =
                            (HttpURLConnection) url60.openConnection();
                    con60.setAllowUserInteraction(false);
                    con60.setInstanceFollowRedirects(true);
                    con60.setRequestMethod("GET");
                    con60.connect();
                    
                    HttpURLConnection con61 =
                            (HttpURLConnection) url61.openConnection();
                    con61.setAllowUserInteraction(false);
                    con61.setInstanceFollowRedirects(true);
                    con61.setRequestMethod("GET");
                    con61.connect();
                    
                    HttpURLConnection con62 =
                            (HttpURLConnection) url62.openConnection();
                    con62.setAllowUserInteraction(false);
                    con62.setInstanceFollowRedirects(true);
                    con62.setRequestMethod("GET");
                    con62.connect();
                    
                    HttpURLConnection con63 =
                            (HttpURLConnection) url63.openConnection();
                    con63.setAllowUserInteraction(false);
                    con63.setInstanceFollowRedirects(true);
                    con63.setRequestMethod("GET");
                    con63.connect();
                    
                    HttpURLConnection con64 =
                            (HttpURLConnection) url64.openConnection();
                    con64.setAllowUserInteraction(false);
                    con64.setInstanceFollowRedirects(true);
                    con64.setRequestMethod("GET");
                    con64.connect();
                    
                    HttpURLConnection con65 =
                            (HttpURLConnection) url65.openConnection();
                    con65.setAllowUserInteraction(false);
                    con65.setInstanceFollowRedirects(true);
                    con65.setRequestMethod("GET");
                    con65.connect();
                    
                    HttpURLConnection con66 =
                            (HttpURLConnection) url66.openConnection();
                    con66.setAllowUserInteraction(false);
                    con66.setInstanceFollowRedirects(true);
                    con66.setRequestMethod("GET");
                    con66.connect();
                    
                    HttpURLConnection con67 =
                            (HttpURLConnection) url67.openConnection();
                    con67.setAllowUserInteraction(false);
                    con67.setInstanceFollowRedirects(true);
                    con67.setRequestMethod("GET");
                    con67.connect();
                    
                    HttpURLConnection con68 =
                            (HttpURLConnection) url68.openConnection();
                    con68.setAllowUserInteraction(false);
                    con68.setInstanceFollowRedirects(true);
                    con68.setRequestMethod("GET");
                    con68.connect();
                    
                    HttpURLConnection con69 =
                            (HttpURLConnection) url69.openConnection();
                    con69.setAllowUserInteraction(false);
                    con69.setInstanceFollowRedirects(true);
                    con69.setRequestMethod("GET");
                    con69.connect();
                    
                    HttpURLConnection con70 =
                            (HttpURLConnection) url70.openConnection();
                    con70.setAllowUserInteraction(false);
                    con70.setInstanceFollowRedirects(true);
                    con70.setRequestMethod("GET");
                    con70.connect();
                    
                    HttpURLConnection con71 =
                            (HttpURLConnection) url71.openConnection();
                    con71.setAllowUserInteraction(false);
                    con71.setInstanceFollowRedirects(true);
                    con71.setRequestMethod("GET");
                    con71.connect();
                    
                    HttpURLConnection con72 =
                            (HttpURLConnection) url72.openConnection();
                    con72.setAllowUserInteraction(false);
                    con72.setInstanceFollowRedirects(true);
                    con72.setRequestMethod("GET");
                    con72.connect();
                    
                    HttpURLConnection con73 =
                            (HttpURLConnection) url73.openConnection();
                    con73.setAllowUserInteraction(false);
                    con73.setInstanceFollowRedirects(true);
                    con73.setRequestMethod("GET");
                    con73.connect();
                    
                    HttpURLConnection con74 =
                            (HttpURLConnection) url74.openConnection();
                    con74.setAllowUserInteraction(false);
                    con74.setInstanceFollowRedirects(true);
                    con74.setRequestMethod("GET");
                    con74.connect();
                    
                    HttpURLConnection con75 =
                            (HttpURLConnection) url75.openConnection();
                    con75.setAllowUserInteraction(false);
                    con75.setInstanceFollowRedirects(true);
                    con75.setRequestMethod("GET");
                    con75.connect();
                    
                    HttpURLConnection con76 =
                            (HttpURLConnection) url76.openConnection();
                    con76.setAllowUserInteraction(false);
                    con76.setInstanceFollowRedirects(true);
                    con76.setRequestMethod("GET");
                    con76.connect();
                    
                    HttpURLConnection con77 =
                            (HttpURLConnection) url77.openConnection();
                    con77.setAllowUserInteraction(false);
                    con77.setInstanceFollowRedirects(true);
                    con77.setRequestMethod("GET");
                    con77.connect();
                    
                    HttpURLConnection con78 =
                            (HttpURLConnection) url78.openConnection();
                    con78.setAllowUserInteraction(false);
                    con78.setInstanceFollowRedirects(true);
                    con78.setRequestMethod("GET");
                    con78.connect();
                    
                    HttpURLConnection con79 =
                            (HttpURLConnection) url79.openConnection();
                    con79.setAllowUserInteraction(false);
                    con79.setInstanceFollowRedirects(true);
                    con79.setRequestMethod("GET");
                    con79.connect();
                    
                    HttpURLConnection con80 =
                            (HttpURLConnection) url80.openConnection();
                    con80.setAllowUserInteraction(false);
                    con80.setInstanceFollowRedirects(true);
                    con80.setRequestMethod("GET");
                    con80.connect();
                    
                    HttpURLConnection con81 =
                            (HttpURLConnection) url81.openConnection();
                    con81.setAllowUserInteraction(false);
                    con81.setInstanceFollowRedirects(true);
                    con81.setRequestMethod("GET");
                    con81.connect();
                    
                    HttpURLConnection con82 =
                            (HttpURLConnection) url82.openConnection();
                    con82.setAllowUserInteraction(false);
                    con82.setInstanceFollowRedirects(true);
                    con82.setRequestMethod("GET");
                    con82.connect();
                    
                    HttpURLConnection con83 =
                            (HttpURLConnection) url83.openConnection();
                    con83.setAllowUserInteraction(false);
                    con83.setInstanceFollowRedirects(true);
                    con83.setRequestMethod("GET");
                    con83.connect();
                    
                    HttpURLConnection con84 =
                            (HttpURLConnection) url84.openConnection();
                    con84.setAllowUserInteraction(false);
                    con84.setInstanceFollowRedirects(true);
                    con84.setRequestMethod("GET");
                    con84.connect();
                    
                    HttpURLConnection con85 =
                            (HttpURLConnection) url85.openConnection();
                    con85.setAllowUserInteraction(false);
                    con85.setInstanceFollowRedirects(true);
                    con85.setRequestMethod("GET");
                    con85.connect();
                    
                    HttpURLConnection con86 =
                            (HttpURLConnection) url86.openConnection();
                    con86.setAllowUserInteraction(false);
                    con86.setInstanceFollowRedirects(true);
                    con86.setRequestMethod("GET");
                    con86.connect();
                    
                    HttpURLConnection con87 =
                            (HttpURLConnection) url87.openConnection();
                    con87.setAllowUserInteraction(false);
                    con87.setInstanceFollowRedirects(true);
                    con87.setRequestMethod("GET");
                    con87.connect();
                    
                    HttpURLConnection con88 =
                            (HttpURLConnection) url88.openConnection();
                    con88.setAllowUserInteraction(false);
                    con88.setInstanceFollowRedirects(true);
                    con88.setRequestMethod("GET");
                    con88.connect();
                    
                    HttpURLConnection con89 =
                            (HttpURLConnection) url89.openConnection();
                    con89.setAllowUserInteraction(false);
                    con89.setInstanceFollowRedirects(true);
                    con89.setRequestMethod("GET");
                    con89.connect();
                    
                    HttpURLConnection con90 =
                            (HttpURLConnection) url90.openConnection();
                    con90.setAllowUserInteraction(false);
                    con90.setInstanceFollowRedirects(true);
                    con90.setRequestMethod("GET");
                    con90.connect();
                    
                    HttpURLConnection con91 =
                            (HttpURLConnection) url91.openConnection();
                    con91.setAllowUserInteraction(false);
                    con91.setInstanceFollowRedirects(true);
                    con91.setRequestMethod("GET");
                    con91.connect();
                    
                    HttpURLConnection con92 =
                            (HttpURLConnection) url92.openConnection();
                    con92.setAllowUserInteraction(false);
                    con92.setInstanceFollowRedirects(true);
                    con92.setRequestMethod("GET");
                    con92.connect();
                    
                    HttpURLConnection con93 =
                            (HttpURLConnection) url93.openConnection();
                    con93.setAllowUserInteraction(false);
                    con93.setInstanceFollowRedirects(true);
                    con93.setRequestMethod("GET");
                    con93.connect();
                    
                    HttpURLConnection con94 =
                            (HttpURLConnection) url94.openConnection();
                    con94.setAllowUserInteraction(false);
                    con94.setInstanceFollowRedirects(true);
                    con94.setRequestMethod("GET");
                    con94.connect();
                    
                    HttpURLConnection con95 =
                            (HttpURLConnection) url95.openConnection();
                    con95.setAllowUserInteraction(false);
                    con95.setInstanceFollowRedirects(true);
                    con95.setRequestMethod("GET");
                    con95.connect();
                    
                    HttpURLConnection con96 =
                            (HttpURLConnection) url96.openConnection();
                    con96.setAllowUserInteraction(false);
                    con96.setInstanceFollowRedirects(true);
                    con96.setRequestMethod("GET");
                    con96.connect();
                    




                    int http1 = con1.getResponseCode();
                    int http2 = con2.getResponseCode();
                    int http3 = con3.getResponseCode();
                    int http4 = con4.getResponseCode();
                    int http5 = con5.getResponseCode();
                    int http6 = con6.getResponseCode();
                    int http7 = con7.getResponseCode();
                    int http8 = con8.getResponseCode();
                    int http9 = con9.getResponseCode();
                    int http10 = con10.getResponseCode();
                    int http11 = con11.getResponseCode();
                    int http12 = con12.getResponseCode();
                    int http13 = con13.getResponseCode();
                    int http14 = con14.getResponseCode();
                    int http15 = con15.getResponseCode();
                    int http16 = con16.getResponseCode();
                    int http17 = con17.getResponseCode();
                    int http18 = con18.getResponseCode();
                    int http19 = con19.getResponseCode();
                    int http20 = con20.getResponseCode();
                    int http21 = con21.getResponseCode();
                    int http22 = con22.getResponseCode();
                    int http23 = con23.getResponseCode();
                    int http24 = con24.getResponseCode();
                    int http25 = con25.getResponseCode();
                    int http26 = con26.getResponseCode();
                    int http27 = con27.getResponseCode();
                    int http28 = con28.getResponseCode();
                    int http29 = con29.getResponseCode();
                    int http30 = con30.getResponseCode();
                    int http31 = con31.getResponseCode();
                    int http32 = con32.getResponseCode();
                    int http33 = con33.getResponseCode();
                    int http34 = con34.getResponseCode();
                    int http35 = con35.getResponseCode();
                    int http36 = con36.getResponseCode();
                    int http37 = con37.getResponseCode();
                    int http38 = con38.getResponseCode();
                    int http39 = con39.getResponseCode();
                    int http40 = con40.getResponseCode();
                    int http41 = con41.getResponseCode();
                    int http42 = con42.getResponseCode();
                    int http43 = con43.getResponseCode();
                    int http44 = con44.getResponseCode();
                    int http45 = con45.getResponseCode();
                    int http46 = con46.getResponseCode();
                    int http47 = con47.getResponseCode();
                    int http48 = con48.getResponseCode();
                    int http49 = con49.getResponseCode();
                    int http50 = con50.getResponseCode();
                    int http51 = con51.getResponseCode();
                    int http52 = con52.getResponseCode();
                    int http53 = con53.getResponseCode();
                    int http54 = con54.getResponseCode();
                    int http55 = con55.getResponseCode();
                    int http56 = con56.getResponseCode();
                    int http57 = con57.getResponseCode();
                    int http58 = con58.getResponseCode();
                    int http59 = con59.getResponseCode();
                    int http60 = con60.getResponseCode();
                    int http61 = con61.getResponseCode();
                    int http62 = con62.getResponseCode();
                    int http63 = con63.getResponseCode();
                    int http64 = con64.getResponseCode();
                    int http65 = con65.getResponseCode();
                    int http66 = con66.getResponseCode();
                    int http67 = con67.getResponseCode();
                    int http68 = con68.getResponseCode();
                    int http69 = con69.getResponseCode();
                    int http70 = con70.getResponseCode();
                    int http71 = con71.getResponseCode();
                    int http72 = con72.getResponseCode();
                    int http73 = con73.getResponseCode();
                    int http74 = con74.getResponseCode();
                    int http75 = con75.getResponseCode();
                    int http76 = con76.getResponseCode();
                    int http77 = con77.getResponseCode();
                    int http78 = con78.getResponseCode();
                    int http79 = con79.getResponseCode();
                    int http80 = con80.getResponseCode();
                    int http81 = con81.getResponseCode();
                    int http82 = con82.getResponseCode();
                    int http83 = con83.getResponseCode();
                    int http84 = con84.getResponseCode();
                    int http85 = con65.getResponseCode();
                    int http86 = con86.getResponseCode();
                    int http87 = con87.getResponseCode();
                    int http88 = con88.getResponseCode();
                    int http89 = con89.getResponseCode();
                    int http90 = con90.getResponseCode();
                    int http91 = con91.getResponseCode();
                    int http92 = con92.getResponseCode();
                    int http93 = con93.getResponseCode();
                    int http94 = con94.getResponseCode();
                    int http95 = con95.getResponseCode();
                    int http96 = con96.getResponseCode();




                    if(http1 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http2 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http3 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http4 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http5 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http6 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http7 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http8 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http9 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http10 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http11 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http12 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http13 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http14 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http15 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http16 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http17 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http18 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http19 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http20 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http21 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http22 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http23 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http24 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http25 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http26 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http27 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http28 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http29 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http30 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http31 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http32 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http33 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http34 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http35 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http36 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http37 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http38 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http39 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http40 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http41 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http42 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http43 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http44 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http45 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http46 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http47 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http48 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http49 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http50 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http51 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http52 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http53 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http54 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http55 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http56 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http57 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http58 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http59 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http60 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http61 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http62 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http63 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http64 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http65 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http66 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http67 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http68 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http69 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http70 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http71 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http72 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http73 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http74 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http75 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http76 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http77 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http78 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http79 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http80 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http81 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http82 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http83 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http84 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http85 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http86 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http87 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http88 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http89 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http90 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http91 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http92 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http93 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http94 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http95 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http96 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    
                    

                    // Input Stream
                    DataInputStream dataIn1 = new DataInputStream(
                            con1.getInputStream());
                    DataInputStream dataIn2 = new DataInputStream(
                            con2.getInputStream());
                    DataInputStream dataIn3 = new DataInputStream(
                            con3.getInputStream());
                    DataInputStream dataIn4 = new DataInputStream(
                            con4.getInputStream());
                    DataInputStream dataIn5 = new DataInputStream(
                            con5.getInputStream());
                    DataInputStream dataIn6 = new DataInputStream(
                            con6.getInputStream());
                    DataInputStream dataIn7 = new DataInputStream(
                            con7.getInputStream());
                    DataInputStream dataIn8 = new DataInputStream(
                            con8.getInputStream());
                    DataInputStream dataIn9 = new DataInputStream(
                            con9.getInputStream());
                    DataInputStream dataIn10 = new DataInputStream(
                            con10.getInputStream());
                    DataInputStream dataIn11 = new DataInputStream(
                            con11.getInputStream());
                    DataInputStream dataIn12 = new DataInputStream(
                            con12.getInputStream());
                    DataInputStream dataIn13 = new DataInputStream(
                            con13.getInputStream());
                    DataInputStream dataIn14 = new DataInputStream(
                            con14.getInputStream());
                    DataInputStream dataIn15 = new DataInputStream(
                            con15.getInputStream());
                    DataInputStream dataIn16 = new DataInputStream(
                            con16.getInputStream());
                    DataInputStream dataIn17 = new DataInputStream(
                            con17.getInputStream());
                    DataInputStream dataIn18 = new DataInputStream(
                            con18.getInputStream());
                    DataInputStream dataIn19 = new DataInputStream(
                            con19.getInputStream());
                    DataInputStream dataIn20 = new DataInputStream(
                            con20.getInputStream());
                    DataInputStream dataIn21 = new DataInputStream(
                            con21.getInputStream());
                    DataInputStream dataIn22 = new DataInputStream(
                            con22.getInputStream());
                    DataInputStream dataIn23 = new DataInputStream(
                            con23.getInputStream());
                    DataInputStream dataIn24 = new DataInputStream(
                            con24.getInputStream());
                    DataInputStream dataIn25 = new DataInputStream(
                            con25.getInputStream());
                    DataInputStream dataIn26 = new DataInputStream(
                            con26.getInputStream());
                    DataInputStream dataIn27 = new DataInputStream(
                            con27.getInputStream());
                    DataInputStream dataIn28 = new DataInputStream(
                            con28.getInputStream());
                    DataInputStream dataIn29 = new DataInputStream(
                            con29.getInputStream());
                    DataInputStream dataIn30 = new DataInputStream(
                            con30.getInputStream());
                    DataInputStream dataIn31 = new DataInputStream(
                            con31.getInputStream());
                    DataInputStream dataIn32 = new DataInputStream(
                            con32.getInputStream());
                    DataInputStream dataIn33 = new DataInputStream(
                            con33.getInputStream());
                    DataInputStream dataIn34 = new DataInputStream(
                            con34.getInputStream());
                    DataInputStream dataIn35 = new DataInputStream(
                            con35.getInputStream());
                    DataInputStream dataIn36 = new DataInputStream(
                            con36.getInputStream());
                    DataInputStream dataIn37 = new DataInputStream(
                            con37.getInputStream());
                    DataInputStream dataIn38 = new DataInputStream(
                            con38.getInputStream());
                    DataInputStream dataIn39 = new DataInputStream(
                            con39.getInputStream());
                    DataInputStream dataIn40 = new DataInputStream(
                            con40.getInputStream());
                    DataInputStream dataIn41 = new DataInputStream(
                            con41.getInputStream());
                    DataInputStream dataIn42 = new DataInputStream(
                            con42.getInputStream());
                    DataInputStream dataIn43 = new DataInputStream(
                            con43.getInputStream());
                    DataInputStream dataIn44 = new DataInputStream(
                            con44.getInputStream());
                    DataInputStream dataIn45 = new DataInputStream(
                            con45.getInputStream());
                    DataInputStream dataIn46 = new DataInputStream(
                            con46.getInputStream());
                    DataInputStream dataIn47 = new DataInputStream(
                            con47.getInputStream());
                    DataInputStream dataIn48 = new DataInputStream(
                            con48.getInputStream());
                    DataInputStream dataIn49 = new DataInputStream(
                            con49.getInputStream());
                    DataInputStream dataIn50 = new DataInputStream(
                            con50.getInputStream());
                    DataInputStream dataIn51 = new DataInputStream(
                            con51.getInputStream());
                    DataInputStream dataIn52 = new DataInputStream(
                            con52.getInputStream());
                    DataInputStream dataIn53 = new DataInputStream(
                            con53.getInputStream());
                    DataInputStream dataIn54 = new DataInputStream(
                            con54.getInputStream());
                    DataInputStream dataIn55 = new DataInputStream(
                            con55.getInputStream());
                    DataInputStream dataIn56 = new DataInputStream(
                            con56.getInputStream());
                    DataInputStream dataIn57 = new DataInputStream(
                            con57.getInputStream());
                    DataInputStream dataIn58 = new DataInputStream(
                            con58.getInputStream());
                    DataInputStream dataIn59 = new DataInputStream(
                            con59.getInputStream());
                    DataInputStream dataIn60 = new DataInputStream(
                            con60.getInputStream());
                    DataInputStream dataIn61 = new DataInputStream(
                            con61.getInputStream());
                    DataInputStream dataIn62 = new DataInputStream(
                            con62.getInputStream());
                    DataInputStream dataIn63 = new DataInputStream(
                            con63.getInputStream());
                    DataInputStream dataIn64 = new DataInputStream(
                            con64.getInputStream());
                    DataInputStream dataIn65 = new DataInputStream(
                            con65.getInputStream());
                    DataInputStream dataIn66 = new DataInputStream(
                            con66.getInputStream());
                    DataInputStream dataIn67 = new DataInputStream(
                            con67.getInputStream());
                    DataInputStream dataIn68 = new DataInputStream(
                            con68.getInputStream());
                    DataInputStream dataIn69 = new DataInputStream(
                            con69.getInputStream());
                    DataInputStream dataIn70 = new DataInputStream(
                            con70.getInputStream());
                    DataInputStream dataIn71 = new DataInputStream(
                            con71.getInputStream());
                    DataInputStream dataIn72 = new DataInputStream(
                            con72.getInputStream());
                    DataInputStream dataIn73 = new DataInputStream(
                            con73.getInputStream());
                    DataInputStream dataIn74 = new DataInputStream(
                            con74.getInputStream());
                    DataInputStream dataIn75 = new DataInputStream(
                            con75.getInputStream());
                    DataInputStream dataIn76 = new DataInputStream(
                            con76.getInputStream());
                    DataInputStream dataIn77 = new DataInputStream(
                            con77.getInputStream());
                    DataInputStream dataIn78 = new DataInputStream(
                            con78.getInputStream());
                    DataInputStream dataIn79 = new DataInputStream(
                            con79.getInputStream());
                    DataInputStream dataIn80 = new DataInputStream(
                            con80.getInputStream());
                    DataInputStream dataIn81 = new DataInputStream(
                            con81.getInputStream());
                    DataInputStream dataIn82 = new DataInputStream(
                            con82.getInputStream());
                    DataInputStream dataIn83 = new DataInputStream(
                            con83.getInputStream());
                    DataInputStream dataIn84 = new DataInputStream(
                            con84.getInputStream());
                    DataInputStream dataIn85 = new DataInputStream(
                            con85.getInputStream());
                    DataInputStream dataIn86 = new DataInputStream(
                            con86.getInputStream());
                    DataInputStream dataIn87 = new DataInputStream(
                            con87.getInputStream());
                    DataInputStream dataIn88 = new DataInputStream(
                            con88.getInputStream());
                    DataInputStream dataIn89 = new DataInputStream(
                            con89.getInputStream());
                    DataInputStream dataIn90 = new DataInputStream(
                            con90.getInputStream());
                    DataInputStream dataIn91 = new DataInputStream(
                            con91.getInputStream());
                    DataInputStream dataIn92 = new DataInputStream(
                            con92.getInputStream());
                    DataInputStream dataIn93 = new DataInputStream(
                            con93.getInputStream());
                    DataInputStream dataIn94 = new DataInputStream(
                            con94.getInputStream());
                    DataInputStream dataIn95 = new DataInputStream(
                            con95.getInputStream());
                    DataInputStream dataIn96 = new DataInputStream(
                            con96.getInputStream());

                    





                    // Output Stream
                    DataOutputStream dataOut1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"industrialcraft-2-2.8.187-ex112.jar")));
                    DataOutputStream dataOut2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut3
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut4
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut5
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut6
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut7
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut8
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut9
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut10
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut11
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut12
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut13
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut14
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut15
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut16
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut17
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut18
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut19
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut20
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut21
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut22
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut23
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut24
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut25
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut26
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut27
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut28
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut29
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut30
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut31
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut32
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut33
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut34
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut35
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut36
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut37
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut38
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut39
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut40
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut41
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut42
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut43
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut44
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut45
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut46
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut47
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut48
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut49
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut50
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut51
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut52
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut53
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut54
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut55
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut56
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut57
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut58
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut59
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut60
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut61
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut62
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut63
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut64
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut65
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut66
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut67
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut68
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut69
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut70
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut71
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut72
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut73
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut74
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut75
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut76
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut77
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut78
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut79
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut80
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut81
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut82
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut83
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut84
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut85
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut86
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut87
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut88
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut89
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut90
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut91
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut92
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut93
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut94
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut95
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut96
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"ここにMod名を入力")));




                    // Read Data
                    byte[] b = new byte[4096];
                    int readByte = 0;

                    while(-1 != (readByte = dataIn1.read(b))){
                        dataOut1.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn2.read(b))){
                        dataOut2.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn3.read(b))){
                        dataOut3.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn4.read(b))){
                        dataOut4.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn5.read(b))){
                        dataOut5.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn6.read(b))){
                        dataOut6.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn7.read(b))){
                        dataOut7.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn8.read(b))){
                        dataOut8.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn9.read(b))){
                        dataOut9.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn10.read(b))){
                        dataOut10.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn11.read(b))){
                        dataOut11.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn12.read(b))){
                        dataOut12.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn13.read(b))){
                        dataOut13.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn14.read(b))){
                        dataOut14.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn15.read(b))){
                        dataOut15.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn16.read(b))){
                        dataOut16.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn17.read(b))){
                        dataOut17.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn18.read(b))){
                        dataOut18.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn19.read(b))){
                        dataOut19.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn20.read(b))){
                        dataOut20.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn21.read(b))){
                        dataOut21.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn22.read(b))){
                        dataOut22.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn23.read(b))){
                        dataOut23.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn24.read(b))){
                        dataOut24.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn25.read(b))){
                        dataOut25.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn26.read(b))){
                        dataOut26.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn27.read(b))){
                        dataOut27.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn28.read(b))){
                        dataOut28.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn29.read(b))){
                        dataOut29.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn30.read(b))){
                        dataOut30.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn31.read(b))){
                        dataOut31.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn32.read(b))){
                        dataOut32.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn33.read(b))){
                        dataOut33.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn34.read(b))){
                        dataOut34.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn35.read(b))){
                        dataOut35.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn36.read(b))){
                        dataOut36.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn37.read(b))){
                        dataOut37.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn38.read(b))){
                        dataOut38.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn39.read(b))){
                        dataOut39.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn40.read(b))){
                        dataOut40.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn41.read(b))){
                        dataOut41.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn42.read(b))){
                        dataOut42.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn43.read(b))){
                        dataOut43.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn44.read(b))){
                        dataOut44.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn45.read(b))){
                        dataOut45.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn46.read(b))){
                        dataOut46.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn47.read(b))){
                        dataOut47.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn48.read(b))){
                        dataOut48.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn49.read(b))){
                        dataOut49.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn50.read(b))){
                        dataOut50.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn51.read(b))){
                        dataOut51.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn52.read(b))){
                        dataOut52.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn53.read(b))){
                        dataOut53.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn54.read(b))){
                        dataOut54.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn55.read(b))){
                        dataOut55.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn56.read(b))){
                        dataOut56.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn57.read(b))){
                        dataOut57.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn58.read(b))){
                        dataOut58.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn59.read(b))){
                        dataOut59.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn60.read(b))){
                        dataOut60.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn61.read(b))){
                        dataOut61.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn62.read(b))){
                        dataOut62.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn63.read(b))){
                        dataOut63.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn64.read(b))){
                        dataOut64.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn65.read(b))){
                        dataOut65.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn66.read(b))){
                        dataOut66.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn67.read(b))){
                        dataOut67.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn68.read(b))){
                        dataOut68.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn69.read(b))){
                        dataOut69.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn70.read(b))){
                        dataOut70.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn71.read(b))){
                        dataOut71.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn72.read(b))){
                        dataOut72.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn73.read(b))){
                        dataOut73.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn74.read(b))){
                        dataOut74.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn75.read(b))){
                        dataOut75.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn76.read(b))){
                        dataOut76.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn77.read(b))){
                        dataOut77.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn78.read(b))){
                        dataOut78.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn79.read(b))){
                        dataOut79.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn80.read(b))){
                        dataOut80.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn81.read(b))){
                        dataOut81.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn82.read(b))){
                        dataOut82.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn83.read(b))){
                        dataOut83.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn84.read(b))){
                        dataOut84.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn85.read(b))){
                        dataOut85.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn86.read(b))){
                        dataOut86.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn87.read(b))){
                        dataOut87.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn88.read(b))){
                        dataOut88.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn89.read(b))){
                        dataOut89.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn90.read(b))){
                        dataOut90.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn91.read(b))){
                        dataOut91.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn92.read(b))){
                        dataOut92.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn93.read(b))){
                        dataOut93.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn94.read(b))){
                        dataOut94.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn95.read(b))){
                        dataOut95.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn96.read(b))){
                        dataOut96.write(b, 0, readByte);
                    }


                    // Close Stream
                    dataIn1.close();
                    dataOut1.close();

                    dataIn2.close();
                    dataOut2.close();

                    dataIn3.close();
                    dataOut3.close();

                    dataIn4.close();
                    dataOut4.close();

                    dataIn5.close();
                    dataOut5.close();

                    dataIn6.close();
                    dataOut6.close();

                    dataIn7.close();
                    dataOut7.close();

                    dataIn8.close();
                    dataOut8.close();

                    dataIn9.close();
                    dataOut9.close();

                    dataIn10.close();
                    dataOut10.close();

                    dataIn11.close();
                    dataOut11.close();

                    dataIn12.close();
                    dataOut12.close();

                    dataIn13.close();
                    dataOut13.close();

                    dataIn14.close();
                    dataOut14.close();

                    dataIn15.close();
                    dataOut15.close();

                    dataIn16.close();
                    dataOut16.close();

                    dataIn17.close();
                    dataOut17.close();

                    dataIn18.close();
                    dataOut18.close();

                    dataIn19.close();
                    dataOut19.close();

                    dataIn20.close();
                    dataOut20.close();

                    dataIn21.close();
                    dataOut21.close();

                    dataIn22.close();
                    dataOut22.close();

                    dataIn23.close();
                    dataOut23.close();

                    dataIn24.close();
                    dataOut24.close();

                    dataIn25.close();
                    dataOut25.close();

                    dataIn26.close();
                    dataOut26.close();

                    dataIn27.close();
                    dataOut27.close();

                    dataIn28.close();
                    dataOut28.close();

                    dataIn29.close();
                    dataOut29.close();

                    dataIn30.close();
                    dataOut30.close();

                    dataIn31.close();
                    dataOut31.close();

                    dataIn32.close();
                    dataOut32.close();

                    dataIn33.close();
                    dataOut33.close();

                    dataIn34.close();
                    dataOut34.close();
                    
                    dataIn35.close();
                    dataOut35.close();
                    
                    dataIn36.close();
                    dataOut36.close();
                    
                    dataIn37.close();
                    dataOut37.close();
                    
                    dataIn38.close();
                    dataOut38.close();
                    
                    dataIn39.close();
                    dataOut39.close();
                    
                    dataIn40.close();
                    dataOut40.close();
                    
                    dataIn41.close();
                    dataOut41.close();
                    
                    dataIn42.close();
                    dataOut42.close();
                    
                    dataIn43.close();
                    dataOut43.close();
                    
                    dataIn44.close();
                    dataOut44.close();
                    
                    dataIn45.close();
                    dataOut45.close();
                    
                    dataIn46.close();
                    dataOut46.close();
                    
                    dataIn47.close();
                    dataOut47.close();
                    
                    dataIn48.close();
                    dataOut48.close();
                    
                    dataIn49.close();
                    dataOut49.close();
                    
                    dataIn50.close();
                    dataOut50.close();
                    
                    dataIn51.close();
                    dataOut51.close();
                    
                    dataIn52.close();
                    dataOut52.close();
                    
                    dataIn53.close();
                    dataOut53.close();
                    
                    dataIn54.close();
                    dataOut54.close();
                    
                    dataIn55.close();
                    dataOut55.close();
                    
                    dataIn56.close();
                    dataOut56.close();
                    
                    dataIn57.close();
                    dataOut57.close();
                    
                    dataIn58.close();
                    dataOut58.close();
                    
                    dataIn59.close();
                    dataOut59.close();
                    
                    dataIn60.close();
                    dataOut60.close();
                    
                    dataIn61.close();
                    dataOut61.close();
                    
                    dataIn62.close();
                    dataOut62.close();
                    
                    dataIn63.close();
                    dataOut63.close();
                    
                    dataIn64.close();
                    dataOut64.close();
                    
                    dataIn65.close();
                    dataOut65.close();
                    
                    dataIn66.close();
                    dataOut66.close();
                    
                    dataIn67.close();
                    dataOut67.close();
                    
                    dataIn68.close();
                    dataOut68.close();
                    
                    dataIn69.close();
                    dataOut69.close();
                    
                    dataIn70.close();
                    dataOut70.close();
                    
                    dataIn71.close();
                    dataOut71.close();
                    
                    dataIn72.close();
                    dataOut72.close();
                    
                    dataIn73.close();
                    dataOut73.close();
                    
                    dataIn74.close();
                    dataOut74.close();
                    
                    dataIn75.close();
                    dataOut75.close();
                    
                    dataIn76.close();
                    dataOut76.close();
                    
                    dataIn77.close();
                    dataOut77.close();
                    
                    dataIn78.close();
                    dataOut78.close();
                    
                    dataIn79.close();
                    dataOut79.close();
                    
                    dataIn80.close();
                    dataOut80.close();
                    
                    dataIn81.close();
                    dataOut81.close();
                    
                    dataIn82.close();
                    dataOut82.close();
                    
                    dataIn83.close();
                    dataOut83.close();
                    
                    dataIn84.close();
                    dataOut84.close();
                    
                    dataIn85.close();
                    dataOut85.close();
                    
                    dataIn86.close();
                    dataOut86.close();
                    
                    dataIn87.close();
                    dataOut87.close();
                    
                    dataIn88.close();
                    dataOut88.close();
                    
                    dataIn89.close();
                    dataOut89.close();
                    
                    dataIn90.close();
                    dataOut90.close();
                    
                    dataIn91.close();
                    dataOut91.close();
                    
                    dataIn92.close();
                    dataOut92.close();
                    
                    dataIn93.close();
                    dataOut93.close();
                    
                    dataIn94.close();
                    dataOut94.close();
                    
                    dataIn95.close();
                    dataOut95.close();
                    
                    dataIn96.close();
                    dataOut96.close();


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (ProtocolException e) {
                    JOptionPane.showMessageDialog(null,"使用中のプロトコルでエラーが発生しました。   エラーコード:1");
                } catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(null,"URL書式が間違っています。   エラーコード:2");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"なんらかの入出力例外が発生しました。   エラーコード:3");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"例外が発生しました。    エラーコード:4");
                } finally {
                    JOptionPane.showMessageDialog(null,"ダウンロードが完了しました。");
                }

                // Linuxであったときの処理
            } else if(osname.contains("Linux")){
                String userhome = System.getProperty("user.home");
                try {
                    URL url1 = new URL("https://web.archive.org/web/20190715131820if_/https://forum.minecraftuser.jp/download/file.php?id=75930");
                    //url1はストレージボックス
                    URL url2 = new URL("https://media.forgecdn.net/files/2518/667/Baubles-1.12-1.5.2.jar");
                    //url2はBaubles
                    URL url3 = new URL("https://media.forgecdn.net/files/2698/39/Botania+r1.10-361.jar");
                    //url3はボタニア
                    URL url4 = new URL("https://media.forgecdn.net/files/2744/222/BrandonsCore-1.12.2-2.4.17.208-universal.jar");
                    //url4はBrandonsCore
                    URL url5 = new URL("https://media.forgecdn.net/files/2709/87/Cavern_1.12.2-v2.2.0.jar");
                    //url5はCavern2
                    URL url6 = new URL("https://media.forgecdn.net/files/2450/900/Chameleon-1.12-4.1.3.jar");
                    //url6はカメレオン
                    URL url7 = new URL("https://media.forgecdn.net/files/2779/848/CodeChickenLib-1.12.2-3.2.3.358-universal.jar");
                    //url7はCodeChickenLib
                    URL url8 = new URL("https://media.forgecdn.net/files/2633/646/CompactSolars-1.12.2-5.0.18.341-universal.jar");
                    //url8はCompactSolars
                    URL url9 = new URL("https://media.forgecdn.net/files/2753/317/Draconic-Evolution-1.12.2-2.3.24.349-universal.jar");
                    //ドラエボ
                    URL url10 = new URL("https://media.forgecdn.net/files/2822/401/EnderCore-1.12.2-0.5.73.jar");
                    //エンダーコア
                    URL url11 = new URL("https://media.forgecdn.net/files/2858/816/EnderIO-1.12.2-5.1.55.jar");
                    //エンダーIO
                    URL url12 = new URL("https://media.forgecdn.net/files/2678/374/extrautils2-1.12-1.9.9.jar");
                    //EXUtil2
                    URL url13 = new URL("https://media.forgecdn.net/files/2640/952/Forgelin-1.8.2.jar");
                    //Forgelin
                    URL url14 = new URL("https://media.forgecdn.net/files/2633/136/gci-0.6-1.12.2.jar");
                    //gci-0.6
                    URL url15 = new URL("https://media.forgecdn.net/files/2524/880/gravestone-1.10.1.jar");
                    //墓石
                    URL url16 = new URL("https://media.forgecdn.net/files/2676/501/ImmersiveEngineering-0.12-89.jar");
                    //ImmersiveEngineering
                    URL url17 = new URL("https://media.forgecdn.net/files/2746/892/industrialcraft-2-2.8.170-ex112.jar");
                    //IC2ex
                    URL url18 = new URL("https://media.forgecdn.net/files/2713/386/Mantle-1.12-1.3.3.55.jar");
                    //Mantle
                    URL url19 = new URL("https://media.forgecdn.net/files/2835/175/Mekanism-1.12.2-9.8.3.390.jar");
                    //Mekanism
                    URL url20 = new URL("https://media.forgecdn.net/files/2835/177/MekanismGenerators-1.12.2-9.8.3.390.jar");
                    //MekanismGen
                    URL url21 = new URL("https://media.forgecdn.net/files/2835/178/MekanismTools-1.12.2-9.8.3.390.jar");
                    //MekanismTools
                    URL url22 = new URL("https://media.forgecdn.net/files/2789/626/plustic-7.1.6.1.jar");
                    //PlusTic
                    URL url23 = new URL("https://media.forgecdn.net/files/2623/90/RedstoneFlux-1.12-2.1.0.6-universal.jar");
                    //RedstoneFLUX
                    URL url24 = new URL("https://media.forgecdn.net/files/2745/458/refinedstorage-1.6.15.jar");
                    //RefindStrage
                    URL url25 = new URL("https://media.forgecdn.net/files/2777/929/StorageDrawers-1.12.2-5.4.0.jar");
                    //StorageDrawers
                    URL url26 = new URL("https://media.forgecdn.net/files/2809/406/TConstruct-1.12.2-2.13.0.171.jar");
                    //TinCon
                    URL url27 = new URL("https://media.forgecdn.net/files/2580/52/tesla-core-lib-1.12.2-1.0.15.jar");
                    //Tesla-Core-Lib
                    URL url28 = new URL("https://media.forgecdn.net/files/2629/23/Thaumcraft-1.12.2-6.1.BETA26.jar");
                    //ソームクラフト,Thaumcraft
                    URL url29 = new URL("https://media.forgecdn.net/files/2596/484/thaumictinkerer-1.12.2-5.0-353c71c.jar");
                    //Thaumic Tinkerer
                    URL url30 = new URL("https://media.forgecdn.net/files/2559/89/ThaumicInventoryScanning_1.12.2-2.0.10.jar");
                    //Thaumic Inventory Scanning
                    URL url31 = new URL("https://media.forgecdn.net/files/2630/860/TinkerToolLeveling-1.12.2-1.1.0.jar");
                    //TinkerToolLeveling
                    URL url32 = new URL("https://media.forgecdn.net/files/2849/448/TofuCraftReload-0.1.0.4.jar");
                    //トーフクラフト,TohucraftR
                    URL url33 = new URL("https://media.forgecdn.net/files/2478/952/ComputerCraft1.80pr1.jar");
                    //CC,ComputerCraft
                    URL url34 = new URL("https://media.forgecdn.net/files/2846/200/Sakura-V0.0.7-MC1.12.2.jar");
                    //さくらMod,桜Mod
                    URL url35 = new URL("");
                    URL url36 = new URL("");
                    URL url37 = new URL("");
                    URL url38 = new URL("");
                    URL url39 = new URL("");
                    URL url40 = new URL("");
                    URL url41 = new URL("");
                    URL url42 = new URL("");
                    URL url43 = new URL("");
                    URL url44 = new URL("");
                    URL url45 = new URL("");
                    URL url46 = new URL("");
                    URL url47 = new URL("");
                    URL url48 = new URL("");
                    URL url49 = new URL("");
                    URL url50 = new URL("");
                    URL url51 = new URL("");
                    URL url52 = new URL("");
                    URL url53 = new URL("");
                    URL url54 = new URL("");
                    URL url55 = new URL("");
                    URL url56 = new URL("");
                    URL url57 = new URL("");
                    URL url58 = new URL("");
                    URL url59 = new URL("");
                    URL url60 = new URL("");
                    URL url61 = new URL("");
                    URL url62 = new URL("");
                    URL url63 = new URL("");
                    URL url64 = new URL("");
                    URL url65 = new URL("");
                    URL url66 = new URL("");
                    URL url67 = new URL("");
                    URL url68 = new URL("");
                    URL url69 = new URL("");
                    URL url70 = new URL("");
                    URL url71 = new URL("");
                    URL url72 = new URL("");
                    URL url73 = new URL("");
                    URL url74 = new URL("");
                    URL url75 = new URL("");
                    URL url76 = new URL("");
                    URL url77 = new URL("");
                    URL url78 = new URL("");
                    URL url79 = new URL("");
                    URL url80 = new URL("");
                    URL url81 = new URL("");
                    URL url82 = new URL("");
                    URL url83 = new URL("");
                    URL url84 = new URL("");
                    URL url85 = new URL("");
                    URL url86 = new URL("");
                    URL url87 = new URL("");
                    URL url88 = new URL("");
                    URL url89 = new URL("");
                    URL url90 = new URL("");
                    URL url91 = new URL("");
                    URL url92 = new URL("");
                    URL url93 = new URL("");
                    URL url94 = new URL("");
                    URL url95 = new URL("");
                    URL url96 = new URL("");





                    HttpURLConnection con1 =
                            (HttpURLConnection) url1.openConnection();
                    con1.setAllowUserInteraction(false);
                    con1.setInstanceFollowRedirects(true);
                    con1.setRequestMethod("GET");
                    con1.connect();


                    HttpURLConnection con2 =
                            (HttpURLConnection) url2.openConnection();
                    con2.setAllowUserInteraction(false);
                    con2.setInstanceFollowRedirects(true);
                    con2.setRequestMethod("GET");
                    con2.connect();


                    HttpURLConnection con3 =
                            (HttpURLConnection) url3.openConnection();
                    con3.setAllowUserInteraction(false);
                    con3.setInstanceFollowRedirects(true);
                    con3.setRequestMethod("GET");
                    con3.connect();


                    HttpURLConnection con4 =
                            (HttpURLConnection) url4.openConnection();
                    con4.setAllowUserInteraction(false);
                    con4.setInstanceFollowRedirects(true);
                    con4.setRequestMethod("GET");
                    con4.connect();


                    HttpURLConnection con5 =
                            (HttpURLConnection) url5.openConnection();
                    con5.setAllowUserInteraction(false);
                    con5.setInstanceFollowRedirects(true);
                    con5.setRequestMethod("GET");
                    con5.connect();


                    HttpURLConnection con6 =
                            (HttpURLConnection) url6.openConnection();
                    con6.setAllowUserInteraction(false);
                    con6.setInstanceFollowRedirects(true);
                    con6.setRequestMethod("GET");
                    con6.connect();


                    HttpURLConnection con7 =
                            (HttpURLConnection) url7.openConnection();
                    con7.setAllowUserInteraction(false);
                    con7.setInstanceFollowRedirects(true);
                    con7.setRequestMethod("GET");
                    con7.connect();


                    HttpURLConnection con8 =
                            (HttpURLConnection) url8.openConnection();
                    con8.setAllowUserInteraction(false);
                    con8.setInstanceFollowRedirects(true);
                    con8.setRequestMethod("GET");
                    con8.connect();


                    HttpURLConnection con9 =
                            (HttpURLConnection) url9.openConnection();
                    con9.setAllowUserInteraction(false);
                    con9.setInstanceFollowRedirects(true);
                    con9.setRequestMethod("GET");
                    con9.connect();


                    HttpURLConnection con10 =
                            (HttpURLConnection) url10.openConnection();
                    con10.setAllowUserInteraction(false);
                    con10.setInstanceFollowRedirects(true);
                    con10.setRequestMethod("GET");
                    con10.connect();


                    HttpURLConnection con11 =
                            (HttpURLConnection) url11.openConnection();
                    con11.setAllowUserInteraction(false);
                    con11.setInstanceFollowRedirects(true);
                    con11.setRequestMethod("GET");
                    con11.connect();


                    HttpURLConnection con12 =
                            (HttpURLConnection) url12.openConnection();
                    con12.setAllowUserInteraction(false);
                    con12.setInstanceFollowRedirects(true);
                    con12.setRequestMethod("GET");
                    con12.connect();


                    HttpURLConnection con13 =
                            (HttpURLConnection) url13.openConnection();
                    con13.setAllowUserInteraction(false);
                    con13.setInstanceFollowRedirects(true);
                    con13.setRequestMethod("GET");
                    con13.connect();


                    HttpURLConnection con14 =
                            (HttpURLConnection) url14.openConnection();
                    con14.setAllowUserInteraction(false);
                    con14.setInstanceFollowRedirects(true);
                    con14.setRequestMethod("GET");
                    con14.connect();


                    HttpURLConnection con15 =
                            (HttpURLConnection) url15.openConnection();
                    con15.setAllowUserInteraction(false);
                    con15.setInstanceFollowRedirects(true);
                    con15.setRequestMethod("GET");
                    con15.connect();


                    HttpURLConnection con16 =
                            (HttpURLConnection) url16.openConnection();
                    con16.setAllowUserInteraction(false);
                    con16.setInstanceFollowRedirects(true);
                    con16.setRequestMethod("GET");
                    con16.connect();


                    HttpURLConnection con17 =
                            (HttpURLConnection) url17.openConnection();
                    con17.setAllowUserInteraction(false);
                    con17.setInstanceFollowRedirects(true);
                    con17.setRequestMethod("GET");
                    con17.connect();


                    HttpURLConnection con18 =
                            (HttpURLConnection) url18.openConnection();
                    con18.setAllowUserInteraction(false);
                    con18.setInstanceFollowRedirects(true);
                    con18.setRequestMethod("GET");
                    con18.connect();


                    HttpURLConnection con19 =
                            (HttpURLConnection) url19.openConnection();
                    con19.setAllowUserInteraction(false);
                    con19.setInstanceFollowRedirects(true);
                    con19.setRequestMethod("GET");
                    con19.connect();


                    HttpURLConnection con20 =
                            (HttpURLConnection) url20.openConnection();
                    con20.setAllowUserInteraction(false);
                    con20.setInstanceFollowRedirects(true);
                    con20.setRequestMethod("GET");
                    con20.connect();


                    HttpURLConnection con21 =
                            (HttpURLConnection) url21.openConnection();
                    con21.setAllowUserInteraction(false);
                    con21.setInstanceFollowRedirects(true);
                    con21.setRequestMethod("GET");
                    con21.connect();


                    HttpURLConnection con22 =
                            (HttpURLConnection) url22.openConnection();
                    con22.setAllowUserInteraction(false);
                    con22.setInstanceFollowRedirects(true);
                    con22.setRequestMethod("GET");
                    con22.connect();


                    HttpURLConnection con23 =
                            (HttpURLConnection) url23.openConnection();
                    con23.setAllowUserInteraction(false);
                    con23.setInstanceFollowRedirects(true);
                    con23.setRequestMethod("GET");
                    con23.connect();


                    HttpURLConnection con24 =
                            (HttpURLConnection) url24.openConnection();
                    con24.setAllowUserInteraction(false);
                    con24.setInstanceFollowRedirects(true);
                    con24.setRequestMethod("GET");
                    con24.connect();

                    HttpURLConnection con25 =
                            (HttpURLConnection) url25.openConnection();
                    con25.setAllowUserInteraction(false);
                    con25.setInstanceFollowRedirects(true);
                    con25.setRequestMethod("GET");
                    con25.connect();

                    HttpURLConnection con26 =
                            (HttpURLConnection) url26.openConnection();
                    con26.setAllowUserInteraction(false);
                    con26.setInstanceFollowRedirects(true);
                    con26.setRequestMethod("GET");
                    con26.connect();

                    HttpURLConnection con27 =
                            (HttpURLConnection) url27.openConnection();
                    con27.setAllowUserInteraction(false);
                    con27.setInstanceFollowRedirects(true);
                    con27.setRequestMethod("GET");
                    con27.connect();

                    HttpURLConnection con28 =
                            (HttpURLConnection) url28.openConnection();
                    con28.setAllowUserInteraction(false);
                    con28.setInstanceFollowRedirects(true);
                    con28.setRequestMethod("GET");
                    con28.connect();

                    HttpURLConnection con29 =
                            (HttpURLConnection) url29.openConnection();
                    con29.setAllowUserInteraction(false);
                    con29.setInstanceFollowRedirects(true);
                    con29.setRequestMethod("GET");
                    con29.connect();

                    HttpURLConnection con30 =
                            (HttpURLConnection) url30.openConnection();
                    con30.setAllowUserInteraction(false);
                    con30.setInstanceFollowRedirects(true);
                    con30.setRequestMethod("GET");
                    con30.connect();

                    HttpURLConnection con31 =
                            (HttpURLConnection) url31.openConnection();
                    con31.setAllowUserInteraction(false);
                    con31.setInstanceFollowRedirects(true);
                    con31.setRequestMethod("GET");
                    con31.connect();

                    HttpURLConnection con32 =
                            (HttpURLConnection) url32.openConnection();
                    con32.setAllowUserInteraction(false);
                    con32.setInstanceFollowRedirects(true);
                    con32.setRequestMethod("GET");
                    con32.connect();

                    HttpURLConnection con33 =
                            (HttpURLConnection) url33.openConnection();
                    con33.setAllowUserInteraction(false);
                    con33.setInstanceFollowRedirects(true);
                    con33.setRequestMethod("GET");
                    con33.connect();

                    HttpURLConnection con34 =
                            (HttpURLConnection) url34.openConnection();
                    con34.setAllowUserInteraction(false);
                    con34.setInstanceFollowRedirects(true);
                    con34.setRequestMethod("GET");
                    con34.connect();
                    
                                        HttpURLConnection con35 =
                            (HttpURLConnection) url35.openConnection();
                    con35.setAllowUserInteraction(false);
                    con35.setInstanceFollowRedirects(true);
                    con35.setRequestMethod("GET");
                    con35.connect();
                    
                                        HttpURLConnection con36 =
                            (HttpURLConnection) url36.openConnection();
                    con36.setAllowUserInteraction(false);
                    con36.setInstanceFollowRedirects(true);
                    con36.setRequestMethod("GET");
                    con36.connect();
                    
                                        HttpURLConnection con37 =
                            (HttpURLConnection) url37.openConnection();
                    con37.setAllowUserInteraction(false);
                    con37.setInstanceFollowRedirects(true);
                    con37.setRequestMethod("GET");
                    con37.connect();
                    
                    HttpURLConnection con38 =
                            (HttpURLConnection) url38.openConnection();
                    con38.setAllowUserInteraction(false);
                    con38.setInstanceFollowRedirects(true);
                    con38.setRequestMethod("GET");
                    con38.connect();
                    
                    HttpURLConnection con39 =
                            (HttpURLConnection) url39.openConnection();
                    con39.setAllowUserInteraction(false);
                    con39.setInstanceFollowRedirects(true);
                    con39.setRequestMethod("GET");
                    con39.connect();
                    
                    HttpURLConnection con40 =
                            (HttpURLConnection) url40.openConnection();
                    con40.setAllowUserInteraction(false);
                    con40.setInstanceFollowRedirects(true);
                    con40.setRequestMethod("GET");
                    con40.connect();
                    
                    HttpURLConnection con41 =
                            (HttpURLConnection) url41.openConnection();
                    con41.setAllowUserInteraction(false);
                    con41.setInstanceFollowRedirects(true);
                    con41.setRequestMethod("GET");
                    con41.connect();
                    
                    HttpURLConnection con42 =
                            (HttpURLConnection) url42.openConnection();
                    con42.setAllowUserInteraction(false);
                    con42.setInstanceFollowRedirects(true);
                    con42.setRequestMethod("GET");
                    con42.connect();
                    
                    HttpURLConnection con43 =
                            (HttpURLConnection) url43.openConnection();
                    con43.setAllowUserInteraction(false);
                    con43.setInstanceFollowRedirects(true);
                    con43.setRequestMethod("GET");
                    con43.connect();
                    
                    HttpURLConnection con44 =
                            (HttpURLConnection) url44.openConnection();
                    con44.setAllowUserInteraction(false);
                    con44.setInstanceFollowRedirects(true);
                    con44.setRequestMethod("GET");
                    con44.connect();
                    
                    HttpURLConnection con45 =
                            (HttpURLConnection) url45.openConnection();
                    con45.setAllowUserInteraction(false);
                    con45.setInstanceFollowRedirects(true);
                    con45.setRequestMethod("GET");
                    con45.connect();
                    
                    HttpURLConnection con46 =
                            (HttpURLConnection) url46.openConnection();
                    con46.setAllowUserInteraction(false);
                    con46.setInstanceFollowRedirects(true);
                    con46.setRequestMethod("GET");
                    con46.connect();
                    
                    HttpURLConnection con47 =
                            (HttpURLConnection) url47.openConnection();
                    con47.setAllowUserInteraction(false);
                    con47.setInstanceFollowRedirects(true);
                    con47.setRequestMethod("GET");
                    con47.connect();
                    
                    HttpURLConnection con48 =
                            (HttpURLConnection) url48.openConnection();
                    con48.setAllowUserInteraction(false);
                    con48.setInstanceFollowRedirects(true);
                    con48.setRequestMethod("GET");
                    con48.connect();
                    
                    HttpURLConnection con49 =
                            (HttpURLConnection) url49.openConnection();
                    con49.setAllowUserInteraction(false);
                    con49.setInstanceFollowRedirects(true);
                    con49.setRequestMethod("GET");
                    con49.connect();
                    
                    HttpURLConnection con50 =
                            (HttpURLConnection) url50.openConnection();
                    con50.setAllowUserInteraction(false);
                    con50.setInstanceFollowRedirects(true);
                    con50.setRequestMethod("GET");
                    con50.connect();
                    
                    HttpURLConnection con51 =
                            (HttpURLConnection) url51.openConnection();
                    con51.setAllowUserInteraction(false);
                    con51.setInstanceFollowRedirects(true);
                    con51.setRequestMethod("GET");
                    con51.connect();
                    
                    HttpURLConnection con52 =
                            (HttpURLConnection) url52.openConnection();
                    con52.setAllowUserInteraction(false);
                    con52.setInstanceFollowRedirects(true);
                    con52.setRequestMethod("GET");
                    con52.connect();
                    
                    HttpURLConnection con53 =
                            (HttpURLConnection) url53.openConnection();
                    con53.setAllowUserInteraction(false);
                    con53.setInstanceFollowRedirects(true);
                    con53.setRequestMethod("GET");
                    con53.connect();
                    
                    HttpURLConnection con54 =
                            (HttpURLConnection) url54.openConnection();
                    con54.setAllowUserInteraction(false);
                    con54.setInstanceFollowRedirects(true);
                    con54.setRequestMethod("GET");
                    con54.connect();
                    
                    HttpURLConnection con55 =
                            (HttpURLConnection) url55.openConnection();
                    con55.setAllowUserInteraction(false);
                    con55.setInstanceFollowRedirects(true);
                    con55.setRequestMethod("GET");
                    con55.connect();
                    
                    HttpURLConnection con56 =
                            (HttpURLConnection) url56.openConnection();
                    con56.setAllowUserInteraction(false);
                    con56.setInstanceFollowRedirects(true);
                    con56.setRequestMethod("GET");
                    con56.connect();
                    
                    HttpURLConnection con57 =
                            (HttpURLConnection) url57.openConnection();
                    con57.setAllowUserInteraction(false);
                    con57.setInstanceFollowRedirects(true);
                    con57.setRequestMethod("GET");
                    con57.connect();
                    
                    HttpURLConnection con58 =
                            (HttpURLConnection) url58.openConnection();
                    con58.setAllowUserInteraction(false);
                    con58.setInstanceFollowRedirects(true);
                    con58.setRequestMethod("GET");
                    con58.connect();
                    
                    HttpURLConnection con59 =
                            (HttpURLConnection) url59.openConnection();
                    con59.setAllowUserInteraction(false);
                    con59.setInstanceFollowRedirects(true);
                    con59.setRequestMethod("GET");
                    con59.connect();
                    
                    HttpURLConnection con60 =
                            (HttpURLConnection) url60.openConnection();
                    con60.setAllowUserInteraction(false);
                    con60.setInstanceFollowRedirects(true);
                    con60.setRequestMethod("GET");
                    con60.connect();
                    
                    HttpURLConnection con61 =
                            (HttpURLConnection) url61.openConnection();
                    con61.setAllowUserInteraction(false);
                    con61.setInstanceFollowRedirects(true);
                    con61.setRequestMethod("GET");
                    con61.connect();
                    
                    HttpURLConnection con62 =
                            (HttpURLConnection) url62.openConnection();
                    con62.setAllowUserInteraction(false);
                    con62.setInstanceFollowRedirects(true);
                    con62.setRequestMethod("GET");
                    con62.connect();
                    
                    HttpURLConnection con63 =
                            (HttpURLConnection) url63.openConnection();
                    con63.setAllowUserInteraction(false);
                    con63.setInstanceFollowRedirects(true);
                    con63.setRequestMethod("GET");
                    con63.connect();
                    
                    HttpURLConnection con64 =
                            (HttpURLConnection) url64.openConnection();
                    con64.setAllowUserInteraction(false);
                    con64.setInstanceFollowRedirects(true);
                    con64.setRequestMethod("GET");
                    con64.connect();
                    
                    HttpURLConnection con65 =
                            (HttpURLConnection) url65.openConnection();
                    con65.setAllowUserInteraction(false);
                    con65.setInstanceFollowRedirects(true);
                    con65.setRequestMethod("GET");
                    con65.connect();
                    
                    HttpURLConnection con66 =
                            (HttpURLConnection) url66.openConnection();
                    con66.setAllowUserInteraction(false);
                    con66.setInstanceFollowRedirects(true);
                    con66.setRequestMethod("GET");
                    con66.connect();
                    
                    HttpURLConnection con67 =
                            (HttpURLConnection) url67.openConnection();
                    con67.setAllowUserInteraction(false);
                    con67.setInstanceFollowRedirects(true);
                    con67.setRequestMethod("GET");
                    con67.connect();
                    
                    HttpURLConnection con68 =
                            (HttpURLConnection) url68.openConnection();
                    con68.setAllowUserInteraction(false);
                    con68.setInstanceFollowRedirects(true);
                    con68.setRequestMethod("GET");
                    con68.connect();
                    
                    HttpURLConnection con69 =
                            (HttpURLConnection) url69.openConnection();
                    con69.setAllowUserInteraction(false);
                    con69.setInstanceFollowRedirects(true);
                    con69.setRequestMethod("GET");
                    con69.connect();
                    
                    HttpURLConnection con70 =
                            (HttpURLConnection) url70.openConnection();
                    con70.setAllowUserInteraction(false);
                    con70.setInstanceFollowRedirects(true);
                    con70.setRequestMethod("GET");
                    con70.connect();
                    
                    HttpURLConnection con71 =
                            (HttpURLConnection) url71.openConnection();
                    con71.setAllowUserInteraction(false);
                    con71.setInstanceFollowRedirects(true);
                    con71.setRequestMethod("GET");
                    con71.connect();
                    
                    HttpURLConnection con72 =
                            (HttpURLConnection) url72.openConnection();
                    con72.setAllowUserInteraction(false);
                    con72.setInstanceFollowRedirects(true);
                    con72.setRequestMethod("GET");
                    con72.connect();
                    
                    HttpURLConnection con73 =
                            (HttpURLConnection) url73.openConnection();
                    con73.setAllowUserInteraction(false);
                    con73.setInstanceFollowRedirects(true);
                    con73.setRequestMethod("GET");
                    con73.connect();
                    
                    HttpURLConnection con74 =
                            (HttpURLConnection) url74.openConnection();
                    con74.setAllowUserInteraction(false);
                    con74.setInstanceFollowRedirects(true);
                    con74.setRequestMethod("GET");
                    con74.connect();
                    
                    HttpURLConnection con75 =
                            (HttpURLConnection) url75.openConnection();
                    con75.setAllowUserInteraction(false);
                    con75.setInstanceFollowRedirects(true);
                    con75.setRequestMethod("GET");
                    con75.connect();
                    
                    HttpURLConnection con76 =
                            (HttpURLConnection) url76.openConnection();
                    con76.setAllowUserInteraction(false);
                    con76.setInstanceFollowRedirects(true);
                    con76.setRequestMethod("GET");
                    con76.connect();
                    
                    HttpURLConnection con77 =
                            (HttpURLConnection) url77.openConnection();
                    con77.setAllowUserInteraction(false);
                    con77.setInstanceFollowRedirects(true);
                    con77.setRequestMethod("GET");
                    con77.connect();
                    
                    HttpURLConnection con78 =
                            (HttpURLConnection) url78.openConnection();
                    con78.setAllowUserInteraction(false);
                    con78.setInstanceFollowRedirects(true);
                    con78.setRequestMethod("GET");
                    con78.connect();
                    
                    HttpURLConnection con79 =
                            (HttpURLConnection) url79.openConnection();
                    con79.setAllowUserInteraction(false);
                    con79.setInstanceFollowRedirects(true);
                    con79.setRequestMethod("GET");
                    con79.connect();
                    
                    HttpURLConnection con80 =
                            (HttpURLConnection) url80.openConnection();
                    con80.setAllowUserInteraction(false);
                    con80.setInstanceFollowRedirects(true);
                    con80.setRequestMethod("GET");
                    con80.connect();
                    
                    HttpURLConnection con81 =
                            (HttpURLConnection) url81.openConnection();
                    con81.setAllowUserInteraction(false);
                    con81.setInstanceFollowRedirects(true);
                    con81.setRequestMethod("GET");
                    con81.connect();
                    
                    HttpURLConnection con82 =
                            (HttpURLConnection) url82.openConnection();
                    con82.setAllowUserInteraction(false);
                    con82.setInstanceFollowRedirects(true);
                    con82.setRequestMethod("GET");
                    con82.connect();
                    
                    HttpURLConnection con83 =
                            (HttpURLConnection) url83.openConnection();
                    con83.setAllowUserInteraction(false);
                    con83.setInstanceFollowRedirects(true);
                    con83.setRequestMethod("GET");
                    con83.connect();
                    
                    HttpURLConnection con84 =
                            (HttpURLConnection) url84.openConnection();
                    con84.setAllowUserInteraction(false);
                    con84.setInstanceFollowRedirects(true);
                    con84.setRequestMethod("GET");
                    con84.connect();
                    
                    HttpURLConnection con85 =
                            (HttpURLConnection) url85.openConnection();
                    con85.setAllowUserInteraction(false);
                    con85.setInstanceFollowRedirects(true);
                    con85.setRequestMethod("GET");
                    con85.connect();
                    
                    HttpURLConnection con86 =
                            (HttpURLConnection) url86.openConnection();
                    con86.setAllowUserInteraction(false);
                    con86.setInstanceFollowRedirects(true);
                    con86.setRequestMethod("GET");
                    con86.connect();
                    
                    HttpURLConnection con87 =
                            (HttpURLConnection) url87.openConnection();
                    con87.setAllowUserInteraction(false);
                    con87.setInstanceFollowRedirects(true);
                    con87.setRequestMethod("GET");
                    con87.connect();
                    
                    HttpURLConnection con88 =
                            (HttpURLConnection) url88.openConnection();
                    con88.setAllowUserInteraction(false);
                    con88.setInstanceFollowRedirects(true);
                    con88.setRequestMethod("GET");
                    con88.connect();
                    
                    HttpURLConnection con89 =
                            (HttpURLConnection) url89.openConnection();
                    con89.setAllowUserInteraction(false);
                    con89.setInstanceFollowRedirects(true);
                    con89.setRequestMethod("GET");
                    con89.connect();
                    
                    HttpURLConnection con90 =
                            (HttpURLConnection) url90.openConnection();
                    con90.setAllowUserInteraction(false);
                    con90.setInstanceFollowRedirects(true);
                    con90.setRequestMethod("GET");
                    con90.connect();
                    
                    HttpURLConnection con91 =
                            (HttpURLConnection) url91.openConnection();
                    con91.setAllowUserInteraction(false);
                    con91.setInstanceFollowRedirects(true);
                    con91.setRequestMethod("GET");
                    con91.connect();
                    
                    HttpURLConnection con92 =
                            (HttpURLConnection) url92.openConnection();
                    con92.setAllowUserInteraction(false);
                    con92.setInstanceFollowRedirects(true);
                    con92.setRequestMethod("GET");
                    con92.connect();
                    
                    HttpURLConnection con93 =
                            (HttpURLConnection) url93.openConnection();
                    con93.setAllowUserInteraction(false);
                    con93.setInstanceFollowRedirects(true);
                    con93.setRequestMethod("GET");
                    con93.connect();
                    
                    HttpURLConnection con94 =
                            (HttpURLConnection) url94.openConnection();
                    con94.setAllowUserInteraction(false);
                    con94.setInstanceFollowRedirects(true);
                    con94.setRequestMethod("GET");
                    con94.connect();
                    
                    HttpURLConnection con95 =
                            (HttpURLConnection) url95.openConnection();
                    con95.setAllowUserInteraction(false);
                    con95.setInstanceFollowRedirects(true);
                    con95.setRequestMethod("GET");
                    con95.connect();
                    
                    HttpURLConnection con96 =
                            (HttpURLConnection) url96.openConnection();
                    con96.setAllowUserInteraction(false);
                    con96.setInstanceFollowRedirects(true);
                    con96.setRequestMethod("GET");
                    con96.connect();




                    int http1 = con1.getResponseCode();
                    int http2 = con2.getResponseCode();
                    int http3 = con3.getResponseCode();
                    int http4 = con4.getResponseCode();
                    int http5 = con5.getResponseCode();
                    int http6 = con6.getResponseCode();
                    int http7 = con7.getResponseCode();
                    int http8 = con8.getResponseCode();
                    int http9 = con9.getResponseCode();
                    int http10 = con10.getResponseCode();
                    int http11 = con11.getResponseCode();
                    int http12 = con12.getResponseCode();
                    int http13 = con13.getResponseCode();
                    int http14 = con14.getResponseCode();
                    int http15 = con15.getResponseCode();
                    int http16 = con16.getResponseCode();
                    int http17 = con17.getResponseCode();
                    int http18 = con18.getResponseCode();
                    int http19 = con19.getResponseCode();
                    int http20 = con20.getResponseCode();
                    int http21 = con21.getResponseCode();
                    int http22 = con22.getResponseCode();
                    int http23 = con23.getResponseCode();
                    int http24 = con24.getResponseCode();
                    int http25 = con25.getResponseCode();
                    int http26 = con26.getResponseCode();
                    int http27 = con27.getResponseCode();
                    int http28 = con28.getResponseCode();
                    int http29 = con29.getResponseCode();
                    int http30 = con30.getResponseCode();
                    int http31 = con31.getResponseCode();
                    int http32 = con32.getResponseCode();
                    int http33 = con33.getResponseCode();
                    int http34 = con34.getResponseCode();
                    int http35 = con35.getResponseCode();
                    int http36 = con36.getResponseCode();
                    int http37 = con37.getResponseCode();
                    int http38 = con38.getResponseCode();
                    int http39 = con39.getResponseCode();
                    int http40 = con40.getResponseCode();
                    int http41 = con41.getResponseCode();
                    int http42 = con42.getResponseCode();
                    int http43 = con43.getResponseCode();
                    int http44 = con44.getResponseCode();
                    int http45 = con45.getResponseCode();
                    int http46 = con46.getResponseCode();
                    int http47 = con47.getResponseCode();
                    int http48 = con48.getResponseCode();
                    int http49 = con49.getResponseCode();
                    int http50 = con50.getResponseCode();
                    int http51 = con51.getResponseCode();
                    int http52 = con52.getResponseCode();
                    int http53 = con53.getResponseCode();
                    int http54 = con54.getResponseCode();
                    int http55 = con55.getResponseCode();
                    int http56 = con56.getResponseCode();
                    int http57 = con57.getResponseCode();
                    int http58 = con58.getResponseCode();
                    int http59 = con59.getResponseCode();
                    int http60 = con60.getResponseCode();
                    int http61 = con61.getResponseCode();
                    int http62 = con62.getResponseCode();
                    int http63 = con63.getResponseCode();
                    int http64 = con64.getResponseCode();
                    int http65 = con65.getResponseCode();
                    int http66 = con66.getResponseCode();
                    int http67 = con67.getResponseCode();
                    int http68 = con68.getResponseCode();
                    int http69 = con69.getResponseCode();
                    int http70 = con70.getResponseCode();
                    int http71 = con71.getResponseCode();
                    int http72 = con72.getResponseCode();
                    int http73 = con73.getResponseCode();
                    int http74 = con74.getResponseCode();
                    int http75 = con75.getResponseCode();
                    int http76 = con76.getResponseCode();
                    int http77 = con77.getResponseCode();
                    int http78 = con78.getResponseCode();
                    int http79 = con79.getResponseCode();
                    int http80 = con80.getResponseCode();
                    int http81 = con81.getResponseCode();
                    int http82 = con82.getResponseCode();
                    int http83 = con83.getResponseCode();
                    int http84 = con84.getResponseCode();
                    int http85 = con65.getResponseCode();
                    int http86 = con86.getResponseCode();
                    int http87 = con87.getResponseCode();
                    int http88 = con88.getResponseCode();
                    int http89 = con89.getResponseCode();
                    int http90 = con90.getResponseCode();
                    int http91 = con91.getResponseCode();
                    int http92 = con92.getResponseCode();
                    int http93 = con93.getResponseCode();
                    int http94 = con94.getResponseCode();
                    int http95 = con95.getResponseCode();
                    int http96 = con96.getResponseCode();




                    if(http1 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http2 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http3 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http4 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http5 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http6 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http7 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http8 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http9 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http10 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http11 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http12 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http13 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http14 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http15 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http16 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http17 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http18 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http19 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http20 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http21 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http22 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http23 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http24 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http25 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http26 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http27 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http28 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http29 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http30 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http31 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http32 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http33 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http34 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http35 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http36 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http37 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http38 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http39 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http40 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http41 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http42 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http43 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http44 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http45 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http46 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http47 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http48 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http49 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http50 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http51 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http52 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http53 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http54 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http55 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http56 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http57 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http58 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http59 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http60 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http61 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http62 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http63 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http64 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http65 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http66 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http67 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http68 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http69 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http70 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http71 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http72 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http73 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http74 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http75 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http76 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http77 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http78 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http79 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http80 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http81 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http82 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http83 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http84 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http85 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http86 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http87 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http88 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http89 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http90 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http91 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http92 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http93 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http94 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http95 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http96 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }


                    // Input Stream
                    DataInputStream dataIn1 = new DataInputStream(
                            con1.getInputStream());
                    DataInputStream dataIn2 = new DataInputStream(
                            con2.getInputStream());
                    DataInputStream dataIn3 = new DataInputStream(
                            con3.getInputStream());
                    DataInputStream dataIn4 = new DataInputStream(
                            con4.getInputStream());
                    DataInputStream dataIn5 = new DataInputStream(
                            con5.getInputStream());
                    DataInputStream dataIn6 = new DataInputStream(
                            con6.getInputStream());
                    DataInputStream dataIn7 = new DataInputStream(
                            con7.getInputStream());
                    DataInputStream dataIn8 = new DataInputStream(
                            con8.getInputStream());
                    DataInputStream dataIn9 = new DataInputStream(
                            con9.getInputStream());
                    DataInputStream dataIn10 = new DataInputStream(
                            con10.getInputStream());
                    DataInputStream dataIn11 = new DataInputStream(
                            con11.getInputStream());
                    DataInputStream dataIn12 = new DataInputStream(
                            con12.getInputStream());
                    DataInputStream dataIn13 = new DataInputStream(
                            con13.getInputStream());
                    DataInputStream dataIn14 = new DataInputStream(
                            con14.getInputStream());
                    DataInputStream dataIn15 = new DataInputStream(
                            con15.getInputStream());
                    DataInputStream dataIn16 = new DataInputStream(
                            con16.getInputStream());
                    DataInputStream dataIn17 = new DataInputStream(
                            con17.getInputStream());
                    DataInputStream dataIn18 = new DataInputStream(
                            con18.getInputStream());
                    DataInputStream dataIn19 = new DataInputStream(
                            con19.getInputStream());
                    DataInputStream dataIn20 = new DataInputStream(
                            con20.getInputStream());
                    DataInputStream dataIn21 = new DataInputStream(
                            con21.getInputStream());
                    DataInputStream dataIn22 = new DataInputStream(
                            con22.getInputStream());
                    DataInputStream dataIn23 = new DataInputStream(
                            con23.getInputStream());
                    DataInputStream dataIn24 = new DataInputStream(
                            con24.getInputStream());
                    DataInputStream dataIn25 = new DataInputStream(
                            con25.getInputStream());
                    DataInputStream dataIn26 = new DataInputStream(
                            con26.getInputStream());
                    DataInputStream dataIn27 = new DataInputStream(
                            con27.getInputStream());
                    DataInputStream dataIn28 = new DataInputStream(
                            con28.getInputStream());
                    DataInputStream dataIn29 = new DataInputStream(
                            con29.getInputStream());
                    DataInputStream dataIn30 = new DataInputStream(
                            con30.getInputStream());
                    DataInputStream dataIn31 = new DataInputStream(
                            con31.getInputStream());
                    DataInputStream dataIn32 = new DataInputStream(
                            con32.getInputStream());
                    DataInputStream dataIn33 = new DataInputStream(
                            con33.getInputStream());
                    DataInputStream dataIn34 = new DataInputStream(
                            con34.getInputStream());
                    DataInputStream dataIn35 = new DataInputStream(
                            con35.getInputStream());
                    DataInputStream dataIn36 = new DataInputStream(
                            con36.getInputStream());
                    DataInputStream dataIn37 = new DataInputStream(
                            con37.getInputStream());
                    DataInputStream dataIn38 = new DataInputStream(
                            con38.getInputStream());
                    DataInputStream dataIn39 = new DataInputStream(
                            con39.getInputStream());
                    DataInputStream dataIn40 = new DataInputStream(
                            con40.getInputStream());
                    DataInputStream dataIn41 = new DataInputStream(
                            con41.getInputStream());
                    DataInputStream dataIn42 = new DataInputStream(
                            con42.getInputStream());
                    DataInputStream dataIn43 = new DataInputStream(
                            con43.getInputStream());
                    DataInputStream dataIn44 = new DataInputStream(
                            con44.getInputStream());
                    DataInputStream dataIn45 = new DataInputStream(
                            con45.getInputStream());
                    DataInputStream dataIn46 = new DataInputStream(
                            con46.getInputStream());
                    DataInputStream dataIn47 = new DataInputStream(
                            con47.getInputStream());
                    DataInputStream dataIn48 = new DataInputStream(
                            con48.getInputStream());
                    DataInputStream dataIn49 = new DataInputStream(
                            con49.getInputStream());
                    DataInputStream dataIn50 = new DataInputStream(
                            con50.getInputStream());
                    DataInputStream dataIn51 = new DataInputStream(
                            con51.getInputStream());
                    DataInputStream dataIn52 = new DataInputStream(
                            con52.getInputStream());
                    DataInputStream dataIn53 = new DataInputStream(
                            con53.getInputStream());
                    DataInputStream dataIn54 = new DataInputStream(
                            con54.getInputStream());
                    DataInputStream dataIn55 = new DataInputStream(
                            con55.getInputStream());
                    DataInputStream dataIn56 = new DataInputStream(
                            con56.getInputStream());
                    DataInputStream dataIn57 = new DataInputStream(
                            con57.getInputStream());
                    DataInputStream dataIn58 = new DataInputStream(
                            con58.getInputStream());
                    DataInputStream dataIn59 = new DataInputStream(
                            con59.getInputStream());
                    DataInputStream dataIn60 = new DataInputStream(
                            con60.getInputStream());
                    DataInputStream dataIn61 = new DataInputStream(
                            con61.getInputStream());
                    DataInputStream dataIn62 = new DataInputStream(
                            con62.getInputStream());
                    DataInputStream dataIn63 = new DataInputStream(
                            con63.getInputStream());
                    DataInputStream dataIn64 = new DataInputStream(
                            con64.getInputStream());
                    DataInputStream dataIn65 = new DataInputStream(
                            con65.getInputStream());
                    DataInputStream dataIn66 = new DataInputStream(
                            con66.getInputStream());
                    DataInputStream dataIn67 = new DataInputStream(
                            con67.getInputStream());
                    DataInputStream dataIn68 = new DataInputStream(
                            con68.getInputStream());
                    DataInputStream dataIn69 = new DataInputStream(
                            con69.getInputStream());
                    DataInputStream dataIn70 = new DataInputStream(
                            con70.getInputStream());
                    DataInputStream dataIn71 = new DataInputStream(
                            con71.getInputStream());
                    DataInputStream dataIn72 = new DataInputStream(
                            con72.getInputStream());
                    DataInputStream dataIn73 = new DataInputStream(
                            con73.getInputStream());
                    DataInputStream dataIn74 = new DataInputStream(
                            con74.getInputStream());
                    DataInputStream dataIn75 = new DataInputStream(
                            con75.getInputStream());
                    DataInputStream dataIn76 = new DataInputStream(
                            con76.getInputStream());
                    DataInputStream dataIn77 = new DataInputStream(
                            con77.getInputStream());
                    DataInputStream dataIn78 = new DataInputStream(
                            con78.getInputStream());
                    DataInputStream dataIn79 = new DataInputStream(
                            con79.getInputStream());
                    DataInputStream dataIn80 = new DataInputStream(
                            con80.getInputStream());
                    DataInputStream dataIn81 = new DataInputStream(
                            con81.getInputStream());
                    DataInputStream dataIn82 = new DataInputStream(
                            con82.getInputStream());
                    DataInputStream dataIn83 = new DataInputStream(
                            con83.getInputStream());
                    DataInputStream dataIn84 = new DataInputStream(
                            con84.getInputStream());
                    DataInputStream dataIn85 = new DataInputStream(
                            con85.getInputStream());
                    DataInputStream dataIn86 = new DataInputStream(
                            con86.getInputStream());
                    DataInputStream dataIn87 = new DataInputStream(
                            con87.getInputStream());
                    DataInputStream dataIn88 = new DataInputStream(
                            con88.getInputStream());
                    DataInputStream dataIn89 = new DataInputStream(
                            con89.getInputStream());
                    DataInputStream dataIn90 = new DataInputStream(
                            con90.getInputStream());
                    DataInputStream dataIn91 = new DataInputStream(
                            con91.getInputStream());
                    DataInputStream dataIn92 = new DataInputStream(
                            con92.getInputStream());
                    DataInputStream dataIn93 = new DataInputStream(
                            con93.getInputStream());
                    DataInputStream dataIn94 = new DataInputStream(
                            con94.getInputStream());
                    DataInputStream dataIn95 = new DataInputStream(
                            con95.getInputStream());
                    DataInputStream dataIn96 = new DataInputStream(
                            con96.getInputStream());
                            





                    // Output Stream
                    DataOutputStream dataOut1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut3
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut4
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut5
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut6
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut7
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut8
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut9
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut10
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut11
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut12
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut13
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut14
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut15
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut16
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut17
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut18
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut19
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut20
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut21
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut22
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut23
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut24
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut25
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut26
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut27
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut28
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut29
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut30
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut31
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut32
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut33
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut34
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut35
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut36
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut37
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut38
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut39
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut40
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut41
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut42
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut43
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut44
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut45
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut46
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut47
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut48
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut49
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut50
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut51
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut52
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut53
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut54
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut55
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut56
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut57
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut58
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut59
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut60
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut61
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut62
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut63
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut64
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut65
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut66
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut67
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut68
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut69
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut70
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut71
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut72
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut73
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut74
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut75
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut76
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut77
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut78
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut79
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut80
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut81
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut82
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut83
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut84
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut85
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut86
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut87
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut88
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut89
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut90
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut91
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut92
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut93
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut94
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut95
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));
                    DataOutputStream dataOut96
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"ここにMod名を入力")));





                    // Read Data
                    byte[] b = new byte[4096];
                    int readByte = 0;

                    while(-1 != (readByte = dataIn1.read(b))){
                        dataOut1.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn2.read(b))){
                        dataOut2.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn3.read(b))){
                        dataOut3.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn4.read(b))){
                        dataOut4.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn5.read(b))){
                        dataOut5.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn6.read(b))){
                        dataOut6.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn7.read(b))){
                        dataOut7.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn8.read(b))){
                        dataOut8.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn9.read(b))){
                        dataOut9.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn10.read(b))){
                        dataOut10.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn11.read(b))){
                        dataOut11.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn12.read(b))){
                        dataOut12.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn13.read(b))){
                        dataOut13.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn14.read(b))){
                        dataOut14.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn15.read(b))){
                        dataOut15.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn16.read(b))){
                        dataOut16.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn17.read(b))){
                        dataOut17.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn18.read(b))){
                        dataOut18.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn19.read(b))){
                        dataOut19.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn20.read(b))){
                        dataOut20.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn21.read(b))){
                        dataOut21.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn22.read(b))){
                        dataOut22.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn23.read(b))){
                        dataOut23.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn24.read(b))){
                        dataOut24.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn25.read(b))){
                        dataOut25.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn26.read(b))){
                        dataOut26.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn27.read(b))){
                        dataOut27.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn28.read(b))){
                        dataOut28.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn29.read(b))){
                        dataOut29.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn30.read(b))){
                        dataOut30.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn31.read(b))){
                        dataOut31.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn32.read(b))){
                        dataOut32.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn33.read(b))){
                        dataOut33.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn34.read(b))){
                        dataOut34.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn35.read(b))){
                        dataOut35.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn36.read(b))){
                        dataOut36.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn37.read(b))){
                        dataOut37.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn38.read(b))){
                        dataOut38.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn39.read(b))){
                        dataOut39.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn40.read(b))){
                        dataOut40.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn41.read(b))){
                        dataOut41.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn42.read(b))){
                        dataOut42.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn43.read(b))){
                        dataOut43.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn44.read(b))){
                        dataOut44.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn45.read(b))){
                        dataOut45.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn46.read(b))){
                        dataOut46.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn47.read(b))){
                        dataOut47.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn48.read(b))){
                        dataOut48.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn49.read(b))){
                        dataOut49.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn50.read(b))){
                        dataOut50.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn51.read(b))){
                        dataOut51.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn52.read(b))){
                        dataOut52.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn53.read(b))){
                        dataOut53.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn54.read(b))){
                        dataOut54.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn55.read(b))){
                        dataOut55.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn56.read(b))){
                        dataOut56.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn57.read(b))){
                        dataOut57.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn58.read(b))){
                        dataOut58.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn59.read(b))){
                        dataOut59.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn60.read(b))){
                        dataOut60.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn61.read(b))){
                        dataOut61.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn62.read(b))){
                        dataOut62.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn63.read(b))){
                        dataOut63.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn64.read(b))){
                        dataOut64.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn65.read(b))){
                        dataOut65.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn66.read(b))){
                        dataOut66.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn67.read(b))){
                        dataOut67.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn68.read(b))){
                        dataOut68.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn69.read(b))){
                        dataOut69.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn70.read(b))){
                        dataOut70.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn71.read(b))){
                        dataOut71.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn72.read(b))){
                        dataOut72.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn73.read(b))){
                        dataOut73.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn74.read(b))){
                        dataOut74.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn75.read(b))){
                        dataOut75.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn76.read(b))){
                        dataOut76.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn77.read(b))){
                        dataOut77.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn78.read(b))){
                        dataOut78.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn79.read(b))){
                        dataOut79.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn80.read(b))){
                        dataOut80.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn81.read(b))){
                        dataOut81.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn82.read(b))){
                        dataOut82.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn83.read(b))){
                        dataOut83.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn84.read(b))){
                        dataOut84.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn85.read(b))){
                        dataOut85.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn86.read(b))){
                        dataOut86.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn87.read(b))){
                        dataOut87.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn88.read(b))){
                        dataOut88.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn89.read(b))){
                        dataOut89.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn90.read(b))){
                        dataOut90.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn91.read(b))){
                        dataOut91.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn92.read(b))){
                        dataOut92.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn93.read(b))){
                        dataOut93.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn94.read(b))){
                        dataOut94.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn95.read(b))){
                        dataOut95.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn96.read(b))){
                        dataOut96.write(b, 0, readByte);
                    }
                    


                    // Close Stream
                    dataIn1.close();
                    dataOut1.close();

                    dataIn2.close();
                    dataOut2.close();

                    dataIn3.close();
                    dataOut3.close();

                    dataIn4.close();
                    dataOut4.close();

                    dataIn5.close();
                    dataOut5.close();

                    dataIn6.close();
                    dataOut6.close();

                    dataIn7.close();
                    dataOut7.close();

                    dataIn8.close();
                    dataOut8.close();

                    dataIn9.close();
                    dataOut9.close();

                    dataIn10.close();
                    dataOut10.close();

                    dataIn11.close();
                    dataOut11.close();

                    dataIn12.close();
                    dataOut12.close();

                    dataIn13.close();
                    dataOut13.close();

                    dataIn14.close();
                    dataOut14.close();

                    dataIn15.close();
                    dataOut15.close();

                    dataIn16.close();
                    dataOut16.close();

                    dataIn17.close();
                    dataOut17.close();

                    dataIn18.close();
                    dataOut18.close();

                    dataIn19.close();
                    dataOut19.close();

                    dataIn20.close();
                    dataOut20.close();

                    dataIn21.close();
                    dataOut21.close();

                    dataIn22.close();
                    dataOut22.close();

                    dataIn23.close();
                    dataOut23.close();

                    dataIn24.close();
                    dataOut24.close();

                    dataIn25.close();
                    dataOut25.close();

                    dataIn26.close();
                    dataOut26.close();

                    dataIn27.close();
                    dataOut27.close();

                    dataIn28.close();
                    dataOut28.close();

                    dataIn29.close();
                    dataOut29.close();

                    dataIn30.close();
                    dataOut30.close();

                    dataIn31.close();
                    dataOut31.close();

                    dataIn32.close();
                    dataOut32.close();

                    dataIn33.close();
                    dataOut33.close();

                    dataIn34.close();
                    dataOut34.close();
                    
                    dataIn35.close();
                    dataOut35.close();
                    
                    dataIn36.close();
                    dataOut36.close();
                    
                    dataIn37.close();
                    dataOut37.close();
                    
                    dataIn38.close();
                    dataOut38.close();
                    
                    dataIn39.close();
                    dataOut39.close();
                    
                    dataIn40.close();
                    dataOut40.close();
                    
                    dataIn41.close();
                    dataOut41.close();
                    
                    dataIn42.close();
                    dataOut42.close();
                    
                    dataIn43.close();
                    dataOut43.close();
                    
                    dataIn44.close();
                    dataOut44.close();
                    
                    dataIn45.close();
                    dataOut45.close();
                    
                    dataIn46.close();
                    dataOut46.close();
                    
                    dataIn47.close();
                    dataOut47.close();
                    
                    dataIn48.close();
                    dataOut48.close();
                    
                    dataIn49.close();
                    dataOut49.close();
                    
                    dataIn50.close();
                    dataOut50.close();
                    
                    dataIn51.close();
                    dataOut51.close();
                    
                    dataIn52.close();
                    dataOut52.close();
                    
                    dataIn53.close();
                    dataOut53.close();
                    
                    dataIn54.close();
                    dataOut54.close();
                    
                    dataIn55.close();
                    dataOut55.close();
                    
                    dataIn56.close();
                    dataOut56.close();
                    
                    dataIn57.close();
                    dataOut57.close();
                    
                    dataIn58.close();
                    dataOut58.close();
                    
                    dataIn59.close();
                    dataOut59.close();
                    
                    dataIn60.close();
                    dataOut60.close();
                    
                    dataIn61.close();
                    dataOut61.close();
                    
                    dataIn62.close();
                    dataOut62.close();
                    
                    dataIn63.close();
                    dataOut63.close();
                    
                    dataIn64.close();
                    dataOut64.close();
                    
                    dataIn65.close();
                    dataOut65.close();
                    
                    dataIn66.close();
                    dataOut66.close();
                    
                    dataIn67.close();
                    dataOut67.close();
                    
                    dataIn68.close();
                    dataOut68.close();
                    
                    dataIn69.close();
                    dataOut69.close();
                    
                    dataIn70.close();
                    dataOut70.close();
                    
                    dataIn71.close();
                    dataOut71.close();
                    
                    dataIn72.close();
                    dataOut72.close();
                    
                    dataIn73.close();
                    dataOut73.close();
                    
                    dataIn74.close();
                    dataOut74.close();
                    
                    dataIn75.close();
                    dataOut75.close();
                    
                    dataIn76.close();
                    dataOut76.close();
                    
                    dataIn77.close();
                    dataOut77.close();
                    
                    dataIn78.close();
                    dataOut78.close();
                    
                    dataIn79.close();
                    dataOut79.close();
                    
                    dataIn80.close();
                    dataOut80.close();
                    
                    dataIn81.close();
                    dataOut81.close();
                    
                    dataIn82.close();
                    dataOut82.close();
                    
                    dataIn83.close();
                    dataOut83.close();
                    
                    dataIn84.close();
                    dataOut84.close();
                    
                    dataIn85.close();
                    dataOut85.close();
                    
                    dataIn86.close();
                    dataOut86.close();
                    
                    dataIn87.close();
                    dataOut87.close();
                    
                    dataIn88.close();
                    dataOut88.close();
                    
                    dataIn89.close();
                    dataOut89.close();
                    
                    dataIn90.close();
                    dataOut90.close();
                    
                    dataIn91.close();
                    dataOut91.close();
                    
                    dataIn92.close();
                    dataOut92.close();
                    
                    dataIn93.close();
                    dataOut93.close();
                    
                    dataIn94.close();
                    dataOut94.close();
                    
                    dataIn95.close();
                    dataOut95.close();
                    
                    dataIn96.close();
                    dataOut96.close();


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (ProtocolException e) {
                    JOptionPane.showMessageDialog(null,"使用中のプロトコルでエラーが発生しました。   エラーコード:1");
                } catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(null,"URL書式が間違っています。   エラーコード:2");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"なんらかの入出力例外が発生しました。   エラーコード:3");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"例外が発生しました。    エラーコード:4");
                } finally {
                    JOptionPane.showMessageDialog(null,"ダウンロードが完了しました。");
                }
                // MacOSであったときの処理
            } else if(osname.contains("Mac")){
                String userhome = System.getProperty("user.home");
                JOptionPane.showMessageDialog(null, "Modファイルのダウンロードを開始しました。完了ダイアログが表示されるまでプログラムを終了しないで下さい。");
                try {
                    URL url1 = new URL("https://web.archive.org/web/20190715131820if_/https://forum.minecraftuser.jp/download/file.php?id=75930");
                    //url1はストレージボックス
                    URL url2 = new URL("https://media.forgecdn.net/files/2518/667/Baubles-1.12-1.5.2.jar");
                    //url2はBaubles
                    URL url3 = new URL("https://media.forgecdn.net/files/2698/39/Botania+r1.10-361.jar");
                    //url3はボタニア
                    URL url4 = new URL("https://media.forgecdn.net/files/2744/222/BrandonsCore-1.12.2-2.4.17.208-universal.jar");
                    //url4はBrandonsCore
                    URL url5 = new URL("https://media.forgecdn.net/files/2709/87/Cavern_1.12.2-v2.2.0.jar");
                    //url5はCavern2
                    URL url6 = new URL("https://media.forgecdn.net/files/2450/900/Chameleon-1.12-4.1.3.jar");
                    //url6はカメレオン
                    URL url7 = new URL("https://media.forgecdn.net/files/2779/848/CodeChickenLib-1.12.2-3.2.3.358-universal.jar");
                    //url7はCodeChickenLib
                    URL url8 = new URL("https://media.forgecdn.net/files/2633/646/CompactSolars-1.12.2-5.0.18.341-universal.jar");
                    //url8はCompactSolars
                    URL url9 = new URL("https://media.forgecdn.net/files/2753/317/Draconic-Evolution-1.12.2-2.3.24.349-universal.jar");
                    //ドラエボ
                    URL url10 = new URL("https://media.forgecdn.net/files/2822/401/EnderCore-1.12.2-0.5.73.jar");
                    //エンダーコア
                    URL url11 = new URL("https://media.forgecdn.net/files/2858/816/EnderIO-1.12.2-5.1.55.jar");
                    //エンダーIO
                    URL url12 = new URL("https://media.forgecdn.net/files/2678/374/extrautils2-1.12-1.9.9.jar");
                    //EXUtil2
                    URL url13 = new URL("https://media.forgecdn.net/files/2640/952/Forgelin-1.8.2.jar");
                    //Forgelin
                    URL url14 = new URL("https://media.forgecdn.net/files/2633/136/gci-0.6-1.12.2.jar");
                    //gci-0.6
                    URL url15 = new URL("https://media.forgecdn.net/files/2524/880/gravestone-1.10.1.jar");
                    //墓石
                    URL url16 = new URL("https://media.forgecdn.net/files/2676/501/ImmersiveEngineering-0.12-89.jar");
                    //ImmersiveEngineering
                    URL url17 = new URL("https://media.forgecdn.net/files/2746/892/industrialcraft-2-2.8.170-ex112.jar");
                    //IC2ex
                    URL url18 = new URL("https://media.forgecdn.net/files/2713/386/Mantle-1.12-1.3.3.55.jar");
                    //Mantle
                    URL url19 = new URL("https://media.forgecdn.net/files/2835/175/Mekanism-1.12.2-9.8.3.390.jar");
                    //Mekanism
                    URL url20 = new URL("https://media.forgecdn.net/files/2835/177/MekanismGenerators-1.12.2-9.8.3.390.jar");
                    //MekanismGen
                    URL url21 = new URL("https://media.forgecdn.net/files/2835/178/MekanismTools-1.12.2-9.8.3.390.jar");
                    //MekanismTools
                    URL url22 = new URL("https://media.forgecdn.net/files/2789/626/plustic-7.1.6.1.jar");
                    //PlusTic
                    URL url23 = new URL("https://media.forgecdn.net/files/2623/90/RedstoneFlux-1.12-2.1.0.6-universal.jar");
                    //RedstoneFLUX
                    URL url24 = new URL("https://media.forgecdn.net/files/2745/458/refinedstorage-1.6.15.jar");
                    //RefindStrage
                    URL url25 = new URL("https://media.forgecdn.net/files/2777/929/StorageDrawers-1.12.2-5.4.0.jar");
                    //StorageDrawers
                    URL url26 = new URL("https://media.forgecdn.net/files/2809/406/TConstruct-1.12.2-2.13.0.171.jar");
                    //TinCon
                    URL url27 = new URL("https://media.forgecdn.net/files/2580/52/tesla-core-lib-1.12.2-1.0.15.jar");
                    //Tesla-Core-Lib
                    URL url28 = new URL("https://media.forgecdn.net/files/2629/23/Thaumcraft-1.12.2-6.1.BETA26.jar");
                    //ソームクラフト,Thaumcraft
                    URL url29 = new URL("https://media.forgecdn.net/files/2596/484/thaumictinkerer-1.12.2-5.0-353c71c.jar");
                    //Thaumic Tinkerer
                    URL url30 = new URL("https://media.forgecdn.net/files/2559/89/ThaumicInventoryScanning_1.12.2-2.0.10.jar");
                    //Thaumic Inventory Scanning
                    URL url31 = new URL("https://media.forgecdn.net/files/2630/860/TinkerToolLeveling-1.12.2-1.1.0.jar");
                    //TinkerToolLeveling
                    URL url32 = new URL("https://media.forgecdn.net/files/2849/448/TofuCraftReload-0.1.0.4.jar");
                    //トーフクラフト,TohucraftR
                    URL url33 = new URL("https://media.forgecdn.net/files/2478/952/ComputerCraft1.80pr1.jar");
                    //CC,ComputerCraft
                    URL url34 = new URL("https://media.forgecdn.net/files/2846/200/Sakura-V0.0.7-MC1.12.2.jar");
                    //さくらMod,桜Mod
                                        URL url35 = new URL("");
                    URL url36 = new URL("");
                    URL url37 = new URL("");
                    URL url38 = new URL("");
                    URL url39 = new URL("");
                    URL url40 = new URL("");
                    URL url41 = new URL("");
                    URL url42 = new URL("");
                    URL url43 = new URL("");
                    URL url44 = new URL("");
                    URL url45 = new URL("");
                    URL url46 = new URL("");
                    URL url47 = new URL("");
                    URL url48 = new URL("");
                    URL url49 = new URL("");
                    URL url50 = new URL("");
                    URL url51 = new URL("");
                    URL url52 = new URL("");
                    URL url53 = new URL("");
                    URL url54 = new URL("");
                    URL url55 = new URL("");
                    URL url56 = new URL("");
                    URL url57 = new URL("");
                    URL url58 = new URL("");
                    URL url59 = new URL("");
                    URL url60 = new URL("");
                    URL url61 = new URL("");
                    URL url62 = new URL("");
                    URL url63 = new URL("");
                    URL url64 = new URL("");
                    URL url65 = new URL("");
                    URL url66 = new URL("");
                    URL url67 = new URL("");
                    URL url68 = new URL("");
                    URL url69 = new URL("");
                    URL url70 = new URL("");
                    URL url71 = new URL("");
                    URL url72 = new URL("");
                    URL url73 = new URL("");
                    URL url74 = new URL("");
                    URL url75 = new URL("");
                    URL url76 = new URL("");
                    URL url77 = new URL("");
                    URL url78 = new URL("");
                    URL url79 = new URL("");
                    URL url80 = new URL("");
                    URL url81 = new URL("");
                    URL url82 = new URL("");
                    URL url83 = new URL("");
                    URL url84 = new URL("");
                    URL url85 = new URL("");
                    URL url86 = new URL("");
                    URL url87 = new URL("");
                    URL url88 = new URL("");
                    URL url89 = new URL("");
                    URL url90 = new URL("");
                    URL url91 = new URL("");
                    URL url92 = new URL("");
                    URL url93 = new URL("");
                    URL url94 = new URL("");
                    URL url95 = new URL("");
                    URL url96 = new URL("");





                    HttpURLConnection con1 =
                            (HttpURLConnection) url1.openConnection();
                    con1.setAllowUserInteraction(false);
                    con1.setInstanceFollowRedirects(true);
                    con1.setRequestMethod("GET");
                    con1.connect();


                    HttpURLConnection con2 =
                            (HttpURLConnection) url2.openConnection();
                    con2.setAllowUserInteraction(false);
                    con2.setInstanceFollowRedirects(true);
                    con2.setRequestMethod("GET");
                    con2.connect();


                    HttpURLConnection con3 =
                            (HttpURLConnection) url3.openConnection();
                    con3.setAllowUserInteraction(false);
                    con3.setInstanceFollowRedirects(true);
                    con3.setRequestMethod("GET");
                    con3.connect();


                    HttpURLConnection con4 =
                            (HttpURLConnection) url4.openConnection();
                    con4.setAllowUserInteraction(false);
                    con4.setInstanceFollowRedirects(true);
                    con4.setRequestMethod("GET");
                    con4.connect();


                    HttpURLConnection con5 =
                            (HttpURLConnection) url5.openConnection();
                    con5.setAllowUserInteraction(false);
                    con5.setInstanceFollowRedirects(true);
                    con5.setRequestMethod("GET");
                    con5.connect();


                    HttpURLConnection con6 =
                            (HttpURLConnection) url6.openConnection();
                    con6.setAllowUserInteraction(false);
                    con6.setInstanceFollowRedirects(true);
                    con6.setRequestMethod("GET");
                    con6.connect();


                    HttpURLConnection con7 =
                            (HttpURLConnection) url7.openConnection();
                    con7.setAllowUserInteraction(false);
                    con7.setInstanceFollowRedirects(true);
                    con7.setRequestMethod("GET");
                    con7.connect();


                    HttpURLConnection con8 =
                            (HttpURLConnection) url8.openConnection();
                    con8.setAllowUserInteraction(false);
                    con8.setInstanceFollowRedirects(true);
                    con8.setRequestMethod("GET");
                    con8.connect();


                    HttpURLConnection con9 =
                            (HttpURLConnection) url9.openConnection();
                    con9.setAllowUserInteraction(false);
                    con9.setInstanceFollowRedirects(true);
                    con9.setRequestMethod("GET");
                    con9.connect();


                    HttpURLConnection con10 =
                            (HttpURLConnection) url10.openConnection();
                    con10.setAllowUserInteraction(false);
                    con10.setInstanceFollowRedirects(true);
                    con10.setRequestMethod("GET");
                    con10.connect();


                    HttpURLConnection con11 =
                            (HttpURLConnection) url11.openConnection();
                    con11.setAllowUserInteraction(false);
                    con11.setInstanceFollowRedirects(true);
                    con11.setRequestMethod("GET");
                    con11.connect();


                    HttpURLConnection con12 =
                            (HttpURLConnection) url12.openConnection();
                    con12.setAllowUserInteraction(false);
                    con12.setInstanceFollowRedirects(true);
                    con12.setRequestMethod("GET");
                    con12.connect();


                    HttpURLConnection con13 =
                            (HttpURLConnection) url13.openConnection();
                    con13.setAllowUserInteraction(false);
                    con13.setInstanceFollowRedirects(true);
                    con13.setRequestMethod("GET");
                    con13.connect();


                    HttpURLConnection con14 =
                            (HttpURLConnection) url14.openConnection();
                    con14.setAllowUserInteraction(false);
                    con14.setInstanceFollowRedirects(true);
                    con14.setRequestMethod("GET");
                    con14.connect();


                    HttpURLConnection con15 =
                            (HttpURLConnection) url15.openConnection();
                    con15.setAllowUserInteraction(false);
                    con15.setInstanceFollowRedirects(true);
                    con15.setRequestMethod("GET");
                    con15.connect();


                    HttpURLConnection con16 =
                            (HttpURLConnection) url16.openConnection();
                    con16.setAllowUserInteraction(false);
                    con16.setInstanceFollowRedirects(true);
                    con16.setRequestMethod("GET");
                    con16.connect();


                    HttpURLConnection con17 =
                            (HttpURLConnection) url17.openConnection();
                    con17.setAllowUserInteraction(false);
                    con17.setInstanceFollowRedirects(true);
                    con17.setRequestMethod("GET");
                    con17.connect();


                    HttpURLConnection con18 =
                            (HttpURLConnection) url18.openConnection();
                    con18.setAllowUserInteraction(false);
                    con18.setInstanceFollowRedirects(true);
                    con18.setRequestMethod("GET");
                    con18.connect();


                    HttpURLConnection con19 =
                            (HttpURLConnection) url19.openConnection();
                    con19.setAllowUserInteraction(false);
                    con19.setInstanceFollowRedirects(true);
                    con19.setRequestMethod("GET");
                    con19.connect();


                    HttpURLConnection con20 =
                            (HttpURLConnection) url20.openConnection();
                    con20.setAllowUserInteraction(false);
                    con20.setInstanceFollowRedirects(true);
                    con20.setRequestMethod("GET");
                    con20.connect();


                    HttpURLConnection con21 =
                            (HttpURLConnection) url21.openConnection();
                    con21.setAllowUserInteraction(false);
                    con21.setInstanceFollowRedirects(true);
                    con21.setRequestMethod("GET");
                    con21.connect();


                    HttpURLConnection con22 =
                            (HttpURLConnection) url22.openConnection();
                    con22.setAllowUserInteraction(false);
                    con22.setInstanceFollowRedirects(true);
                    con22.setRequestMethod("GET");
                    con22.connect();


                    HttpURLConnection con23 =
                            (HttpURLConnection) url23.openConnection();
                    con23.setAllowUserInteraction(false);
                    con23.setInstanceFollowRedirects(true);
                    con23.setRequestMethod("GET");
                    con23.connect();


                    HttpURLConnection con24 =
                            (HttpURLConnection) url24.openConnection();
                    con24.setAllowUserInteraction(false);
                    con24.setInstanceFollowRedirects(true);
                    con24.setRequestMethod("GET");
                    con24.connect();

                    HttpURLConnection con25 =
                            (HttpURLConnection) url25.openConnection();
                    con25.setAllowUserInteraction(false);
                    con25.setInstanceFollowRedirects(true);
                    con25.setRequestMethod("GET");
                    con25.connect();

                    HttpURLConnection con26 =
                            (HttpURLConnection) url26.openConnection();
                    con26.setAllowUserInteraction(false);
                    con26.setInstanceFollowRedirects(true);
                    con26.setRequestMethod("GET");
                    con26.connect();

                    HttpURLConnection con27 =
                            (HttpURLConnection) url27.openConnection();
                    con27.setAllowUserInteraction(false);
                    con27.setInstanceFollowRedirects(true);
                    con27.setRequestMethod("GET");
                    con27.connect();

                    HttpURLConnection con28 =
                            (HttpURLConnection) url28.openConnection();
                    con28.setAllowUserInteraction(false);
                    con28.setInstanceFollowRedirects(true);
                    con28.setRequestMethod("GET");
                    con28.connect();

                    HttpURLConnection con29 =
                            (HttpURLConnection) url29.openConnection();
                    con29.setAllowUserInteraction(false);
                    con29.setInstanceFollowRedirects(true);
                    con29.setRequestMethod("GET");
                    con29.connect();

                    HttpURLConnection con30 =
                            (HttpURLConnection) url30.openConnection();
                    con30.setAllowUserInteraction(false);
                    con30.setInstanceFollowRedirects(true);
                    con30.setRequestMethod("GET");
                    con30.connect();

                    HttpURLConnection con31 =
                            (HttpURLConnection) url31.openConnection();
                    con31.setAllowUserInteraction(false);
                    con31.setInstanceFollowRedirects(true);
                    con31.setRequestMethod("GET");
                    con31.connect();

                    HttpURLConnection con32 =
                            (HttpURLConnection) url32.openConnection();
                    con32.setAllowUserInteraction(false);
                    con32.setInstanceFollowRedirects(true);
                    con32.setRequestMethod("GET");
                    con32.connect();

                    HttpURLConnection con33 =
                            (HttpURLConnection) url33.openConnection();
                    con33.setAllowUserInteraction(false);
                    con33.setInstanceFollowRedirects(true);
                    con33.setRequestMethod("GET");
                    con33.connect();

                    HttpURLConnection con34 =
                            (HttpURLConnection) url34.openConnection();
                    con34.setAllowUserInteraction(false);
                    con34.setInstanceFollowRedirects(true);
                    con34.setRequestMethod("GET");
                    con34.connect();
                    
                                        HttpURLConnection con35 =
                            (HttpURLConnection) url35.openConnection();
                    con35.setAllowUserInteraction(false);
                    con35.setInstanceFollowRedirects(true);
                    con35.setRequestMethod("GET");
                    con35.connect();
                                        
                                        HttpURLConnection con36 =
                            (HttpURLConnection) url36.openConnection();
                    con36.setAllowUserInteraction(false);
                    con36.setInstanceFollowRedirects(true);
                    con36.setRequestMethod("GET");
                    con36.connect();
                    
                                        HttpURLConnection con37 =
                            (HttpURLConnection) url37.openConnection();
                    con37.setAllowUserInteraction(false);
                    con37.setInstanceFollowRedirects(true);
                    con37.setRequestMethod("GET");
                    con37.connect();
                    
                    HttpURLConnection con38 =
                            (HttpURLConnection) url38.openConnection();
                    con38.setAllowUserInteraction(false);
                    con38.setInstanceFollowRedirects(true);
                    con38.setRequestMethod("GET");
                    con38.connect();
                    
                    HttpURLConnection con39 =
                            (HttpURLConnection) url39.openConnection();
                    con39.setAllowUserInteraction(false);
                    con39.setInstanceFollowRedirects(true);
                    con39.setRequestMethod("GET");
                    con39.connect();
                    
                    HttpURLConnection con40 =
                            (HttpURLConnection) url40.openConnection();
                    con40.setAllowUserInteraction(false);
                    con40.setInstanceFollowRedirects(true);
                    con40.setRequestMethod("GET");
                    con40.connect();
                    
                    HttpURLConnection con41 =
                            (HttpURLConnection) url41.openConnection();
                    con41.setAllowUserInteraction(false);
                    con41.setInstanceFollowRedirects(true);
                    con41.setRequestMethod("GET");
                    con41.connect();
                    
                    HttpURLConnection con42 =
                            (HttpURLConnection) url42.openConnection();
                    con42.setAllowUserInteraction(false);
                    con42.setInstanceFollowRedirects(true);
                    con42.setRequestMethod("GET");
                    con42.connect();
                    
                    HttpURLConnection con43 =
                            (HttpURLConnection) url43.openConnection();
                    con43.setAllowUserInteraction(false);
                    con43.setInstanceFollowRedirects(true);
                    con43.setRequestMethod("GET");
                    con43.connect();
                    
                    HttpURLConnection con44 =
                            (HttpURLConnection) url44.openConnection();
                    con44.setAllowUserInteraction(false);
                    con44.setInstanceFollowRedirects(true);
                    con44.setRequestMethod("GET");
                    con44.connect();
                    
                    HttpURLConnection con45 =
                            (HttpURLConnection) url45.openConnection();
                    con45.setAllowUserInteraction(false);
                    con45.setInstanceFollowRedirects(true);
                    con45.setRequestMethod("GET");
                    con45.connect();
                    
                    HttpURLConnection con46 =
                            (HttpURLConnection) url46.openConnection();
                    con46.setAllowUserInteraction(false);
                    con46.setInstanceFollowRedirects(true);
                    con46.setRequestMethod("GET");
                    con46.connect();
                    
                    HttpURLConnection con47 =
                            (HttpURLConnection) url47.openConnection();
                    con47.setAllowUserInteraction(false);
                    con47.setInstanceFollowRedirects(true);
                    con47.setRequestMethod("GET");
                    con47.connect();
                    
                    HttpURLConnection con48 =
                            (HttpURLConnection) url48.openConnection();
                    con48.setAllowUserInteraction(false);
                    con48.setInstanceFollowRedirects(true);
                    con48.setRequestMethod("GET");
                    con48.connect();
                    
                    HttpURLConnection con49 =
                            (HttpURLConnection) url49.openConnection();
                    con49.setAllowUserInteraction(false);
                    con49.setInstanceFollowRedirects(true);
                    con49.setRequestMethod("GET");
                    con49.connect();
                    
                    HttpURLConnection con50 =
                            (HttpURLConnection) url50.openConnection();
                    con50.setAllowUserInteraction(false);
                    con50.setInstanceFollowRedirects(true);
                    con50.setRequestMethod("GET");
                    con50.connect();
                    
                    HttpURLConnection con51 =
                            (HttpURLConnection) url51.openConnection();
                    con51.setAllowUserInteraction(false);
                    con51.setInstanceFollowRedirects(true);
                    con51.setRequestMethod("GET");
                    con51.connect();
                    
                    HttpURLConnection con52 =
                            (HttpURLConnection) url52.openConnection();
                    con52.setAllowUserInteraction(false);
                    con52.setInstanceFollowRedirects(true);
                    con52.setRequestMethod("GET");
                    con52.connect();
                    
                    HttpURLConnection con53 =
                            (HttpURLConnection) url53.openConnection();
                    con53.setAllowUserInteraction(false);
                    con53.setInstanceFollowRedirects(true);
                    con53.setRequestMethod("GET");
                    con53.connect();
                    
                    HttpURLConnection con54 =
                            (HttpURLConnection) url54.openConnection();
                    con54.setAllowUserInteraction(false);
                    con54.setInstanceFollowRedirects(true);
                    con54.setRequestMethod("GET");
                    con54.connect();
                    
                    HttpURLConnection con55 =
                            (HttpURLConnection) url55.openConnection();
                    con55.setAllowUserInteraction(false);
                    con55.setInstanceFollowRedirects(true);
                    con55.setRequestMethod("GET");
                    con55.connect();
                    
                    HttpURLConnection con56 =
                            (HttpURLConnection) url56.openConnection();
                    con56.setAllowUserInteraction(false);
                    con56.setInstanceFollowRedirects(true);
                    con56.setRequestMethod("GET");
                    con56.connect();
                    
                    HttpURLConnection con57 =
                            (HttpURLConnection) url57.openConnection();
                    con57.setAllowUserInteraction(false);
                    con57.setInstanceFollowRedirects(true);
                    con57.setRequestMethod("GET");
                    con57.connect();
                    
                    HttpURLConnection con58 =
                            (HttpURLConnection) url58.openConnection();
                    con58.setAllowUserInteraction(false);
                    con58.setInstanceFollowRedirects(true);
                    con58.setRequestMethod("GET");
                    con58.connect();
                    
                    HttpURLConnection con59 =
                            (HttpURLConnection) url59.openConnection();
                    con59.setAllowUserInteraction(false);
                    con59.setInstanceFollowRedirects(true);
                    con59.setRequestMethod("GET");
                    con59.connect();
                    
                    HttpURLConnection con60 =
                            (HttpURLConnection) url60.openConnection();
                    con60.setAllowUserInteraction(false);
                    con60.setInstanceFollowRedirects(true);
                    con60.setRequestMethod("GET");
                    con60.connect();
                    
                    HttpURLConnection con61 =
                            (HttpURLConnection) url61.openConnection();
                    con61.setAllowUserInteraction(false);
                    con61.setInstanceFollowRedirects(true);
                    con61.setRequestMethod("GET");
                    con61.connect();
                    
                    HttpURLConnection con62 =
                            (HttpURLConnection) url62.openConnection();
                    con62.setAllowUserInteraction(false);
                    con62.setInstanceFollowRedirects(true);
                    con62.setRequestMethod("GET");
                    con62.connect();
                    
                    HttpURLConnection con63 =
                            (HttpURLConnection) url63.openConnection();
                    con63.setAllowUserInteraction(false);
                    con63.setInstanceFollowRedirects(true);
                    con63.setRequestMethod("GET");
                    con63.connect();
                    
                    HttpURLConnection con64 =
                            (HttpURLConnection) url64.openConnection();
                    con64.setAllowUserInteraction(false);
                    con64.setInstanceFollowRedirects(true);
                    con64.setRequestMethod("GET");
                    con64.connect();
                    
                    HttpURLConnection con65 =
                            (HttpURLConnection) url65.openConnection();
                    con65.setAllowUserInteraction(false);
                    con65.setInstanceFollowRedirects(true);
                    con65.setRequestMethod("GET");
                    con65.connect();
                    
                    HttpURLConnection con66 =
                            (HttpURLConnection) url66.openConnection();
                    con66.setAllowUserInteraction(false);
                    con66.setInstanceFollowRedirects(true);
                    con66.setRequestMethod("GET");
                    con66.connect();
                    
                    HttpURLConnection con67 =
                            (HttpURLConnection) url67.openConnection();
                    con67.setAllowUserInteraction(false);
                    con67.setInstanceFollowRedirects(true);
                    con67.setRequestMethod("GET");
                    con67.connect();
                    
                    HttpURLConnection con68 =
                            (HttpURLConnection) url68.openConnection();
                    con68.setAllowUserInteraction(false);
                    con68.setInstanceFollowRedirects(true);
                    con68.setRequestMethod("GET");
                    con68.connect();
                    
                    HttpURLConnection con69 =
                            (HttpURLConnection) url69.openConnection();
                    con69.setAllowUserInteraction(false);
                    con69.setInstanceFollowRedirects(true);
                    con69.setRequestMethod("GET");
                    con69.connect();
                    
                    HttpURLConnection con70 =
                            (HttpURLConnection) url70.openConnection();
                    con70.setAllowUserInteraction(false);
                    con70.setInstanceFollowRedirects(true);
                    con70.setRequestMethod("GET");
                    con70.connect();
                    
                    HttpURLConnection con71 =
                            (HttpURLConnection) url71.openConnection();
                    con71.setAllowUserInteraction(false);
                    con71.setInstanceFollowRedirects(true);
                    con71.setRequestMethod("GET");
                    con71.connect();
                    
                    HttpURLConnection con72 =
                            (HttpURLConnection) url72.openConnection();
                    con72.setAllowUserInteraction(false);
                    con72.setInstanceFollowRedirects(true);
                    con72.setRequestMethod("GET");
                    con72.connect();
                    
                    HttpURLConnection con73 =
                            (HttpURLConnection) url73.openConnection();
                    con73.setAllowUserInteraction(false);
                    con73.setInstanceFollowRedirects(true);
                    con73.setRequestMethod("GET");
                    con73.connect();
                    
                    HttpURLConnection con74 =
                            (HttpURLConnection) url74.openConnection();
                    con74.setAllowUserInteraction(false);
                    con74.setInstanceFollowRedirects(true);
                    con74.setRequestMethod("GET");
                    con74.connect();
                    
                    HttpURLConnection con75 =
                            (HttpURLConnection) url75.openConnection();
                    con75.setAllowUserInteraction(false);
                    con75.setInstanceFollowRedirects(true);
                    con75.setRequestMethod("GET");
                    con75.connect();
                    
                    HttpURLConnection con76 =
                            (HttpURLConnection) url76.openConnection();
                    con76.setAllowUserInteraction(false);
                    con76.setInstanceFollowRedirects(true);
                    con76.setRequestMethod("GET");
                    con76.connect();
                    
                    HttpURLConnection con77 =
                            (HttpURLConnection) url77.openConnection();
                    con77.setAllowUserInteraction(false);
                    con77.setInstanceFollowRedirects(true);
                    con77.setRequestMethod("GET");
                    con77.connect();
                    
                    HttpURLConnection con78 =
                            (HttpURLConnection) url78.openConnection();
                    con78.setAllowUserInteraction(false);
                    con78.setInstanceFollowRedirects(true);
                    con78.setRequestMethod("GET");
                    con78.connect();
                    
                    HttpURLConnection con79 =
                            (HttpURLConnection) url79.openConnection();
                    con79.setAllowUserInteraction(false);
                    con79.setInstanceFollowRedirects(true);
                    con79.setRequestMethod("GET");
                    con79.connect();
                    
                    HttpURLConnection con80 =
                            (HttpURLConnection) url80.openConnection();
                    con80.setAllowUserInteraction(false);
                    con80.setInstanceFollowRedirects(true);
                    con80.setRequestMethod("GET");
                    con80.connect();
                    
                    HttpURLConnection con81 =
                            (HttpURLConnection) url81.openConnection();
                    con81.setAllowUserInteraction(false);
                    con81.setInstanceFollowRedirects(true);
                    con81.setRequestMethod("GET");
                    con81.connect();
                    
                    HttpURLConnection con82 =
                            (HttpURLConnection) url82.openConnection();
                    con82.setAllowUserInteraction(false);
                    con82.setInstanceFollowRedirects(true);
                    con82.setRequestMethod("GET");
                    con82.connect();
                    
                    HttpURLConnection con83 =
                            (HttpURLConnection) url83.openConnection();
                    con83.setAllowUserInteraction(false);
                    con83.setInstanceFollowRedirects(true);
                    con83.setRequestMethod("GET");
                    con83.connect();
                    
                    HttpURLConnection con84 =
                            (HttpURLConnection) url84.openConnection();
                    con84.setAllowUserInteraction(false);
                    con84.setInstanceFollowRedirects(true);
                    con84.setRequestMethod("GET");
                    con84.connect();
                    
                    HttpURLConnection con85 =
                            (HttpURLConnection) url85.openConnection();
                    con85.setAllowUserInteraction(false);
                    con85.setInstanceFollowRedirects(true);
                    con85.setRequestMethod("GET");
                    con85.connect();
                    
                    HttpURLConnection con86 =
                            (HttpURLConnection) url86.openConnection();
                    con86.setAllowUserInteraction(false);
                    con86.setInstanceFollowRedirects(true);
                    con86.setRequestMethod("GET");
                    con86.connect();
                    
                    HttpURLConnection con87 =
                            (HttpURLConnection) url87.openConnection();
                    con87.setAllowUserInteraction(false);
                    con87.setInstanceFollowRedirects(true);
                    con87.setRequestMethod("GET");
                    con87.connect();
                    
                    HttpURLConnection con88 =
                            (HttpURLConnection) url88.openConnection();
                    con88.setAllowUserInteraction(false);
                    con88.setInstanceFollowRedirects(true);
                    con88.setRequestMethod("GET");
                    con88.connect();
                    
                    HttpURLConnection con89 =
                            (HttpURLConnection) url89.openConnection();
                    con89.setAllowUserInteraction(false);
                    con89.setInstanceFollowRedirects(true);
                    con89.setRequestMethod("GET");
                    con89.connect();
                    
                    HttpURLConnection con90 =
                            (HttpURLConnection) url90.openConnection();
                    con90.setAllowUserInteraction(false);
                    con90.setInstanceFollowRedirects(true);
                    con90.setRequestMethod("GET");
                    con90.connect();
                    
                    HttpURLConnection con91 =
                            (HttpURLConnection) url91.openConnection();
                    con91.setAllowUserInteraction(false);
                    con91.setInstanceFollowRedirects(true);
                    con91.setRequestMethod("GET");
                    con91.connect();
                    
                    HttpURLConnection con92 =
                            (HttpURLConnection) url92.openConnection();
                    con92.setAllowUserInteraction(false);
                    con92.setInstanceFollowRedirects(true);
                    con92.setRequestMethod("GET");
                    con92.connect();
                    
                    HttpURLConnection con93 =
                            (HttpURLConnection) url93.openConnection();
                    con93.setAllowUserInteraction(false);
                    con93.setInstanceFollowRedirects(true);
                    con93.setRequestMethod("GET");
                    con93.connect();
                    
                    HttpURLConnection con94 =
                            (HttpURLConnection) url94.openConnection();
                    con94.setAllowUserInteraction(false);
                    con94.setInstanceFollowRedirects(true);
                    con94.setRequestMethod("GET");
                    con94.connect();
                    
                    HttpURLConnection con95 =
                            (HttpURLConnection) url95.openConnection();
                    con95.setAllowUserInteraction(false);
                    con95.setInstanceFollowRedirects(true);
                    con95.setRequestMethod("GET");
                    con95.connect();
                    
                    HttpURLConnection con96 =
                            (HttpURLConnection) url96.openConnection();
                    con96.setAllowUserInteraction(false);
                    con96.setInstanceFollowRedirects(true);
                    con96.setRequestMethod("GET");
                    con96.connect();




                    int http1 = con1.getResponseCode();
                    int http2 = con2.getResponseCode();
                    int http3 = con3.getResponseCode();
                    int http4 = con4.getResponseCode();
                    int http5 = con5.getResponseCode();
                    int http6 = con6.getResponseCode();
                    int http7 = con7.getResponseCode();
                    int http8 = con8.getResponseCode();
                    int http9 = con9.getResponseCode();
                    int http10 = con10.getResponseCode();
                    int http11 = con11.getResponseCode();
                    int http12 = con12.getResponseCode();
                    int http13 = con13.getResponseCode();
                    int http14 = con14.getResponseCode();
                    int http15 = con15.getResponseCode();
                    int http16 = con16.getResponseCode();
                    int http17 = con17.getResponseCode();
                    int http18 = con18.getResponseCode();
                    int http19 = con19.getResponseCode();
                    int http20 = con20.getResponseCode();
                    int http21 = con21.getResponseCode();
                    int http22 = con22.getResponseCode();
                    int http23 = con23.getResponseCode();
                    int http24 = con24.getResponseCode();
                    int http25 = con25.getResponseCode();
                    int http26 = con26.getResponseCode();
                    int http27 = con27.getResponseCode();
                    int http28 = con28.getResponseCode();
                    int http29 = con29.getResponseCode();
                    int http30 = con30.getResponseCode();
                    int http31 = con31.getResponseCode();
                    int http32 = con32.getResponseCode();
                    int http33 = con33.getResponseCode();
                    int http34 = con34.getResponseCode();
                    int http35 = con35.getResponseCode();
                    int http36 = con36.getResponseCode();
                    int http37 = con37.getResponseCode();
                    int http38 = con38.getResponseCode();
                    int http39 = con39.getResponseCode();
                    int http40 = con40.getResponseCode();
                    int http41 = con41.getResponseCode();
                    int http42 = con42.getResponseCode();
                    int http43 = con43.getResponseCode();
                    int http44 = con44.getResponseCode();
                    int http45 = con45.getResponseCode();
                    int http46 = con46.getResponseCode();
                    int http47 = con47.getResponseCode();
                    int http48 = con48.getResponseCode();
                    int http49 = con49.getResponseCode();
                    int http50 = con50.getResponseCode();
                    int http51 = con51.getResponseCode();
                    int http52 = con52.getResponseCode();
                    int http53 = con53.getResponseCode();
                    int http54 = con54.getResponseCode();
                    int http55 = con55.getResponseCode();
                    int http56 = con56.getResponseCode();
                    int http57 = con57.getResponseCode();
                    int http58 = con58.getResponseCode();
                    int http59 = con59.getResponseCode();
                    int http60 = con60.getResponseCode();
                    int http61 = con61.getResponseCode();
                    int http62 = con62.getResponseCode();
                    int http63 = con63.getResponseCode();
                    int http64 = con64.getResponseCode();
                    int http65 = con65.getResponseCode();
                    int http66 = con66.getResponseCode();
                    int http67 = con67.getResponseCode();
                    int http68 = con68.getResponseCode();
                    int http69 = con69.getResponseCode();
                    int http70 = con70.getResponseCode();
                    int http71 = con71.getResponseCode();
                    int http72 = con72.getResponseCode();
                    int http73 = con73.getResponseCode();
                    int http74 = con74.getResponseCode();
                    int http75 = con75.getResponseCode();
                    int http76 = con76.getResponseCode();
                    int http77 = con77.getResponseCode();
                    int http78 = con78.getResponseCode();
                    int http79 = con79.getResponseCode();
                    int http80 = con80.getResponseCode();
                    int http81 = con81.getResponseCode();
                    int http82 = con82.getResponseCode();
                    int http83 = con83.getResponseCode();
                    int http84 = con84.getResponseCode();
                    int http85 = con65.getResponseCode();
                    int http86 = con86.getResponseCode();
                    int http87 = con87.getResponseCode();
                    int http88 = con88.getResponseCode();
                    int http89 = con89.getResponseCode();
                    int http90 = con90.getResponseCode();
                    int http91 = con91.getResponseCode();
                    int http92 = con92.getResponseCode();
                    int http93 = con93.getResponseCode();
                    int http94 = con94.getResponseCode();
                    int http95 = con95.getResponseCode();
                    int http96 = con96.getResponseCode();
                    




                    if(http1 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http2 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http3 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http4 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http5 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http6 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http7 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http8 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http9 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http10 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http11 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http12 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http13 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http14 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http15 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http16 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http17 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http18 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http19 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http20 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http21 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http22 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http23 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http24 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http25 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http26 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http27 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http28 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http29 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http30 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http31 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http32 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http33 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http34 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http35 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http36 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http37 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http38 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http39 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http40 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http41 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http42 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http43 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http44 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http45 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http46 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http47 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http48 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http49 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http50 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http51 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http52 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http53 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http54 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http55 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http56 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http57 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http58 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http59 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http60 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http61 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http62 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http63 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http64 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http65 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http66 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http67 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http68 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http69 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http70 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http71 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http72 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http73 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http74 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http75 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http76 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http77 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http78 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http79 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http80 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http81 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http82 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http83 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http84 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http85 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http86 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http87 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http88 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http89 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http90 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http91 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http92 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http93 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http94 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http95 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http96 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }




                    // Input Stream
                        DataInputStream dataIn1 = new DataInputStream(
                            con1.getInputStream());

                        DataInputStream dataIn2 = new DataInputStream(
                            con2.getInputStream());

                        DataInputStream dataIn3 = new DataInputStream(
                            con3.getInputStream());

                        DataInputStream dataIn4 = new DataInputStream(
                            con4.getInputStream());

                        DataInputStream dataIn5 = new DataInputStream(
                            con5.getInputStream());

                        DataInputStream dataIn6 = new DataInputStream(
                            con6.getInputStream());

                        DataInputStream dataIn7 = new DataInputStream(
                            con7.getInputStream());

                        DataInputStream dataIn8 = new DataInputStream(
                            con8.getInputStream());

                        DataInputStream dataIn9 = new DataInputStream(
                            con9.getInputStream());

                        DataInputStream dataIn10 = new DataInputStream(
                            con10.getInputStream());

                        DataInputStream dataIn11 = new DataInputStream(
                            con11.getInputStream());

                        DataInputStream dataIn12 = new DataInputStream(
                            con12.getInputStream());

                        DataInputStream dataIn13 = new DataInputStream(
                            con13.getInputStream());

                        DataInputStream dataIn14 = new DataInputStream(
                            con14.getInputStream());

                        DataInputStream dataIn15 = new DataInputStream(
                            con15.getInputStream());

                        DataInputStream dataIn16 = new DataInputStream(
                            con16.getInputStream());

                        DataInputStream dataIn17 = new DataInputStream(
                            con17.getInputStream());

                        DataInputStream dataIn18 = new DataInputStream(
                            con18.getInputStream());

                        DataInputStream dataIn19 = new DataInputStream(
                            con19.getInputStream());

                        DataInputStream dataIn20 = new DataInputStream(
                            con20.getInputStream());

                        DataInputStream dataIn21 = new DataInputStream(
                            con21.getInputStream());

                        DataInputStream dataIn22 = new DataInputStream(
                            con22.getInputStream());

                        DataInputStream dataIn23 = new DataInputStream(
                            con23.getInputStream());

                        DataInputStream dataIn24 = new DataInputStream(
                            con24.getInputStream());

                        DataInputStream dataIn25 = new DataInputStream(
                            con25.getInputStream());

                        DataInputStream dataIn26 = new DataInputStream(
                            con26.getInputStream());

                        DataInputStream dataIn27 = new DataInputStream(
                            con27.getInputStream());

                        DataInputStream dataIn28 = new DataInputStream(
                            con28.getInputStream());

                        DataInputStream dataIn29 = new DataInputStream(
                            con29.getInputStream());

                        DataInputStream dataIn30 = new DataInputStream(
                            con30.getInputStream());

                        DataInputStream dataIn31 = new DataInputStream(
                            con31.getInputStream());

                        DataInputStream dataIn32 = new DataInputStream(
                            con32.getInputStream());

                        DataInputStream dataIn33 = new DataInputStream(
                            con33.getInputStream());

                        DataInputStream dataIn34 = new DataInputStream(
                            con34.getInputStream());

                        DataInputStream dataIn35 = new DataInputStream(
                            con35.getInputStream());

                        DataInputStream dataIn36 = new DataInputStream(
                            con36.getInputStream());

                        DataInputStream dataIn37 = new DataInputStream(
                            con37.getInputStream());

                        DataInputStream dataIn38 = new DataInputStream(
                            con38.getInputStream());

                        DataInputStream dataIn39 = new DataInputStream(
                            con39.getInputStream());

                        DataInputStream dataIn40 = new DataInputStream(
                            con40.getInputStream());

                        DataInputStream dataIn41 = new DataInputStream(
                            con41.getInputStream());

                        DataInputStream dataIn42 = new DataInputStream(
                            con42.getInputStream());

                        DataInputStream dataIn43 = new DataInputStream(
                            con43.getInputStream());

                        DataInputStream dataIn44 = new DataInputStream(
                            con44.getInputStream());

                        DataInputStream dataIn45 = new DataInputStream(
                            con45.getInputStream());

                        DataInputStream dataIn46 = new DataInputStream(
                            con46.getInputStream());

                        DataInputStream dataIn47 = new DataInputStream(
                            con47.getInputStream());

                        DataInputStream dataIn48 = new DataInputStream(
                            con48.getInputStream());

                        DataInputStream dataIn49 = new DataInputStream(
                            con49.getInputStream());

                        DataInputStream dataIn50 = new DataInputStream(
                            con50.getInputStream());

                        DataInputStream dataIn51 = new DataInputStream(
                            con51.getInputStream());

                        DataInputStream dataIn52 = new DataInputStream(
                            con52.getInputStream());

                        DataInputStream dataIn53 = new DataInputStream(
                            con53.getInputStream());

                        DataInputStream dataIn54 = new DataInputStream(
                            con54.getInputStream());

                        DataInputStream dataIn55 = new DataInputStream(
                            con55.getInputStream());

                        DataInputStream dataIn56 = new DataInputStream(
                            con56.getInputStream());

                        DataInputStream dataIn57 = new DataInputStream(
                            con57.getInputStream());

                        DataInputStream dataIn58 = new DataInputStream(
                            con58.getInputStream());

                        DataInputStream dataIn59 = new DataInputStream(
                            con59.getInputStream());

                        DataInputStream dataIn60 = new DataInputStream(
                            con60.getInputStream());

                        DataInputStream dataIn61 = new DataInputStream(
                            con61.getInputStream());

                        DataInputStream dataIn62 = new DataInputStream(
                            con62.getInputStream());

                        DataInputStream dataIn63 = new DataInputStream(
                            con63.getInputStream());

                        DataInputStream dataIn64 = new DataInputStream(
                            con64.getInputStream());

                        DataInputStream dataIn65 = new DataInputStream(
                            con65.getInputStream());

                        DataInputStream dataIn66 = new DataInputStream(
                            con66.getInputStream());

                        DataInputStream dataIn67 = new DataInputStream(
                            con67.getInputStream());

                        DataInputStream dataIn68 = new DataInputStream(
                            con68.getInputStream());

                        DataInputStream dataIn69 = new DataInputStream(
                            con69.getInputStream());

                        DataInputStream dataIn70 = new DataInputStream(
                            con70.getInputStream());

                        DataInputStream dataIn71 = new DataInputStream(
                            con71.getInputStream());

                        DataInputStream dataIn72 = new DataInputStream(
                            con72.getInputStream());

                        DataInputStream dataIn73 = new DataInputStream(
                            con73.getInputStream());

                        DataInputStream dataIn74 = new DataInputStream(
                            con74.getInputStream());

                        DataInputStream dataIn75 = new DataInputStream(
                            con75.getInputStream());

                        DataInputStream dataIn76 = new DataInputStream(
                            con76.getInputStream());

                        DataInputStream dataIn77 = new DataInputStream(
                            con77.getInputStream());

                        DataInputStream dataIn78 = new DataInputStream(
                            con78.getInputStream());

                        DataInputStream dataIn79 = new DataInputStream(
                            con79.getInputStream());

                        DataInputStream dataIn80 = new DataInputStream(
                            con80.getInputStream());

                        DataInputStream dataIn81 = new DataInputStream(
                            con81.getInputStream());

                        DataInputStream dataIn82 = new DataInputStream(
                            con82.getInputStream());

                        DataInputStream dataIn83 = new DataInputStream(
                            con83.getInputStream());

                        DataInputStream dataIn84 = new DataInputStream(
                            con84.getInputStream());

                        DataInputStream dataIn85 = new DataInputStream(
                            con85.getInputStream());

                        DataInputStream dataIn86 = new DataInputStream(
                            con86.getInputStream());

                        DataInputStream dataIn87 = new DataInputStream(
                            con87.getInputStream());

                        DataInputStream dataIn88 = new DataInputStream(
                            con88.getInputStream());

                        DataInputStream dataIn89 = new DataInputStream(
                            con89.getInputStream());

                        DataInputStream dataIn90 = new DataInputStream(
                            con90.getInputStream());

                        DataInputStream dataIn91 = new DataInputStream(
                            con91.getInputStream());

                        DataInputStream dataIn92 = new DataInputStream(
                            con92.getInputStream());

                        DataInputStream dataIn93 = new DataInputStream(
                            con93.getInputStream());

                        DataInputStream dataIn94 = new DataInputStream(
                            con94.getInputStream());

                        DataInputStream dataIn95 = new DataInputStream(
                            con95.getInputStream());

                        DataInputStream dataIn96 = new DataInputStream(
                            con96.getInputStream());





                    // Output Stream
                    DataOutputStream dataOut1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut3
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut4
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut5
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut6
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut7
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut8
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut9
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut10
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut11
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut12
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut13
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut14
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut15
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut16
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut17
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut18
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut19
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut20
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut21
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut22
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut23
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut24
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut25
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut26
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut27
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut28
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut29
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut30
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut31
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut32
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut33
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut34
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut35
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut36
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut37
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut38
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut39
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut40
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut41
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut42
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut43
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut44
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut45
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut46
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut47
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut48
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut49
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut50
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut51
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut52
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut53
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut54
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut55
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut56
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut57
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut58
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut59
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut60
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut61
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut62
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut63
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut64
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut65
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut66
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut67
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut68
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut69
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut70
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut71
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut72
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut73
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut74
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut75
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut76
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut77
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut78
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut79
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut80
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut81
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut82
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut83
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut84
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut85
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut86
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut87
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut88
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut89
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut90
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut91
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut92
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut93
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut94
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut95
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));
                    DataOutputStream dataOut96
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ここにMod名を入力")));





                    // Read Data
                    byte[] b = new byte[4096];
                    int readByte = 0;

                    while(-1 != (readByte = dataIn1.read(b))){
                        dataOut1.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn2.read(b))){
                        dataOut2.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn3.read(b))){
                        dataOut3.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn4.read(b))){
                        dataOut4.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn5.read(b))){
                        dataOut5.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn6.read(b))){
                        dataOut6.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn7.read(b))){
                        dataOut7.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn8.read(b))){
                        dataOut8.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn9.read(b))){
                        dataOut9.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn10.read(b))){
                        dataOut10.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn11.read(b))){
                        dataOut11.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn12.read(b))){
                        dataOut12.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn13.read(b))){
                        dataOut13.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn14.read(b))){
                        dataOut14.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn15.read(b))){
                        dataOut15.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn16.read(b))){
                        dataOut16.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn17.read(b))){
                        dataOut17.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn18.read(b))){
                        dataOut18.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn19.read(b))){
                        dataOut19.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn20.read(b))){
                        dataOut20.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn21.read(b))){
                        dataOut21.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn22.read(b))){
                        dataOut22.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn23.read(b))){
                        dataOut23.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn24.read(b))){
                        dataOut24.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn25.read(b))){
                        dataOut25.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn26.read(b))){
                        dataOut26.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn27.read(b))){
                        dataOut27.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn28.read(b))){
                        dataOut28.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn29.read(b))){
                        dataOut29.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn30.read(b))){
                        dataOut30.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn31.read(b))){
                        dataOut31.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn32.read(b))){
                        dataOut32.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn33.read(b))){
                        dataOut33.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn34.read(b))){
                        dataOut34.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn35.read(b))){
                        dataOut35.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn36.read(b))){
                        dataOut36.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn37.read(b))){
                        dataOut37.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn38.read(b))){
                        dataOut38.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn39.read(b))){
                        dataOut39.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn40.read(b))){
                        dataOut40.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn41.read(b))){
                        dataOut41.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn42.read(b))){
                        dataOut42.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn43.read(b))){
                        dataOut43.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn44.read(b))){
                        dataOut44.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn45.read(b))){
                        dataOut45.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn46.read(b))){
                        dataOut46.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn47.read(b))){
                        dataOut47.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn48.read(b))){
                        dataOut48.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn49.read(b))){
                        dataOut49.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn50.read(b))){
                        dataOut50.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn51.read(b))){
                        dataOut51.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn52.read(b))){
                        dataOut52.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn53.read(b))){
                        dataOut53.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn54.read(b))){
                        dataOut54.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn55.read(b))){
                        dataOut55.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn56.read(b))){
                        dataOut56.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn57.read(b))){
                        dataOut57.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn58.read(b))){
                        dataOut58.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn59.read(b))){
                        dataOut59.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn60.read(b))){
                        dataOut60.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn61.read(b))){
                        dataOut61.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn62.read(b))){
                        dataOut62.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn63.read(b))){
                        dataOut63.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn64.read(b))){
                        dataOut64.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn65.read(b))){
                        dataOut65.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn66.read(b))){
                        dataOut66.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn67.read(b))){
                        dataOut67.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn68.read(b))){
                        dataOut68.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn69.read(b))){
                        dataOut69.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn70.read(b))){
                        dataOut70.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn71.read(b))){
                        dataOut71.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn72.read(b))){
                        dataOut72.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn73.read(b))){
                        dataOut73.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn74.read(b))){
                        dataOut74.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn75.read(b))){
                        dataOut75.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn76.read(b))){
                        dataOut76.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn77.read(b))){
                        dataOut77.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn78.read(b))){
                        dataOut78.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn79.read(b))){
                        dataOut79.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn80.read(b))){
                        dataOut80.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn81.read(b))){
                        dataOut81.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn82.read(b))){
                        dataOut82.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn83.read(b))){
                        dataOut83.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn84.read(b))){
                        dataOut84.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn85.read(b))){
                        dataOut85.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn86.read(b))){
                        dataOut86.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn87.read(b))){
                        dataOut87.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn88.read(b))){
                        dataOut88.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn89.read(b))){
                        dataOut89.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn90.read(b))){
                        dataOut90.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn91.read(b))){
                        dataOut91.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn92.read(b))){
                        dataOut92.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn93.read(b))){
                        dataOut93.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn94.read(b))){
                        dataOut94.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn95.read(b))){
                        dataOut95.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = dataIn96.read(b))){
                        dataOut96.write(b, 0, readByte);
                    }



                    // Close Stream
                    dataIn1.close();
                    dataOut1.close();

                    dataIn2.close();
                    dataOut2.close();

                    dataIn3.close();
                    dataOut3.close();

                    dataIn4.close();
                    dataOut4.close();

                    dataIn5.close();
                    dataOut5.close();

                    dataIn6.close();
                    dataOut6.close();

                    dataIn7.close();
                    dataOut7.close();

                    dataIn8.close();
                    dataOut8.close();

                    dataIn9.close();
                    dataOut9.close();

                    dataIn10.close();
                    dataOut10.close();

                    dataIn11.close();
                    dataOut11.close();

                    dataIn12.close();
                    dataOut12.close();

                    dataIn13.close();
                    dataOut13.close();

                    dataIn14.close();
                    dataOut14.close();

                    dataIn15.close();
                    dataOut15.close();

                    dataIn16.close();
                    dataOut16.close();

                    dataIn17.close();
                    dataOut17.close();

                    dataIn18.close();
                    dataOut18.close();

                    dataIn19.close();
                    dataOut19.close();

                    dataIn20.close();
                    dataOut20.close();

                    dataIn21.close();
                    dataOut21.close();

                    dataIn22.close();
                    dataOut22.close();

                    dataIn23.close();
                    dataOut23.close();

                    dataIn24.close();
                    dataOut24.close();

                    dataIn25.close();
                    dataOut25.close();

                    dataIn26.close();
                    dataOut26.close();

                    dataIn27.close();
                    dataOut27.close();

                    dataIn28.close();
                    dataOut28.close();

                    dataIn29.close();
                    dataOut29.close();

                    dataIn30.close();
                    dataOut30.close();

                    dataIn31.close();
                    dataOut31.close();

                    dataIn32.close();
                    dataOut32.close();

                    dataIn33.close();
                    dataOut33.close();

                    dataIn34.close();
                    dataOut34.close();
                    
                    dataIn35.close();
                    dataOut35.close();
                    
                    dataIn36.close();
                    dataOut36.close();
                    
                    dataIn37.close();
                    dataOut37.close();
                    
                    dataIn38.close();
                    dataOut38.close();
                    
                    dataIn39.close();
                    dataOut39.close();
                    
                    dataIn40.close();
                    dataOut40.close();
                    
                    dataIn41.close();
                    dataOut41.close();
                    
                    dataIn42.close();
                    dataOut42.close();
                    
                    dataIn43.close();
                    dataOut43.close();
                    
                    dataIn44.close();
                    dataOut44.close();
                    
                    dataIn45.close();
                    dataOut45.close();
                    
                    dataIn46.close();
                    dataOut46.close();
                    
                    dataIn47.close();
                    dataOut47.close();
                    
                    dataIn48.close();
                    dataOut48.close();
                    
                    dataIn49.close();
                    dataOut49.close();
                    
                    dataIn50.close();
                    dataOut50.close();
                    
                    dataIn51.close();
                    dataOut51.close();
                    
                    dataIn52.close();
                    dataOut52.close();
                    
                    dataIn53.close();
                    dataOut53.close();
                    
                    dataIn54.close();
                    dataOut54.close();
                    
                    dataIn55.close();
                    dataOut55.close();
                    
                    dataIn56.close();
                    dataOut56.close();
                    
                    dataIn57.close();
                    dataOut57.close();
                    
                    dataIn58.close();
                    dataOut58.close();
                    
                    dataIn59.close();
                    dataOut59.close();
                    
                    dataIn60.close();
                    dataOut60.close();
                    
                    dataIn61.close();
                    dataOut61.close();
                    
                    dataIn62.close();
                    dataOut62.close();
                    
                    dataIn63.close();
                    dataOut63.close();
                    
                    dataIn64.close();
                    dataOut64.close();
                    
                    dataIn65.close();
                    dataOut65.close();
                    
                    dataIn66.close();
                    dataOut66.close();
                    
                    dataIn67.close();
                    dataOut67.close();
                    
                    dataIn68.close();
                    dataOut68.close();
                    
                    dataIn69.close();
                    dataOut69.close();
                    
                    dataIn70.close();
                    dataOut70.close();
                    
                    dataIn71.close();
                    dataOut71.close();
                    
                    dataIn72.close();
                    dataOut72.close();
                    
                    dataIn73.close();
                    dataOut73.close();
                    
                    dataIn74.close();
                    dataOut74.close();
                    
                    dataIn75.close();
                    dataOut75.close();
                    
                    dataIn76.close();
                    dataOut76.close();
                    
                    dataIn77.close();
                    dataOut77.close();
                    
                    dataIn78.close();
                    dataOut78.close();
                    
                    dataIn79.close();
                    dataOut79.close();
                    
                    dataIn80.close();
                    dataOut80.close();
                    
                    dataIn81.close();
                    dataOut81.close();
                    
                    dataIn82.close();
                    dataOut82.close();
                    
                    dataIn83.close();
                    dataOut83.close();
                    
                    dataIn84.close();
                    dataOut84.close();
                    
                    dataIn85.close();
                    dataOut85.close();
                    
                    dataIn86.close();
                    dataOut86.close();
                    
                    dataIn87.close();
                    dataOut87.close();
                    
                    dataIn88.close();
                    dataOut88.close();
                    
                    dataIn89.close();
                    dataOut89.close();
                    
                    dataIn90.close();
                    dataOut90.close();
                    
                    dataIn91.close();
                    dataOut91.close();
                    
                    dataIn92.close();
                    dataOut92.close();
                    
                    dataIn93.close();
                    dataOut93.close();
                    
                    dataIn94.close();
                    dataOut94.close();
                    
                    dataIn95.close();
                    dataOut95.close();
                    
                    dataIn96.close();
                    dataOut96.close();


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (ProtocolException e) {
                    JOptionPane.showMessageDialog(null,"使用中のプロトコルでエラーが発生しました。   エラーコード:1");
                } catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(null,"URL書式が間違っています。   エラーコード:2");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"なんらかの入出力例外が発生しました。   エラーコード:3");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"例外が発生しました。    エラーコード:4");
                } finally {
                    JOptionPane.showMessageDialog(null,"ダウンロードが完了しました。");
                }

                // その他の環境だったときの処理
            } else {
                JOptionPane.showMessageDialog(null, "エラー！"+osname+"には未対応です。");


            }
        });


        //jb3はおすすめModDL
        //jb3がクリックされたら
        jb3.addActionListener(eve -> {			//以下のことをする
            String osname = System.getProperty("os.name");
            //winだったとき
            if(osname.contains("Windows")) {
                String userhome = System.getProperty("user.home");
                try {

                    URL urlo1 = new URL("https://media.forgecdn.net/files/2524/17/CraftingEX_1.12-v1.2.0.jar");
                    URL urlo2 = new URL("https://media.forgecdn.net/files/2803/400/jei_1.12.2-4.15.0.291.jar");
                    URL urlo3 = new URL("https://media.forgecdn.net/files/2755/792/NotEnoughItems-1.12.2-2.4.3.245-universal.jar");
                    URL urlo4 = new URL("https://optifine.net/downloadx?f=OptiFine_1.12.2_HD_U_F5.jar&x=634fc7561d00a0506f211a7bf5d09b14");
                    URL urlo5 = new URL("http://mcc.mcsv.jp/Files/IntelliInput/IntelliInput-2.6-for1.12.2.jar");

                    HttpURLConnection cono1 =
                            (HttpURLConnection) urlo1.openConnection();
                    cono1.setAllowUserInteraction(false);
                    cono1.setInstanceFollowRedirects(true);
                    cono1.setRequestMethod("GET");
                    cono1.connect();

                    HttpURLConnection cono2 =
                            (HttpURLConnection) urlo2.openConnection();
                    cono2.setAllowUserInteraction(false);
                    cono2.setInstanceFollowRedirects(true);
                    cono2.setRequestMethod("GET");
                    cono2.connect();

                    HttpURLConnection cono3 =
                            (HttpURLConnection) urlo3.openConnection();
                    cono3.setAllowUserInteraction(false);
                    cono3.setInstanceFollowRedirects(true);
                    cono3.setRequestMethod("GET");
                    cono3.connect();

                    HttpURLConnection cono4 =
                            (HttpURLConnection) urlo4.openConnection();
                    cono4.setAllowUserInteraction(false);
                    cono4.setInstanceFollowRedirects(true);
                    cono4.setRequestMethod("GET");
                    cono4.connect();
                    
                    HttpURLConnection cono5 =
                            (HttpURLConnection) urlo5.openConnection();
                    cono5.setAllowUserInteraction(false);
                    cono5.setInstanceFollowRedirects(true);
                    cono5.setRequestMethod("GET");
                    cono5.connect();

                    int http1 = cono1.getResponseCode();
                    int http2 = cono2.getResponseCode();
                    int http3 = cono3.getResponseCode();
                    int http4 = cono4.getResponseCode();
                    int http5 = cono5.getResponseCode();

                    if(http1 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http2 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http3 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http4 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http5 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }

                    // Input Stream
                    DataInputStream In1
                            = new DataInputStream(
                            cono1.getInputStream());
                    DataInputStream In2
                            = new DataInputStream(
                            cono2.getInputStream());
                    DataInputStream In3
                            = new DataInputStream(
                            cono3.getInputStream());
                    DataInputStream In4
                            = new DataInputStream(
                            cono4.getInputStream());
                    DataInputStream In5
                            = new DataInputStream(
                            cono5.getInputStream());


                    // Output Stream
                    DataOutputStream Out1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"CraftingEX_1.12-v1.2.0.jar")));
                    DataOutputStream Out2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"jei_1.12.2-4.15.0.291.jar")));
                    DataOutputStream Out3
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"NotEnoughItems-1.12.2-2.4.3.245-universal.jar")));
                    DataOutputStream Out4
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"OptiFine_1.12.2_HD_U_F5.jar")));
                    DataOutputStream Out5
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"AppData"+File.separator+".minecraft"+File.separator+"mods"+File.separator+"IntelliInput-2.6-for1.12.2.jar")));

                    // Read Data
                    byte[] b = new byte[4096];
                    int readByte = 0;

                    while(-1 != (readByte = In1.read(b))){
                        Out1.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In2.read(b))){
                        Out2.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In3.read(b))){
                        Out3.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In4.read(b))){
                        Out4.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In5.read(b))){
                        Out5.write(b, 0, readByte);
                    }

                    // Close Stream
                    In1.close();
                    Out1.close();
                    In2.close();
                    Out2.close();
                    In3.close();
                    Out3.close();
                    In4.close();
                    Out4.close();
                    In5.close();
                    Out5.close();

                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null,"ファイルが存在していません。  エラーコード:o0");
                } catch (ProtocolException e) {
                    JOptionPane.showMessageDialog(null,"使用中のプロトコルでエラーが発生しました。   エラーコード:o1");
                } catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(null,"URL書式が間違っています。   エラーコード:o2");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"なんらかの入出力例外が発生しました。   エラーコード:o3");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"例外が発生しました。    エラーコード:o4");
                } finally {
                    JOptionPane.showMessageDialog(null,"ダウンロードが完了しました。");
                }

            }else if(osname.contains("Mac")){
                String userhome = System.getProperty("user.home");
                JOptionPane.showMessageDialog(null, "Modファイルのダウンロードを開始しました。完了ダイアログが表示されるまでプログラムを終了しないで下さい。");
                try {

                    URL urlo1 = new URL("https://media.forgecdn.net/files/2524/17/CraftingEX_1.12-v1.2.0.jar");
                    URL urlo2 = new URL("https://media.forgecdn.net/files/2803/400/jei_1.12.2-4.15.0.291.jar");
                    URL urlo3 = new URL("https://media.forgecdn.net/files/2755/792/NotEnoughItems-1.12.2-2.4.3.245-universal.jar");
                    URL urlo4 = new URL("https://optifine.net/downloadx?f=OptiFine_1.12.2_HD_U_F5.jar&x=634fc7561d00a0506f211a7bf5d09b14");
                    URL urlo5 = new URL("https://media.forgecdn.net/files/2540/534/CocoaInput-%5b1.9-1.12.2%5d-3.1.5.jar");

                    HttpURLConnection cono1 =
                            (HttpURLConnection) urlo1.openConnection();
                    cono1.setAllowUserInteraction(false);
                    cono1.setInstanceFollowRedirects(true);
                    cono1.setRequestMethod("GET");
                    cono1.connect();

                    HttpURLConnection cono2 =
                            (HttpURLConnection) urlo2.openConnection();
                    cono2.setAllowUserInteraction(false);
                    cono2.setInstanceFollowRedirects(true);
                    cono2.setRequestMethod("GET");
                    cono2.connect();

                    HttpURLConnection cono3 =
                            (HttpURLConnection) urlo3.openConnection();
                    cono3.setAllowUserInteraction(false);
                    cono3.setInstanceFollowRedirects(true);
                    cono3.setRequestMethod("GET");
                    cono3.connect();

                    HttpURLConnection cono4 =
                            (HttpURLConnection) urlo4.openConnection();
                    cono4.setAllowUserInteraction(false);
                    cono4.setInstanceFollowRedirects(true);
                    cono4.setRequestMethod("GET");
                    cono4.connect();
                    
                    HttpURLConnection cono5 =
                            (HttpURLConnection) urlo5.openConnection();
                    cono5.setAllowUserInteraction(false);
                    cono5.setInstanceFollowRedirects(true);
                    cono5.setRequestMethod("GET");
                    cono5.connect();

                    int http1 = cono1.getResponseCode();
                    int http2 = cono2.getResponseCode();
                    int http3 = cono3.getResponseCode();
                    int http4 = cono4.getResponseCode();
                    int http5 = cono5.getResponseCode();

                    if(http1 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http2 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http3 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http4 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http5 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }

                    // Input Stream
                    DataInputStream In1
                            = new DataInputStream(
                            cono1.getInputStream());
                    DataInputStream In2
                            = new DataInputStream(
                            cono2.getInputStream());
                    DataInputStream In3
                            = new DataInputStream(
                            cono3.getInputStream());
                    DataInputStream In4
                            = new DataInputStream(
                            cono4.getInputStream());
                    DataInputStream In5
                            = new DataInputStream(
                            cono5.getInputStream());


                    // Output Stream
                    DataOutputStream Out1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/CraftingEX_1.12-v1.2.0.jar")));
                    DataOutputStream Out2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/jei_1.12.2-4.15.0.291.jar")));
                    DataOutputStream Out3
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/NotEnoughItems-1.12.2-2.4.3.245-universal.jar")));
                    DataOutputStream Out4
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/OptiFine_1.12.2_HD_U_F5.jar")));
                    DataOutputStream Out5
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/CocoaInput-[1.9-1.12.2]-3.1.5.jar")));

                    // Read Data
                    byte[] b = new byte[4096];
                    int readByte = 0;

                    while(-1 != (readByte = In1.read(b))){
                        Out1.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In2.read(b))){
                        Out2.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In3.read(b))){
                        Out3.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In4.read(b))){
                        Out4.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In5.read(b))){
                        Out5.write(b, 0, readByte);
                    }
                    

                    // Close Stream
                    In1.close();
                    Out1.close();
                    In2.close();
                    Out2.close();
                    In3.close();
                    Out3.close();
                    In4.close();
                    Out4.close();
                    In5.close();
                    Out5.close();

                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null,"ファイルが存在していません。  エラーコード:o0");
                } catch (ProtocolException e) {
                    JOptionPane.showMessageDialog(null,"使用中のプロトコルでエラーが発生しました。   エラーコード:o1");
                } catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(null,"URL書式が間違っています。   エラーコード:o2");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"なんらかの入出力例外が発生しました。   エラーコード:o3");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"例外が発生しました。    エラーコード:o4");
                } finally {
                    JOptionPane.showMessageDialog(null,"ダウンロードが完了しました。");
                }

            }else if(osname.contains("Linux")){
                String userhome = System.getProperty("user.home");
                try {

                    URL urlo1 = new URL("https://media.forgecdn.net/files/2524/17/CraftingEX_1.12-v1.2.0.jar");
                    URL urlo2 = new URL("https://media.forgecdn.net/files/2803/400/jei_1.12.2-4.15.0.291.jar");
                    URL urlo3 = new URL("https://media.forgecdn.net/files/2755/792/NotEnoughItems-1.12.2-2.4.3.245-universal.jar");
                    URL urlo4 = new URL("https://optifine.net/downloadx?f=OptiFine_1.12.2_HD_U_F5.jar&x=634fc7561d00a0506f211a7bf5d09b14");
                    URL urlo5 = new URL("https://media.forgecdn.net/files/2540/534/CocoaInput-%5b1.9-1.12.2%5d-3.1.5.jar");

                    HttpURLConnection cono1 =
                            (HttpURLConnection) urlo1.openConnection();
                    cono1.setAllowUserInteraction(false);
                    cono1.setInstanceFollowRedirects(true);
                    cono1.setRequestMethod("GET");
                    cono1.connect();

                    HttpURLConnection cono2 =
                            (HttpURLConnection) urlo2.openConnection();
                    cono2.setAllowUserInteraction(false);
                    cono2.setInstanceFollowRedirects(true);
                    cono2.setRequestMethod("GET");
                    cono2.connect();

                    HttpURLConnection cono3 =
                            (HttpURLConnection) urlo3.openConnection();
                    cono3.setAllowUserInteraction(false);
                    cono3.setInstanceFollowRedirects(true);
                    cono3.setRequestMethod("GET");
                    cono3.connect();

                    HttpURLConnection cono4 =
                            (HttpURLConnection) urlo4.openConnection();
                    cono4.setAllowUserInteraction(false);
                    cono4.setInstanceFollowRedirects(true);
                    cono4.setRequestMethod("GET");
                    cono4.connect();
                    
                    HttpURLConnection cono5 =
                            (HttpURLConnection) urlo5.openConnection();
                    cono5.setAllowUserInteraction(false);
                    cono5.setInstanceFollowRedirects(true);
                    cono5.setRequestMethod("GET");
                    cono5.connect();

                    int http1 = cono1.getResponseCode();
                    int http2 = cono2.getResponseCode();
                    int http3 = cono3.getResponseCode();
                    int http4 = cono4.getResponseCode();
                    int http5 = cono5.getResponseCode();

                    if(http1 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http2 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http3 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http4 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }
                    if(http5 != HttpURLConnection.HTTP_OK){
                        throw new Exception();
                    }

                    // Input Stream
                    DataInputStream In1
                            = new DataInputStream(
                            cono1.getInputStream());
                    DataInputStream In2
                            = new DataInputStream(
                            cono2.getInputStream());
                    DataInputStream In3
                            = new DataInputStream(
                            cono3.getInputStream());
                    DataInputStream In4
                            = new DataInputStream(
                            cono4.getInputStream());
                    DataInputStream In5
                            = new DataInputStream(
                            cono5.getInputStream());


                    // Output Stream
                    DataOutputStream Out1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"CraftingEX_1.12-v1.2.0.jar")));
                    DataOutputStream Out2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"jei_1.12.2-4.15.0.291.jar")));
                    DataOutputStream Out3
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"NotEnoughItems-1.12.2-2.4.3.245-universal.jar")));
                    DataOutputStream Out4
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+File.separator+"minecraft"+File.separator+File.separator+"OptiFine_1.12.2_HD_U_F5.jar")));
                    DataOutputStream Out5
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/CocoaInput-[1.9-1.12.2]-3.1.5.jar")));

                    // Read Data
                    byte[] b = new byte[4096];
                    int readByte = 0;

                    while(-1 != (readByte = In1.read(b))){
                        Out1.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In2.read(b))){
                        Out2.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In3.read(b))){
                        Out3.write(b, 0, readByte);
                    }
                    while(-1 != (readByte = In4.read(b))){
                        Out4.write(b, 0, readByte);
                    }

                    // Close Stream
                    In1.close();
                    Out1.close();
                    In2.close();
                    Out2.close();
                    In3.close();
                    Out3.close();
                    In4.close();
                    Out4.close();

                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null,"ファイルが存在していません。  エラーコード:o0");
                } catch (ProtocolException e) {
                    JOptionPane.showMessageDialog(null,"使用中のプロトコルでエラーが発生しました。   エラーコード:o1");
                } catch (MalformedURLException e) {
                    JOptionPane.showMessageDialog(null,"URL書式が間違っています。   エラーコード:o2");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"なんらかの入出力例外が発生しました。   エラーコード:o3");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"例外が発生しました。    エラーコード:o4");
                } finally {
                    JOptionPane.showMessageDialog(null,"ダウンロードが完了しました。");
                }

            }else{
                JOptionPane.showMessageDialog(null,osname+"には未対応です！");

            }
        });
        
        
        //jb2がクリックされたら
        jb2.addActionListener(even -> {			//以下のことをする
            System.exit(0);				// プログラムを終了
        });

        Container contentPane = getContentPane();			//コンテンツパネルの位置設定↓
        contentPane.add(p0, BorderLayout.NORTH);			//p0をNORTHに設定
        contentPane.add(p1, BorderLayout.NORTH);			//p1をNORTHに設定
        contentPane.add(p2, BorderLayout.NORTH);			//p2をNORTHに設定
        contentPane.add(p3, BorderLayout.SOUTH);			//p3をSOUTHに設定
        contentPane.add(p4, BorderLayout.SOUTH);			//p4をSOUTHに設定
        contentPane.add(p5, BorderLayout.SOUTH);			//p5をSOUTHに設定
        contentPane.add(p6, BorderLayout.SOUTH);			//p6をSOUTHに設定

        //以下、ウィンドウ設定


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//ウィンドウを閉じたらプログラム終了
        setTitle("IMSModDownloader 1.3.4T");	//ウィンドウタイトル設定
        setSize(625, 400);						//ウィンドウサイズ設定
        setLocationRelativeTo(null);		//ウィンドウ位置設定(中央)
        setVisible(true);							//ウィンドウ可視化
    }



    public static void main(String[] args) {
        new Main();															//ウィンドウ作成(なぜ最後に？)
    }
}
