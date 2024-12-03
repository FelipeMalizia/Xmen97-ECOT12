package br.edu.unifei.ecot12.xmen97;


import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        //magneto
        Mutant magneto = new Mutant();
        magneto.setName("Erik Magnus Lehnsherr");
        magneto.setPowerState(new Enabled());
        magneto.setLife(30);
        magneto.setAge(50);
        magneto.setBeingAlign(AlignEnum.EVIL);
        magneto.setAlterEgo(new Villain());
        magneto.getAlterEgo().setName("Magneto");
        ((Villain) magneto.getAlterEgo()).setVillainy(40);
        magneto.setLevel(LevelEnum.OMEGA);
        Psychic ps = new Psychic();
        ps.setDescription("Control electromagnetic fields with the mind");
        ps.setDamage(8);
        ps.setPsychicDamage(0.9f);
        magneto.getPowers().add(ps);

        //wolverine
        Mutant wolverine = new Mutant();
        wolverine.setName("Logan");
        wolverine.setPowerState(new Enabled());
        wolverine.setLife(40);
        wolverine.setAge(300);
        wolverine.setBeingAlign(AlignEnum.GOOD);
        wolverine.setAlterEgo(new Hero());
        wolverine.getAlterEgo().setName("Wolverine");
        ((Hero) wolverine.getAlterEgo()).setGoodness(60);
        wolverine.setLevel(LevelEnum.ALPHA);
        Physical p = new Physical();
        p.setDescription("Adamantium claws and skeleton");
        p.setDamage(10);
        p.setDestructivePotencial(0.4f);
        wolverine.getPowers().add(p);
        Regenerative r = new Regenerative();
        r.setDescription("Extremely accelerated and powerful regeneration");
        r.setDamage(10);
        r.setHeal(-0.8f);
        wolverine.getPowers().add(r);

        //ciclop
        Mutant ciclop = new Mutant();
        ciclop.setName("Scott Summers");
        ciclop.setPowerState(new Enabled());
        ciclop.setLife(30);
        ciclop.setAge(20);
        ciclop.setBeingAlign(AlignEnum.GOOD);
        ciclop.setAlterEgo(new Hero());
        ciclop.getAlterEgo().setName("Ciclop");
        ((Hero) ciclop.getAlterEgo()).setGoodness(100);
        ciclop.setLevel(LevelEnum.ALPHA);
        p.setDescription("Bursts of energy through the eyes");
        p.setDamage(10);
        p.setDestructivePotencial(0.6f);
        ciclop.getPowers().add(p);

        //Jean Grey
        Mutant jean = new Mutant();
        jean.setName("Jean Grey Summers");
        jean.setPowerState(new Enabled());
        jean.setLife(30);
        jean.setAge(20);
        jean.setBeingAlign(AlignEnum.GOOD);
        jean.setAlterEgo(new Hero());
        jean.getAlterEgo().setName("Jean Grey");
        ((Hero) jean.getAlterEgo()).setGoodness(100);
        jean.setLevel(LevelEnum.OMEGA);
        ps.setDescription("Telepathy");
        ps.setDamage(8);
        ps.setPsychicDamage(0.7f);
        jean.getPowers().add(ps);
        ps.setDescription("Telekinesis");
        ps.setDamage(9);
        ps.setPsychicDamage(0.7f);
        jean.getPowers().add(ps);

        //Cable
        Mutant cable = new Mutant();
        cable.setName("Nathan Summers");
        cable.setPowerState(new Enabled());
        cable.setLife(30);
        cable.setAge(40);
        cable.setBeingAlign(AlignEnum.GOOD);
        cable.setAlterEgo(new Hero());
        cable.getAlterEgo().setName("Cable");
        ((Hero) cable.getAlterEgo()).setGoodness(60);
        cable.setLevel(LevelEnum.OMEGA);
        p.setDescription("Bursts of energy through the eyes");
        p.setDamage(10);
        p.setDestructivePotencial(0.6f);
        cable.getPowers().add(p);
        Technological t = new Technological();
        t.setTechnovirus(true);
        t.setCommunicationLevel(0.9f);
        t.setDamage(10);
        t.setDescription("Machine control");
        cable.getPowers().add(t);
        cable.getPowers().add(ps);

        //Jean Gray is Fenix's classic avatar
        Fenix fenix = Fenix.getFenix();
        fenix.setPossessed(jean);
        fenix.setActive(false);
        
        //Mr.Sinister
        Modified sinister = new Modified();
        sinister.setLife(50);
        sinister.setBeingAlign(AlignEnum.EVIL);
        sinister.setAlterEgo(new Villain());
        sinister.setName("Nathaniel Essex");
        sinister.getAlterEgo().setName("Mr.Sinister");
        ((Villain) sinister.getAlterEgo()).setVillainy(100);
        sinister.setPowerOrigin("He stole mutant DNA and injected it into himself.");
        sinister.setProfession("Scientist");
        r.setDescription("regeneration due to mutant DNA");
        r.setDamage(6);
        r.setHeal(-0.8f);
        sinister.getPowers().add(r);
        p.setDescription("Superhuman strength");
        p.setDestructivePotencial(0.2f);
        p.setDamage(10);
        sinister.getPowers().add(p);

        //Madeleine Prior (Jean Grey clone)
        Clone madeleine = new Clone(jean);
        madeleine.setBeingAlign(AlignEnum.EVIL);
        madeleine.setLife(30);
        madeleine.setCreator(sinister);
        madeleine.setCreationTechnique("Captured Jean and made perfect cloning");
        madeleine.setAlterEgo(new Villain());
        madeleine.setName("Madeleine Prior");
        madeleine.getAlterEgo().setName("Goblin Queen");
        ((Villain) madeleine.getAlterEgo()).setVillainy(65);

        //cBolivar Task human version
        Human bolivar = new Human();
        bolivar.setAge(48);
        bolivar.setLife(30);
        bolivar.setBeingAlign(AlignEnum.EVIL);
        bolivar.setName("Bolivar Task");
        bolivar.setProfession("High-ranking military");
        bolivar.setAlterEgo(new Villain());
        ((Villain) bolivar.getAlterEgo()).setVillainy(60);

        //Bastion
        HumanSentinel bastion = new HumanSentinel();
        bastion.setName("Sebastian Gilberti");
        bastion.setFreedom(100);
        bastion.setMachineControl(100);
        bastion.setLife(55);
        bastion.setBeingAlign(AlignEnum.EVIL);
        bastion.setAlterEgo(new Villain());
        ((Villain) bastion.getAlterEgo()).setVillainy(80);
        bastion.getAlterEgo().setName("Bastion");
        bastion.getTargets().add(wolverine);
        bastion.getTargets().add(jean);
        bastion.getTargets().add(ciclop);
        bastion.getTargets().add(magneto);

        //creation of shiar galactic empire and home planet
        InterGalaticEmpire shiar = new InterGalaticEmpire();
        shiar.setName("Shiar Empire");
        shiar.setPurpose("Expand the empire, end the arts");
        shiar.setFleet(1000000l);
        Planet chadilar = new Planet();
        chadilar.setName("Chadilar");
        chadilar.setAtmosfere("Nitrogen, oxygen, carbon dioxide");
        shiar.getPlanets().add(chadilar);

        //empress Lilandra Neramani
        Alien lilandra = new Alien();
        lilandra.setName("Lilandra Neramani");
        lilandra.setAge(50);
        lilandra.setRace("Shiar");
        lilandra.setLife(30);
        lilandra.setBeingAlign(AlignEnum.GOOD);
        lilandra.setEmpire(shiar);
        
        //Magneto switches sides after Charles Xavier's death
        Caretaker care = new Caretaker();
        care.setBeing(magneto);
        magneto.setCaretaker(care);
        magneto.setBeingAlign(AlignEnum.GOOD);
        //see if you really saved it
        for(RecordedAlterEgo l : care.getAlterEgos())
            System.out.println(l.getAlterEgo());
        System.out.println(magneto.getAlterEgo());

        //X-men!
        Group xmen = new Group();
        xmen.setName("X-men");
        xmen.setGroupAlign(AlignEnum.GOOD);
        xmen.getMembers().add(jean);
        xmen.getMembers().add(ciclop);
        xmen.getMembers().add(wolverine);
        xmen.setLider(magneto);

        //bolivar task become Humam sentinel
        HumanSentinel task = new HumanSentinel();
        task.setName("Bolivar Task");
        task.setFreedom(30);
        task.setMachineControl(0);
        task.setLife(45);
        task.setBeingAlign(AlignEnum.EVIL);
        task.setAlterEgo(new Villain());
        ((Villain) task.getAlterEgo()).setVillainy(75);
        task.getAlterEgo().setName("Bolivar Task");
        task.setDisguise(bolivar);

        //creating flyweight sentinels
        RoboticSentinelFabric fabric = new RoboticSentinelFabric();
        RoboticSentinel r1 = fabric.getRoboticSentinel(10);
        RoboticSentinel r2 = fabric.getRoboticSentinel(10);
        System.out.println(r2 == r1);//test
        RoboticSentinel r3 = fabric.getRoboticSentinel(11);
        r1.getTargets().add(wolverine);
        r3.getTargets().add(ciclop);


        //Bastion Sentinels Army
        Group sent_army = new Group();
        sent_army.setName("Bastion Sentinel Army");
        sent_army.setLider(bastion);
        sent_army.setGroupAlign(AlignEnum.EVIL);
        sent_army.getMembers().add(sinister);
        sent_army.getMembers().add(task);
        sent_army.getMembers().add(r1);
        sent_army.getMembers().add(r2);
        sent_army.getMembers().add(r3);

        //Earth and some Nations
        Planet earth = new Planet();
        earth.setName("Earth");
        earth.setAtmosfere("Nitrogen, oxygen, carbon dioxide");
        Country genosha = new Country();
        genosha.setName("Genosha");
        genosha.setExtension(50000);
        genosha.setFolk("Mutants");
        Country usa = new Country();
        usa.setName("United States of America");
        usa.setExtension(9525067);
        usa.setFolk("Humans");
        earth.getCountries().add(genosha);
        earth.getCountries().add(usa);

        //Battle: Bastion Army x X-men
        Battle bastion_battle = new Battle();
        bastion_battle.setConsequences("Gambit death"); 
        bastion_battle.getGroups().add(sent_army);
        bastion_battle.getGroups().add(xmen);
        bastion_battle.setWinner(xmen);
        bastion_battle.setBegin(new GregorianCalendar());
        bastion_battle.setDuration(2);
        bastion_battle.setMotivation("Bastion wanted to rule the world");

        //magneto turns to evil again
        care.restore();
        //test
        System.out.println(magneto.getAlterEgo());

        //Scott becomes leader with magneto exit
        xmen.setLider(ciclop);
        //xmen time-travel
        TimeTravel timetravel = new TimeTravel();
        timetravel.setConsequences("Scott and Jean raised cable in the future");
        timetravel.setBegin(new GregorianCalendar());
        timetravel.setDestinyTime(new GregorianCalendar());
        timetravel.getGroups().add(xmen);
        timetravel.setMotivation("Bastion wants revenge");

        //tests for battle modeling
        AttackTool fuzil = new AttackTool();
        fuzil.setFunction(5);
        fuzil.setDescription("A standard US Army weapon");
        AttackTool canhao = new AttackTool();
        canhao.setDescription("Plasma cannon");
        canhao.setFunction(7);
        bastion.getTools().add(canhao);
        task.getTools().add(fuzil);
        HealTool autorepair = new HealTool();
        autorepair.setDescription("Machines can repair themselves");
        autorepair.setFunction(4);
        bastion.getTools().add(autorepair);

        System.out.println(bastion.getLife());
        wolverine.attackPower(bastion);
        jean.attackPower(bastion);
        ciclop.attackPower(bastion);
        System.out.println(bastion.getLife());

        for(Mutant e : bastion.getTargets())
            for(Tool te : bastion.getTools())
                if( te instanceof AttackTool)te.useFunction(e);
                else te.useFunction(bastion);

        System.out.println(wolverine.getLife());
        System.out.println(jean.getLife());
        System.out.println(ciclop.getLife());
        System.out.println(bastion.getLife());
        
        //facade
        MutantFacade facade = new MutantFacade();
        Mutant beast = facade.createMutant();
        beast.attackPower(bastion);
        System.out.println(bastion.getLife());

    }
}