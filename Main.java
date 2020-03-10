import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.*;

class Main extends JFrame implements ActionListener {
    Main() {
        getContentPane().setLayout(new FlowLayout());


        //コンボボックス作成
        JComboBox<String> cb = new JComboBox<>();
        cb.addItem("選択してください");
        cb.addItem("標準のModsフォルダーにインストールする	(注1)");
        cb.addItem("標準のModsフォルダーのModの不足Modを表示する(注2)");
        cb.addItem("選択したフォルダーにModをダウンロードする");
        cb.addActionListener(this);
        getContentPane().add(cb);

        JLabel l1 = new JLabel("<html><h4>上の選択肢は機能していません。実装までお待ち下さい。</h4><br><p>注1 : Modsフォルダー内のファイルは削除されます</p></html>");
        JLabel l2 = new JLabel("<html><p>注2 : プログラムの仕様上、名前が変更されている場合は、不足Modとして表示されます。</p></html>");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.add(l1);
        p2.add(l2);

        //	ImageIcon i1 = new ImageIcon("./yoshi.png");
        JCheckBox c1 = new JCheckBox();
        JLabel l3 = new JLabel("利用規約");
        l3.setForeground(Color.BLUE.darker());
        l3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        l3.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // ラベルをクリックしたとき
                try {

                    Desktop.getDesktop().browse(new URI("http://im-s.tk/terms/"));

                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });

        JLabel l4 = new JLabel("<html><p>に同意する</p></html>");

        JButton jb1 = new JButton("開始");

        JButton jb2 = new JButton("プログラム終了");

        //	jb1.setIcon(i1);

        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        p3.add(c1);
        p3.add(l3);
        p3.add(l4);
        p4.add(jb1);
        p4.add(jb2);


        //jb1がクリックされたら
        jb1.addActionListener(ev -> {			//以下のことをする

            String osname = System.getProperty("os.name");
            // Windowsであったときの処理
            if(osname.contains("Windows")){
                JOptionPane.showMessageDialog(null, "エラー！Windowsには未対応です。対応作業中なので待ってplease");


                // Linuxであったときの処理
            } else if(osname.contains("Linux")){
                JOptionPane.showMessageDialog(null, "エラー！Linuxには未対応です。");

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





                    // Output Stream
                    DataOutputStream dataOut1
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/OptiFine_1.11.2_HD_U_F5.jar")));

                    DataOutputStream dataOut2
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/Baubles-1.12-1.5.2.jar")));

                    DataOutputStream dataOut3
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/Botania+r1.10-361.jar")));

                    DataOutputStream dataOut4
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/BrandonsCore-1.12.2-2.4.17.208-universal.jar")));

                    DataOutputStream dataOut5
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/Cavern_1.12.2-v2.2.0.jar")));
                    DataOutputStream dataOut6
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/Chameleon-1.12-4.1.3.jar")));
                    DataOutputStream dataOut7
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/CodeChickenLib-1.12.2-3.2.3.358-universal.jar")));
                    DataOutputStream dataOut8
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/CompactSolars-1.12.2-5.0.18.341-universal.jar")));
                    DataOutputStream dataOut9
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/Draconic-Evolution-1.12.2-2.3.24.349-universal.jar")));
                    DataOutputStream dataOut10
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/EnderCore-1.12.2-0.5.73.jar")));
                    DataOutputStream dataOut11
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/EnderIO-1.12.2-5.1.55.jar")));
                    DataOutputStream dataOut12
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/extrautils2-1.12-1.9.9.jar")));
                    DataOutputStream dataOut13
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/Forgelin-1.8.2.jar")));
                    DataOutputStream dataOut14
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/gci-0.6-1.12.2.jar")));
                    DataOutputStream dataOut15
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/gravestone-1.10.1.jar")));
                    DataOutputStream dataOut16
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ImmersiveEngineering-0.12-89.jar")));
                    DataOutputStream dataOut17
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/industrialcraft-2-2.8.170-ex112.jar")));
                    DataOutputStream dataOut18
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/Mantle-1.12-1.3.3.55.jar")));
                    DataOutputStream dataOut19
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/Mekanism-1.12.2-9.8.3.390.jar")));
                    DataOutputStream dataOut20
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/MekanismGenerators-1.12.2-9.8.3.390.jar")));
                    DataOutputStream dataOut21
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/MekanismTools-1.12.2-9.8.3.390.jar")));
                    DataOutputStream dataOut22
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/plustic-7.1.6.1.jar")));
                    DataOutputStream dataOut23
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/RedstoneFlux-1.12-2.1.0.6-universal.jar")));
                    DataOutputStream dataOut24
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/refinedstorage-1.6.15.jar")));
                    DataOutputStream dataOut25
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/StorageDrawers-1.12.2-5.4.0.jar")));
                    DataOutputStream dataOut26
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/TConstruct-1.12.2-2.13.0.171.jar")));
                    DataOutputStream dataOut27
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/tesla-core-lib-1.12.2-1.0.15.jar")));
                    DataOutputStream dataOut28
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/Thaumcraft-1.12.2-6.1.BETA26.jar")));
                    DataOutputStream dataOut29
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/Thaumic-Tinkerer-Mod-1.12.2.jar")));
                    DataOutputStream dataOut30
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ThaumicInventoryScanning_1.12.2-2.0.10.jar")));
                    DataOutputStream dataOut31
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/TinkerToolLeveling-1.12.2-1.1.0.jar")));
                    DataOutputStream dataOut32
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/TofuCraftReload-0.1.0.4.jar")));
                    DataOutputStream dataOut33
                            = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(userhome+"/Library/Application Support/minecraft/mods/ComputerCraft-1.80pr1-build5.jar")));




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
                String osnameelse = System.getProperty("os.name");
                JOptionPane.showMessageDialog(null, "エラー！"+osnameelse+"には未対応です。");


            }
        });


        //jb2がクリックされたら
        jb2.addActionListener(e -> {			//以下のことをする
            System.exit(0);				// プログラムを終了
        });

        Container contentPane = getContentPane();			//コンテンツパネルの位置設定↓
        contentPane.add(p1, BorderLayout.NORTH);			//p1をNORTHに設定
        contentPane.add(p2, BorderLayout.NORTH);			//p2をNORTHに設定
        contentPane.add(p3, BorderLayout.SOUTH);			//p3をSOUTHに設定
        contentPane.add(p4, BorderLayout.SOUTH);			//p4をSOUTHに設定

        //以下、ウィンドウ設定


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//ウィンドウを閉じたらプログラム終了
        setTitle("IMServerModInstaller");	//ウィンドウタイトル設定
        setSize(600, 400);						//ウィンドウサイズ設定
        setLocationRelativeTo(null);		//ウィンドウ位置設定(中央)
        setVisible(true);							//ウィンドウ可視化
    }
    public void actionPerformed(ActionEvent e) {			//多分プリント林でcbの内容をプリントしてる
        JComboBox cb;
        cb = (JComboBox)e.getSource();
        System.out.println(cb.getSelectedItem());			//cb.getSelecteditemで選択したアイテムを表示してそう
    }



    public static void main(String[] args) {
        new Main();															//ウィンドウ作成(なぜ最後に？)
    }
}
